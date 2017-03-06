//David Evander

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnagramSolver extends JPanel {
	private JTextField txtIn;
	private JTextField txtOut;
	
	
	public AnagramSolver() {
		setBackground(new Color(152, 251, 152));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 25, 345, 35);
		add(panel);
		panel.setLayout(null);
		
		txtIn = new JTextField();
		txtIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtIn.setText("");
				txtIn.grabFocus();
			}
		});
		txtIn.setBackground(new Color(189, 183, 107));
		txtIn.setBounds(0, 0, 290, 35);
		panel.add(txtIn);
		txtIn.setHorizontalAlignment(SwingConstants.CENTER);
		txtIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtIn.setText("Enter word to unscramble here");
		txtIn.setColumns(10);
		
		
		JButton btnGo = new JButton("GO!");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGo.setBounds(285, 0, 60, 35);
		panel.add(btnGo);
		btnGo.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		
		JLabel lblDavidsAnagramSolver = new JLabel("David's Anagram Solver");
		lblDavidsAnagramSolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblDavidsAnagramSolver.setBounds(122, 0, 155, 14);
		add(lblDavidsAnagramSolver);
		
		txtOut = new JTextField();
		txtOut.setBackground(Color.PINK);
		txtOut.setEditable(false);
		txtOut.setBounds(42, 114, 315, 175);
		add(txtOut);
		txtOut.setColumns(10);
		
		JLabel lblAnagrams = new JLabel("Anagrams");
		lblAnagrams.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnagrams.setBounds(170, 98, 60, 14);
		add(lblAnagrams);
		
		setPreferredSize(new Dimension(400,300));
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame ("David's Anagram Solver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new AnagramSolver());
		frame.pack();
		frame.setVisible(true);

	}
}
