import model.*;
import model.Character;
import service.GameService;
import service.LoadService;
import service.PlayerService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pokemon Game'e Hoş Geldiniz.");
        System.out.println("----------------------------");
        System.out.println("1- Oyuna başla.");
        System.out.println("2- Çıkış yap.");


        int choice = input.nextInt();
        if (choice == 1) {
            startGame(input);
        } else if (choice == 2) {
            System.out.println("Oyundan çıkılıyor...");
            System.exit(0);
        } else {
            System.out.println("Geçersiz seçim. Lütfen 1 veya 2 girin.");
        }
    }

    public static void startGame(Scanner input) {
        LoadService loadService = new LoadService();
        PlayerService playerService = new PlayerService();
        GameService gameService = new GameService();

        // Load characters
        ArrayList<Character> characterList = loadService.loadCharacters();
        System.out.println("------Characters------");
        for (int i = 0; i < characterList.size(); i++) {
            System.out.println((i + 1) + "- " + characterList.get(i).toString());
        }

        System.out.print("\nOyuncu 1, bir karakter seçin (1-" + characterList.size() + "): ");
        int player1CharacterIndex = input.nextInt() - 1;
        Character player1Character = characterList.get(player1CharacterIndex);

        System.out.print("Oyuncu 1, ismini girin: ");
        String player1Name = input.next();
        Player player1 = playerService.createPlayer(player1Name, player1Character);

        System.out.print("\nOyuncu 2, bir karakter seçin (1-" + characterList.size() + "): ");
        int player2CharacterIndex = input.nextInt() - 1;
        Character player2Character = characterList.get(player2CharacterIndex);

        System.out.print("Oyuncu 2, ismini girin: ");
        String player2Name = input.next();
        Player player2 = playerService.createPlayer(player2Name, player2Character);

        // Load Pokemon
        ArrayList<Pokemon> pokemonList = loadService.loadPokemons();
        System.out.println("\n------Pokemon--------");
        for (int i = 0; i < pokemonList.size(); i++) {
            System.out.println((i + 1) + "- " + pokemonList.get(i).toString());
        }

        // Assign Pokemon to characters
        System.out.println("\nOyuncu 1, bir Pokemon seçin (1-" + pokemonList.size() + "): ");
        int player1PokemonIndex = input.nextInt() - 1;
        player1.getCharacter().getPokemonList().add(pokemonList.get(player1PokemonIndex));

        System.out.println("Oyuncu 2, bir Pokemon seçin (1-" + pokemonList.size() + "): ");
        int player2PokemonIndex = input.nextInt() - 1;
        player2.getCharacter().getPokemonList().add(pokemonList.get(player2PokemonIndex));

        Random random = new Random();
        boolean isPlayer1Turn = random.nextBoolean();

        /*
        gameService.attack(player1, player2, true, true);
        gameService.healthCheck(player2);
         */
        while (true) {
            if (gameService.healthCheck(player1) && gameService.healthCheck(player2)) {
                if (isPlayer1Turn) {
                    System.out.println("\n" + player1.getName() + "'in sırası: ");
                    selectDisplayOptions(input, gameService, player1, player2);

                } else {
                    System.out.println("\n" + player2.getName() + "'in sırası: ");
                    selectDisplayOptions(input, gameService, player2, player1);

                }
                isPlayer1Turn = !isPlayer1Turn;
            } else {
                System.out.println("Oyun bitti");
                break;
            }
        }
    }

    public static void selectDisplayOptions(Scanner input, GameService gameService, Player attacker, Player defender) {
        System.out.println("Saldırı Seçenekleri:");
        System.out.println("1- Normal Saldırı");
        System.out.println("2- Pokemon Özel Güç Saldırısı");
        System.out.println("3- Karakter Özel Güç Saldırısı");
        System.out.print("Seçiminizi yapın (1-3): ");

        int option = input.nextInt();

        // Seçime göre saldırı türünü belirle ve saldırıyı yap
        if (option == 1) {
            gameService.attack(attacker, defender, false, false);
        } else if (option == 2) {
            gameService.attack(attacker, defender, true, false);
        } else if (option == 3) {
            gameService.attack(attacker, defender, false, true);
        }
    }
}