import java.util.Scanner;
/**
 * Write a description of class Teacher here.
 *
 * @author (Prabuddha Pal)
 * @version (26 th of June 2024)
 */
public class Teacher
{
    String name[]=new String[5];
    String dob[]=new String[5];
    String doj[]=new String[5];
    void get_data(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Names Of The 5 Teachers !");
    for(int i=0;i<5;i++){
    name[i]=sc.nextLine();
    }
    System.out.println("Enter The Date Of Birth Of The 5 Teachers !");
    for(int i=0;i<5;i++){
    dob[i]=sc.nextLine();
    }
    System.out.println("Enter The Date Of Joining Of 5 Teachers !");
    for(int i=0;i<5;i++){
    doj[i]=sc.nextLine();
    }
    }
    void show_getdata(){
    System.out.println("NAME OF TEACHERS "+"");
    for(int i=0;i<5;i++){
    System.out.println(name[i]+" ");
    }
    System.out.println("DATE OF JOINING");
    for(int i=0;i<5;i++){
    System.out.println(doj[i]+" ");
    }
    System.out.println("DATE OF BIRTH ");
    for(int i=0;i<5;i++){
    System.out.println(dob[i]+" ");
    }
}
}