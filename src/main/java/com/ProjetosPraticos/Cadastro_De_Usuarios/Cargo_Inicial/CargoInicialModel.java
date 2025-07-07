package com.ProjetosPraticos.Cadastro_De_Usuarios.Cargo_Inicial;

import com.ProjetosPraticos.Cadastro_De_Usuarios.Funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name="tb_cargos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CargoInicialModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCargo;
    private String nivelExp;

    @OneToMany (mappedBy = "cargos")
    private FuncionarioModel funcionario;
}
