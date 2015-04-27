package com.dtdream.entity;

/**
 * Created by X0269 on 2015/4/25.
 */
public class Server {
	private String serverID;
	private String instanceID;
	private String instanceName;

	public Server(String serverID, String instanceName) {
		this.serverID = serverID;
		this.instanceName = instanceName;
	}

	public Server(String instanceID) {
		this.instanceID = instanceID;
	}

	public String getInstanceName() {
		return instanceName;
	}
}
