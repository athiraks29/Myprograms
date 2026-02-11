package hierarchial_smpl;

public class Son extends Father{
	public void son()
	{
		System.out.println("son");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Son s1 = new Son();
s1.son();
s1.Age(74);
	}
}
