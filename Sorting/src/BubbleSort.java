
public class BubbleSort {
	public static void main(String[] args) {
		int[] numbers = {9,7,6,3};
		//int c=0;
		bubbleSort(numbers);
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			}
		
	
	}
	 static void bubbleSort(int[] numbers) {  
		 
	        int n = numbers.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){ 
	        	 
	                 for(int j=1; j < (n-i); j++){  
	                	 
	                          if(numbers[j-1] > numbers[j]){  
	                        
	                                 temp = numbers[j-1];  
	                                 numbers[j-1] =numbers[j];  
	                                 numbers[j] = temp;  }
	                 }
	         }
	 }
	
}
