package hierarchial_smpl;

public class Daughter extends Father {
	public void daughter()
	{
		System.out.println("Daughter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d1 = new Daughter();
		d1.daughter();
		d1.Age(65);
	}

}
