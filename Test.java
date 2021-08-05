

class A11{
static{
System.out.println("static of A");
}
{
System.out.println("instance block of A");
}
}

class B11 extends A11{
static{
System.out.println("static of B");
}
{
System.out.println("instance block of B");
}
}

public class Test {
public static void main(String[] agrs){
	B11 b = new B11();
	B11 b1 = new B11();
}
}