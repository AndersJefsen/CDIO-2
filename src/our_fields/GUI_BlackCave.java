package our_fields;
import spil.Konto;

import java.awt.*;

public class GUI_BlackCave extends GUI_Custom{

    public GUI_BlackCave(Color bgColor, Color fgColor, String title, String subText, String description) {
        super(bgColor, fgColor, title, subText, description);
    }

    @Override
    public Konto hit(Konto konto) {
        konto.update(-70);
        return konto;
    }
}
