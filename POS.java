import java.util.Scanner;  
public class POS   
{
public static void main(String[] args)   
{  
String name;
String y;
int n=0,x = 0,z=1,a = 0;
int total = 0,num;
int[] array = new int[10];
String[] array1 = new String[10];
Scanner sc = new Scanner(System.in);
do
{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your item: ");
	System.out.print(z+" ");
	name = input.nextLine();
	System.out.println("Enter the price: ");
	num = input.nextInt();
	System.out.print("Do you want to continue:(yes or no): ");
	y = sc.next();
	array[x] = num;  
	array1[n] = name;
	y = y.toLowerCase();
	n++;
	x++;
	z++;
}while(y.equals("yes"));
 
 for(int i = 0;1<array.length;i++)
 {
	 if(array[i]==0)
	 {
		 break;
	 }
	 a++;
	 total=total + array[i];
	 System.out.println(a+" . "+array1[i]+" - "+array[i]);
 }
 System.out.println("YOUR TOTAL IS "+total);
 
}
}
