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
import java.util.List;

@Entity
public class Carrinho_de_compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamento ManyToOne com o Cliente
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)  // Cliente é obrigatório
    private Cliente cliente;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    // Getters e Setters
}
