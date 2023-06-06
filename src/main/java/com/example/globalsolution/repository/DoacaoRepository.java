package com.example.globalsolution.repository;

import com.example.globalsolution.entity.Doacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoacaoRepository extends JpaRepository<Doacao, Long> {
}
