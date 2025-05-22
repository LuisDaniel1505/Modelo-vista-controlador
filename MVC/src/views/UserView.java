package views;

import models.User;
import models.UserModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controllers.UserController;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserView extends JFrame {
    private JTable table;
    private DefaultTableModel tabla;
    private JButton btnCerrar, btnActualizar, btnAdd, btnAdd2;

    public UserView() {
        setTitle("Usuarios");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        String[] columnas = {"ID", "Nombre", "Email", "Rol", "Teléfono", "Creación"};
        tabla = new DefaultTableModel(columnas, 0);
        table = new JTable(tabla);
        add(new JScrollPane(table), BorderLayout.CENTER);
        
        JPanel panelAcciones = new JPanel();
        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        btnAdd = new JButton("Añadir");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addUser();
            }
        });
        panelAcciones.add(btnCerrar);
        panelAcciones.add(btnActualizar);
        panelAcciones.add(btnAdd);
        add(panelAcciones, BorderLayout.SOUTH);
        
    }
    public void addUser() {
    	JFrame form = new JFrame("Nuevo usuario");
        form.setSize(300, 300);
        form.setLocationRelativeTo(null);
        form.setLayout(new GridLayout(5, 2));

        JTextField txtId = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtRol = new JTextField();

        form.add(new JLabel("Nombre:")); form.add(txtNombre);
        form.add(new JLabel("Email:")); form.add(txtEmail);
        form.add(new JLabel("Rol:")); form.add(txtRol);

        btnAdd2 = new JButton("Guardar");
        btnAdd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	UserModel userM = new UserModel();
            	String nombre = txtNombre.getText();
            	String email = txtEmail.getText();
            	String rol = txtRol.getText();
            	
            	userM.add(nombre, email, rol);
            	form.dispose();
            	
            }
        });

        form.add(btnAdd2);
        form.setVisible(true);
    }
    public JButton getBtnActualizar() {
        return btnActualizar;
    }
    public void ListaUsuarios(ArrayList<User> users) {
        tabla.setRowCount(0);
        for (User Users : users) {
            Object[] columna = {Users.getId(), Users.getName(), Users.getEmail(), Users.getRole(), Users.getPhone(), Users.getFecha() };
            tabla.addRow(columna);
        }
    }
    
}