package model;

import helper.Utils;

import javax.swing.*;

public class Produto {
    private static int contador = 1;

    private int codigo;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.codigo = Produto.contador;
        this.nome = nome;
        this.preco = preco;
        Produto.contador += 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Código: " + this.getCodigo() +
                "\nNome: " + this.getNome() +
                "\nPreço: " + Utils.doubleParaString(this.getPreco());
    }
}
