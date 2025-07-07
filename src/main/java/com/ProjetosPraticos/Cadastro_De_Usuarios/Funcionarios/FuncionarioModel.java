package com.ProjetosPraticos.Cadastro_De_Usuarios.Funcionarios;

import com.ProjetosPraticos.Cadastro_De_Usuarios.Cargo_Inicial.CargoInicialModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//transforma classe em entidade no banco de dados
@Entity
@Table (name = "tb_funcionario")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "cargos_id")
    private CargoInicialModel cargoinicial;
}