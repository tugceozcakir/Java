package model;

public class ToolStore extends NormalLoc {

     public ToolStore(Player player){
          super(player, "Mağaza");
     }

     @Override
     boolean onLocation() {
          System.out.println("Mağazaya hoş geldiniz.");
          return true;
     }
     
}
