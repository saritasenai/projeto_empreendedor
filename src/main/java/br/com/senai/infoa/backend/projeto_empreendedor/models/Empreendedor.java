package br.com.senai.infoa.backend.projeto_empreendedor.models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
//Um empreendedor pode ter varios endereços, sendo assim usamos o @Onetomany
    @OneToMany
    @JoinColumn(name = "id_empreendedor")
    private List<Endereco> enderecos;

    //Varios empreendedores podem ter varios produtos, sendo assim usamos o @ManytoMany
    @ManyToMany
    @JoinTable (
        name = "empreendedor_produto",
        joinColumns = @JoinColumn(name = "id_empreendedor"),
        inverseJoinColumns = @JoinColumn(name = "id_produto") // serve para indicar qual é a coluna que vai ser usada para fazer o join com a tabela de produto
    )
    private List<Produto> produtos;
    public Empreendedor() {
    }

    public Empreendedor(Integer id, String cpf, LocalDate dataNascimento, List<Produto> produtos) {
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
    // essa função serve para retornar a lista de endereços do empreendedor, que é uma lista de objetos do tipo Endereco.
    public List<Endereco> getEnderecos() {
        return enderecos;  
    }
    

}


