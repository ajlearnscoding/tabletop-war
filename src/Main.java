import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create new GameWindow object
        GameWindow gameWindow = new GameWindow();

        // Set the behaviour of the window when the user closes it
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Centre the window on the screen
        gameWindow.setLocationRelativeTo(null);

    }
}
