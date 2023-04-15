package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JCalendar;
import javax.swing.ImageIcon;

public class CreateClientView extends JPanel {

	private JTextField tfCreate1;
	private JTextField tfCreate3;
	private JTextField tfCreate2;
	private JTextField tfCreate4;
	
	/**
	 * Create the panel.
	 */
	/**
	 * @param panel_crear_cliente
	 */
	public CreateClientView(){

		this.setForeground(new Color(255, 255, 255));
		this.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 14));
		this.setToolTipText("");
		this.setName("");
		this.setBackground(new Color(0, 64, 128));
		this.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Alta de cliente");
		lblNewLabel_2.setBounds(96, 69, 142, 26);
		
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setToolTipText("Alta cliente");
		lblNewLabel_2.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 22));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(103, 179, 128, 128);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setIcon(new ImageIcon(MainView.class.getResource("/resources/assets/icons/add-client128.png")));
		this.add(lblNewLabel);
		
		JLabel lblCreate1 = new JLabel("Nombre");
		lblCreate1.setBounds(292, 105, 47, 16);
		lblCreate1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		lblCreate1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreate1.setForeground(new Color(255, 255, 255));
		this.add(lblCreate1);
		
		tfCreate1 = new JTextField();
		tfCreate1.setBounds(344, 100, 280, 27);
		tfCreate1.setMaximumSize(new Dimension(250, 250));
		tfCreate1.setToolTipText("Introduce Nombre");
		this.add(tfCreate1);
		tfCreate1.setColumns(10);
		
		JLabel lblCreate2 = new JLabel("Apellidos");
		lblCreate2.setBounds(286, 137, 53, 16);
		lblCreate2.setToolTipText("Apellidos Cliente");
		lblCreate2.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreate2.setForeground(Color.WHITE);
		lblCreate2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		this.add(lblCreate2);
		
		tfCreate2 = new JTextField();
		tfCreate2.setBounds(344, 132, 280, 27);
		tfCreate2.setToolTipText("Introduce Apellidos");
		tfCreate2.setMaximumSize(new Dimension(250, 250));
		tfCreate2.setColumns(10);
		this.add(tfCreate2);
		
		JLabel lblCreate3 = new JLabel("Dirección");
		lblCreate3.setBounds(283, 169, 56, 16);
		lblCreate3.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreate3.setForeground(Color.WHITE);
		lblCreate3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		this.add(lblCreate3);
		
		tfCreate3 = new JTextField();
		tfCreate3.setBounds(344, 164, 280, 27);
		tfCreate3.setToolTipText("Introduce Dirección");
		tfCreate3.setMaximumSize(new Dimension(250, 250));
		tfCreate3.setColumns(10);
		this.add(tfCreate3);
		
		JLabel lblCreate4 = new JLabel("DNI");
		lblCreate4.setBounds(317, 201, 22, 16);
		lblCreate4.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreate4.setForeground(Color.WHITE);
		lblCreate4.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		this.add(lblCreate4);
		
		tfCreate4 = new JTextField();
		tfCreate4.setBounds(344, 196, 280, 26);
		tfCreate4.setToolTipText("Introduce DNI");
		tfCreate4.setMaximumSize(new Dimension(250, 250));
		tfCreate4.setColumns(10);
		this.add(tfCreate4);
		
		JLabel lblCreate5 = new JLabel(" Fecha Alta");
		lblCreate5.setBounds(273, 227, 66, 16);
		lblCreate5.setVerticalAlignment(SwingConstants.TOP);
		lblCreate5.setToolTipText("Introduce Fecha de Alta de Cliente");
		lblCreate5.setHorizontalAlignment(SwingConstants.LEFT);
		lblCreate5.setForeground(Color.WHITE);
		lblCreate5.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 14));
		this.add(lblCreate5);
		
		JCalendar jcFechaAlta = new JCalendar();
		jcFechaAlta.setBounds(344, 227, 212, 159);
		this.add(jcFechaAlta);
		
		JButton btnNewButton = new JButton("Finalizar Alta de Cliente");
		btnNewButton.setBounds(344, 421, 280, 55);
		btnNewButton.setBorder(new LineBorder(new Color(255, 255, 255), 3, true));
		btnNewButton.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 16));
		btnNewButton.setBackground(new Color(255, 255, 255));
		this.add(btnNewButton);
	}

	/**
	 * @return the panel_crear_cliente
	 */
	public JPanel getPanel_crear_cliente() {
		return this;
	}
	
}
