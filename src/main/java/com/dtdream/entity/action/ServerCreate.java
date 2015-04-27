package com.dtdream.entity.action;

import com.dtdream.base.ClientContext;

/**
 * Created by X0269 on 2015/4/25.
 */
public class ServerCreate {
	ClientContext context;
	String regionID;
	String imageID;
	String instanceType;
	String securityGroupID;

	public ServerCreate(ClientContext context, String regionID, String imageID, String instanceType, String securityGroupID) {
		this.context = context;
		this.regionID = regionID;
		this.imageID = imageID;
		this.instanceType = instanceType;
		this.securityGroupID = securityGroupID;
	}

	public ClientContext getContext() {
		return context;
	}

	public String getRegionID() {
		return regionID;
	}

	public String getImageID() {
		return imageID;
	}

	public String getInstanceType() {
		return instanceType;
	}

	public String getSecurityGroupID() {
		return securityGroupID;
	}
}
