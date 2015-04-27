package com.dtdream.adapter.aliyun;

import com.aliyun.api.AliyunClient;
import com.aliyun.api.DefaultAliyunClient;
import com.dtdream.base.ClientContext;
import com.dtdream.baseapi.ComputeService;
import com.dtdream.baseapi.DtApi;
import com.dtdream.baseapi.IdentityService;

/**
 * Created by X0269 on 2015/4/25.
 */
public class AliyunDtAdapter implements DtApi {
    @Override
    public ClientContext createClient(String endpoint, String id, String password) {
        AliyunClient client = new DefaultAliyunClient(endpoint, id, password);
        return new ClientContext(client);
    }

    @Override
    public ComputeService compute() {
        return AliyunApis.getComputeServices();
    }

    @Override
    public IdentityService identity() {
        return AliyunApis.getIdentityServices();
    }

}
