package br.com.HavelsKitchen.recipes.Recipe;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    //GET ALL
    @GetMapping("")
    public List<RecipeModel>listAll(){
        return recipeService.listAll();
    }

    //GET BY ID
    @GetMapping("/recipes/{id}")
    public Optional<RecipeModel>listById(@PathVariable Long id){
        return recipeService.listById(id);
    }

    //POST
    @PostMapping("/create")
    public RecipeModel create(RecipeModel recipe){
        return recipeService.create(recipe);
    }

    //PUT BY ID
    @PutMapping("/update")


    //DELETE BY ID
    @DeleteMapping("/delete")
    public void deleteById(Long id){
        recipeService.deleteById(id);
    }

}
