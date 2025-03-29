import java.util.Scanner;
public class SortingRow
{
  void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the M");
    int m=sc.nextInt();
    System.out.println("Enter The Value Of n");
    int n=sc.nextInt();
    int arr[][]=new int[m][n];
    System.out.println("Enter the elements will be");
    for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
    arr[i][j]=sc.nextInt();
    }
    }
    //Display
    System.out.println("Original Array !");
    for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
    System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }
    /**
     * Sort
     */
    int t=0;
    for(int i=0;i<m;i++){
    for(int j=0;j<n-1;j++){
    for(int k=0;k<n-1-j;k++){
    if(arr[i][k]>arr[i][k+1]){
        t=arr[i][k];
        arr[i][k]=arr[i][k+1];
        arr[i][k+1]=t;
    }
    }
    }
    }
    System.out.println("After Sorting Rows !");
    for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
    System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }
    }
}
