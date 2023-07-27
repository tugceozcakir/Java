package service;

import model.Pokemon;
import model.WeatherEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherService {

    public WeatherEnum createWeatherEnum() {

        Random randomWeather = new Random();
        List<WeatherEnum> weatherList = new ArrayList<>();
        for (WeatherEnum weather : WeatherEnum.values()) {
            weatherList.add(weather);
        }
        int index = randomWeather.nextInt(4);
        return weatherList.get(index);
    }

    public void EffectOfWeatherOnPower(Pokemon pokemon, WeatherEnum weatherEnum) {

        switch (pokemon.getType().toString()) {
            case "ELECTRICY" -> {
                if (weatherEnum == WeatherEnum.RAINY) {
                    pokemon.setDamage((pokemon.getDamage() * 15 / 10));
                    System.out.println("Pikachu yağmurlu havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.WINDY) {
                    pokemon.setDamage((pokemon.getDamage() * 5 / 10));
                    System.out.println("Pikachu rüzgarlı havada güç kaybetti.");
                }
            }
            case "WATER" -> {
                if (weatherEnum == WeatherEnum.RAINY) {
                    pokemon.setDamage(pokemon.getDamage() * 15 / 10);
                    System.out.println("Squirtle yağmurlu havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.SUNNY) {
                    pokemon.setDamage(pokemon.getDamage() * 5 / 10);
                    System.out.println("Squirtle güneşli havada güç kaybetti.");
                }
            }
            case "FIRE" -> {
                if (weatherEnum == WeatherEnum.HOT) {
                    pokemon.setDamage(pokemon.getDamage() * 15 / 10);
                    System.out.println("Charmander sıcak havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.RAINY) {
                    pokemon.setDamage(pokemon.getDamage() * 5 / 10);
                    System.out.println("Charmander yağmurlu havada güç kaybetti.");
                }
            }
            case "WIND" -> {
                if (weatherEnum == WeatherEnum.WINDY) {
                    pokemon.setDamage(pokemon.getDamage() * 15 / 10);
                    System.out.println("Bulbasaur rüzgarlı havada güç kazandı.");
                } else if (weatherEnum == WeatherEnum.HOT) {
                    pokemon.setDamage(pokemon.getDamage() * 5 / 10);
                    System.out.println("Bulbasaur sıcak havada güç kaybetti.");
                }
            }
        }
    }
}
