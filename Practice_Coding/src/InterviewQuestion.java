
public class InterviewQuestion {
	int num;
	InterviewQuestion(int num){
		this.num=num;
	}

	public static void main(String args[]) {
		InterviewQuestion i1=new InterviewQuestion(10);
		InterviewQuestion i2=new InterviewQuestion(10);
		if(i1.equals(i2)) {
			System.out.println("both are same..");
		}
		else
		{
			System.out.println("both are not same..");
		}
		
		System.out.println("hashcode of i1 is"+i1.hashCode()+"\n"+"hashcode of i2 is"+i2.hashCode());
		
		
		System.out.println("**********-----------------------------**************");
		String s1=new String("neha");
		String s2=new String("neha");
		if(s1.equals(s2)) {
			System.out.println("both are same..");
		}
		else
		{
			System.out.println("both are not same..");
		}
		
		System.out.println("hashcode of s1 is"+s1.hashCode()+"\n"+"hashcode of s2 is"+s2.hashCode());
		
		System.out.println("**********-----------------------------**************");
		String s3=new String("neha");
		String s4=new String("pooja");
		if(s3.equals(s4)) {
			System.out.println("both are same..");
		}
		else
		{
			System.out.println("both are not same..");
		}
		
		System.out.println("hashcode of s2 is"+s3.hashCode()+"\n"+"hashcode of s3 is"+s4.hashCode());
		
		System.out.println("**********-----------------------------**************");
		
		
		String s5="pooja";
		String s6="pooja";
		if(s5.equals(s6)) {
			System.out.println("both are same..");
		}
		else
		{
			System.out.println("both are not same..");
		}
		
		System.out.println("hashcode of s5 is"+s5.hashCode()+"\n"+"hashcode of s6 is"+s6.hashCode());
		
		
		String s7="pooja";
		String s8="neha";
		if(s7.equals(s8)) {
			System.out.println("both are same..");
		}
		else
		{
			System.out.println("both are not same..");
		}
		
		System.out.println("hashcode of s7 is"+s7.hashCode()+"\n"+"hashcode of s8 is"+s8.hashCode());
		
	}
}
