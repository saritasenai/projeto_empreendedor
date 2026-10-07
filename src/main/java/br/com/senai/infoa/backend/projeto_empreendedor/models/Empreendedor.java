package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="empreendedor")
public class Empreendedor {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;

    @Column(name="nome")
    private String cpf;

    @Column (name="dataNascimento")
    private java.time.LocalDate dataNascimento;

    public Empreendedor() {
    }

    public Empreendedor(Integer id, String cpf, LocalDate dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public java.time.LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(java.time.LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

}


