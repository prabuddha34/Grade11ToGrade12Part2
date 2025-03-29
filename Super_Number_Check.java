import java.util.Scanner;
//I Got a new Number

/*
 * (166)^3+(500)^3+(333)^3=166500333
 * 
 */
public class Super_Number_Check{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three Numbers !");
int n=sc.nextInt();
int n1=sc.nextInt();
int n2=sc.nextInt();
//Cube the three Numbers and then add the three number to get a special number
int sum=(int)(Math.pow(n,3)+Math.pow(n1,3)+Math.pow(n2,3));
System.out.println("The Number that you found is "+" "+sum);
   

}

}
