package br.com.HavelsKitchen.recipes.Recipe;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    //GET - lista todas as receitas
    public List<RecipeModel>listAll(){
        return recipeRepository.findAll();
    }

    //GET - lista a receita por id
    public Optional<RecipeModel>listById(Long id){
        return recipeRepository.findById(id);
    }

    //POST - cria a receita
    public RecipeModel create(RecipeModel recipe){
        return recipeRepository.save(recipe);
    }

    //PUT - altera a receita


    //DELETE - deleta a receita por id
    public void deleteById(Long id){
        recipeRepository.deleteById(id);
    }
}
