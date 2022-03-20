/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjconstrutores;

/**
 *
 * @author Retr0
 */
public class Pessoa {
    private int id_pessoa;
    private String nome;
    private String sobrenome;
    private String bairro;
    private int cidade_ibge;

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCidade_ibge() {
        return cidade_ibge;
    }

    public void setCidade_ibge(int cidade_ibge) {
        this.cidade_ibge = cidade_ibge;
    }

    
    
    Pessoa(String bairro, int cidade_ibge) {
        this.bairro = bairro;
        this.cidade_ibge = cidade_ibge;
    }

    public Pessoa(int id_pessoa, String nome, String sobrenome, String bairro, int cidade_ibge) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.bairro = bairro;
        this.cidade_ibge = cidade_ibge;
    }
    
    Pessoa(){
    
    }
    
    
    
}
