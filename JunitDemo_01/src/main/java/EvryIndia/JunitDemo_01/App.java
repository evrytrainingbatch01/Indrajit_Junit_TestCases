package EvryIndia.JunitDemo_01;

public class App {
    public static int checkMax(int arr[]) {
    	int max = arr[0];
    	 for(int i=1;i<arr.length;i++){  
             if(max<arr[i])  
                 max=arr[i];  
         } 
		return max;  	
    }
    
    
    public static int[] checkSquare(int arr[]) {
    	/*int square = arr[0];
    	int outPutarray[] = new int[5];*/
    	int[] outPutarray = new int[] {0,0};
    	for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[i] = (int) Math.pow(arr[i], 2);
				outPutarray [i] = arr[i];
			}
		}
        return outPutarray;  
    }   
}
