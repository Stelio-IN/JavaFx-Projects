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
public class Administrador extends Pessoa {

    @Column(nullable = false)
    private String nivelAcesso;

    // Getters e Setters
}

