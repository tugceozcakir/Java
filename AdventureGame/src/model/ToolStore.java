package model;

public class ToolStore extends NormalLoc {

    public int pickedToolID;

    //Player's weapon
    public Weapon weapon = this.getPlayer().getCharacter().getInventory().getWeapon();
    //Player's armor
    public Armor armor = this.getPlayer().getCharacter().getInventory().getArmor();

    //Picked weapon from the store
    public Weapon pickedWeapon;
    //Picked armor from the store
    public Armor pickedArmor;

    public ToolStore(Player player) {
        super(player, "Store", 2);
        //this.getPlayer().getCharacter().getInventory();
    }
    @Override
    public boolean onLocation(){
        System.out.println("************ Welcome to the Store ************");
        System.out.println("1 - Weapons");
        System.out.println("2 - Armors");
        System.out.println("3 - Exit");
        System.out.println("***********************************************");

        System.out.println("Your choice: ");
        pickedToolID = scan.nextInt();

        /*
            while(!(pickedToolID == "1" || pickedToolID == "2" || pickedToolID == "3")){
            System.out.println("You typed an invalid value! Please try again: ");
            pickedToolID = scan.next();
            System.out.println("picked tool id:" + pickedToolID);
        }*/


        switch (pickedToolID){
            case 1 :
                //Print weapon
                weapon.printItemsInfo();
                pickingWeapon();
                break;
            case 2 :
                //Print armors
                armor.printItemsInfo();
                pickingArmor();

                break;
            case 3 :
                    System.out.println("Come again :)");
                    break;
    
            }
            return true;
        }

     //Pick weapon
     public void pickingWeapon(){
        System.out.println("Chose a weapon: ");
        pickedToolID = scan.nextInt();

        //If typed 4 exit
        if(pickedToolID == 4){
            onLocation();
        }

        while(pickedToolID == (this.getPlayer().getCharacter().getInventory().getWeapon().getId())){
            System.out.println("You already have a " + this.getPlayer().getCharacter().getInventory().getWeapon().getName());
            pickingWeapon();
        }
            buyWeapon();



    }

    //Buy weapon
    public void buyWeapon(){
        pickedWeapon = (Weapon) weapon.getItemByID(pickedToolID, weapon.weapons());


        if(pickedWeapon != null){

            //Check money
            if(pickedWeapon.getPrice() > this.getPlayer().getCharacter().getMoney()){
                System.out.println("Sorry, you haven't got enough money!!");
                pickingWeapon();
            }else{
                int newMoney = this.getPlayer().getCharacter().getMoney() - pickedWeapon.getPrice();
                this.getPlayer().getCharacter().setMoney(newMoney);

                System.out.println("Previous weapon " + this.getPlayer().getCharacter().getInventory().getWeapon().getName()
                + ", changed with " + pickedWeapon.getName());

                this.getPlayer().getCharacter().getInventory().setWeapon(pickedWeapon);

            }

        }
    }


    //PICKING AN ARMOR
    public void pickingArmor(){
        System.out.println("Chose an armor: ");
        pickedToolID = scan.nextInt();

        if(pickedToolID== 4){
            onLocation();

        }
        while(pickedToolID == (this.getPlayer().getCharacter().getInventory().getArmor().getId())){
            System.out.println("You already have an " + this.getPlayer().getCharacter().getInventory().getArmor().getName());
            pickingArmor();
              }
            buyArmor();

    }

    //Buy armor
    public void buyArmor(){
        pickedArmor = (Armor) armor.getItemByID(pickedToolID, armor.armors());

        if(pickedArmor != null){

            //Check money
            if(pickedArmor.getPrice() > this.getPlayer().getCharacter().getMoney()){
                System.out.println("Sorry, you haven't got enough money!!");
                pickingArmor();
            }else{
                int newMoney = this.getPlayer().getCharacter().getMoney() - pickedArmor.getPrice();
                this.getPlayer().getCharacter().setMoney(newMoney);

                //PLAYER'S WEAPON INVENTORY CHANGED MESSAGE
                System.out.println("Previous armor " + this.getPlayer().getCharacter().getInventory().getArmor().getName()
                        + ", changed with " + pickedArmor.getName());

                 this.getPlayer().getCharacter().getInventory().setArmor(pickedArmor);

            }

        }
    }

}