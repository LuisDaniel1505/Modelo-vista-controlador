package views;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
	Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);
	AuthModel funciones;
	public AuthView() {
 		
 		 funciones = new AuthModel();
 	}
	public void login() {
		JPanel login = new JPanel(null);
	    login.setBackground(new Color(43, 39, 56));
	    login.setBounds(0, 0, 400, 539);
		 
	    JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 539);
	    frame.setResizable(true);
	    frame.add(login);
	    frame.setLocationRelativeTo(null); 
	    frame.setVisible(true);
	
	    JLabel etiqueta1 = new JLabel("Inicia sesión");
	    etiqueta1.setBounds(60, 40, 245, 50);
	    etiqueta1.setBackground(new Color(43, 39, 56));
	    etiqueta1.setOpaque(true);
	    etiqueta1.setHorizontalAlignment(JLabel.CENTER);
	    Font etiquetaInicio = new Font("Ginebra", Font.PLAIN, 40);
	    etiqueta1.setFont(etiquetaInicio);
	    etiqueta1.setForeground(Color.WHITE);
	    login.add(etiqueta1);
	
	    JLabel etiqueta2 = new JLabel("Correo electrónico");
	    etiqueta2.setBounds(90, 120, 180, 30);
	    etiqueta2.setFont(etiquetas);
	    etiqueta2.setForeground(Color.WHITE);
	    etiqueta2.setHorizontalAlignment(JLabel.CENTER);
	    login.add(etiqueta2);
	    
	   	JLabel etiqueta5 = new JLabel();
	    ImageIcon imagen4 = new ImageIcon("images/user2.png");
	    etiqueta5.setIcon(imagen4);
	    etiqueta5.setBounds(270, 150, 30, 30);
	    etiqueta5.setBackground(new Color(59, 53, 79));
	    Image img2 = imagen4.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	    etiqueta5.setIcon(new ImageIcon(img2));
	    etiqueta5.setOpaque(true);
	    login.add(etiqueta5);
	    
	    JTextField email = new JTextField(null);
	    email.setBounds(40, 150, 270, 30);
	    email.setBackground(new Color(59, 53, 79));
	    email.setFont(etiquetas);
	    email.setForeground(Color.WHITE );
	    login.add(email);
	    login.revalidate();
	
	    JLabel etiqueta4 = new JLabel("Contraseña");
	    etiqueta4.setBounds(115, 190, 120, 30);
	    etiqueta4.setFont(etiquetas);
	    etiqueta4.setForeground(Color.WHITE);
	    etiqueta4.setHorizontalAlignment(JLabel.CENTER);
	    login.add(etiqueta4);
	    
	    JLabel etiqueta3 = new JLabel();
	    ImageIcon imagen3 = new ImageIcon("images/eye.png");
	    etiqueta3.setIcon(imagen3);
	    etiqueta3.setBounds(270, 220, 30, 30);
	    etiqueta3.setBackground(new Color(59, 53, 79));
	    Image img = imagen3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	    etiqueta3.setIcon(new ImageIcon(img));
	    etiqueta3.setOpaque(true);
	    login.add(etiqueta3);
	    
	    JPasswordField password = new JPasswordField (15);
	    password.setBounds(40, 220, 270, 30);
	    password.setBackground(new Color(59, 53, 79));
	    password.setFont(etiquetas);
	    login.add(password);
	    login.revalidate();
	    
	    JCheckBox recordar = new JCheckBox("Recordarme");
	    recordar.setBounds(40, 250, 99, 20);
	    recordar.setBackground(new Color(43, 39, 56));
	    recordar.setForeground(Color.WHITE);
	    recordar.setVisible(true);
	    login.add(recordar);
	
	    JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
	    olvidar.setBounds(184, 246, 150, 30);
	    Font fuente1 = new Font("Ginebra", Font.ITALIC, 12);
	    olvidar.setFont(fuente1);
	    olvidar.setBackground(new Color(43, 39, 56));
	    olvidar.setOpaque(true);
	    olvidar.setForeground(new Color(0, 154, 182));
	    login.add(olvidar);
	    login.revalidate();
	
	    JButton access = new JButton("Acceder");
	    access.setBounds(40, 310, 270, 35);
	    access.setHorizontalAlignment(JLabel.CENTER);
	    access.setBackground(new Color(111, 85, 182));
	    Font fuente2 = new Font("Ginebra", 40, 20);
	    access.setFont(fuente2);
	    access.setForeground(Color.WHITE);
	    login.add(access);
	
	    JLabel cuenta = new JLabel("¿Aun no tiene cuenta?");
	    cuenta.setBounds(40, 398, 250, 30);
	    Font fuente5 = new Font("Ginebra", Font.ITALIC, 12);
	    cuenta.setFont(fuente5);
	    cuenta.setBackground(new Color(43, 39, 56));
	    cuenta.setOpaque(true);
	    cuenta.setForeground(new Color(0, 154, 182));
	    login.add(cuenta);
	    login.revalidate();
	    
	    JButton createAcc = new JButton("Crea una cuenta");
	    createAcc.setBounds(40, 360, 270, 35);
	    createAcc.setFont(etiquetas);
	    createAcc.setHorizontalAlignment(JLabel.CENTER);
	    login.add(createAcc);
	    
	    createAcc.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					//manager("Register");
				}
			});
	    
	    access.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String correo = email.getText();
	            String passText = new String(password.getPassword());

	            if (correo.equals("")) {
	                email.setBorder(BorderFactory.createLineBorder(Color.RED));
	            } else {
	                email.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (passText.equals("")) {
	                password.setBorder(BorderFactory.createLineBorder(Color.RED));
	            } else {
	                password.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }
	            
	            if (!correo.equals("") && !passText.equals("")) {
	                AuthModel auth = new AuthModel(); 
	                if (auth.access(correo, passText)) {
	                    JOptionPane.showMessageDialog(null, "Bienvenido", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        }
	    });
	    
	}
}
