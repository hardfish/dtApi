package com.dtdream.baseapi;

/**
 * Created by X0269 on 2015/4/25.
 */
public interface DtApi {

    public Object createClient(String endpoint, String tenantName, String username, String password);
    ComputeService compute();
    IdentityService identity();
}