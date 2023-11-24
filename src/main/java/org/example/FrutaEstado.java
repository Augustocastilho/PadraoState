package org.example;

public abstract class FrutaEstado {

    public abstract String getEstado();

    public boolean registrarFruta(Fruta fruta) {
        return false;
    }

    public boolean amadurecer(Fruta fruta) {
        return false;
    }

    public boolean estragar(Fruta fruta) {
        return false;
    }

    
}
