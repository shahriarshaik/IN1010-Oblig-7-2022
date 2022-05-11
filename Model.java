import javax.swing.*;
import java.util.ArrayList;

public class Model {
    GUI gui;
    randomtall rand = new randomtall(0, 11);

    public Model(GUI gui) {
        this.gui = gui;
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

}
