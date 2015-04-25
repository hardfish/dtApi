package com.dtdream;

import com.dtdream.adapter.aliyun.AliyunDtAdapter;
import com.dtdream.adapter.openstack.OpenstackDtAdapter;
import com.dtdream.baseapi.DtApi;

/**
 * Created by X0269 on 2015/4/25.
 */
public class DtAdapterFactory {
    public static DtApi getApi(String provider)
    {
        if(provider.equals("Aliyun"))
        {
            return new AliyunDtAdapter();
        }
        else if(provider.equals("Openstack"))
        {
            return new OpenstackDtAdapter();
        }
        else
        {
            //error
            return null;
        }
    }
}
