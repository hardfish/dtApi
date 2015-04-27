package com.dtdream.entity;

/**
 * Created by X0269 on 2015/4/25.
 */
public class Server {
	private String serverID;
	private String instanceName;

	public Server(String serverID) {
		this.serverID = serverID;
	}

	public Server(String serverID, String instanceName) {
		this.serverID = serverID;
		this.instanceName = instanceName;
	}

	public Server() {

	}

	public String getInstanceName() {
		return instanceName;
	}
}
