package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity
// Transforma uma classe numa entidade no banco de dados
// JPA -> Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // Cria um construtor vazio
@AllArgsConstructor // Cria um construtor com todos os argumentos
@Data // Cria os getters e setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    @Column (name = "rank")
    private String rank;

    // Um ninja tem uma única missão, mas uma missão pode ser atribuída a mais de um ninja
    // Para facilitar -> o "Many" se refere a classe em questão, no caso "Ninja", e "One" se refere a classe relacionada,
    // no caso "Missoes" (muitos ninjas podem ter uma única missão)
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Chave Estrangeira
    private MissoesModel missoes;

}
