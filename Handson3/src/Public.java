
public class Public {
	public String name;
	public void display()
	{
		System.out.println("public modifier");
	}

	public static void main(String[] args) {
		Public p2=new Public();
		p2.name="vinay";
		p2.display();

	}

}
