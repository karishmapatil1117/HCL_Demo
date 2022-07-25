import java.util.Arrays;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
	String str="I am Gayatri";
	String rev = "";
	char ch[]=str.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
	 rev+=ch[i];
	
     System.out.println(rev);
    
	}
	
}
}