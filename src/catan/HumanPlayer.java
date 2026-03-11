

package catan;

import java.util.Scanner;
public class HumanPlayer extends Player {
    Scanner scanner = new Scanner(System.in);

    public HumanPlayer(int playerID){
        super(playerID);

    }

    public void showResources(){
        System.out.println("YOUR RESOURCES ARE");
        for (String resource : resources.keySet()) {
            int amount = resources.get(resource);
            System.out.println(resource + ": " + amount);
        }
    }
    public int askForaction(){
        System.out.println("Choose action:");
        System.out.println("0 = Build Settlement");
        System.out.println("1 = Build Road");
        System.out.println("2 = Pass");


        int action = scanner.nextInt();
        return action;
    }
    public int askForLoc(){
        System.out.println("Choose a node (1-6): ");
        int nodeId = scanner.nextInt();
        return nodeId;
    }
}


