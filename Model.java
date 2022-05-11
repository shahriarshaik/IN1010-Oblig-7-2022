import javax.swing.*;
import java.util.ArrayList;

public class Model {
    GUI gui;
    randomtall rand = new randomtall(0, 11);
    ArrayList<JLabel> slangen;
    int rettning;
    int hodeY = 6;
    int hodeX = 6;

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
            gui.leggTilSlange(hodeY, hodeX - 1);
            int kord[] = hentHaleKord(gui.slangen.get(gui.slangen.size() - 1));
            gui.fjernSlange(kord[0], kord[1]);
        }
    }

    public int[] hentHaleKord(JLabel hale) { // tror denne funker
        int[] kord = new int[2];
        for (int y = 0; y < 12; y++) {
            for (int x = 0; x < 12; x++) {
                if (hale == gui.bokser[y][x]) {
                    kord[0] = y;
                    kord[1] = x;
                }
            }
        }
        return kord;
    }

}
