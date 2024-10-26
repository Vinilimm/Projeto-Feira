package com.projeto.feira.Domain.Entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table (name = "feira")
public class Feira {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Date data;

    @OneToMany(mappedBy = "feira", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItemCompra> itensCompra;


    public Feira(String nome, Date data, List<ItemCompra> itensCompra) {
        this.nome = nome;
        this.data = data;
        this.itensCompra = itensCompra;
    }

    public Feira() {

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }
}

