
public class SmallestNumber {
	
	     public static void main(String arg[]) {
	    	 int mark[]= {98,56,47,23,15,100};
	    	 int min=mark[0];
	    	 for(int i=0;i<mark.length;i++) {
	    		 if(mark[i]<min) {
	    			 min=mark[i];
	    		 }
	    	 }
	    	 System.out.println("Smallest number is:"+min);
	     }
	}


