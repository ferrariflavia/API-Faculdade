package com.inspirar.inspirarapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;
    private Object Cursos;

    @GetMapping
    public List<Cursos> listar(){return cursosRepository.findAll();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cursos adicionar(@RequestBody Cursos cursos){
        return cursosRepository.save(cursos);
    }
}
