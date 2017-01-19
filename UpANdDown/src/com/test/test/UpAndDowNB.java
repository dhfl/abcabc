package com.test.test;
import java.util.Scanner;

public class UpAndDowNB {
	private int input;
	private int random_number;
	//private int sum;
	//private int game_count;
	private boolean check;
	private String gostop=" ";
	
	public UpAndDowNB(){
		//input 숫자, 랜덤숫자, 합계, 판수, Y/N
		int input=0;
		int random_number=0;
		boolean check=true;
		//int sum=0;
		//int game_count=0;
		//String checkgame=" ";
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
	
	
	public String getCheck(){
		Scanner check1 = new Scanner(System.in);
		String gostop=" ";
		this.gostop=check1.nextLine();
		return gostop;
	}
	public boolean setCheck(){
		if(this.gostop == "Y" || this.gostop == "y")
			this.check = check = true;
		else if(this.gostop == "N" || this.gostop=="n")
			this.check = check =false;
		return check;
	}
	
	public String gameStart(){
		String messege = "Up and Down\n"
					   + "1~100사이의 숫자를 입력해주세요.\n";
		return messege;
	}
	public String startmessege(){
		return "┌───────────────┐\n"
			 + "│   UP & DOWN   │\n"
			 + "│               │\n"
			 + "│   S T A R T   │\n"
			 + "│               │\n"
			 + "└───────────────┘\n";
	}
	
	public String initGame(){
		return "┌───────────────┐\n"
			 + "│   UP & DOWN   │\n"
			 + "│1. 시작하기    │\n"
			 + "│2. 그만하기    │\n"
			 + "│3. 기록보기    │\n"
			 + "└───────────────┘\n";
	}
	
	public boolean up(){
		if(input < random_number)
		return true;
		return false;
	}
	public boolean down(){
		if(input > random_number)
		return true;
		return false;
	}
	
	public boolean match(){
		if(input==random_number)
			return true;
		return false;
	}
	
	public String updownmessege(){
		if(up()==true)
			return "UP!!";
		else if(down()==true)
			return "DOWN!!";
		else if(match()==true)
			return "정답!!";
		return " ";
	}
	public String checkmessege(){
		return "게임을 계속하시겠습니까?(Y/N)";
	}
	
	public void clearconsole(){
		for(int i=0;i<80;i++)
			System.out.println(" ");
	}

}
