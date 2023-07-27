package service;

import model.Player;
import model.Pokemon;
import model.WeatherEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherService {
    public WeatherEnum getWeather() {
        int random = (int) (Math.random() * 4);
        return switch (random) {
            case 1 -> WeatherEnum.RAINY;
            case 2 -> WeatherEnum.WINDY;
            case 3 -> WeatherEnum.HOT;
            default -> WeatherEnum.SUNNY;
        };
    }
    public void effectOfWeatherOnPower(Pokemon pokemon, WeatherEnum weatherEnum) {
        switch (pokemon.getType()) {
            case ELECTRICY:
                if (weatherEnum == WeatherEnum.RAINY) {
                    //Electric-type Pokemon power increases in rainy weather
                    pokemon.setDamage(pokemon.getDamage() * 2);
                    System.out.println(pokemon.getName() + " yağmurlu havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.WINDY) {
                    //Electric type Pokemon power decreases in windy weather
                    pokemon.setDamage(pokemon.getDamage() / 2);
                    System.out.println(pokemon.getName() + " rüzgarlı havada güç kaybetti.");
                }
                break;
            case WATER:
                if (weatherEnum == WeatherEnum.RAINY) {
                    //Water-type Pokemon strength increases in rainy weather
                    pokemon.setDamage(pokemon.getDamage() * 2);
                    System.out.println(pokemon.getName() + " yağmurlu havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.SUNNY) {
                    //Water-type Pokemon strength decreases in sunny weather
                    pokemon.setDamage(pokemon.getDamage() / 2);
                    System.out.println(pokemon.getName() + " güneşli havada güç kaybetti.");
                }
                break;
            case FIRE:
                if (weatherEnum == WeatherEnum.HOT) {
                    //Fire-type Pokemon strength increases in hot weather
                    pokemon.setDamage(pokemon.getDamage() * 2);
                    System.out.println(pokemon.getName() + " sıcak havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.RAINY) {
                    //Fire-type Pokemon strength decreases in rainy weather
                    pokemon.setDamage(pokemon.getDamage() / 2);
                    System.out.println(pokemon.getName() + " yağmurlu havada güç kaybetti.");
                }
                break;
            case EARTH:
                if (weatherEnum == WeatherEnum.WINDY) {
                    //Ground type Pokemon strength increases in windy weather
                    pokemon.setDamage(pokemon.getDamage() * 2);
                    System.out.println(pokemon.getName() + " rüzgarlı havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.HOT) {
                    //Earth type Pokemon strength decreases in hot weather
                    pokemon.setDamage(pokemon.getDamage() / 2);
                    System.out.println(pokemon.getName() + " sıcak havada güç kaybetti.");
                }
                break;
            default:
                break;
        }
    }
    public void applyWeatherEffects(Player player1, Player player2) {
        WeatherEnum weatherEnum = getWeather();
        System.out.println("Weather is " + weatherEnum + "!\n");

        // Apply weather effects on player1's Pokemon
        for (Pokemon pokemon : player1.getCharacter().getPokemonList()) {
            effectOfWeatherOnPower(pokemon, weatherEnum);
        }

        // Apply weather effects on player2's Pokemon
        for (Pokemon pokemon : player2.getCharacter().getPokemonList()) {
            effectOfWeatherOnPower(pokemon, weatherEnum);
        }
    }
}
