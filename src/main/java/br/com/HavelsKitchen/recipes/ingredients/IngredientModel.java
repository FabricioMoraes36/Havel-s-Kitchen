package br.com.HavelsKitchen.recipes.ingredients;

import br.com.HavelsKitchen.recipes.Recipe.RecipeModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name="Ingredients") //cria uma tabela com o nome Ingredients
@Data //adiciona os getters e setters
@AllArgsConstructor //adiciona construtores com todos os argumentos
@NoArgsConstructor //adiciona construtores sem argumentos
@Entity //marca a classe como uma entidade no db

public class IngredientModel {

    //identificador unico gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "Type")
    private IngredientType type;

    @Column(name = "rarity")
    private boolean isRare;

    //@ManyToMany pq as receitas podem ter os mesmos ingredientes
    @ManyToMany(mappedBy = "ingredients")
    private List<RecipeModel>recipes;

}
