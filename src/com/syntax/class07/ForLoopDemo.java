package com.syntax.class07;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1; i<=5; i++) {
	System.out.println("Hello");
}
System.out.println("------------------");
// print numbers from 1 to 20
for(int i=1; i<=20; i++) {
	System.out.print(i+" ");
}
System.out.println("-----------------");
//print from 30 to 10
for(int i=30; i>=10;i--) {
	System.out.print(i+" ");
}
System.out.println("-------------");

//what is a output
for(int i=0; i<=10; i+=2) {
	System.out.print(i+" ");
}
System.out.println("-----------------");
//what is a output
for(int i=10; i<=25; i+=5) {
	System.out.print(i+" ");
}

System.out.println("------------");
int sum=0;
for(int i=1; i<=6;i++) {
	sum+=i;
}
System.out.println(sum);  //0+1+2+3+4+5+6
	}

}
