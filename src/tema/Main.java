package tema;

public class Main {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 5;
		
		IOperator sum = (a, b) -> a + b;
		IOperator diff = (a, b) -> a - b;
		IOperator mul = (a, b) -> a * b;
		IOperator div = (a, b) -> a / b;
		IOperator mod = (a, b) -> a % b;
		
		System.out.println(x + " + " + y  + " = " + sum.operation(x, y));
		System.out.println(x + " - " + y  + " = " + diff.operation(x, y));
		System.out.println(x + " * " + y  + " = " + mul.operation(x, y));
		System.out.println(x + " / " + y  + " = " + div.operation(x, y));
		System.out.println(x + " % " + y  + " = " + mod.operation(x, y));
		System.out.println();
		
		IVerifyProperty even = a -> a % 2 == 0;
		IVerifyProperty negative = a -> a < 0;
		IVerifyProperty isZero = a -> a == 0;
		
		int z = 0;
		int w = -5;
		
		System.out.println("Is " + x + " even? -> " + even.hasProperty(x));
		System.out.println("Is " + x + " negative? -> " + negative.hasProperty(x));
		System.out.println("Is " + w + " negative? -> " + negative.hasProperty(w));
		System.out.println("Is " + x + " zero? -> " + isZero.hasProperty(x));
		System.out.println("Is " + z + " zero? -> " + isZero.hasProperty(z));
	}

}
