package methodoverloading;

public class Subtractor {
	static int sub(int a,int b) {return a-b;}
	static int sub(int a,int b,int c) {return a-b-c;}
}
class Testoverloading{ 

	public static void main(String[] args) {
		System.out.println(Subtractor.sub(10,10));
		System.out.println(Subtractor.sub(10,10,10));
	}

	}
	
