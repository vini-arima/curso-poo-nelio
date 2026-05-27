package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private Double preco;
    private Integer qtd;

    private List<Produto> listProdutos = new ArrayList<>();

    public Produto(String nome, Double preco, Integer qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public Double valorTotal() {
        return preco * qtd;
    }

    @Override
    public String toString() {
        return getNome() + "," + getPreco() + " , " + getQtd();
    }

}
