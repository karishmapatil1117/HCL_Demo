
public class LargestNumber {
     public static void main(String arg[]) {
    	 int mark[]= {98,56,47,23,15,100};
    	 int max=mark[0];
    	 for(int i=0;i<mark.length;i++) {
    		 if(mark[i]>max) {
    			 max=mark[i];
    		 }
    	 }
    	 System.out.println("Largest number is:"+max);
     }
}
