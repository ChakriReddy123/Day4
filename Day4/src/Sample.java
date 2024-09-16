
public class Sample {

	static void go(Object a) {
		System.out.println("Integer null"+a);
	}
	static void go(String a) {
		System.out.println("Integer "+a);
	}
	

	public static void main(String[] args) {
		
		go(null);
	}

}
