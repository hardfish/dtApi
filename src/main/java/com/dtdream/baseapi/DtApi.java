package com.dtdream.baseapi;

import com.dtdream.base.ClientContext;

/**
 * Created by X0269 on 2015/4/25.
 */
public interface DtApi {

    public ClientContext createClient(String endpoint, String id, String password);
    ComputeService compute();
    IdentityService identity();
}