package models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ProductModel {

    public List<Product> obtenerProductos() {
        List<Product> productos = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try (FileReader ruta = new FileReader(getClass().getResource("/files/producto.json").getPath())) {
        	
            JSONObject raiz = (JSONObject) parser.parse(ruta);
            JSONArray arregloObjetos = (JSONArray) raiz.get("productos");
            for (Object item : arregloObjetos) {
                JSONObject objeto = (JSONObject) item;
                int id = (int)(long) objeto.get("id");
                String nombre = (String) objeto.get("nombre");
                double precio = (double) objeto.get("precio");
                int stock = (int)(long) objeto.get("stock");
                productos.add(new Product(id, nombre, precio, stock));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productos;
    }
}