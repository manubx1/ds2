/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manu.mavenproject1;

/**
 *
 * @author Aluno
 */
public class IngressoVIP extends Ingresso {
    private final float valorAdicional;

    public IngressoVIP(float valorAdicional, float valor, String nome, String cpf) {
        super(valor, nome, cpf);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    
   // @Override
   // public float getValor() {
     //   return valor + valorAdicional;                    

    public float getValorTotal() {
        return valor + valorAdicional;
    }

    }           
