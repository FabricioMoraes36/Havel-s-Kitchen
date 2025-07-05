package br.com.HavelsKitchen.recipes.Recipe;

import br.com.HavelsKitchen.recipes.ingredients.IngredientModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "Recipes") //cria uma tabela com o nome recipes
@Data //adiciona os getters e setters
@AllArgsConstructor //adiciona construtores com todos os argumentos
@NoArgsConstructor //adiciona construtores sem argumentos
@Entity //marca a classe como uma entidade no db

public class RecipeModel {
    //identificador unico gerado automaticamente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //nome da receita
    @Column(name ="name")
    private String name;

    //breve descrição da receita
    @Column(name ="description")
    private String description;

    //enum para a dificuldade de preparo
    @Column(name ="dificulty")
    private DifficultyLevel difficulty;

    //lista com os principais ingredientes para essa receita
    @Column(name ="base_ingredients")
    @Transient
    private List<IngredientModel>baseIngredients;

    //quantas vezes podemos aumentar essa receita para mais pessoas
    @Column(name ="soul_count(serves)")
    private int soulCount;

    //data da criação da receita
    @Column(name ="created_at")
    private LocalDateTime createdAt;

    //data de atualização da receita
    @Column(name ="Update_at")
    private LocalDateTime updatedAt;

    //@ManyToMany pq os ingredientes podem aparecer em varias receitas
    @ManyToMany
    @JoinTable(name = "Recipe_ingredient",joinColumns = @JoinColumn(name = "Recipe_id"),inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private List<IngredientModel>ingredients;

}
