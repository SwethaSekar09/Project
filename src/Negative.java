package com.example.myproject;

//SWETHA SEKAR 7/7/17
public class Negative {
	
	public boolean posNeg(int a,int b, boolean negative){
		if(!negative==false)
			if((a<0) && (b<0))
			return true;
			else return false;
		else if(!negative==true)
			if(((a<0)&& (b>0))||((a>0) && (b<0)))
		 return true;
		 else 
			 return false;
		else return false;
}
 public static void main(String[] args) {
 Negative case1=new Negative();
 boolean result1= case1.posNeg(1,-1,false);
 System.out.println(result1);
 Negative case2=new Negative();
 boolean result2= case2.posNeg(-1,-1,false);
 System.out.println(result2);
Negative case3=new Negative();
 boolean result3= case3.posNeg(-1,-1,true);
 System.out.println(result3);

 }
}
 
