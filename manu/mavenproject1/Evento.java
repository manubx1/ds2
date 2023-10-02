/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manu.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Evento extends IngressoVIP {
    String nomEvento;
    LocalDate data;
    String local;
    int maxIngresso;

    public Evento(String nomEvento, LocalDate data, String local, int maxIngresso, float valorAdicional, float valor, String nome, String cpf) {
        super(valorAdicional, valor, nome, cpf);
        this.nomEvento = nomEvento;
        this.data = data;
        this.local = local;
        this.maxIngresso = maxIngresso;
    }
    
    
}
