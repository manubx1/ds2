/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package manu.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Ingresso {
   protected float valor;
   private String nome;
   private String cpf;

    public Ingresso(float valor, String nome, String cpf) {
        this.valor = valor;
        this.nome = nome;
        this.cpf = cpf;
    }

    public float getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
 
    
 
    
   
}

