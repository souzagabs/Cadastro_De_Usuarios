package com.ProjetosPraticos.Cadastro_De_Usuarios.Funcionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Esta é a primeira rota";
    }


}
