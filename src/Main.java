import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		
		/*Fibonacci
		System.out.println("Enter number of fibonacci elements: ");
		int n = sc.nextInt();
		Fibonacci f = new Fibonacci(n);
		f.printFib();*/
		
		
		/*Number Swap
		NumberSwap ns = new NumberSwap(9, 15);
		ns.printNums();
		ns.swap();
		ns.printNums();*/
		
		
		/*Palindrome
		System.out.println("Enter a string: ");
		String m = sc.nextLine();
		char[] c = m.toCharArray();
		int l = c.length;
		int i = 0;
		char[] temp = new char[l];
		while(i < l/2){
			temp[i] = c[i];
			i++;
		}
		boolean b = true;
		i = 0;
		while(i < (l/2)){
			if(temp[i] == c[l-i-1]);
			else
				b = false;
			i++;
		}
		System.out.println("Is palindrome? "+b);*/
		
		
		//Sort Numbers - BEGAN DEBUGGING BUT DID NOT FINISH
		/*double[] sort = new double[10];
		for(int i = 0; i < 10; i++){
			System.out.println((i+1)+". "+"Enter a number: ");
			sort[i] = sc.nextDouble();
		}
		double[] sort = {75,23,64,80,3,56,12,65,78,5};
		SortNumbers sn = new SortNumbers(sort);
		sn.printNums();
		sn.sortNums();
		sn.printNums();*/
		
		
		/*Number of Prime
		System.out.println("Enter positive number: ");
		int num = sc.nextInt();
		int count = 0;
		if(num >= 2){
			System.out.println(2);
			count = 1;
			for(int i = 3; i < num; i++){
				boolean isPrime = true;
				for(int j = i-1; j > 1; j--){
					if(i % j == 0)
						isPrime = false;
					else;
				}
				if (isPrime){
					System.out.println(i);
					count++;
				}
				else;
			}
		}
		System.out.println("Number of primes: "+count);*/
		
		
		/*Reverse Number
		System.out.println("Enter integer: ");
		int num = sc.nextInt();
		int temp = 0;
		while(num != 0){
			temp = (temp*10) + (num%10);
			num = num / 10;
		}
		System.out.println(temp);*/
	}
}






