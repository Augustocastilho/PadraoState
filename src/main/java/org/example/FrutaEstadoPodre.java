package org.example;

public class FrutaEstadoPodre extends FrutaEstado {

    private FrutaEstadoPodre() {};
    private static FrutaEstadoPodre instance = new FrutaEstadoPodre();
    public static FrutaEstadoPodre getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Podre";
    }

}
