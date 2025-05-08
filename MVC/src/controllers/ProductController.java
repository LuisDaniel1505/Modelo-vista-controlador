package controllers;

import models.Product;
import models.ProductModel;
import views.ProductView;
import java.util.List;

public class ProductController {
    private ProductModel modelo;
    private ProductView vista;

    public ProductController() {
        modelo = new ProductModel();
        vista = new ProductView(this);
    }

    public void mostrarProductos() {
        List<Product> productos = modelo.obtenerProductos();
        vista.actualizarTabla(productos);
    }
    
    public void agregarProducto(int id, String nombre, double precio, int stock) {
        Product producto = new Product(id, nombre, precio, stock);
        boolean hecho = modelo.agregarProducto(producto);
        if (hecho) {
            mostrarProductos();
        } else {
            System.out.println("Error al agregar producto");
        }
    }
}