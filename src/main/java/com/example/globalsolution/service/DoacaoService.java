package com.example.globalsolution.service;

import com.example.globalsolution.entity.Doacao;
import com.example.globalsolution.entity.DoacaoRequest;
import com.example.globalsolution.repository.DoacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoacaoService {
    private final DoacaoRepository doacaoRepository;

    @Autowired
    public DoacaoService(DoacaoRepository doacaoRepository) {
        this.doacaoRepository = doacaoRepository;
    }

    public List<Doacao> getAllDoacoes() {
        return doacaoRepository.findAll();
    }

    public Doacao createDoacao(DoacaoRequest request) {
        Doacao doacao = new Doacao();
        doacao.setValor(request.getValor());
        doacao.setValorArrecadado(request.getValor());
        return doacaoRepository.save(doacao);
    }

    public Doacao updateDoacao(Long id, DoacaoRequest request) {
        Optional<Doacao> optionalDoacao = doacaoRepository.findById(id);
        if (optionalDoacao.isPresent()) {
            Doacao doacao = optionalDoacao.get();
            int valorArrecadado = doacao.getValorArrecadado() + request.getValor(); // Somar o valor arrecadado com o valor da doação
            doacao.setValorArrecadado(valorArrecadado);
            return doacaoRepository.save(doacao);
        } else {
            return null;
        }
    }
}
