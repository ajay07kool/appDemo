package com.alacriti.demo.singleton.enumm;

enum EnumSingleton{
	INSTANCE;
	public String getConfiguration(){
		return "from enum";
	}
}