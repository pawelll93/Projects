import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;

public class Alpina {

	private JFrame frmAlpinaProgram;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnGuuzik;
	private JTextField textField_3;
	private JLabel lblImie;
	private JLabel lblNazwisko;
	private JLabel lblLiczbaGodzin;
	private JLabel lblStawkaNaGodzine;
	private JLabel lblNewLabel;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alpina window = new Alpina();
					window.frmAlpinaProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Alpina() {
		initialize();
	}

	
	private void initialize() {
		frmAlpinaProgram = new JFrame();
		frmAlpinaProgram.setTitle("Alpina Program - Wynagrodzenia.");
		frmAlpinaProgram.getContentPane().setBackground(SystemColor.inactiveCaption);
		frmAlpinaProgram.setBounds(100, 100, 605, 469);
		frmAlpinaProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAlpinaProgram.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 302, 247);
		frmAlpinaProgram.getContentPane().add(scrollPane);
		
		table = new JTable();
		Object[] columns = {"Imie","Nazwisko","Kwota"};
			DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
			table.setModel(model);
			table.setRowHeight(30);
			
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(10, 281, 86, 20);
		frmAlpinaProgram.getContentPane().add(textField);
		textField.setColumns(10);
	
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 312, 86, 20);
		frmAlpinaProgram.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		
		textField_2.setBounds(10, 343, 86, 20);
		frmAlpinaProgram.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		
		textField_3.setBounds(10, 374, 86, 20);
		frmAlpinaProgram.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		
		 
		
		btnGuuzik = new JButton("Oblicz !");
		btnGuuzik.setBackground(SystemColor.controlLtHighlight);
		btnGuuzik.setForeground(SystemColor.desktop);
		Object[] row = new Object[3];
		btnGuuzik.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent arg0) {
			row[0] = textField.getText();
			row[1] = textField_1.getText();
			
		
			int a =	Integer.parseInt(textField_3.getText());
			int b =	Integer.parseInt(textField_2.getText());
			row[2] = a*b + " Z£ NETTO";
	
			model.addRow(row);
			
			}
		});
		btnGuuzik.setBounds(306, 325, 117, 38);
		frmAlpinaProgram.getContentPane().add(btnGuuzik);
		
		lblImie = new JLabel("IMIE");
		lblImie.setBounds(106, 284, 46, 14);
		frmAlpinaProgram.getContentPane().add(lblImie);
		
		lblNazwisko = new JLabel("NAZWISKO");
		lblNazwisko.setBounds(106, 315, 91, 14);
		frmAlpinaProgram.getContentPane().add(lblNazwisko);
		
		lblLiczbaGodzin = new JLabel("LICZBA GODZIN");
		lblLiczbaGodzin.setBounds(106, 346, 132, 14);
		frmAlpinaProgram.getContentPane().add(lblLiczbaGodzin);
		
		lblStawkaNaGodzine = new JLabel("STAWKA NA GODZINE");
		lblStawkaNaGodzine.setBounds(106, 377, 162, 14);
		frmAlpinaProgram.getContentPane().add(lblStawkaNaGodzine);
		
		JLabel label = new JLabel("");
		label.setBounds(322, 11, 247, 213);
		frmAlpinaProgram.getContentPane().add(label);
		Image image = new ImageIcon(this.getClass().getResource("logo.png")).getImage();
		label.setIcon(new ImageIcon(image));
		
		lblNewLabel = new JLabel("Program dla firmy Alpina. ");
		lblNewLabel.setBounds(322, 235, 247, 23);
		frmAlpinaProgram.getContentPane().add(lblNewLabel);
	
		}
	}

