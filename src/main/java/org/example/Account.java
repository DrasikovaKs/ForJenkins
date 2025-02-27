package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        boolean check = false;

        if (name.length() >= 3 && name.length() <= 19) {
            if (!name.startsWith(" ") || !name.endsWith(" ")) {
                int spaceCount = 0;
                int EXPECTED_COUNT = 1;
                for (char ch : name.toCharArray()) {
                    if (ch == ' ') {
                        spaceCount++;
                    }
                }
                if (spaceCount != EXPECTED_COUNT) {
                    System.out.println("Нельзя печатать");
                    return false;
                }
                check = true;
            }
        }
        if (check)
            System.out.println("Можно печатать");
        else
            System.out.println("Нельзя печатать");
        return check;
    }

}