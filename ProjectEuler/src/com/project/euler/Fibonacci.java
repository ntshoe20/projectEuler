package com.project.euler;

public class Fibonacci {
	
	Fibonacci(){
		//empty constructor
	}
	
	public static long fib(long index){
		if(index == 0 ){
			return 0;
		}else if(index == 1){
			return 1;
		}else 
		return fib(index -1) + fib(index -2);
		
	}
}
