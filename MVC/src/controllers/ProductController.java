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
}