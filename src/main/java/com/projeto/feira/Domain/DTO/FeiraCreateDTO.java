package com.projeto.feira.Domain.DTO;

import com.projeto.feira.Domain.Entities.ItemCompra;

import java.util.List;

public class FeiraCreateDTO {

    private String nome;

    private List<ItemCompra> itensCompra;





    public FeiraCreateDTO(String nome, List<ItemCompra> itenscompra) {
        this.nome = nome;
        itensCompra = itenscompra;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ItemCompra> getItensCompra() {
        return itensCompra;
    }

    public void setItensCompra(List<ItemCompra> itensCompra) {
        this.itensCompra = itensCompra;
    }

}
