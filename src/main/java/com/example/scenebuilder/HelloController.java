package com.example.scenebuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.Arrays;

public class HelloController {
    public TextField textfield1;
    @FXML
    private Button start1111111;
    @FXML
    private VBox vbox1;

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    int counter = 0;

    String getRandomColor() {
        int randomWithMathRandom = (int) ((Math.random() * (1000000 - 100000)) + 100000);
        String randomColor = new String(String.valueOf(randomWithMathRandom));
        String bColor = "-fx-background-color: #" + randomColor + ";";
        return bColor;
    }

    String getRandomTextColor() {
        int randomWithMathRandom = (int) ((Math.random() * (300000 - 100000)) + 100000);
        String randomColor = new String(String.valueOf(randomWithMathRandom));
        String tColor = "-fx-text-fill: #" + randomColor + ";";
        return tColor;
    }

    String getRandomFontSize() {
        int randomWithMathRandom = (int) ((Math.random() * (70 - 10)) + 10);
        String randomFontSize = new String(String.valueOf(randomWithMathRandom));
        String fontSize = " -fx-font-size: " + randomFontSize + ";";
        return fontSize;
    }

    String getRandomHeight() {
        int randomWithMathRandom = (int) ((Math.random() * (400 - 40)) + 40);
        String randomHeight = new String(String.valueOf(randomWithMathRandom));
        String height = " -fx-pref-height: " + randomHeight + ";";
        return height;
    }

    String getRandomWidth() {
        int randomWithMathRandom = (int) ((Math.random() * (400 - 40)) + 40);
        String randomWidth = new String(String.valueOf(randomWithMathRandom));
        String width = " -fx-min-width: " + randomWidth + ";";
        return width;
    }

    char textReplacer() {
        int randomWithMathRandom = (int) ((Math.random() * ((alphabet.length - 1) - 0)) + 0);
        char randomLetter = alphabet[randomWithMathRandom];
        return randomLetter;
    }


int counterNumber() {
        return counter;

}



    @FXML
    void addColorToButtons(ActionEvent actionEvent) throws InterruptedException {
        counter++;

        for (int i = 0; i < vbox1.getChildren().size(); i++) {
            HBox hbox = (HBox) vbox1.getChildren().get(i);
            for (int j = 0; j < hbox.getChildren().size(); j++)
                if (i == 0 && j==0) {
                    continue;
                }
            else {
                    hbox.getChildren().get(j).setStyle(getRandomColor() + "-fx-text-fill: white;" + getRandomHeight() + getRandomWidth());
                    Button button = new Button();
                    button = (Button) hbox.getChildren().get(j);
                   String[] original = button.getText().split("");
                   String text = button.getText();
                    for (int k = 0; k < text.length(); k++) {
                       char[] chars = text.toCharArray();
                       chars[k] = textReplacer();
                       text = String.valueOf(chars);

                    }

                    button.setText(text);
                }


        }
        System.out.println(counterNumber());
        }





}

//for (int i = 1; i < vbox1.getChildren().size(); i++) {
//                vbox1.getChildren().get(i).setStyle(getRandomColor() + getRandomFontSize() + getRandomTextColor());
//            }