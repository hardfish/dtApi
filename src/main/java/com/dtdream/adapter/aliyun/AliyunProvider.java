package com.dtdream.adapter.aliyun;

/**
 * Created by X0269 on 2015/4/25.
 */

import com.dtdream.baseapi.*;
import com.dtdream.base.exceptions.ApiNotFoundException;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Simple API Provider which keeps internally Maps interface implementations as singletons
 *
 * @author Jeremy Unruh
 */
public class AliyunProvider implements APIProvider {

	private static final Map<Class<?>, Class<?>> bindings = Maps.newHashMap();
	private static final Map<Class<?>, Object> instances = Maps.newConcurrentMap();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize() {
		bind(IdentityService.class, AliyunIdentity.class);
		bind(ComputeService.class, AliyunCompute.class);
		bind(ServerService.class, AliyunServer.class);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> api) {
		if (instances.containsKey(api))
			return (T) instances.get(api);

		if (bindings.containsKey(api)) {
			try {
				T impl = (T) bindings.get(api).newInstance();
				instances.put(api, impl);
				return impl;
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new ApiNotFoundException("API Not found for: " + api.getName(), e);
			}
		}
		throw new ApiNotFoundException("API Not found for: " + api.getName());
	}

	private void bind(Class<?> api, Class<?> impl)
	{
		bindings.put(api, impl);
	}
}

