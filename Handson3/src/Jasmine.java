
public class Jasmine extends Flower {
	
		protected int number;
		

		public int getNumber() {
			return number;
		}


		public void setNumber(int number) {
			this.number = number;
		}


		public static void main(String[] args) {
			Jasmine J1 =new Jasmine();
			J1.setNumber(12345);
			System.out.println(J1.getNumber());
			J1.display();
			

		}


	}



