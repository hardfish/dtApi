package com.dtdream;

import com.dtdream.base.ClientContext;
import com.dtdream.baseapi.DtApi;
import com.dtdream.entity.Server;

import java.util.List;

/**
 * Created by X0269 on 2015/4/27.
 */
public class App2 {
	public static void main(String[] argvs) {
		DtApi dtApi = DtAdapterFactory.getApi("Openstack");

		// 1. 建立连接
		ClientContext context = dtApi.createClient("http://121.41.120.176:5000/v2.0", "admin", "123456");

		// 2. 准备参数
		List<? extends Server> servers = dtApi.compute().server().listAll(context, true);

		// 3. 下发参数
		for (Server s : servers) {
			System.out.println(s.getInstanceName());
		}
	}
}