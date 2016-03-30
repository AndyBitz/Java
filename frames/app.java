import javax.swing.JFrame;

class app{

	public static void main(String[] args){

		JFrame frame = new JFrame("Frame Title");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// didn't work - don't know why
		// frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		frame.pack();

		frame.setVisible(true);

	}

}