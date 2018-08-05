package ticatactoe;

public class LogicService {
    public String check(String[][] t) {

        for (int i = 0; i < t.length; i++) {
            if (!t[i][0].equalsIgnoreCase("")
                    && t[i][0].equalsIgnoreCase(t[i][1])
                    && t[i][0].equalsIgnoreCase(t[i][2])
                    ) {
                return t[i][0];
            }

            if (!t[0][i].equalsIgnoreCase("")
                    && t[0][i].equalsIgnoreCase(t[1][i])
                    && t[0][i].equalsIgnoreCase(t[2][i])
                    ) {
                return t[0][i];
            }
        }

        if (!t[1][1].equalsIgnoreCase("")
                && t[1][1].equalsIgnoreCase(t[0][0])
                && t[1][1].equalsIgnoreCase(t[2][2])
                ) {
            return t[1][1];
        }
        if (!t[0][2].equalsIgnoreCase("")
                && t[0][2].equalsIgnoreCase(t[1][1])
                && t[0][2].equalsIgnoreCase(t[2][0])
                ) {
            return t[1][1];
        }


        return null;
    }
}
