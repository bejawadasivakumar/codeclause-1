
import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Window.Type;

public class TemperatureConvertor {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConvertor window = new TemperatureConvertor();
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
	public TemperatureConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setBounds(100, 100, 538, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Input:");
		lblNewLabel.setBounds(30, 112, 122, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(162, 117, 200, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("From");
		lblNewLabel_1.setBounds(30, 171, 71, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(162, 171, 200, 28);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Celsius", "Kelvin"}));
		comboBox.setToolTipText("");
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("To");
		lblNewLabel_2.setBounds(30, 233, 45, 28);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		
		comboBox_1.setBounds(162, 237, 200, 28);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fahrenheit", "Celsius", "Kelvin"}));
		frame.getContentPane().add(comboBox_1);
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBounds(162, 294, 200, 28);
		frame.getContentPane().add(textField_1);
		JLabel lblNewLabel_3 = new JLabel("Result");
		lblNewLabel_3.setBounds(30, 294, 83, 28);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Convert\r\n");
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setBounds(279, 337, 111, 35);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(comboBox.getSelectedItem().equals("Select") ||comboBox_1.getSelectedItem().equals("Select")  ) {
						JOptionPane.showMessageDialog(comboBox,"Invalid Entry.Select proper forms");
					}
					else {
					try {
					float a=(Float.parseFloat(textField.getText()));
					if(comboBox.getSelectedItem().equals("Fahrenheit")) {
						textField.setText(a+" (Fahrenheit)");
						if(comboBox_1.getSelectedItem().equals("Celsius")) {
							float c=(a-32)*5/9;
							textField_1.setText(c+" (Celsius)");
						}
						if(comboBox_1.getSelectedItem().equals("Kelvin")) {
							float c=(float) ((a-32)*5/9+273.15);
							textField_1.setText(c+" (Kelvin)");
						}
					}
					if(comboBox.getSelectedItem().equals("Celsius")) {
						textField.setText(a+" (Celsius)");
						if(comboBox_1.getSelectedItem().equals("Fahrenheit")) {
							float c=a*9/5+32;
							textField_1.setText(c+" (Fahrenheit)");
						}
						if(comboBox_1.getSelectedItem().equals("Kelvin")) {
							float c=(float) (a+273.15);
							textField_1.setText(c+" (Kelvin)");
						}
					}
					if(comboBox.getSelectedItem().equals("Kelvin")) {
						textField.setText(a+" (Kelvin)");
						if(comboBox_1.getSelectedItem().equals("Celsius")) {
							float c=(float) (a-273.15);
							textField_1.setText(c+" (Celsius)");
						}
						if(comboBox_1.getSelectedItem().equals("Fahrenheit")) {
							float c=(float) ((a-273.15)*9/5+32);
							textField_1.setText(c+" (Fahrenheit)");
						}
					}
				}
				
				catch(Exception e1) {
					JOptionPane.showMessageDialog(textField,"Invalid Entry");
				}
				}
				}

			});
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("TEMPERATURE CONVERTER\r\n");
		lblNewLabel_4.setBackground(new Color(192, 192, 192));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(0, 0, 524, 71);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Clear\r\n");
		btnNewButton_2.setBackground(new Color(255, 153, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				comboBox.setSelectedItem("Select");
				comboBox_1.setSelectedItem("Select");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(402, 337, 85, 35);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
