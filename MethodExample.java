public class MethodExample
{
	public static void main (String args [])
	{
		int total = sum (10,20);//arguments
		System.out.println(total);	
		int total2 = sum (20,30);//arguments
		System.out.println(total2);
	}
	 static int sum(int num1, int num2)//parameters
	 {
		 int total = num1 + num2;
		 return total;
	 }
}