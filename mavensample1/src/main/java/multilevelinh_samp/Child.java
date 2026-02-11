package multilevelinh_samp;

public class Child extends Father{
	public void child1() {
		System.out.println("printing from child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.child1();
		c1.Sum(5,6);
		c1.mul(7,8);

	}

}
