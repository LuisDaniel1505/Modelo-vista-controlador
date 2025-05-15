package controllers;

import models.User;
import models.UserModel;
import views.UserView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserController {
    private UserModel model;
    private UserView view;

    public UserController() {
        model = new UserModel();
        view = new UserView();
        
        view.getBtnActualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<User> users = model.get();
                users.clear();
                users = model.get();
                view.ListaUsuarios(users);
            }
        });
    }

    public void mostrarUsuarios() {
        ArrayList<User> users = model.get();
        view.ListaUsuarios(users);
        view.setVisible(true);
    }
}