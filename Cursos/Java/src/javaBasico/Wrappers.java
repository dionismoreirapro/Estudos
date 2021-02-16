package javaBasico;

public class Wrappers {

	public static void main(String[] args) {
		
		
	
	Short a = 100;
	
	Integer c = 1000;
	Long d = 1000L;
	
	Boolean bo = Boolean.parseBoolean("false");
	
	System.out.println(Byte.SIZE);
	String t = a.toString();
	System.out.println(t + 103);
	System.out.println(bo);

	
	Character test = '$';
	
	System.out.println(test);
	
	Double star = 2.300;
	Float i = 3.4F;
	
	System.out.println(star);
	System.out.println(i);
	System.out.println(c);
	System.out.println(d);
	}

}	