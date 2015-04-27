package com.dtdream.adapter.openstack;

import com.dtdream.baseapi.ComputeService;
import com.dtdream.baseapi.ServerService;

/**
 * Created by X0269 on 2015/4/27.
 */
public class OpenstackCompute  implements ComputeService {
	@Override
	public ServerService server() {
		return OpenstackApis.get(ServerService.class);
	}
}
