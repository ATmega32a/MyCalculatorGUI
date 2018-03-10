package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller{

    @FXML
    TextField fText;
    @FXML
    Button btn0;
    @FXML
    Button btn1;
    @FXML
    Button btn2;
    @FXML
    Button btn3;
    @FXML
    Button btn4;
    @FXML
    Button btn5;
    @FXML
    Button btn6;
    @FXML
    Button btn7;
    @FXML
    Button btn8;
    @FXML
    Button btn9;
    @FXML
    Button btnPlus;
    @FXML
    Button btnMinus;
    @FXML
    Button btnMul;
    @FXML
    Button btnDiv;
    @FXML
    Button btnEqual;
    @FXML
    Button btnPoint;
    @FXML
    Button btnClear;
    @FXML
    Button btnBackSpace;
    @FXML
    Button btnPercent;
    @FXML
    Label tLabel;

  private String prevStr;
  private int flagOp=0;
  private double numFirst;
  private double numSecond;
  private double result;



    public void onClickZero(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "0");
            tLabel.setText("");
    }

    public void onClickOne(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr+"1");
            tLabel.setText("");
    }

    public void onClickTwo(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "2");
            tLabel.setText("");

    }

    public void onClickThree(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "3");
            tLabel.setText("");

    }

    public void onClickFour(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "4");
            tLabel.setText("");
    }

    public void onClickFive(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "5");
            tLabel.setText("");
    }

    public void onClickSix(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "6");
            tLabel.setText("");

    }

     public void onClickSeven(ActionEvent actionEvent) {
             prevStr = fText.getText();
             fText.setText(prevStr + "7");
             tLabel.setText("");
    }

    public void onClickEight(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "8");
            tLabel.setText("");

    }

    public void onClickNine(ActionEvent actionEvent) {
            prevStr = fText.getText();
            fText.setText(prevStr + "9");
            tLabel.setText("");

    }

    public void onClickPlus(ActionEvent actionEvent) {
        try {
            numFirst=converter(fText.getText());
            fText.setText("");
            tLabel.setText("");
            flagOp=1;
        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
        }

    }

    public void onClickMinus(ActionEvent actionEvent) {
        try {
            numFirst=converter(fText.getText());
            fText.setText("");
            tLabel.setText("");
            flagOp=2;

        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
        }
    }
   public void onClickMul(ActionEvent actionEvent) {
        try {
            numFirst=converter(fText.getText());
            fText.setText("");
            tLabel.setText("");
            flagOp=3;

        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
        }

    }

    public void onClickDiv(ActionEvent actionEvent) {
        try {
            numFirst=converter(fText.getText());
            fText.setText("");
            tLabel.setText("");
            flagOp=4;

        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
        }

    }

    public void onClickEqual(ActionEvent actionEvent) {
        try {
            numSecond=converter(fText.getText());
            selectorOperation();
            fText.setText(Double.toString(result));
            prevStr="";
            flagOp=0;
        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
         }
    }

    public void onClickSign(ActionEvent actionEvent) {
        double buffer;
        try {
            buffer=Double.parseDouble(fText.getText());
            fText.setText(Double.toString(-buffer));
            tLabel.setText("");
        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
        }

    }

    public void onClickPoint(ActionEvent actionEvent) {
        String buffer;
        try {
            buffer=fText.getText()+".";
            fText.setText(buffer);
            tLabel.setText("");
        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");
        }

    }

    public void onClickClear(ActionEvent actionEvent) {
        numFirst=0;
        numSecond=0;
        fText.setText("");
        tLabel.setText("");
    }

    public void onClickBackSpace(ActionEvent actionEvent) {
        String buffer;
        try {
              buffer="";
              buffer=fText.getText().substring(0,fText.getLength()-1);
              fText.setText(buffer);
              tLabel.setText("");
        }
        catch (StringIndexOutOfBoundsException exception){
             fText.setText("");
             tLabel.setText("всё, хватит уже удалять!");

        }

    }

    public void onClickPercent(ActionEvent actionEvent) {
        double onePercent;
        try {
        onePercent=numFirst/100;
        numSecond=converter(fText.getText());
        numSecond=numSecond*onePercent;
        selectorOperation();
        fText.setText(Double.toString(result));
        tLabel.setText("");
        prevStr="";
        }
        catch (NumberFormatException exception){
            fText.setText("");
            tLabel.setText("вы ввели недопустимые символы!");

        }

    }
    private void killOldText(){
            numFirst=numSecond=0;
            fText.setText("");
            tLabel.setText("");

    }
    private double converter(String strNum){
           return Double.parseDouble(strNum);
    }
    private void selectorOperation(){
       switch (flagOp){
           case 1: result=numFirst+numSecond;
                break;
           case 2: result=numFirst-numSecond;
               break;
           case 3: result=numFirst*numSecond;
               break;
           case 4: result=numFirst/numSecond;
               break;
       }

    }


}

