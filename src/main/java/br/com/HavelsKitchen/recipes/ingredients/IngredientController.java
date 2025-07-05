package br.com.HavelsKitchen.recipes.ingredients;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Ingredients")

public class IngredientController {

    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    //GET ALL
    @GetMapping("")
    public List<IngredientModel>listAll(){
        return ingredientService.listAll();
    }

    //GET BY ID
    @GetMapping("/{id}")
    public Optional<IngredientModel>listById(@PathVariable Long id){
        return ingredientService.listById(id);
    }

    //POST
    @PostMapping("/create")
    public IngredientModel create(IngredientModel ingredient){
        return ingredientService.create(ingredient);
    }

    //PUT BY ID
    @PutMapping

    //DELETE BY ID
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        ingredientService.deleteById(id);
    }

}
