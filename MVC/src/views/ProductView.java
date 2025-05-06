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
    private ProductController controlador;

    public ProductView(ProductController controlador) {
        this.controlador = controlador;
        setTitle("Gestión de Productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configura tabla
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
}