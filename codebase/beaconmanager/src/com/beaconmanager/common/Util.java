package com.beaconmanager.common;

public class Util {

	public static boolean isEmpty(String theString){
		if(null != theString && !"".equals(theString.trim())){
			return false;
		}
		return true;
	}
}
