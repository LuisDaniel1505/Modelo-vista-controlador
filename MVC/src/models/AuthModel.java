package models;

import java.io.BufferedReader;
import java.io.FileReader;

public class AuthModel {

    public boolean access(String usuario, String contrasena) {
        try {
            String url = AuthModel.class.getResource("/Files/user.txt").getPath();
            BufferedReader lector = new BufferedReader(new FileReader(url));
            String linea;

            while ((linea = lector.readLine()) != null) {
            	
                String[] datos = linea.split(",");
                if (datos.length >= 2) {
                    String email = datos[0].trim();
                    String pass = datos[1].trim();

                    if (usuario.equals(email) && contrasena.equals(pass)) {
                        lector.close();
                        return true;
                    }
                }
            }
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No se encontró el archivo.");
        }

        return false;
    }
    public void registro(String usuario, String biografia, String preferencias, String colonia, boolean aceptoTerminos) {
        System.out.println("Registro de usuario:");
        System.out.println("Usuario: " + usuario);
        System.out.println("Biografía: " + biografia);
        System.out.println("Preferencias: " + preferencias);
        System.out.println("Colonia: " + colonia);
        System.out.println("Aceptó términos: " + aceptoTerminos);
    }
}
