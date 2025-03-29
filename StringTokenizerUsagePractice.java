import java.util.Scanner;
import java.util.StringTokenizer;
public class StringTokenizerUsagePractice
{
void main(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Sentence !");
String str=sc.nextLine();
StringTokenizer st=new StringTokenizer(str);
int count_of_words=st.countTokens();
System.out.println("The Number Of The Words :- "+""+count_of_words);
System.out.println("The Number Of The Spaces :-"+" "+(count_of_words-1));
int count=0,c=0;
for(int i=0;i<str.length();i++){
if("AEIOUaeiou".indexOf(str.charAt(i))>=0){
    c++; 
    continue;
}
else
count++;
}
System.out.println("The Number Of The Vowels Is "+" "+c);
System.out.println("The Number Of Consonants Is"+" "+count);
}    
}
