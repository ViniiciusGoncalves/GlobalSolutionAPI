package com.example.globalsolution.controller;

import com.example.globalsolution.entity.Doador;
import com.example.globalsolution.entity.PrecisandoAjuda;
import com.example.globalsolution.entity.User;
import com.example.globalsolution.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins="*")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/donor")
    public ResponseEntity<Doador> createDoador(@RequestBody Doador doador) {
        Doador createdDoador = userService.createDoador(doador);
        return new ResponseEntity<>(createdDoador, HttpStatus.CREATED);
    }

    @PostMapping("/help")
    public ResponseEntity<PrecisandoAjuda> createPrecisandoAjuda(@RequestBody PrecisandoAjuda precisandoAjuda) {
        PrecisandoAjuda createdHelp = userService.createPrecisandoAjuda(precisandoAjuda);
        return new ResponseEntity<>(createdHelp, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<User> loginUser(@RequestBody User loginUser) {
        User user = userService.loginUser(loginUser);

        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }
}