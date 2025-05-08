package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import controllers.ProductController;
import models.Product;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProductView extends JFrame {
    private JTable tabla;
    private DefaultTableModel tableModel;
    private JButton btnActualizar;
    private JButton btnCerrar;
    private JButton btnNuevo;
    private ProductController controlador;

    public ProductView(ProductController controlador) {
        this.controlador = controlador;
        setTitle("Gestión de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tableModel = new DefaultTableModel(new Object[]{"ID", "Nombre", "Precio", "Stock"}, 0);
        tabla = new JTable(tableModel);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        // Botones
        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.mostrarProductos();
            }
        });
        
        btnNuevo = new JButton("Nuevo Producto");
        btnNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	agregar();
            }
        });
        
        btnCerrar = new JButton("Cerrar");
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        JPanel panel = new JPanel();
        panel.add(btnActualizar);
        panel.add(btnCerrar);
        panel.add(btnNuevo);
        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actualizarTabla(List<Product> productos) {
        tableModel.setRowCount(0);
        for (Product p : productos) {
            tableModel.addRow(new Object[]{
                p.getId(),
                p.getNombre(),
                p.getPrecio(),
                p.getStock()
            });
        }
    }
    private void agregar() {
        JFrame form = new JFrame("Nuevo Producto");
        form.setSize(300, 300);
        form.setLocationRelativeTo(null);
        form.setLayout(new GridLayout(5, 2));

        JTextField txtId = new JTextField();
        JTextField txtNombre = new JTextField();
        JTextField txtPrecio = new JTextField();
        JTextField txtStock = new JTextField();

        form.add(new JLabel("ID:")); form.add(txtId);
        form.add(new JLabel("Nombre:")); form.add(txtNombre);
        form.add(new JLabel("Precio:")); form.add(txtPrecio);
        form.add(new JLabel("Stock:")); form.add(txtStock);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtId.getText());
                String nombre = txtNombre.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                int stock = Integer.parseInt(txtStock.getText());
                controlador.agregarProducto(id, nombre, precio, stock);
                form.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(form, "Datos inválidos");
            }
        });

        form.add(btnGuardar);
        form.setVisible(true);
    }
}