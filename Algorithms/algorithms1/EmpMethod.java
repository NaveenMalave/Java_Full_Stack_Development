package com.algorithms1;

public class EmpMethod {
	static int empSearch(Employee emparr[],String key) {
		for(int i =0;i<emparr.length;i++) {
			if(key.equals(emparr[i].name)) {
				return i;
			}
		}
		return -1;
	}

}
