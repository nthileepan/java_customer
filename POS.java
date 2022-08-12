import java.util.ArrayList;
import java.util.Scanner;  
public class POS   
{
public static void main(String[] args)   
{  
String name;
String y;
int n=0,x = 0,z=1,a = 1;
int total = 0,num;
ArrayList<Integer> array = new ArrayList<>();
ArrayList<String> array1 = new ArrayList<>();
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
	array.add(num);  
	array1.add(name);
	y = y.toLowerCase();
	z++;
}while(y.equals("yes"));
for(int i = 0;i<array.size();i++)
{
	 total=total + array.get(i);
	 System.out.println(a+" . "+array1.get(i)+" - "+array.get(i));
	 a++;
}
System.out.println("total: "+total);
}
}
