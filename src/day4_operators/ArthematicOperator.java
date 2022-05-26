package day4_operators;

public class ArthematicOperator {

	public static void main(String[] args) {
		// + , - , * , / , % , ++ , --
		
		
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		

		System.out.println(a/b);
		System.out.println(a*b);
		System.out.println(b-a); // 2
		System.out.println(b-a);
		
		
		
		double result = a / b;
		
		System.out.println(result);
		
		
		double valueA = a;
		double valueB = b;
		
		double result2 = valueA/valueB;
		
		System.out.println(result2);
		
		
		
		// ++
		int valueC = 1;
		System.out.println(valueC);
		
		
		valueC = valueC +1;
		valueC = valueC +1;
		valueC = valueC +1;
		valueC = valueC +1;
		System.out.println(valueC);//5
		
		valueC = valueC -1;
		System.out.println(valueC);
		
		
		// %
				int A = 10;
				int B = 3;
				
				System.out.println(A/B);
				System.out.println(A%B); //(3, 3, 3, 1)
				System.out.println(10%4); //(4 , 4, 2)
				System.out.println(10 %5); // (5 , 5)
		
		
		
		
		
		
		
		
		
		
		
	}

}
