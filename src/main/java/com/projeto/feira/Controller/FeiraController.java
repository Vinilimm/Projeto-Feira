package com.projeto.feira.Controller;


import com.projeto.feira.Domain.DTO.FeiraCreateDTO;
import com.projeto.feira.Domain.Entities.Feira;
import com.projeto.feira.Services.Feira.FeiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feira")
public class FeiraController {

    @Autowired
    private FeiraService feiraService;

    @GetMapping
    public ResponseEntity <List<Feira>> getAll(){
        List<Feira> feiras = feiraService.listarFeiras();
        return ResponseEntity.ok(feiras);

    }

    @PostMapping
    public ResponseEntity<Feira> createFeira(@RequestBody FeiraCreateDTO feiraCreateDTO){
       Feira createdFeira;
       createdFeira = feiraService.createFeira(feiraCreateDTO);
        return ResponseEntity.ok(createdFeira);
    }
}
