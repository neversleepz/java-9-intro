package java9intro;

import melbjvm.util.Util;

public class Java9Talk {
    public Java9Talk() {
        showWelcomePage();
    }

    private void showWelcomePage() {
        Util.displayGraphic("welcome.txt");
        Util.displayGraphic("melbjvm.txt");
    }

}
