package ver1;

public class HelloWorld {
	
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static void whatFor(String arg) {
		arg += "stringArg. what for?";
		System.out.println(arg);
	}


	public static void main(String[] args) {
		
		System.out.println("Hello From Github");
		whatFor("hey");

	}

}
