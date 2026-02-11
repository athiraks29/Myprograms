package inheritancesample;

public class inhchild extends inhparent {
	public void test() {
		System.out.println("Final result is");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inhchild child1 = new inhchild();
		child1.test();
		child1.sum(34,44);		
	}
}
