package com.dtdream.adapter.openstack;

/**
 * Created by X0269 on 2015/4/25.
 */

import com.dtdream.baseapi.APIProvider;
import com.dtdream.baseapi.ComputeService;
import com.dtdream.baseapi.IdentityService;

/**
 * Provides access to the Major APIs and Buildables
 *
 * @author Jeremy Unruh
 */
public class OpenstackApis {

	private static final APIProvider providers = initializeProvider();

	/**
	 * Gets the API implementation based on Type
	 *
	 * @param <T> the API type
	 * @param api the API implementation
	 * @return the API implementation
	 */
	public static <T> T get(Class<T> api) {
		return providers.get(api);
	}

	/**
	 * Gets the identity services API
	 *
	 * @return the identity services
	 */
	public static IdentityService getIdentityServices() {
		return get(IdentityService.class);
	}

	/**
	 * Gets the compute services API
	 *
	 * @return the compute services
	 */
	public static ComputeService getComputeServices() {
		return get(ComputeService.class);
	}


	private static APIProvider initializeProvider() {
		APIProvider p = new OpenstackProvider(); //ServiceLoader.load(APIProvider.class).iterator().next();
		p.initialize();
		return p;
	}
}
