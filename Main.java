public class Main
{
	static void myMethod()//method is created here
	{
		System.out.println("I am being executed!");
	}
	public static void main(String args[])
	{
		myMethod();//method is called here
		myMethod();
		myMethod();// S.O.P message will be printed as many times method is called
	}
}