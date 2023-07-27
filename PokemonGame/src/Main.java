import model.*;
import model.Character;
import service.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameManagementService.showWelcomeMenu(input);
    }

}