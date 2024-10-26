package com.projeto.feira.Mapper;
import com.projeto.feira.Domain.DTO.FeiraCreateDTO;
import com.projeto.feira.Domain.Entities.Feira;
import org.springframework.stereotype.Component;

@Component
public class FeiraMapper {

    public  FeiraCreateDTO toFeiraDTO(Feira feira) {
        return new FeiraCreateDTO(feira.getNome(), feira.getItensCompra());
    }

    public  Feira toFeira(FeiraCreateDTO feiraCreateDTO) {
        Feira feira = new Feira();
        feira.setNome(feiraCreateDTO.getNome());
        feira.setItensCompra(feiraCreateDTO.getItensCompra());
        return feira;
    }
}