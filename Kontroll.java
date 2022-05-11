import java.util.ArrayList;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Kontroll {
    public GUI gui;
    Model model;
    int haleLengde;
    ArrayList<JLabel> slangen;
    int[] hale;

    public Kontroll() {
        gui = new GUI();
        model = new Model(gui);
        haleLengde = gui.slangen.size();
        slangen = gui.slangen;
    }

    public void start() {
        model.spreEpler();
        hale = model.hentHaleKord(gui.slangen.get(gui.slangen.size() - 1));
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();
        model.bevegelse();

        /*
         * for (int i = 0; i < 5; i++) {
         * try {
         * TimeUnit.SECONDS.sleep(1);
         * model.bevegelse();
         * } catch (Exception e) {
         * // TODO: handle exception
         * }
         * }
         */
    }

}
