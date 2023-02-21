import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    public GameWindow() {
        // Create a new menu bar and set it to the frame
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create a new menu and add it to the menu bar
        JMenu terrainMenu = new JMenu("Terrain");
        JMenuItem mapEditorItem = new JMenuItem("Map Editor");
        terrainMenu.add(mapEditorItem);
        menuBar.add(terrainMenu);

        // Create a new menu and add it to the menu bar
        JMenu armyMenu = new JMenu("Army");
        JMenuItem armyEditorItem = new JMenuItem("Army Editor");
        armyMenu.add(armyEditorItem);
        menuBar.add(armyMenu);

        // Create a new menu and add it to the menu bar
        JMenu gameMenu = new JMenu("Game");
        JMenuItem setupGameItem = new JMenuItem("Setup Game");
        JMenuItem startGameItem = new JMenuItem("Start Game");
        gameMenu.add(setupGameItem);
        gameMenu.add(startGameItem);
        menuBar.add(gameMenu);

        // Create a new tabbed pane and add it to the main window
        JTabbedPane tabbedPane = new JTabbedPane();
        add(tabbedPane, BorderLayout.CENTER);

        // Create a new panel for the map editor and add it to the tabbed pane
        MapEditor mapEditorPanel = new MapEditor();
        tabbedPane.addTab("Map Editor", mapEditorPanel);

        // Create a new panel for the army editor and add it to the tabbed pane
        JPanel armyEditorPanel = new JPanel();
        tabbedPane.addTab("Army Editor", armyEditorPanel);

        // Create a new panel for the game setup and add it to the tabbed pane
        JPanel setupGamePanel = new JPanel();
        tabbedPane.addTab("Setup Game", setupGamePanel);

        // Create a new panel for the start game option and add it to the tabbed pane
        JPanel startGamePanel = new JPanel();
        tabbedPane.addTab("Start Game", startGamePanel);


        // Set title of the main window
        setTitle("Tabletop War");

        // Set the icon for the main window
        Image icon = Toolkit.getDefaultToolkit().getImage("assets/icon.png");
        setIconImage(icon);

        // Set the size and visibility of the main window
        setSize(800, 600);
        setVisible(true);
    }
}
