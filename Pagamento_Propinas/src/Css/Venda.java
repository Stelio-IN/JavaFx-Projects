/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Css;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
/**
 *
 * @author steli
 */


@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private Long id;

    // Relacionamento obrigatório com o Cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)  // Cliente é obrigatório
    private Cliente cliente;

    // Relacionamento obrigatório com o Funcionário
    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)  // Funcionário é obrigatório
    private Funcionario funcionario;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    @Column(nullable = false)
    private double total;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
