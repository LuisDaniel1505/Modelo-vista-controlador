package models;

public class AuthModel {

    public boolean access(String usuario, String contrasena){

        if(usuario.equals("danidash@gmail.com") && contrasena.equals("GokuLares123")) {
            return true;
        } else {
            return false;
        }
    }
}
