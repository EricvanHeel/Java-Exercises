
public class SortNumbers {
	double[] sort;
	
	public SortNumbers(double[] s){
		sort = s;
	}
	
	public void sortNums(){
		double[] sorted = new double[10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(sorted[j] == 0.0){
					sorted[j] = sort[i];
					break;
				}
				else if(sort[i] > sorted[j]);
				else{
					while(sorted[j]!=0.0){
						//sorted
					}
						sorted[j+1] = sorted[j];
						sorted[j] = sort[i];
					}
					break;
			}
		}
		sort = sorted;
	}
	
	public void printNums(){
		for(int i = 0; i < 10; i++){
			System.out.println((i+1)+". "+sort[i]);
		}
	}
}
