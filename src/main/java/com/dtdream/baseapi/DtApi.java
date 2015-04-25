package com.dtdream.baseapi;

import com.dtdream.entity.Server;
import com.dtdream.entity.action.ServerCreate;

/**
 * Created by X0269 on 2015/4/25.
 */
public interface DtApi {

    public Object createClient(String endpoint, String tenantName, String username, String password);

    public interface ComputeService {

        /**
         * Server Service API
         *
         * @return the server service
         */
        public interface ServerService {
            Server create(ServerCreate server);
        }
    }

    public interface IdentityService {
    }


}