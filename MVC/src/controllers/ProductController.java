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
    }

    public void setVista(ProductView vista) {
        this.vista = vista;
    }

    public void mostrarProductos() {
        List<Product> productos = modelo.obtenerProductos();
        vista.actualizarTabla(productos);
    }

    public void agregarProducto(int id, String nombre, double precio, int stock) {
        Product producto = new Product(id, nombre, precio, stock);
        boolean hecho = modelo.agregarProducto(producto);
        if (hecho) mostrarProductos();
        else System.out.println("Error al agregar producto");
    }

    public void eliminarProducto(int id) {
        boolean hecho = modelo.eliminarProducto(id);
        if (hecho) {
        	mostrarProductos();
        }
        else {
        	System.out.println("Error al eliminar producto");
        }
    }
}