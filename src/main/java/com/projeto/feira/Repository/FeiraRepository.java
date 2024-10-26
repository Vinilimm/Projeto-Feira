package com.projeto.feira.Repository;

import com.projeto.feira.Domain.Entities.Feira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeiraRepository extends JpaRepository<Feira, Long> {



}
