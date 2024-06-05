import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private final MainPanel mainPanel;
    public View() {
        super("OOP Kujundid GUI");
        mainPanel = new MainPanel();
        JPanel container = new JPanel(new BorderLayout());
        container.add(mainPanel, BorderLayout.CENTER);
        add(container);
    }

    public void calculateButtonListener(ActionListener actionListener) {
        mainPanel.getBtnCalculate().addActionListener(actionListener);
    }

    public JTextField getSphereRadius() {
        return mainPanel.getSphereRadius();
    }

    public JTextField getCylinderRadius() {
        return mainPanel.getCylinderRadius();
    }

    public JTextField getCylinderHeight() {
        return mainPanel.getCylinderHeight();
    }

    public JTextArea getTxtArea() {
        return mainPanel.getTxtArea();
    }

    public JLabel getSphereRadiusError() {
        return mainPanel.getSphereRadiusError();
    }

    public JLabel getCylinderRadiusError() {
        return mainPanel.getCylinderRadiusError();
    }

    public JLabel getCylinderHeightError() {
        return mainPanel.getCylinderHeightError();
    }

    public JLabel getFileNameLabel() {
        return mainPanel.getFileNameLabel();
    }
}
