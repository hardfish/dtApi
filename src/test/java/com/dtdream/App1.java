package com.dtdream;

import com.dtdream.baseapi.DtApi;

/**
 * Created by X0269 on 2015/4/25.
 */
public class App1 extends DtAdapterFactory {
    public static void main(String[] argvs)
    {
        DtApi dtApi = DtAdapterFactory.getApi("Aliyun");

        dtApi.createInstance();
    }
}
