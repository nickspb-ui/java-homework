class Button {
    String name;
}

class PlayButton extends Button {

}

class Main {
    static void checkButton(Button button) {
        if (button instanceof PlayButton) {
            System.out.println("It's a play button");
        } else {
            System.out.println("It's a default button");
        }
    }

    public static void main(String[] args) {
        checkButton(new Button()); // работает для базового класса
        checkButton(new PlayButton()); // работает для его подкласса
    }
}