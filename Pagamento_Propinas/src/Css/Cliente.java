
package Css;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente extends Pessoa {

    @Column(nullable = false)
    private String telefone;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Venda> vendas;

    // Relacionamento OneToMany para Carrinhos de Compras
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Carrinho_de_compras> carrinhos;

    // Getters e Setters
}
