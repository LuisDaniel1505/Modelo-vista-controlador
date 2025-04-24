package views;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
    Font etiquetas = new Font("Ginebra", Font.PLAIN, 20);
    AuthModel funciones;
    JFrame frame;
    JPanel panelPrincipal;

    public AuthView() {
        funciones = new AuthModel();
        frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 600);
        frame.setLocationRelativeTo(null);

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        frame.add(panelPrincipal);
        frame.setVisible(true);

        login(); 
    }
	public void login() {
		panelPrincipal.removeAll();
	    panelPrincipal.setBackground(new Color(43, 39, 56));
	    panelPrincipal.repaint();
	    panelPrincipal.revalidate();

	    JLabel etiqueta1 = new JLabel("Inicia sesión");
	    etiqueta1.setBounds(60, 40, 245, 50);
	    etiqueta1.setBackground(new Color(43, 39, 56));
	    etiqueta1.setOpaque(true);
	    etiqueta1.setHorizontalAlignment(JLabel.CENTER);
	    Font etiquetaInicio = new Font("Ginebra", Font.PLAIN, 40);
	    etiqueta1.setFont(etiquetaInicio);
	    etiqueta1.setForeground(Color.WHITE);
	    panelPrincipal.add(etiqueta1);
	
	    JLabel etiqueta2 = new JLabel("Correo electrónico");
	    etiqueta2.setBounds(90, 120, 180, 30);
	    etiqueta2.setFont(etiquetas);
	    etiqueta2.setForeground(Color.WHITE);
	    etiqueta2.setHorizontalAlignment(JLabel.CENTER);
	    panelPrincipal.add(etiqueta2);
	    
	   	JLabel etiqueta5 = new JLabel();
	    ImageIcon imagen4 = new ImageIcon("images/user2.png");
	    etiqueta5.setIcon(imagen4);
	    etiqueta5.setBounds(270, 150, 30, 30);
	    etiqueta5.setBackground(new Color(59, 53, 79));
	    Image img2 = imagen4.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	    etiqueta5.setIcon(new ImageIcon(img2));
	    etiqueta5.setOpaque(true);
	    panelPrincipal.add(etiqueta5);
	    
	    JTextField email = new JTextField(null);
	    email.setBounds(40, 150, 270, 30);
	    email.setBackground(new Color(59, 53, 79));
	    email.setFont(etiquetas);
	    email.setForeground(Color.WHITE );
	    panelPrincipal.add(email);
	    panelPrincipal.revalidate();
	
	    JLabel etiqueta4 = new JLabel("Contraseña");
	    etiqueta4.setBounds(115, 190, 120, 30);
	    etiqueta4.setFont(etiquetas);
	    etiqueta4.setForeground(Color.WHITE);
	    etiqueta4.setHorizontalAlignment(JLabel.CENTER);
	    panelPrincipal.add(etiqueta4);
	    
	    JLabel etiqueta3 = new JLabel();
	    ImageIcon imagen3 = new ImageIcon("images/eye.png");
	    etiqueta3.setIcon(imagen3);
	    etiqueta3.setBounds(270, 220, 30, 30);
	    etiqueta3.setBackground(new Color(59, 53, 79));
	    Image img = imagen3.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	    etiqueta3.setIcon(new ImageIcon(img));
	    etiqueta3.setOpaque(true);
	    panelPrincipal.add(etiqueta3);
	    
	    JPasswordField password = new JPasswordField (15);
	    password.setBounds(40, 220, 270, 30);
	    password.setBackground(new Color(59, 53, 79));
	    password.setFont(etiquetas);
	    panelPrincipal.add(password);
	    panelPrincipal.revalidate();
	    
	    JCheckBox recordar = new JCheckBox("Recordarme");
	    recordar.setBounds(40, 250, 99, 20);
	    recordar.setBackground(new Color(43, 39, 56));
	    recordar.setForeground(Color.WHITE);
	    recordar.setVisible(true);
	    panelPrincipal.add(recordar);
	
	    JLabel olvidar = new JLabel("¿Olvidó su contraseña?");
	    olvidar.setBounds(184, 246, 150, 30);
	    Font fuente1 = new Font("Ginebra", Font.ITALIC, 12);
	    olvidar.setFont(fuente1);
	    olvidar.setBackground(new Color(43, 39, 56));
	    olvidar.setOpaque(true);
	    olvidar.setForeground(new Color(0, 154, 182));
	    panelPrincipal.add(olvidar);
	    panelPrincipal.revalidate();
	
	    JButton access = new JButton("Acceder");
	    access.setBounds(40, 310, 270, 35);
	    access.setHorizontalAlignment(JLabel.CENTER);
	    access.setBackground(new Color(111, 85, 182));
	    Font fuente2 = new Font("Ginebra", 40, 20);
	    access.setFont(fuente2);
	    access.setForeground(Color.WHITE);
	    panelPrincipal.add(access);
	
	    JLabel cuenta = new JLabel("¿Aun no tiene cuenta?");
	    cuenta.setBounds(40, 398, 250, 30);
	    Font fuente5 = new Font("Ginebra", Font.ITALIC, 12);
	    cuenta.setFont(fuente5);
	    cuenta.setBackground(new Color(43, 39, 56));
	    cuenta.setOpaque(true);
	    cuenta.setForeground(new Color(0, 154, 182));
	    panelPrincipal.add(cuenta);
	    panelPrincipal.revalidate();
	    
	    JButton createAcc = new JButton("Crea una cuenta");
	    createAcc.setBounds(40, 360, 270, 35);
	    createAcc.setFont(etiquetas);
	    createAcc.setHorizontalAlignment(JLabel.CENTER);
	    panelPrincipal.add(createAcc);
	    
	    createAcc.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					frame.setSize(420,600);
					register();
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
	    panelPrincipal.repaint();
	    panelPrincipal.revalidate();
	}
	public void register() {
		panelPrincipal.removeAll();
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(400, 600);
		panelPrincipal.setBackground(new Color(235, 235, 235));
		panelPrincipal.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(245, 30);
		etiqueta1.setLocation(70, 20);
		etiqueta1.setBackground(new Color(235, 235, 235));
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(etiquetas);
		panelPrincipal.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Nombre de usuario");
		etiqueta2.setBounds(95, 60, 180, 30);
		etiqueta2.setFont(etiquetas);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		panelPrincipal.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setBounds(15, 90, 370, 30);
		email.setBackground(new Color(255, 255, 255));
		email.setOpaque(true);
		email.setFont(etiquetas);
		panelPrincipal.add(email);
		panelPrincipal.revalidate();
		
		JLabel etiqueta3 = new JLabel("Cuentanos sobre ti");
		etiqueta3.setBounds(95, 120, 180, 30);
		etiqueta3.setFont(etiquetas);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		panelPrincipal.add(etiqueta3);
		
		JTextArea biografia = new JTextArea();
		biografia.setBounds(15, 150, 370, 70);
		biografia.setBackground(new Color(255, 255, 255));
		biografia.setOpaque(true);
		biografia.setFont(etiquetas);
		biografia.setBorder(BorderFactory.createLineBorder(Color.black));
		panelPrincipal.add(biografia);
		panelPrincipal.revalidate();
		
		JLabel etiqueta4 = new JLabel("Preferencias");
		etiqueta4.setBounds(95, 225, 180, 30);
		etiqueta4.setFont(etiquetas);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		panelPrincipal.add(etiqueta4);
		
		JCheckBox recordar = new JCheckBox("Dulce");
		recordar.setBounds(18,255, 99,20);
		recordar.setBackground(new Color(235, 235, 235));
		recordar.setVisible(true);
		panelPrincipal.add(recordar);
		
		JCheckBox salado = new JCheckBox("Salado");
		salado.setBounds(150,255, 99,20);
		salado.setBackground(new Color(235, 235, 235));
		salado.setVisible(true);
		panelPrincipal.add(salado);
		
		JCheckBox saludable = new JCheckBox("Saludable");
		saludable.setBounds(300,255, 99,20);
		saludable.setBackground(new Color(235, 235, 235));
		saludable.setVisible(true);
		panelPrincipal.add(saludable);
		
		JLabel etiqueta5 = new JLabel("Terminos");
		etiqueta5.setBounds(95, 270, 180, 30);
		etiqueta5.setFont(etiquetas);
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		panelPrincipal.add(etiqueta5);

		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton aceptar = new JRadioButton("Acepto los términos",true);
		aceptar.setBounds(18,300,140,20);
		panelPrincipal.add(aceptar);
		
		JRadioButton aceptar2 = new JRadioButton("No acepto los términos");
		aceptar2.setBounds(210,300,180,20);
		panelPrincipal.add(aceptar2);
		
		terminos.add(aceptar);
		terminos.add(aceptar2);
		
		String [] colonias = {"Los Olivos", "Miramar", "Santa Fe","Pedregal"};
		JComboBox colonia = new JComboBox(colonias);
		colonia.setBounds(18,340,370,30);
		colonia.setBackground(new Color(255, 255, 255));
		colonia.setVisible(true);
		panelPrincipal.add(colonia);
		
		JButton acceso = new JButton("Crear cuenta");
		acceso.setBounds(80, 390, 230, 45);
		acceso.setHorizontalAlignment(JLabel.CENTER);
		acceso.setBackground(new Color(15, 62, 234));
		Font fuente2 = new Font("arial", 40, 20);
		acceso.setFont(fuente2); 
		acceso.setForeground(Color.WHITE);
		panelPrincipal.add(acceso);
		
		JButton acceso2 = new JButton("Regresar");
		acceso2.setBounds(80, 440, 230, 45);
		acceso2.setHorizontalAlignment(JLabel.CENTER);
		acceso2.setBackground(new Color(15, 62, 234));
		Font fuente3 = new Font("arial", 40, 20);
		acceso2.setFont(fuente3); 
		acceso2.setForeground(Color.WHITE);
		panelPrincipal.add(acceso2);
		panelPrincipal.revalidate();
		
		acceso2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setSize(380,600);
				login();		
			}
		});
		
		acceso.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean valido = true;

				if(email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red));
					valido = false;
				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green));
				}

				if(biografia.getText().equals("")) {
					biografia.setBorder(BorderFactory.createLineBorder(Color.red));
					valido = false;
				} else {
					biografia.setBorder(BorderFactory.createLineBorder(Color.green));
				}

				if (valido) {
				    String preferencias = "";

				    if (recordar.isSelected()) {
				        preferencias += "Dulce";
				    }

				    if (salado.isSelected()) {
				        if (!preferencias.equals("")) {
				            preferencias += ", ";
				        }
				        preferencias += "Salado";
				    }

				    if (saludable.isSelected()) {
				        if (!preferencias.equals("")) {
				            preferencias += ", ";
				        }
				        preferencias += "Saludable";
				    }				    
				    String coloniaSeleccionada = colonia.getSelectedItem().toString();
				    boolean acepto = aceptar.isSelected();

				    
				    if(acepto) {
				    	AuthModel auth = new AuthModel();
				    	auth.registro(email.getText(), biografia.getText(), preferencias, coloniaSeleccionada, acepto);
				    	JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", JOptionPane.INFORMATION_MESSAGE);
				    	frame.setSize(380,600);
				    	login();
				    }else {
				    	JOptionPane.showMessageDialog(null, "Registro no exitoso, acepta los terminos", "Registro", JOptionPane.INFORMATION_MESSAGE);
				    }
				}
			}
		});

		panelPrincipal.repaint();
		panelPrincipal.revalidate();
	}
}
