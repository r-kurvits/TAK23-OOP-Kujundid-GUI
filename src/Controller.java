public class Controller {
    public Controller(Model model, View view) {
        view.calculateButtonListener(new CalculateListener(model, view));
    }
}
