package com.dtdream.baseapi;

import com.dtdream.base.exceptions.ApiNotFoundException;

/**
 * Created by X0269 on 2015/4/25.
 */
public interface APIProvider {

	/**
	 * Called after the APIProvider is constructed.  This allows the provider to pre-initialize or bind any interface implementations if desired
	 */
	void initialize();

	/**
	 * Gets the implementation for the specified interface type
	 *
	 * @param <T> the Openstack4j API type
	 * @param api the API interface
	 * @return the implementation for T
	 * @throws ApiNotFoundException if the API cannot be found
	 */
	<T> T get(Class<T> api);
}
