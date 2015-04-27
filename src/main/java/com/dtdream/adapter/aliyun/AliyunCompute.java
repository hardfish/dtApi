package com.dtdream.adapter.aliyun;

import com.dtdream.baseapi.ComputeService;
import com.dtdream.baseapi.ServerService;

/**
* Created by X0269 on 2015/4/25.
*/
class AliyunCompute implements ComputeService {

	@Override
	public ServerService server() {
		return AliyunApis.get(ServerService.class);
	}
}
