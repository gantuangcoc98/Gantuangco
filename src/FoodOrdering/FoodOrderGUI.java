package FoodOrdering;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;

public class FoodOrderGUI extends JFrame {
    private JPanel pnlMain;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.pnlMain);
        app.setTitle("Simple Calculator");
        app.setSize(768, 768);
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
