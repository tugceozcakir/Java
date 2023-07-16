package model;

import java.util.Scanner;

public class Player {
     private Inventory inventory;
     private int damage;
     private int healthy;
     private int money;
     private String name;
     private String charName;
     Scanner input = new Scanner(System.in);
     
     public Player(String name) {
          this.name = name;
     }

     public void selectChar(){
          System.out.println("######################");
          Samurai samurai = new Samurai();
          Knight knight = new Knight();
          Archer archer = new Archer();

          GameChar[] charList = { new Samurai(), new Knight(), new Archer()};
          for(GameChar gameChar: charList){
               System.out.println("Id: " + gameChar.getId() + "\t\t Karakter: " + gameChar.getName() + "\t\t Hasar: " + gameChar.getDamage() + 
               "\t\t Sağlık: " + gameChar.getHealth()
               + "\t\t Para: " + gameChar.getMoney());
          }
          System.out.println("--------------------");
          System.out.println("Lütfen bir karakter seçiniz.");
          int selectedChar = input.nextInt();
          switch(selectedChar){
               case 1: 
               initPlayer(new Samurai());
               break;

               case 2: 
               initPlayer(new Knight());
               break;

               case 3:
               initPlayer(new Archer());
               break;

               default: 
               initPlayer(new Samurai());
               break;
          }

          System.out.println("Seçilen karakter: " + this.getCharName() + " \t\t Hasar: " + getDamage() +
          " \t\t Sağlık: " + getHealthy() + "\t\t Money: " + getMoney());
     }

     public void initPlayer(GameChar gameChar){
          this.setDamage(gameChar.getDamage());
          this.setHealthy(gameChar.getHealth());
          this.setMoney(gameChar.getMoney());
          this.setCharName(gameChar.getName());
     }
     public Inventory getInventory() {
          return inventory;
     }

     public void setInventory(Inventory inventory) {
          this.inventory = inventory;
     }

     public int getDamage() {
          return damage;
     }

     public void setDamage(int damage) {
          this.damage = damage;
     }

     public int getHealthy() {
          return healthy;
     }

     public void setHealthy(int healthy) {
          this.healthy = healthy;
     }

     public int getMoney() {
          return money;
     }

     public void setMoney(int money) {
          this.money = money;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getCharName() {
          return charName;
     }

     public void setCharName(String charName) {
          this.charName = charName;
     }

     
}
