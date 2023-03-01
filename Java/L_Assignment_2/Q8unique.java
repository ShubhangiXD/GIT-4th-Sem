import java.util.*;
public class Q8unique {
    static void printDistinct(int arr[], int n)
    {
        int count2=0;
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            if (arr[i] == arr[j])
                break;
    
            if (i == j){
            count2++;
            }
        }
        System.out.println("No. of unique digits: "+count2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        String num1=sc.nextLine(); //taking a string num
        int count = num1.length(); //finding the length of the string wihtout having to use a loop
        int num = Integer.parseInt(num1); //converting the string to integer
        int[] arr = new int[10];
        int copy=num;
        //System.out.println(count);
        copy=num;
        for (int i=0; i<count;i++)
        {
            int d=copy%10;
            arr[i]=d;
            copy=copy/10;
        }
        printDistinct(arr, count);
        sc.close();
    }
}
