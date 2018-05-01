
public class Fibonacci {
	int num;
	
	public Fibonacci(int i){
		num = i;
	}
	
	public void printFib(){
		int[] fib = new int[100];
		fib[0] = 1;
		fib[1] = 2;
		if(num > 0)
			System.out.println(fib[0]);
		else
			System.out.println("Not a valid number");
		if(num > 1)
			System.out.println(fib[1]);
		if(num > 2){
			for(int j = 2; j < num; j++){
				fib[j] = fib[j-1] + fib[j-2];
				System.out.println(fib[j]);
			}
		}
	}
}
