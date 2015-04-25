package com.dtdream.adapter.openstack;

import com.dtdream.cloudapi.openstack.OpenstackApi;
import com.dtdream.baseapi.DtApi;

import javax.inject.Inject;

/**
 * Created by X0269 on 2015/4/25.
 */
public class OpenstackDtAdapter implements DtApi {
    @Inject
    OpenstackApi opstkApi;

    public void createInstance()
    {
        opstkApi.createServer();
    }
}
