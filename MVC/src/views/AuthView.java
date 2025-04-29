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
	                    frame.setSize(380,600);
	    				home();
	                    
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
	    frame.setSize(650, 500);
	    panelPrincipal.setSize(650, 500);
	    panelPrincipal.setBackground(new Color(43, 39, 56));
	    panelPrincipal.setLayout(null);
	    
	    JLabel etiqueta1 = new JLabel("Crear cuenta");
	    etiqueta1.setBounds(250, 20, 150, 40);
	    etiqueta1.setBackground(new Color(43, 39, 56));
	    etiqueta1.setOpaque(true);
	    etiqueta1.setHorizontalAlignment(JLabel.CENTER);
	    Font fuenteTitulo = new Font("Segoe UI", Font.BOLD, 24);
	    etiqueta1.setFont(fuenteTitulo);
	    etiqueta1.setForeground(Color.WHITE);
	    panelPrincipal.add(etiqueta1);

	    JLabel lblNombres = new JLabel("Nombres");
	    lblNombres.setBounds(40, 80, 150, 20);
	    lblNombres.setFont(etiquetas);
	    lblNombres.setForeground(Color.WHITE);
	    panelPrincipal.add(lblNombres);
	    
	    JTextField txtNombres = new JTextField();
	    txtNombres.setBounds(40, 100, 250, 30);
	    txtNombres.setBackground(new Color(59, 53, 79));
	    txtNombres.setFont(etiquetas);
	    txtNombres.setForeground(Color.WHITE);
	    panelPrincipal.add(txtNombres);
	    
	    JLabel lblApellidos = new JLabel("Apellidos");
	    lblApellidos.setBounds(40, 140, 150, 20);
	    lblApellidos.setFont(etiquetas);
	    lblApellidos.setForeground(Color.WHITE);
	    panelPrincipal.add(lblApellidos);
	    
	    JTextField txtApellidos = new JTextField();
	    txtApellidos.setBounds(40, 160, 250, 30);
	    txtApellidos.setBackground(new Color(59, 53, 79));
	    txtApellidos.setFont(etiquetas);
	    txtApellidos.setForeground(Color.WHITE);
	    panelPrincipal.add(txtApellidos);
	    
	    JLabel lblEmpresa = new JLabel("Empresa");
	    lblEmpresa.setBounds(40, 200, 150, 20);
	    lblEmpresa.setFont(etiquetas);
	    lblEmpresa.setForeground(Color.WHITE);
	    panelPrincipal.add(lblEmpresa);
	    
	    JTextField txtEmpresa = new JTextField();
	    txtEmpresa.setBounds(40, 220, 250, 30);
	    txtEmpresa.setBackground(new Color(59, 53, 79));
	    txtEmpresa.setFont(etiquetas);
	    txtEmpresa.setForeground(Color.WHITE);
	    panelPrincipal.add(txtEmpresa);

	    JLabel lblAmbito = new JLabel("Ámbito de la empresa");
	    lblAmbito.setBounds(40, 260, 200, 20);
	    lblAmbito.setFont(etiquetas);
	    lblAmbito.setForeground(Color.WHITE);
	    panelPrincipal.add(lblAmbito);
	    
	    String[] ambitos = {"Tecnología", "Salud", "Educación", "Comercio", "Otro"};
	    JComboBox cmbAmbito = new JComboBox(ambitos);
	    cmbAmbito.setBounds(40, 280, 250, 30);
	    cmbAmbito.setBackground(new Color(59, 53, 79));
	    cmbAmbito.setForeground(Color.WHITE);
	    panelPrincipal.add(cmbAmbito);
	    
	    JLabel lblCargo = new JLabel("Cargo");
	    lblCargo.setBounds(350, 80, 150, 20);
	    lblCargo.setFont(etiquetas);
	    lblCargo.setForeground(Color.WHITE);
	    panelPrincipal.add(lblCargo);
	    
	    JTextField txtCargo = new JTextField();
	    txtCargo.setBounds(350, 100, 250, 30);
	    txtCargo.setBackground(new Color(59, 53, 79));
	    txtCargo.setFont(etiquetas);
	    txtCargo.setForeground(Color.WHITE);
	    panelPrincipal.add(txtCargo);

	    JLabel lblUsuario = new JLabel("Nombre de usuario");
	    lblUsuario.setBounds(350, 140, 200, 20);
	    lblUsuario.setFont(etiquetas);
	    lblUsuario.setForeground(Color.WHITE);
	    panelPrincipal.add(lblUsuario);
	    
	    JTextField txtUsuario = new JTextField();
	    txtUsuario.setBounds(350, 160, 250, 30);
	    txtUsuario.setBackground(new Color(59, 53, 79));
	    txtUsuario.setFont(etiquetas);
	    txtUsuario.setForeground(Color.WHITE);
	    panelPrincipal.add(txtUsuario);

	    JLabel lblEmail = new JLabel("Correo electrónico");
	    lblEmail.setBounds(350, 200, 200, 20);
	    lblEmail.setFont(etiquetas);
	    lblEmail.setForeground(Color.WHITE);
	    panelPrincipal.add(lblEmail);
	    
	    JTextField txtEmail = new JTextField();
	    txtEmail.setBounds(350, 220, 250, 30);
	    txtEmail.setBackground(new Color(59, 53, 79));
	    txtEmail.setFont(etiquetas);
	    txtEmail.setForeground(Color.WHITE);
	    panelPrincipal.add(txtEmail);

	    JLabel lblPassword = new JLabel("Contraseña");
	    lblPassword.setBounds(40, 330, 150, 20);
	    lblPassword.setFont(etiquetas);
	    lblPassword.setForeground(Color.WHITE);
	    panelPrincipal.add(lblPassword);
	    
	    JPasswordField txtPassword = new JPasswordField();
	    txtPassword.setBounds(40, 350, 250, 30);
	    txtPassword.setBackground(new Color(59, 53, 79));
	    txtPassword.setFont(etiquetas);
	    panelPrincipal.add(txtPassword);
	    
	    JLabel lblPassword2 = new JLabel("Repetir contraseña");
	    lblPassword2.setBounds(350, 330, 200, 20);
	    lblPassword2.setFont(etiquetas);
	    lblPassword2.setForeground(Color.WHITE);
	    panelPrincipal.add(lblPassword2);
	    
	    JPasswordField txtPassword2 = new JPasswordField();
	    txtPassword2.setBounds(350, 350, 250, 30);
	    txtPassword2.setBackground(new Color(59, 53, 79));
	    txtPassword2.setFont(etiquetas);
	    panelPrincipal.add(txtPassword2);

	    JButton btnRegistrar = new JButton("Registrarse");
	    btnRegistrar.setBounds(180, 410, 150, 35);
	    btnRegistrar.setHorizontalAlignment(JLabel.CENTER);
	    btnRegistrar.setBackground(new Color(111, 85, 182));
	    btnRegistrar.setFont(etiquetas);
	    btnRegistrar.setForeground(Color.WHITE);
	    panelPrincipal.add(btnRegistrar);
	    
	    JButton btnRegresar = new JButton("Regresar");
	    btnRegresar.setBounds(350, 410, 150, 35);
	    btnRegresar.setHorizontalAlignment(JLabel.CENTER);
	    btnRegresar.setBackground(new Color(59, 53, 79));
	    btnRegresar.setFont(etiquetas);
	    btnRegresar.setForeground(Color.WHITE);
	    panelPrincipal.add(btnRegresar);
	    
	    btnRegresar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            frame.setSize(380, 600);
	            login();
	        }
	    });
	    
	    btnRegistrar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String nombres = txtNombres.getText();
	            String apellidos = txtApellidos.getText();
	            String empresa = txtEmpresa.getText();
	            String ambito = cmbAmbito.getSelectedItem().toString();
	            String cargo = txtCargo.getText();
	            String usuario = txtUsuario.getText();
	            String password = new String(txtPassword.getPassword());
	            String password2 = new String(txtPassword2.getPassword());
	            String email = txtEmail.getText();

	            boolean hayErrores = false;
	            String mensajeErrores = "";

	            if (!nombres.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
	                txtNombres.setBorder(BorderFactory.createLineBorder(Color.RED));
	                mensajeErrores += "Nombres inválidos.\n";
	                hayErrores = true;
	            } else {
	                txtNombres.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (!apellidos.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
	                txtApellidos.setBorder(BorderFactory.createLineBorder(Color.RED));
	                mensajeErrores += "Apellidos inválidos.\n";
	                hayErrores = true;
	            } else {
	                txtApellidos.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (!empresa.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+")) {
	                txtEmpresa.setBorder(BorderFactory.createLineBorder(Color.RED));
	                mensajeErrores += "Empresa inválida.\n";
	                hayErrores = true;
	            } else {
	                txtEmpresa.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (!cargo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
	                txtCargo.setBorder(BorderFactory.createLineBorder(Color.RED));
	                mensajeErrores += "Cargo inválido.\n";
	                hayErrores = true;
	            } else {
	                txtCargo.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (!usuario.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚñÑ ]+")) {
	                txtUsuario.setBorder(BorderFactory.createLineBorder(Color.RED));
	                mensajeErrores += "Usuario inválido.\n";
	                hayErrores = true;
	            } else {
	                txtUsuario.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (password.matches(".*\\s.*")) {
	                mensajeErrores += "La contraseña no puede contener espacios.\n";
	                hayErrores = true;
	            }

	            if (!password.matches(".*[!@#$%^&*()_+=\\-{}\\[\\]:;\"'<>,.?/\\\\|~`].*")) {
	                mensajeErrores += "La contraseña debe tener al menos un carácter especial.\n";
	                hayErrores = true;
	            }

	            if (!password.equals(password2)) {
	                mensajeErrores += "Las contraseñas no coinciden.\n";
	                txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
	                txtPassword2.setBorder(BorderFactory.createLineBorder(Color.RED));
	                hayErrores = true;
	            }
	            else {
	            	txtPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	                txtPassword2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (email.contains(" ")) {
	                txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
	                mensajeErrores += "El correo electrónico no debe tener espacios.\n";
	                hayErrores = true;
	            } else {
	                txtEmail.setBorder(BorderFactory.createLineBorder(Color.GREEN));
	            }

	            if (hayErrores) {
	                JOptionPane.showMessageDialog(null, mensajeErrores, "Errores en el formulario", JOptionPane.ERROR_MESSAGE);
	                return;
	            }
	            
	            AuthModel auth = new AuthModel();
	            boolean datosCorrectos = auth.registro(nombres,apellidos,empresa,ambito,cargo,usuario,email,password);
	            
	            if(datosCorrectos){
	            	JOptionPane.showMessageDialog(null,"Registro exitoso","Registro",JOptionPane.INFORMATION_MESSAGE);
	            	frame.setSize(380,600);
	            	login();
	            }
	            else{
	            	JOptionPane.showMessageDialog(null,"Error al guardar los datos.","Error",JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });

	    panelPrincipal.repaint();
	    panelPrincipal.revalidate();
	}
	public void home() {
		panelPrincipal.removeAll();
		panelPrincipal.setLocation(0, 0);
		panelPrincipal.setOpaque(true);
		panelPrincipal.setSize(400, 600);
		panelPrincipal.setBackground(new Color(235, 235, 235));
		panelPrincipal.setLayout(null);
		
		panelPrincipal.repaint();
		panelPrincipal.revalidate();
	}
}
