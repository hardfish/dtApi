package com.dtdream.adapter.aliyun;

import com.aliyun.api.AliyunClient;
import com.aliyun.api.DefaultAliyunClient;
import com.dtdream.baseapi.ComputeService;
import com.dtdream.baseapi.DtApi;
import com.dtdream.baseapi.IdentityService;

/**
 * Created by X0269 on 2015/4/25.
 */
public class AliyunDtAdapter implements DtApi {
    AliyunClient client;

    @Override
    public Object createClient(String endpoint, String tenantName, String username, String password) {
        AliyunClient client;

        String serverUrl = "<serverUrl>"; //例如: http://ecs.aliyuncs.com/
        String accessKeyId = "<accessKeyId>";
        String accessKeySecret = "<accessKeySecret>";
        client = new DefaultAliyunClient(serverUrl, accessKeyId, accessKeySecret);

        return client;
    }

    @Override
    public ComputeService compute() {
        return null;
    }

    @Override
    public IdentityService identity() {
        return null;
    }

}
