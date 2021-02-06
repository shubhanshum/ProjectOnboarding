package com.epam.oops.composition;

import java.util.List;

public class MobileStore {

	List<Mobile> mobiles;

	public MobileStore(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}

	public List<Mobile> getTotalMobileNumber() {
		return mobiles;
	}
	
}
