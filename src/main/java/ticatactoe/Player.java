package ticatactoe;

import java.util.Scanner;

public class Player {

    private String type;

    public Player(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

       public int[] parseInput(String positions) {
        String[] resultS = positions.split(",");
        return new int[]{Integer.parseInt(resultS[0]),
                Integer.parseInt(resultS[1])};
    }
}
