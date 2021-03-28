package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class Controller {
    public TextField fldUnos;
    public Label labellRez;

    public void prepravi(ActionEvent actionEvent) {
        String pom = fldUnos.getText() ,maksRijec = "";
        System.out.println(pom);
        for(String rijec : pom.split(" ")){
            if(rijec.length() > maksRijec.length()) maksRijec = rijec;
            System.out.println(maksRijec);
        }
        maksRijec = maksRijec.toUpperCase(Locale.ROOT);
        System.out.println(maksRijec);
        labellRez.setText(maksRijec);

    }
}
