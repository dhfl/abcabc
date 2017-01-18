package com.test.test;
import java.util.Scanner;

public class UpAndDowNB {
	private int input;
	private int random_number;
	private int sum;
	private int game_count;
	private String chcakgame;
	private boolean check;
	
	public UpAndDowNB(){
		//input 숫자, 랜덤숫자, 합계, 판수, Y/N
		int input=0;
		int random_number=0;
		int sum=0;
		int game_count=0;
		String checkgame=" ";
		boolean check=true;
	}
	
	public int setInput(){
		Scanner input_number = new Scanner(System.in);
		input = input_number.nextInt();
		this.input = input;
		return input;
	}
	public void getInput(){
	}
	
	public int setRandom_number(){
		this.random_number=(int)(Math.random()*100+1);
		return random_number;
	}
	public void getRandom_number(){
	}
	
	public boolean setCheck(){
		Scanner check1 = new Scanner(System.in);
		String gostop=" ";
		gostop=check1.nextLine();
		if(gostop == "Y" || gostop == "y")
			check = true;
		else if(gostop == "N" || gostop=="n")
			check = false;
		return check;
	}
	public void getCheck(){
		String gostop=" ";
		Scanner check1 = new Scanner(System.in);
		gostop=check1.nextLine();
	}
	
	public String gameStart(){
		String messege = "Up and Down\n"
					   + "1~100사이의 숫자를 입력해주세요.\n";
		return messege;
	}
	
	public int updown(){
		if(input < random_number)
		return 1;
		else if(input > random_number)
		return 2;
		else
		return 3;
	}
	public boolean match(){
		if(input==random_number)
			return true;
		return false;
	}
	
	public String updownmessege(){
		if(updown()==1){
			return "UP!!";
		}
		else if(updown()==2){
			return "DOWN!!";
		}
		else
			return "정답!!";
	}
	public String checkmessege(){
		return "게임을 계속하시겠습니까?(Y/N)";
	}

}
