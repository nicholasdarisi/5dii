package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Grafica {

	public JFrame frame;
	private JTextField textField;
	private JButton Bottone;
	private JLabel n_tent;
	private JLabel Risposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafica window = new Grafica();
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
	public Grafica() {
		initialize();
	}
	
	public JButton getBottone() {
		return Bottone;
	}
	
	public int getN_tent() {
		String a;
		int x;
		a = n_tent.getText();
		x = Integer.parseInt(a);
		return x;
	}
	
	public void setN_tent(int n) {
		String prova;
		prova = String.valueOf(n);
		n_tent.setText(prova);
	}
	
	
	
	public int getTextField() {
		String a;
		int x;
		a = textField.getText();
		x=Integer.parseInt(a);
		return x;
	}
	
	public void setRisposta (String a) {
		Risposta.setText(a);
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Bottone = new JButton("Invia");

		Bottone.addActionListener(new Controller.Controller(this, new Model.Data()));
		Bottone.setBounds(163, 210, 117, 29);
		frame.getContentPane().add(Bottone);
		
		JLabel lblNewLabel = new JLabel("INDOVINA NUMERO");
		lblNewLabel.setBounds(163, 21, 132, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tentativi:");
		lblNewLabel_1.setBounds(150, 68, 69, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		n_tent = new JLabel("");
		n_tent.setBounds(225, 68, 61, 16);
		frame.getContentPane().add(n_tent);
		
		textField = new JTextField();
		textField.setBounds(150, 106, 130, 76);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Risposta = new JLabel("");
		Risposta.setBounds(246, 244, 198, 16);
		frame.getContentPane().add(Risposta);
	}
}
