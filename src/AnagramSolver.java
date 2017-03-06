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
import javax.swing.JTextPane;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnagramSolver extends JPanel {
	private JTextField txtIn;
	private JTextPane txtPane;
	private static String[] dict;
	
	
	public AnagramSolver() {
		setBackground(new Color(152, 251, 152));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 25, 345, 35);
		add(panel);
		panel.setLayout(null);
		
		txtIn = new JTextField();
		txtIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				solver(txtIn.getText());
			}
		});
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
				solver(txtIn.getText());
			}
		});
		btnGo.setBounds(285, 0, 60, 35);
		panel.add(btnGo);
		btnGo.setFont(new Font("Franklin Gothic Book", Font.BOLD, 13));
		
		JLabel lblDavidsAnagramSolver = new JLabel("David's Anagram Solver");
		lblDavidsAnagramSolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblDavidsAnagramSolver.setBounds(122, 0, 155, 14);
		add(lblDavidsAnagramSolver);
		
		JLabel lblAnagrams = new JLabel("Anagrams");
		lblAnagrams.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnagrams.setBounds(170, 98, 60, 14);
		add(lblAnagrams);
		
		setPreferredSize(new Dimension(400,300));
		
		JTextPane txtPane = new JTextPane();
		txtPane.setEditable(false);
		txtPane.setBounds(27, 126, 345, 163);
		add(txtPane);
	}
	
	public static void solver(String input){
		
		
	}

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame ("David's Anagram Solver");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new AnagramSolver());
		frame.pack();
		frame.setVisible(true);
		
		//bring in a dictionary
		dict=new String[354983];
		BufferedReader in = new BufferedReader(new FileReader("dictionary.txt"));
		for (int i=0; i<354983;i++){
			dict[i]=in.readLine();
		}
		in.close();
	}
}
