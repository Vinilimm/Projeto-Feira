package com.projeto.feira.Domain.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "itemCompra")
public class ItemCompra {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private double valor;

    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "feira_id")  // Define a chave estrangeira para "Feira"
    @JsonIgnore
    private Feira feira;




    public ItemCompra(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Feira getFeira() {
        return feira;
    }

    public void setFeira(Feira feira) {
        this.feira = feira;
    }
}
