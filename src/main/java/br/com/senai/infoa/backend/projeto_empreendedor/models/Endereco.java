package br.com.senai.infoa.backend.projeto_empreendedor.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table (name="endereco")
public class Endereco {
    
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;

    @Column(name= "cep")
    private String cep;

    @Column (name="número")
    private String número;

    @Column (name="logradouro")
    private String logradouro;

    public Endereco() {
    }

    public Endereco(String cep, Integer id, String logradouro, String número) {
        this.cep = cep;
        this.id = id;
        this.logradouro = logradouro;
        this.número = número;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


}
