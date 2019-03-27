import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 541, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Gesorteerd");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OpdrachtA.gesorteerd();
			}
		});
		btnNewButton.setBounds(61, 99, 170, 68);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnOngesorteerd = new JButton("Ongesorteerd");
		btnOngesorteerd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpdrachtA.ongesorteerd();
			}
		});
		btnOngesorteerd.setBounds(312, 99, 170, 68);
		frame.getContentPane().add(btnOngesorteerd);
	}
}
