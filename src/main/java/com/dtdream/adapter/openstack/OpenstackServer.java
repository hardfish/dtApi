package com.dtdream.adapter.openstack;

import com.dtdream.base.ClientContext;
import com.dtdream.baseapi.ServerService;
import com.dtdream.entity.Server;
import com.dtdream.entity.action.ServerCreate;
import org.openstack4j.api.OSClient;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by X0269 on 2015/4/27.
 */
public class OpenstackServer implements ServerService
{
	public OpenstackServer() {

	}

	@Override
	public Server create(ServerCreate serverCreate) {

		return null;
	}

	@Override
	public List<? extends Server> listAll(ClientContext context, boolean detail) {
		OSClient os = (OSClient)context.getClient();
		List<? extends org.openstack4j.model.compute.Server> servers = os.compute().servers().listAll(detail);
		List<Server> slist = new LinkedList<Server>();
		Server newServer;
		for (org.openstack4j.model.compute.Server s : servers)
		{
			newServer = new Server(s.getId(), s.getInstanceName());
			slist.add(newServer);
		}
		return slist;
	}
}
