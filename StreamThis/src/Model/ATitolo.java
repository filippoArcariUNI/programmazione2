package Model;

import Model.Enums.Categoria;
import Model.Enums.Lingue;

import java.awt.*;

public abstract class ATitolo implements Titolo{
    private final double scontoVecchiaia= 0.15;

    private String nome;
    private int annoPubblicazione;
    private Categoria categoria;
    private Lingue lingua;
    private int prezzo;
    private double prezzoScontato;

    public ATitolo(String nome, int annoPubblicazione, Categoria categoria, Lingue lingua, int prezzo) {
        this.nome = nome;
        this.annoPubblicazione = annoPubblicazione;
        this.categoria = categoria;
        this.lingua = lingua;
        this.prezzo = prezzo;
        this.calcolaPrezzoScontato();
    }

    private void calcolaPrezzoScontato() {
        if (annoPubblicazione < 2015){
            prezzoScontato = prezzo*(1-scontoVecchiaia);
        }
    }

    public double getPrezzoScontato() {
        if (prezzoScontato == 0 ){
            return prezzo;
        }else{
            return prezzoScontato;
        }
    }


    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setPrezzoScontato(double prezzoScontato) {
        this.prezzoScontato= prezzoScontato;
    }

    @Override
    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    @Override
    public Categoria getCategoria() {
        return this.categoria;
    }

    @Override
    public Lingue getLingua() {
        return this.lingua;
    }

    @Override
    public int getPrezzo() {
        return prezzo;
    }
}
