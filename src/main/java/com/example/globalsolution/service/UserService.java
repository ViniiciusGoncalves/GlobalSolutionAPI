package com.example.globalsolution.service;

import com.example.globalsolution.entity.Doador;
import com.example.globalsolution.entity.PrecisandoAjuda;
import com.example.globalsolution.entity.User;
import com.example.globalsolution.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Doador createDoador(Doador doador) {
        return userRepository.save(doador);
    }

    public PrecisandoAjuda createPrecisandoAjuda(PrecisandoAjuda precisandoAjuda) {
        return userRepository.save(precisandoAjuda);
    }

    public User loginUser(User loginUser) {
        String email = loginUser.getEmail();
        String password = loginUser.getPassword();

        return userRepository.findByEmailAndPassword(email, password);
    }
}
