/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author sa
 */
public class Cliente implements Serializable{
    private int id;
    private String nome;
    private String senha;
    private String email;
    private String CPF;    
    private String atendimentos;

    public Cliente() {
    }

    public Cliente(String nome, String senha, String email, String CPF, String atendimentos) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.CPF = CPF;
        this.atendimentos = atendimentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(String atendimentos) {
        this.atendimentos = atendimentos;
    }

}
