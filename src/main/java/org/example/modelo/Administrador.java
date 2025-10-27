package org.example.modelo;

public class Administrador {
    private final String surname;
    private final String password;

    Administrador(String surname, String password) {
        this.surname = surname;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
