package com.dtdream.adapter.aliyun;

import com.aliyun.api.AliyunClient;
import com.aliyun.api.ecs.ecs20130110.request.CreateInstanceRequest;
import com.aliyun.api.ecs.ecs20130110.response.CreateInstanceResponse;
import com.dtdream.base.ClientContext;
import com.dtdream.baseapi.ServerService;
import com.dtdream.entity.Server;
import com.dtdream.entity.action.ServerCreate;
import com.taobao.api.ApiException;
import com.taobao.api.internal.util.StringUtils;

import java.util.List;

/**
* Created by X0269 on 2015/4/25.
*/
class AliyunServer implements ServerService
{
    public AliyunServer() {

    }

    @Override
    public Server create(ServerCreate serverCreate) {
        CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
        createInstanceRequest.setRegionId(serverCreate.getRegionID());
        createInstanceRequest.setImageId(serverCreate.getImageID());
        createInstanceRequest.setInstanceType(serverCreate.getInstanceType());
        createInstanceRequest.setSecurityGroupId(serverCreate.getSecurityGroupID());

        try {
            AliyunClient client = (AliyunClient)serverCreate.getContext().getClient();
            CreateInstanceResponse createInstanceResponse = client.execute(createInstanceRequest);
            if (StringUtils.isEmpty(createInstanceResponse.getErrorCode())) { //创建成功
                String instanceId = createInstanceResponse.getInstanceId(); //获取实例ID
            } else {
                String errCode = createInstanceResponse.getErrorCode(); //获取错误码
                String message = createInstanceResponse.getMessage(); //获取错误信息
            }
            return new Server(createInstanceResponse.getInstanceId());
        } catch (ApiException e) {
            // TODO: handle exception
        }
        return null;
    }

    @Override
    public List<? extends Server> listAll(ClientContext context, boolean detail) {
        return null;
    }
}
