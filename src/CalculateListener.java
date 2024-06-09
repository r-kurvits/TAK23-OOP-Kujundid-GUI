import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculateListener implements ActionListener {
    private final Model model;
    private final View view;

    public CalculateListener(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputSphereRadius = view.getSphereRadius().getText();
        String inputCylinderRadius = view.getCylinderRadius().getText();
        String inputCylinderHeight = view.getCylinderHeight().getText();

        if (!Model.isNumber(inputSphereRadius)) {
            view.getSphereRadiusError().setText("Sisesta arv!");
        } else {
            view.getSphereRadiusError().setText("");
        }
        if (!Model.isNumber(inputCylinderRadius)) {
            view.getCylinderRadiusError().setText("Sisesta arv!");
        } else {
            view.getCylinderRadiusError().setText("");
        }
        if (!Model.isNumber(inputCylinderHeight)) {
            view.getCylinderHeightError().setText("Sisesta arv!");
        } else {
            view.getCylinderHeightError().setText("");
        }

        view.getTxtArea().setText("");
        view.getTxtArea().append(model.getSphereUserInput(inputSphereRadius));
        view.getTxtArea().append(model.getCylinderUserInput(inputCylinderRadius, inputCylinderHeight));

        if (model.checkIfFileExists()) {
            view.getFileNameLabel().setText(FileHandler.getFilePath());
        }

    }
}
