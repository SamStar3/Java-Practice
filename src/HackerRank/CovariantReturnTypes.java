package HackerRank;

import java.util.*;
class Flower {
    String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    String whatsYourName() {
        return "Lotus";
    }
}

class State {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends State {
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Karnataka extends State {
    @Override
    Lotus yourNationalFlower() {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    @Override
    Lily yourNationalFlower() {
        return new Lily();
    }
}


public class CovariantReturnTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stateName = scanner.next();
        scanner.close();

        State state;
        if (stateName.equals("WestBengal")) {
            state = new WestBengal();
        } else if (stateName.equals("Karnataka")) {
            state = new Karnataka();
        } else if (stateName.equals("AndhraPradesh")) {
            state = new AndhraPradesh();
        } else {
            state = new State();
        }

        System.out.println(state.yourNationalFlower().whatsYourName());
    }
}
