package com.dtdream.adapter.openstack;

import com.dtdream.base.ClientContext;
import com.dtdream.baseapi.ComputeService;
import com.dtdream.baseapi.DtApi;
import com.dtdream.baseapi.IdentityService;
import org.openstack4j.api.OSClient;
import org.openstack4j.openstack.OSFactory;

/**
 * Created by X0269 on 2015/4/25.
 */
public class OpenstackDtAdapter implements DtApi {

    @Override
    public ClientContext createClient(String endpoint, String id, String password) {
        OSClient os = OSFactory.builder()
                .endpoint(endpoint)
                .credentials(id, password)
                .tenantName("admin")
                .authenticate();
        return new ClientContext(os);
    }

    @Override
    public ComputeService compute() {
        return OpenstackApis.get(ComputeService.class);
    }

    @Override
    public IdentityService identity() {
        return OpenstackApis.get(IdentityService.class);
    }
}
