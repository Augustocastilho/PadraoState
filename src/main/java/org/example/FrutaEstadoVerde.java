package org.example;

public class FrutaEstadoVerde extends FrutaEstado {

    private FrutaEstadoVerde() {};
    private static FrutaEstadoVerde instance = new FrutaEstadoVerde();
    public static FrutaEstadoVerde getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Verde";
    }

    @Override
    public boolean amadurecer(Fruta fruta) {
        fruta.setEstado(FrutaEstadoMadura.getInstance());
        return true;
    }

    @Override
    public boolean estragar(Fruta fruta) {
        fruta.setEstado(FrutaEstadoPodre.getInstance());
        return true;
    }
}
