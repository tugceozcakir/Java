import model.*;
import model.Character;
import service.LoadService;

import java.math.BigDecimal;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LoadService loadService = new LoadService();

        // Load characters
        ArrayList<model.Character> characterList = loadService.loadCharacters();
        System.out.println("------Characters------");
        for (Character character : characterList) {
            System.out.println(character.getName());
        }

        // Load Pokémon
        ArrayList<Pokemon> pokemonList = loadService.loadPokemons();
        System.out.println("\n------Pokemon--------");
        for (Pokemon pokemon : pokemonList) {
            System.out.println(pokemon.getName());
        }

    };
}