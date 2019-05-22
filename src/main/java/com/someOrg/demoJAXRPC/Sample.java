package com.someOrg.demoJAXRPC;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.someOrg.indus.client.YourWSServiceLocator;
import com.someOrg.indus.client.UserRequest;
import com.someOrg.indus.client.UserResponse;

/**
 * @description
 * <Provide a brief description about the class Sample>
 * 
 * @author NDH00362
 * @date 15-Feb-2019
 *
 * 
 * @history
 * 
 * 
 *
 */
public class Sample {

	public static void main(String[] args) {
		
		try {
			UserResponse res = new YourWSServiceLocator().getYourWSPort().userRequest(new UserRequest("username", "password"));
			if (res.getErrorCode().equals("defined success code")) {
				System.out.println("Success");
			} else {
				System.out.println(res.getErrorCode().toString() + " False");
			}
		} catch (RemoteException | ServiceException e) {
			e.printStackTrace();
		}

	}

}
