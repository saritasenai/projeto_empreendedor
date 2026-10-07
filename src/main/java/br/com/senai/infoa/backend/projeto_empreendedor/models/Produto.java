package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity 
@Table(name="produto")
public class Produto {
    
    @Id 
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;

    @Column (name="nome")
    private String name;

    @Column (name="dataFabricacao")
    private String dataFabricacao;

    @Column (name="preco")
    private Double preco;

    @ManyToMany 
    @JoinTable (
        name = "empreendedor_produto", 
        joinColumns = @JoinColumn(name = "id_produto"),
        inverseJoinColumns = @JoinColumn(name = "id_empreendedor") 
    )
    private List<Empreendedor> empreendedores;
    public Produto() {
    }

    public Produto(String dataFabricacao, Integer id, String name, Double preco, List<Empreendedor> empreendedores) {
        this.dataFabricacao = dataFabricacao;
        this.id = id;
        this.name = name;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public List<Empreendedor> getEmpreendedores() {
        return empreendedores;
    }
    public void setEmpreendedores(List<Empreendedor> empreendedores) {
        this.empreendedores = empreendedores;
    }

}
