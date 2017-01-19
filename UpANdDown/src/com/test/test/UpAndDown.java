package com.test.test;

public class UpAndDown {
	public static void main(String args[]){
		UpAndDowNB mygame = new UpAndDowNB();
		UpAndDowNB regame = new UpAndDowNB();
		
		System.out.print(mygame.initGame());
		while(regame.setCheck()==false){
		///////////////////////////////////////////////////이거 안에만 수정

		//GAME START MESSEGE
		
		System.out.println(mygame.gameStart());
		
		//GET RANDOM_NUMBER
		mygame.setRandom_number();
		
		while(true){
		
		mygame.setInput();
		/////////////////////UP DOWN////////////////////////
			while(mygame.match()==false){
			System.out.println(mygame.updownmessege());
			break;
		}
		////////////////////////////////////////////////////
			
		/////////////////////맞췄을 때/////////////////////
			if(mygame.match()==true){
				System.out.println(mygame.updownmessege());
				System.out.println(mygame.checkmessege());
				regame.getCheck();
				break;					
			}
		////////////////////////////////////////////////////
		 }
	}
}
}