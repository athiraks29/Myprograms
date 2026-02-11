package multilevelinh_samp;

public class Father extends Grandparent{
public void mul(int a, int b) {
	int mul = a*b;
	System.out.println("Printing from Father:" + mul);
}
}
