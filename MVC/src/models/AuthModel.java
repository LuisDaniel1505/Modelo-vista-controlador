package models;

public class AuthModel {

    public boolean access(String usuario, String contrasena){

        if(usuario.equals("danidash@gmail.com") && contrasena.equals("GokuLares123")) {
            return true;
        } else {
            return false;
        }
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
