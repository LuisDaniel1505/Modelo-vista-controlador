package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controllers.ProductController;

public class HomeView extends JFrame {
	private JPanel contentPane;
	
	public HomeView() {
		setTitle("Panel de Control");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 430);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
        Home();

	}
	public void Home() {
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 150, 371);
		panel.setBackground(new Color(45, 62, 80));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setBounds(10, 0, 124, 74);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuarios");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(51, 73, 83, 24);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	JOptionPane.showMessageDialog(null, "Acaba de entrar a usuarios", "Usuarios", JOptionPane.INFORMATION_MESSAGE);
            }

        });
		
		JLabel lblNewLabel_1_1 = new JLabel("Registros");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(51, 108, 83, 24);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	JOptionPane.showMessageDialog(null, "Acaba de entrar a registros", "Registros", JOptionPane.INFORMATION_MESSAGE);
            }

        });
		
		JLabel lblNewLabel_1_2 = new JLabel("Configuración");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(51, 143, 99, 24);
		panel.add(lblNewLabel_1_2);
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	JOptionPane.showMessageDialog(null, "Acaba de entrar a configuración", "Configuración", JOptionPane.INFORMATION_MESSAGE);
            }

        });
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Productos");
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(51, 178, 99, 24);
		panel.add(lblNewLabel_1_1_2);
		
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
            	 ProductController controlador = new ProductController();
                 controlador.mostrarProductos();
             }

         });
		
		JLabel lblNewLabel_1_3 = new JLabel("Cuenta");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(10, 336, 83, 24);
		panel.add(lblNewLabel_1_3);
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	JOptionPane.showMessageDialog(null, "Acaba de entrar a cuenta", "Cuenta", JOptionPane.INFORMATION_MESSAGE);
            }

        });
		
		JLabel lblPanelDeControl = new JLabel("Panel de control");
		lblPanelDeControl.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPanelDeControl.setBounds(164, 5, 262, 48);
		contentPane.add(lblPanelDeControl);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(167, 60, 557, 316);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 20, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(100, 149, 237));
		panel_6.setBounds(0, 0, 268, 5);
		panel_3.add(panel_6);
		
		JLabel lblNewLabel_1_4 = new JLabel("1500");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(29, 38, 83, 24);
		panel_3.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_4 = new JLabel("Usuarios registrados");
		lblNewLabel_1_4_4.setForeground(Color.GRAY);
		lblNewLabel_1_4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4_4.setBounds(29, 98, 148, 24);
		panel_3.add(lblNewLabel_1_4_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(60, 179, 113));
		panel_6_1.setBounds(0, 0, 268, 5);
		panel_4.add(panel_6_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("50");
		lblNewLabel_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(26, 36, 83, 24);
		panel_4.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_4_1 = new JLabel("Nuevos mensajes");
		lblNewLabel_1_4_4_1.setForeground(Color.GRAY);
		lblNewLabel_1_4_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4_4_1.setBounds(26, 98, 148, 24);
		panel_4.add(lblNewLabel_1_4_4_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(new Color(205, 133, 63));
		panel_6_2.setBounds(0, 0, 268, 5);
		panel_2.add(panel_6_2);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("15:30");
		lblNewLabel_1_4_2.setForeground(Color.BLACK);
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4_2.setBounds(31, 38, 83, 24);
		panel_2.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_4_2 = new JLabel("Hora actual");
		lblNewLabel_1_4_4_2.setForeground(Color.GRAY);
		lblNewLabel_1_4_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4_4_2.setBounds(31, 100, 148, 24);
		panel_2.add(lblNewLabel_1_4_4_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6_3 = new JPanel();
		panel_6_3.setBackground(new Color(255, 0, 0));
		panel_6_3.setBounds(0, 0, 268, 5);
		panel_5.add(panel_6_3);
		
		JLabel lblNewLabel_1_4_3 = new JLabel("920");
		lblNewLabel_1_4_3.setForeground(Color.BLACK);
		lblNewLabel_1_4_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4_3.setBounds(29, 36, 83, 24);
		panel_5.add(lblNewLabel_1_4_3);
		
		JLabel lblNewLabel_1_4_4_3 = new JLabel("Visitas diarias");
		lblNewLabel_1_4_4_3.setForeground(Color.GRAY);
		lblNewLabel_1_4_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_4_4_3.setBounds(29, 99, 148, 24);
		panel_5.add(lblNewLabel_1_4_4_3);
	}
}
