import java.util.Scanner;

class app{

	public static void main(String[] args){

		// object for user input
		Scanner input = new Scanner(System.in);

		// vars to store user input
		String s;
		int i;
		double d;

		// vars to modify the output
		// this applies only too the indentions and the border-lines
		int count = 24;
		String ind = "    ";

		System.out.println();

		// border
		for(i=0; i<=count; i++){
			System.out.print("-");
		}

		System.out.println();

		
		System.out.print(ind+"please enter your name: ");
		s = input.next();		// get a String value


		System.out.print(ind+"please enter your age: ");
		i = input.nextInt();	// get an Integer value


		System.out.print(ind+"please enter a double: ");
		d = input.nextDouble();	// get an Double value


		// border
		for(i=0; i<=count; i++){
			System.out.print("-");
		}

		// end
		System.out.println();
		System.out.println();
		System.out.printf("goodbye %s", s);

		System.out.println();
	}

}