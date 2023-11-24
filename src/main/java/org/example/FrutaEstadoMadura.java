package org.example;

public class FrutaEstadoMadura extends FrutaEstado {
    
    private FrutaEstadoMadura() {};
    private static FrutaEstadoMadura instance = new FrutaEstadoMadura();
    public static FrutaEstadoMadura getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Madura";
    }

    @Override
    public boolean estragar(Fruta fruta) {
        fruta.setEstado(FrutaEstadoPodre.getInstance());
        return true;
    }
}
