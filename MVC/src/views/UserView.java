package views;

import models.User;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserView extends JFrame {
    private JTable table;
    private DefaultTableModel tabla;
    private JButton btnCerrar, btnActualizar;

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
        panelAcciones.add(btnCerrar);
        panelAcciones.add(btnActualizar);
        add(panelAcciones, BorderLayout.SOUTH);
        
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