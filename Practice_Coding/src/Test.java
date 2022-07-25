/*public class Test {
public static void main(String[] args)
{
    B b = new B();
     b.m1();

    A a = new A();
     a.m1();

    A a2 = new B();
     a2.m1();
  }
}*/

public class Test {

public static void main(String[] args)

{

	/*
	 * B b = new B();
	 * 
	 * System.out.println("x value in B "+ b.x);
	 * 
	 * b.m1();
	 * 
	 * 
	 * 
	 * A a = new A();
	 * 
	 * System.out.println("x value in A "+ a.x);
	 * 
	 * a.m1();
	 */
 

    A a2 = new B();

    System.out.println("x value in B "+ a2.x);

     a2.m1();

  }

}