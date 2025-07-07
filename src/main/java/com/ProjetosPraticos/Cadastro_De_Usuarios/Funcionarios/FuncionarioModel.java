package com.ProjetosPraticos.Cadastro_De_Usuarios.Funcionarios;

import com.ProjetosPraticos.Cadastro_De_Usuarios.Cargo_Inicial.CargoInicialModel;
import jakarta.persistence.*;

//transforma classe em entidade no banco de dados
@Entity
@Table (name = "tb_funcionario")
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

    public FuncionarioModel() {
    }

    public FuncionarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
