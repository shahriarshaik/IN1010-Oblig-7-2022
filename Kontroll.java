public class Kontroll {
    public GUI gui;
    Model model;

    public Kontroll() {
        gui = new GUI();
        model = new Model(gui);
    }

    public void start() {
        model.spreEpler();
    }

}
