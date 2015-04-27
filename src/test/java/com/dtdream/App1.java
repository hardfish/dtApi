package com.dtdream;

import com.dtdream.base.ClientContext;
import com.dtdream.baseapi.DtApi;
import com.dtdream.entity.action.ServerCreate;

/**
 * Created by X0269 on 2015/4/25.
 */
public class App1 {
    public static void main(String[] argvs)
    {
        DtApi dtApi = DtAdapterFactory.getApi("Aliyun");
        String serverUrl = "http://ecs.aliyuncs.com/"; //例如: http://ecs.aliyuncs.com/
        String accessKeyId = "N8uTikOyyyyyyyy";
        String accessKeySecret = "u35Kxc0HUZIg4zmkxxxxxxxxxx";

        // 1. 建立连接
        ClientContext context = dtApi.createClient(serverUrl, accessKeyId, accessKeySecret);

        // 2. 准备参数
        String regionID = "cn-hangzhou";
        String imageID = "_32_23c472_20120822172155_aliguest.vhd";
        String instanceType = "ecs.t1.small";
        String securityGroupID = "sg-c0003e8b9";

        // 3. 下发参数
        dtApi.compute().server().create(new ServerCreate(context, regionID, imageID, instanceType, securityGroupID));
    }
}
