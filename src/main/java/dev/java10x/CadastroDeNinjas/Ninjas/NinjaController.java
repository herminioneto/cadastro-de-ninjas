package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Hello Spring";
    }

    // Adicionar ninja
    @PostMapping("/criar")
    public String criarNinja() {
        return "ninja criado";
    }

    // Mostrar todos os ninjas
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas() {
        return "todos os ninjas";
    }

    // Procurar ninja por id
    @GetMapping("/ninjaID")
    public String mostrarNinjaPorId() {
        return "ninja por id";
    }

    // Alterar dados dos ninjas
    @PutMapping("/alterarID")
    public String alterarNinjaPorId() {
        return "alterar ninja por id";
    }

    // Deletar ninja
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId() {
        return "deletar ninja por id";
    }
}
