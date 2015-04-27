package com.dtdream.baseapi;

import java.util.ServiceLoader;

/**
 * Created by X0269 on 2015/4/27.
 */
public class ServiceProvider {
	public static APIProvider getDefault() {

		// load our plugin
		ServiceLoader<APIProvider> apiLoader =
				ServiceLoader.load(APIProvider.class);

		//checking if load was successful
		for (APIProvider provider : apiLoader) {
			return provider;
		}
		throw new Error("Something is wrong with registering the addon");
	}

}
