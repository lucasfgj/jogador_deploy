package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_jogador")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @NotBlank(message = "Idade é obrigatorio.")
    private String idade;

    @NotBlank(message = "Altura é obrigatorio.")
    private String altura;

    @NotBlank(message = "Peso é obrigatorio.")
    private String peso;

    @NotBlank(message = "Posicao é obrigatorio.")
    private String posicao;

    @NotBlank(message = "Numero da camisa é obrigatorio.")
    private String numCamisa;


    public Usuario() {
    }

    public Usuario(String altura, Long id, String idade, String nome, String numCamisa, String peso, String posicao, Sexo sexo) {
        this.altura = altura;
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.numCamisa = numCamisa;
        this.peso = peso;
        this.posicao = posicao;
        this.sexo = sexo;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(String numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}