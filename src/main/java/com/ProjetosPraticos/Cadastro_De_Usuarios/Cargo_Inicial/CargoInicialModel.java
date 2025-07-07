package com.ProjetosPraticos.Cadastro_De_Usuarios.Cargo_Inicial;

import com.ProjetosPraticos.Cadastro_De_Usuarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name="tb_cargos")
public class CargoInicialModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCargo;
    private String nivelExp;

    @OneToMany (mappedBy = "cargos")
    private FuncionarioModel funcionario;
}
