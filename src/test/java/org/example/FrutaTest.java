package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrutaTest {

    Fruta fruta;

    @BeforeEach
    public void setUp() {
        fruta = new Fruta();
    }

    @Test
    public void naoDeveRegistrarFrutaRegistrada() {
        fruta.setEstado(FrutaEstadoVerde.getInstance());
        assertFalse(fruta.registrarFruta());
    }

    @Test
    public void deveAmadurecerFrutaVerde() {
        fruta.setEstado(FrutaEstadoVerde.getInstance());
        assertTrue(fruta.amadurecer());
        assertEquals(FrutaEstadoMadura.getInstance(), fruta.getEstado());
    }

    @Test
    public void naoDeveAmadurecerFrutaMadura() {
        fruta.setEstado(FrutaEstadoMadura.getInstance());
        assertFalse(fruta.amadurecer());
    }

    @Test
    public void naoDeveAmadurecerFrutaPodre() {
        fruta.setEstado(FrutaEstadoPodre.getInstance());
        assertFalse(fruta.amadurecer());
    }

    @Test
    public void deveEstragarFrutaVerde() {
        fruta.setEstado(FrutaEstadoVerde.getInstance());
        assertTrue(fruta.estragar());
        assertEquals(FrutaEstadoPodre.getInstance(), fruta.getEstado());
    }

    @Test
    public void deveEstragarFrutaMadura() {
        fruta.setEstado(FrutaEstadoMadura.getInstance());
        assertTrue(fruta.estragar());
        assertEquals(FrutaEstadoPodre.getInstance(), fruta.getEstado());
    }

    @Test
    public void naoDeveEstragarFrutaPodre() {
        fruta.setEstado(FrutaEstadoPodre.getInstance());
        assertFalse(fruta.estragar());
    }


}