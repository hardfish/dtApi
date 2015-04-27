package com.dtdream.baseapi;

import com.dtdream.base.ClientContext;
import com.dtdream.entity.Server;
import com.dtdream.entity.action.ServerCreate;

import java.util.List;

/**
 * Created by X0269 on 2015/4/25.
 */
public interface ServerService {

	Server create(ServerCreate server);

	List<? extends Server> listAll(ClientContext context, boolean detail);
}
