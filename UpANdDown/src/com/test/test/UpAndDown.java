package com.test.test;

public class UpAndDown {
	public static void main(String args[]){

		while(true){
		UpAndDowNB mygame = new UpAndDowNB();
		//GAME START MESSEGE
		System.out.println(mygame.gameStart());
		//GET RANDOM_NUMBER
		mygame.setRandom_number();
		
		while(true){
		mygame.setInput();

		/////////////////////UP DOWN////////////////////////
			while(mygame.match()==false){
			if(mygame.updown()==1){
				System.out.println(mygame.updownmessege());
				break;
			}
			else if(mygame.updown()==2){
				System.out.println(mygame.updownmessege());
				break;
			}
		}
		////////////////////////////////////////////////////
			
		/////////////////////맞췄을 때/////////////////////
			if(mygame.match()==true){
				System.out.println(mygame.updownmessege());
				System.out.println(mygame.checkmessege());
				if(mygame.setCheck()==true){
					continue;
				}
				else if(mygame.setCheck()==false){
					break;
				}
			}
		////////////////////////////////////////////////////
		 }
	}
}
}