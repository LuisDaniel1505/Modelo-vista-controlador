package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AuthModel {

	String url = AuthModel.class.getResource("/Files/user.txt").getPath();
    public boolean access(String usuario, String contrasena) {
        try {
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
    
    public boolean registro(String nombres,String apellidos,String empresa,String ambito,String cargo,String usuario,String email,String password){
        FileWriter archivo=null;
        PrintWriter escritor=null;
        try{
            archivo=new FileWriter("src/Files/registro.txt",true);
            escritor=new PrintWriter(archivo);
            String linea = String.join("|",nombres,apellidos,empresa,ambito,cargo,usuario,email,password);
            escritor.println(linea);
            escritor.close();archivo.close();
            return true;
        }catch(Exception e){
        	e.printStackTrace();
            System.out.println("No se encontró el archivo.");
        }
        return false;
    }
}
