import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Not_HAL9000 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Not_HAL9000 frame = new Not_HAL9000();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Not_HAL9000() {
		setTitle("friendly game of rock paper sissors");
		Random random = new Random();
		
		String []  aiinput;
		aiinput = new String [3];
		aiinput[0]= "Rock";
		aiinput[1]= "Paper";
		aiinput[2]= "Sissor";
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 406);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBounds(120, 10, 177, 175);
		
		float with = lblNewLabel.getHeight() * (220f/220f);
		
		Image img = new ImageIcon(this.getClass().getResource("/not_HAL.jfif")).getImage();
		img = img.getScaledInstance((int) with, lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
		lblNewLabel.setIcon(new ImageIcon(img));
		
		contentPane.add(lblNewLabel);
		
		JLabel success = new JLabel("");
		success.setBounds(125, 250, 300, 21);
		contentPane.add(success);
		
		btnNewButton = new JButton("rock");
		btnNewButton.addMouseListener(new MouseAdapter() {
			private int index;
				@Override
			public void mouseClicked(MouseEvent e) {
					for(int i = 0; i < 1; i++) {
						index = random.nextInt(3);
					switch(aiinput[index])
					{
					case "Paper":
							success.setText("You have Failed the ai chose paper"); break;
					case  "Rock":
							success.setText("You have Tied the ai chose Rock"); break;
					case "Sissor":
							success.setText("You have Won the ai chose Sissors"); break;

					}
						
					}
			}
		});
		
		btnNewButton.setBounds(22, 211, 85, 21);
		contentPane.add(btnNewButton);
		
		
		
		btnNewButton_1 = new JButton("paper");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			private int index;
				@Override
			public void mouseClicked(MouseEvent e) {
					for(int i = 0; i < 1; i++) {
						index = random.nextInt(3);
					switch(aiinput[index])
					{
					case "Paper":
							success.setText("You have Tied the ai chose paper"); break;
					case  "Rock":
							success.setText("You have Won the ai chose Rock"); break;
					case "Sissor":
							success.setText("You have Failed the ai chose Sissors"); break;

					}
						
					}
			}
		});
		btnNewButton_1.setBounds(176, 211, 85, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Sissors");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			private int index;
				@Override
			public void mouseClicked(MouseEvent e) {
					for(int i = 0; i < 1; i++) {
						index = random.nextInt(3);
					switch(aiinput[index])
					{
					case "Paper":
							success.setText("You have Won the ai chose paper"); break;
					case  "Rock":
							success.setText("You have Lost the ai chose Rock"); break;
					case "Sissor":
							success.setText("You have Tied the ai chose Sissors"); break;

					}
						
					}
			}
		});
		btnNewButton_2.setBounds(325, 211, 85, 21);
		contentPane.add(btnNewButton_2);

		
	
	}

}
