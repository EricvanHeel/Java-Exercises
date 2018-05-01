
public class NumberSwap {
	int a;
	int b;
	
	public NumberSwap(int alpha, int beta){
		a = alpha;
		b = beta;
	}
	
	public void swap(){
		a = b-a;
		b = b-a;
		a = b+a;
	}
	
	public void printNums(){
		System.out.println("a: "+a+"\tb: "+b);
	}
}
