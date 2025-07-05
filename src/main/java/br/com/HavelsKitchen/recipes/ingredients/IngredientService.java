package br.com.HavelsKitchen.recipes.ingredients;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {
    private IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    //GET - lista todas as receitas
    public List<IngredientModel>listAll(){
        return ingredientRepository.findAll();
    }
    //GET - lista a receita por id
    public Optional<IngredientModel>listById(Long id){
        return ingredientRepository.findById(id);
    }

    //POST - cria a receita
    public IngredientModel create(IngredientModel ingredient){
      return ingredientRepository.save(ingredient);
    }

    //PUT - altera a receita

    //DELETE - deleta a receita por id
    public void deleteById (Long id){
        ingredientRepository.deleteById(id);
    }
}
