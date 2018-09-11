package main;

public class MainClass {
	static int total=0;
	final int LENGTH=10;
	int add[]=new int[LENGTH];
	public static void addScore(int add[])
	{
		for(int i=0;i<add.length;i++)
		{
			total=total+add[i];
		}
		System.out.print(total);
	}
	public static void main(String arg[])
	{
		int array[]= {3,4,5,6,7,8,1,0,9};
		addScore(array);

	}
}
