/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Css;

/**
 *
 * @author steli
 */
import javax.persistence.*;

@Entity
public class Funcionario extends Pessoa {

    @Column(nullable = false)
    private String departamento;

    @Column(nullable = false)
    private double salario;

    // Getters e Setters
}

