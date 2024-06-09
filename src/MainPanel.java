import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {
    private JButton btnCalculate;
    private JTextField sphereRadius;
    private JTextField cylinderRadius;
    private JTextField cylinderHeight;
    private JTextArea txtArea;
    private JLabel sphereRadiusError;
    private JLabel cylinderRadiusError;
    private JLabel cylinderHeightError;
    private JLabel fileNameLabel;
    public MainPanel() {
        setPreferredSize(new Dimension(370, 380));
        setLayout(new BorderLayout());

        createComponents();
    }

    private void createComponents() {

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JLabel lblInfo = new JLabel("Kujundite arvutus");
        topPanel.add(lblInfo);

        btnCalculate = new JButton("Arvuta");
        topPanel.add(btnCalculate);

        JPanel centerPanel = new JPanel(new SpringLayout());
        JLabel sphereRadiusLabel = new JLabel("Kera raadius:");

        sphereRadius = new JTextField(10);
        sphereRadiusError = new JLabel("");
        sphereRadiusError.setForeground(Color.RED);
        centerPanel.add(sphereRadiusLabel);
        centerPanel.add(sphereRadius);
        centerPanel.add(sphereRadiusError);

        SpringLayout layout = (SpringLayout) centerPanel.getLayout();
        layout.putConstraint(SpringLayout.WEST, sphereRadiusLabel, 10, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, sphereRadiusLabel, 10, SpringLayout.NORTH, centerPanel);
        layout.putConstraint(SpringLayout.WEST, sphereRadius, 20, SpringLayout.EAST, sphereRadiusLabel);
        layout.putConstraint(SpringLayout.NORTH, sphereRadius, 10, SpringLayout.NORTH, centerPanel);
        layout.putConstraint(SpringLayout.WEST, sphereRadiusError, 230, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, sphereRadiusError, 10, SpringLayout.NORTH, centerPanel);

        JLabel cylinderRadiusLabel = new JLabel("Silindri raadius:");
        cylinderRadius = new JTextField(10);
        cylinderRadiusError = new JLabel("");
        cylinderRadiusError.setForeground(Color.RED);
        centerPanel.add(cylinderRadiusLabel);
        centerPanel.add(cylinderRadius);
        centerPanel.add(cylinderRadiusError);

        layout.putConstraint(SpringLayout.WEST, cylinderRadiusLabel, 10, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, cylinderRadiusLabel, 40, SpringLayout.NORTH, centerPanel);
        layout.putConstraint(SpringLayout.WEST, cylinderRadius, 20, SpringLayout.EAST, sphereRadiusLabel);
        layout.putConstraint(SpringLayout.NORTH, cylinderRadius, 40, SpringLayout.NORTH, centerPanel);
        layout.putConstraint(SpringLayout.WEST, cylinderRadiusError, 230, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, cylinderRadiusError, 40, SpringLayout.NORTH, centerPanel);

        JLabel cylinderHeightLabel = new JLabel("Silindri kõrgus:");
        cylinderHeight = new JTextField(10);
        cylinderHeightError = new JLabel("");
        cylinderHeightError.setForeground(Color.RED);
        centerPanel.add(cylinderHeightLabel);
        centerPanel.add(cylinderHeight);
        centerPanel.add(cylinderHeightError);

        layout.putConstraint(SpringLayout.WEST, cylinderHeightLabel, 10, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, cylinderHeightLabel, 70, SpringLayout.NORTH, centerPanel);
        layout.putConstraint(SpringLayout.WEST, cylinderHeight, 20, SpringLayout.EAST, sphereRadiusLabel);
        layout.putConstraint(SpringLayout.NORTH, cylinderHeight, 70, SpringLayout.NORTH, centerPanel);
        layout.putConstraint(SpringLayout.WEST, cylinderHeightError, 230, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, cylinderHeightError, 70, SpringLayout.NORTH, centerPanel);

        fileNameLabel = new JLabel("Faili asukoht");
        centerPanel.add(fileNameLabel);

        layout.putConstraint(SpringLayout.WEST, fileNameLabel, 10, SpringLayout.WEST, centerPanel);
        layout.putConstraint(SpringLayout.NORTH, fileNameLabel, 100, SpringLayout.NORTH, centerPanel);


        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        txtArea = new JTextArea(10, 15);
        txtArea.setFont(new Font("Courier", Font.PLAIN, 14));
        bottomPanel.add(new JScrollPane(txtArea));


        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public JButton getBtnCalculate() {
        return btnCalculate;
    }

    public JTextField getSphereRadius() {
        return sphereRadius;
    }

    public JTextField getCylinderRadius() {
        return cylinderRadius;
    }

    public JTextField getCylinderHeight() {
        return cylinderHeight;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public JLabel getSphereRadiusError() {
        return sphereRadiusError;
    }

    public JLabel getCylinderRadiusError() {
        return cylinderRadiusError;
    }

    public JLabel getCylinderHeightError() {
        return cylinderHeightError;
    }

    public JLabel getFileNameLabel() {
        return fileNameLabel;
    }
}
