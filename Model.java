import javax.swing.*;
import java.util.ArrayList;

public class Model {
    GUI gui;
    randomtall rand = new randomtall(0, 11);
    ArrayList<JLabel> slangen;
    int rettning;

    public Model(GUI gui) {
        this.gui = gui;
        slangen = gui.slangen;
        rettning = gui.rettning;
    }

    public void spreEpler() {
        for (int eple = 0; eple < 10; eple++) {
            int x = rand.tall();
            int y = rand.tall();
            while (gui.erEpleEllerslange(y, x)) {
                x = rand.tall();
                y = rand.tall();
            }
            gui.leggTilEple(y, x);
        }
    }

    public void bevegelse() {
        if (rettning == 8) { // retning opp

        } else if (rettning == 2) { // retning ned

        } else if (rettning == 6) { // retning høyre

        } else if (rettning == 4) { // retning venstre

        }
    }

}
