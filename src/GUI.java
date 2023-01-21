import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI {

	GUI(){
		
		//The canvas
		JFrame frame = new JFrame();
		frame.setTitle("Study Tool");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);

		//Label
		JLabel session = new JLabel("Session: ");
		session.setBounds(150, 50, 300, 300);
		frame.add(session);

		// Create the start button
		JButton startBtn = new JButton("Start");
		// Get the width and height of the frame
		int frameWidth = frame.getWidth();
		int frameHeight = frame.getHeight();
		// Set the bounds of the button to the middle of the frame
		startBtn.setBounds((frameWidth - 100) / 2, (frameHeight - 150) / 2, 100, 50);
		// Add the button to the frame
		frame.add(startBtn);

		// Create the text field
		JTextField sessionField = new JTextField();
		// Set the bounds of the text field next to the label
		sessionField.setBounds(session.getX() + session.getWidth() + 10, session.getY(), 150, 20);
		// Add the text field to the frame
		frame.add(sessionField);

		frame.setVisible(true);
		
	}
}
