package com.dtdream.adapter.aliyun;

import com.aliyun.api.AliyunClient;
import com.aliyun.api.DefaultAliyunClient;
import com.aliyun.api.ecs.ecs20130110.request.CreateInstanceRequest;
import com.aliyun.api.ecs.ecs20130110.response.CreateInstanceResponse;
import com.dtdream.baseapi.DtApi;
import com.dtdream.entity.action.ServerCreate;
import com.taobao.api.ApiException;
import com.taobao.api.internal.util.StringUtils;

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

    class Compute implements DtApi.ComputeService{

        class Server implements DtApi.ComputeService.ServerService
        {
            @Override
            public com.dtdream.entity.Server create(ServerCreate serverCreate) {
                CreateInstanceRequest createInstanceRequest = new CreateInstanceRequest();
                createInstanceRequest.setRegionId("<RegionId>");
                createInstanceRequest.setImageId("<ImageId>");
                createInstanceRequest.setInstanceType("<InstanceType>");
                createInstanceRequest.setSecurityGroupId("<SecurityGroupId>");

                try {
                    CreateInstanceResponse createInstanceResponse = client.execute(createInstanceRequest);
                    if (StringUtils.isEmpty(createInstanceResponse.getErrorCode())) { //创建成功
                        String instanceId = createInstanceResponse.getInstanceId(); //获取实例ID
                    } else {
                        String errCode = createInstanceResponse.getErrorCode(); //获取错误码
                        String message = createInstanceResponse.getMessage(); //获取错误信息
                    }
                    return new com.dtdream.entity.Server(createInstanceResponse.getInstanceId());
                } catch (ApiException e) {
                    // TODO: handle exception
                }
                return null;
            }
        }
    }
}
