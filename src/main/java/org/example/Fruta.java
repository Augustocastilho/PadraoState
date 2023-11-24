package org.example;

public class Fruta {

    private String nome;
    private FrutaEstado estado;

    public Fruta() {
        this.estado = FrutaEstadoVerde.getInstance();
    }

    public void setEstado(FrutaEstado estado) {
        this.estado = estado;
    }

    public boolean registrarFruta() {
        return estado.registrarFruta(this);
    }

    public boolean amadurecer() {
        return estado.amadurecer(this);
    }

    public boolean estragar() {
        return estado.estragar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FrutaEstado getEstado() {
        return estado;
    }

}
