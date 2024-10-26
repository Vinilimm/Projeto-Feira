package com.projeto.feira.Services.Feira;

import com.projeto.feira.Domain.DTO.FeiraCreateDTO;
import com.projeto.feira.Domain.Entities.Feira;
import com.projeto.feira.Domain.Entities.ItemCompra;
import com.projeto.feira.FeiraApplication;
import com.projeto.feira.Mapper.FeiraMapper;
import com.projeto.feira.Repository.FeiraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class FeiraService implements IFeiraService{

    @Autowired
    private FeiraRepository _feiraRepository;

    @Autowired
    private  final FeiraMapper _feiraMapper;



    public FeiraService(FeiraRepository feiraRepository, FeiraMapper feiraMapper) {
        _feiraRepository = feiraRepository;
        _feiraMapper = feiraMapper;
    }

    public List<Feira> listarFeiras(){
        return _feiraRepository.findAll();
    }


    public Feira createFeira(FeiraCreateDTO feiraCreateDTO) {
        Feira feira = _feiraMapper.toFeira(feiraCreateDTO);
        feira.setData(new Date());
        for (ItemCompra item : feira.getItensCompra()){
            item.setFeira(feira);
        }
        return _feiraRepository.save(feira);
    }


}
