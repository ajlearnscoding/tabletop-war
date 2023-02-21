import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class MapEditor extends JPanel implements ActionListener {
    private int mapWidth;
    private int mapHeight;
    private ArrayList<ArrayList<JButton>> terrainButtons;
    private JTextField widthField;
    private JTextField heightField;

    public MapEditor() {
        // Set the layout manager for the panel
        setLayout(new BorderLayout());
        
        // Create panel for the terrain buttons
        JPanel terrainPanel = new JPanel(new GridLayout(10, 10));
        add(terrainPanel, BorderLayout.CENTER);

        // Create a label and text field for the map size parameters
        JLabel widthLabel = new JLabel("Width: ");
        widthField = new JTextField(5);
        JPanel widthPanel = new JPanel();
        widthPanel.add(widthLabel);
        widthPanel.add(widthField);
        add(widthPanel, BorderLayout.NORTH);

        JLabel heightLabel = new JLabel("Height: ");
        heightField = new JTextField(5);
        JPanel heightPanel = new JPanel();
        heightPanel.add(heightLabel);
        heightPanel.add(heightField);
        add(heightPanel, BorderLayout.SOUTH);

        // Create a button for saving the map
        JButton saveButton = new JButton("Save Map");
        saveButton.addActionListener(this);
        add(saveButton, BorderLayout.EAST);

        // Initialise the terrain buttons array
        terrainButtons = new ArrayList<>();

        // Add the terrain buttons to the terrain panel
        for (int i = 0; i < 10; i++) {
            terrainButtons.add(new ArrayList<JButton>());
            for (int j = 0; j < 10; j++) {
                JButton terrainButton = new JButton("Grass");
                terrainButton.addActionListener(this);
                terrainButtons.get(i).add(terrainButton);
                terrainPanel.add(terrainButton);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source instanceof JButton) {
            // If a terrain button was clicked, change its terrain type
            JButton terrainButton = (JButton) source;
            String currentTerrain = terrainButton.getText();
            if (currentTerrain.equals("Grass")) {
                terrainButton.setText("Water");
            } else {
                terrainButton.setText("Grass");
            }
        } else if (source instanceof JButton) {
            // If the save button was clicked, save the map to a file
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                saveMapToFile(file);
            }
        }
    }

    public void saveMapToFile(File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            // Write the map size to the file
            writer.println(mapWidth);
            writer.println(mapHeight);

            // Write the terrain types to the file
            for (int i = 0; i < mapHeight; i++) {
                for (int j = 0; j < mapWidth; j++) {
                    JButton terrainButton = terrainButtons.get(i).get(j);
                    String terrainType = terrainButton.getText();
                    writer.print(terrainType + " ");
                }
                writer.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
