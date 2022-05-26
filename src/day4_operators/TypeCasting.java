package day4_operators;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		System.out.println(d);
/* 
 * Narrowing Casting (manually) - converting a larger to to a smaller size type
		 *  double --> float --> long --> int --> char --> short--> byte
 * */
		
		
		
		
		long c= 70000000L;
		float d = c;
		
		int valueA = 10;
		byte valueB = (byte)valueA;
		
		System.out.println(valueA);
		System.out.println(valueB);
		
		int valueC = 300; 
		byte valueD = (byte)valueC; // byte --> -128 ~ 127
		
		System.out.println(valueD);
		
		double e = 4000;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		short f = (short)e;
		System.out.println(f);
		
		
		
		
		
	}

}
