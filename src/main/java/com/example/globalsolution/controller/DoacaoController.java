package com.example.globalsolution.controller;

import com.example.globalsolution.entity.Doacao;
import com.example.globalsolution.entity.DoacaoRequest;
import com.example.globalsolution.service.DoacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doacoes")
public class DoacaoController {
    private final DoacaoService doacaoService;

    @Autowired
    public DoacaoController(DoacaoService doacaoService) {
        this.doacaoService = doacaoService;
    }

    @GetMapping
    public List<Doacao> getAllDoacoes() {
        return doacaoService.getAllDoacoes();
    }

    @PostMapping
    public Doacao createDoacao(@RequestBody DoacaoRequest request) {
        return doacaoService.createDoacao(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Doacao> updateDoacao(@PathVariable Long id, @RequestBody DoacaoRequest request) {
        Doacao updatedDoacao = doacaoService.updateDoacao(id, request);
        if (updatedDoacao != null) {
            return ResponseEntity.ok(updatedDoacao);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}