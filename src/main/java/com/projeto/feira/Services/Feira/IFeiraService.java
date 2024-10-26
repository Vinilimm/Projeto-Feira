package com.projeto.feira.Services.Feira;

import com.projeto.feira.Domain.DTO.FeiraCreateDTO;
import com.projeto.feira.Domain.Entities.Feira;

import java.util.List;

public interface IFeiraService {

   public List<Feira> listarFeiras();

   public Feira createFeira(FeiraCreateDTO feiraCreateDTO);
}
