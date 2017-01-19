package com.test.test;

public abstract class Regame {
	public String check;
	public Regame(String check){
		this.check=check;
	}
	public boolean regame(){
		if(check=="y"||check=="Y"){
			return true;
		}
		else return false;
	}
}
