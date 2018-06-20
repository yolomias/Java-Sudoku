package com.company;

import com.sun.javafx.iio.common.ImageLoaderImpl;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;

public class Sudoku_GUI
{
    private JPanel tolle_sudoku_GUI;
    private JPanel fensterleiste;
    private JTextField textField1;
    private JButton loeseSudokuButton;
    private JButton sudokuResetButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JButton anleitungAusgabeButton;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel label2;
    private JLabel label1;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JLabel label3;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JTextField textField34;
    private JTextField textField35;
    private JTextField textField36;
    private JTextField textField37;
    private JTextField textField38;
    private JTextField textField39;
    private JTextField textField40;
    private JTextField textField41;
    private JTextField textField42;
    private JTextField textField43;
    private JTextField textField44;
    private JTextField textField45;
    private JTextField textField46;
    private JTextField textField47;
    private JTextField textField48;
    private JTextField textField49;
    private JTextField textField50;
    private JTextField textField51;
    private JTextField textField52;
    private JTextField textField53;
    private JTextField textField54;
    private JTextField textField55;
    private JTextField textField56;
    private JTextField textField57;
    private JTextField textField58;
    private JTextField textField59;
    private JTextField textField60;
    private JTextField textField61;
    private JTextField textField62;
    private JTextField textField63;
    private JTextField textField64;
    private JTextField textField65;
    private JTextField textField66;
    private JTextField textField67;
    private JTextField textField68;
    private JTextField textField69;
    private JTextField textField70;
    private JTextField textField71;
    private JTextField textField72;
    private JTextField textField73;
    private JTextField textField74;
    private JTextField textField75;
    private JTextField textField76;
    private JTextField textField77;
    private JTextField textField78;
    private JTextField textField79;
    private JTextField textField80;
    private JTextField textField81;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton gelberButton;
    private JButton gruenerButton;
    private JButton roterButton;
    private JPanel menuleiste;
    private JLabel windowIcon;
    private JRadioButton appleButton;
    private JPanel seitenLeiste;
    private JLabel label7;
    private JLabel appleIcon;
    private JRadioButton windowButton;
    private JRadioButton otherButton;
    private JButton infoButton;
    private JButton gruen2Button;
    private JButton gelb2Button;
    private JButton rot2Button;
    private JButton sudokuSpielenButton;
    private String[][] sudokuWerte;
    private int[][] zahlen;
    private boolean[] loeser;
    private boolean pruefer = true;
    private int xx = 0;
    private int yy = 0;
    private String select = "apple";
    private byte spiel = 0;
    private static JFrame frame = new JFrame("Sudoku ergibt keinen Sinn");


    //Startet das Fenster und macht es sichtbar
    public static void main(String[] args)
    {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        frame.setContentPane(new Sudoku_GUI().tolle_sudoku_GUI);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }

    //Lese die Werte der 81 Textfelder in das String Array
    private void SudokuEinlesen() {
        sudokuWerte = new String[9][9];
        sudokuWerte[0][0] = textField1.getText();
        sudokuWerte[0][1] = textField2.getText();
        sudokuWerte[0][2] = textField3.getText();
        sudokuWerte[0][3] = textField4.getText();
        sudokuWerte[0][4] = textField5.getText();
        sudokuWerte[0][5] = textField6.getText();
        sudokuWerte[0][6] = textField7.getText();
        sudokuWerte[0][7] = textField8.getText();
        sudokuWerte[0][8] = textField9.getText();
        sudokuWerte[1][0] = textField10.getText();
        sudokuWerte[1][1] = textField11.getText();
        sudokuWerte[1][2] = textField12.getText();
        sudokuWerte[1][3] = textField13.getText();
        sudokuWerte[1][4] = textField14.getText();
        sudokuWerte[1][5] = textField15.getText();
        sudokuWerte[1][6] = textField16.getText();
        sudokuWerte[1][7] = textField17.getText();
        sudokuWerte[1][8] = textField18.getText();
        sudokuWerte[2][0] = textField19.getText();
        sudokuWerte[2][1] = textField20.getText();
        sudokuWerte[2][2] = textField21.getText();
        sudokuWerte[2][3] = textField22.getText();
        sudokuWerte[2][4] = textField23.getText();
        sudokuWerte[2][5] = textField24.getText();
        sudokuWerte[2][6] = textField25.getText();
        sudokuWerte[2][7] = textField26.getText();
        sudokuWerte[2][8] = textField27.getText();
        sudokuWerte[3][0] = textField28.getText();
        sudokuWerte[3][1] = textField29.getText();
        sudokuWerte[3][2] = textField30.getText();
        sudokuWerte[3][3] = textField31.getText();
        sudokuWerte[3][4] = textField32.getText();
        sudokuWerte[3][5] = textField33.getText();
        sudokuWerte[3][6] = textField34.getText();
        sudokuWerte[3][7] = textField35.getText();
        sudokuWerte[3][8] = textField36.getText();
        sudokuWerte[4][0] = textField37.getText();
        sudokuWerte[4][1] = textField38.getText();
        sudokuWerte[4][2] = textField39.getText();
        sudokuWerte[4][3] = textField40.getText();
        sudokuWerte[4][4] = textField41.getText();
        sudokuWerte[4][5] = textField42.getText();
        sudokuWerte[4][6] = textField43.getText();
        sudokuWerte[4][7] = textField44.getText();
        sudokuWerte[4][8] = textField45.getText();
        sudokuWerte[5][0] = textField46.getText();
        sudokuWerte[5][1] = textField47.getText();
        sudokuWerte[5][2] = textField48.getText();
        sudokuWerte[5][3] = textField49.getText();
        sudokuWerte[5][4] = textField50.getText();
        sudokuWerte[5][5] = textField51.getText();
        sudokuWerte[5][6] = textField52.getText();
        sudokuWerte[5][7] = textField53.getText();
        sudokuWerte[5][8] = textField54.getText();
        sudokuWerte[6][0] = textField55.getText();
        sudokuWerte[6][1] = textField56.getText();
        sudokuWerte[6][2] = textField57.getText();
        sudokuWerte[6][3] = textField58.getText();
        sudokuWerte[6][4] = textField59.getText();
        sudokuWerte[6][5] = textField60.getText();
        sudokuWerte[6][6] = textField61.getText();
        sudokuWerte[6][7] = textField62.getText();
        sudokuWerte[6][8] = textField63.getText();
        sudokuWerte[7][0] = textField64.getText();
        sudokuWerte[7][1] = textField65.getText();
        sudokuWerte[7][2] = textField66.getText();
        sudokuWerte[7][3] = textField67.getText();
        sudokuWerte[7][4] = textField68.getText();
        sudokuWerte[7][5] = textField69.getText();
        sudokuWerte[7][6] = textField70.getText();
        sudokuWerte[7][7] = textField71.getText();
        sudokuWerte[7][8] = textField72.getText();
        sudokuWerte[8][0] = textField73.getText();
        sudokuWerte[8][1] = textField74.getText();
        sudokuWerte[8][2] = textField75.getText();
        sudokuWerte[8][3] = textField76.getText();
        sudokuWerte[8][4] = textField77.getText();
        sudokuWerte[8][5] = textField78.getText();
        sudokuWerte[8][6] = textField79.getText();
        sudokuWerte[8][7] = textField80.getText();
        sudokuWerte[8][8] = textField81.getText();
    }

    //Überprüfe ob ein Feld leer ist oder es 0 enthält, wenn ja wird der Vorgang abgebrochen
    private void ueberpruefeSudoku() {
        pruefer = true;

        for (byte b = 0; b <= 8; b++) {
            for (byte c = 0; c <= 8; c++) {
                if (sudokuWerte[c][b].equals("")) {
                    JOptionPane.showMessageDialog(null, "Sie haben die Felder nicht vollständig" +
                            " ausgefüllt! Vervollständigen Sie diese zuerst!!!");
                    b = 8;
                    c = 8;
                    pruefer = false;
                } else if (sudokuWerte[c][b].contains("0")) {
                    JOptionPane.showMessageDialog(null, "Sie haben eine 0 eingegeben, dass" +
                            " ist nicht zulässig!!!!1");
                    b = 8;
                    c = 8;
                    pruefer = false;
                } /*else if (!sudokuWerte[c][b].equals("1") || !sudokuWerte[c][b].equals("2") || !sudokuWerte[c][b].equals("3")
                        || !sudokuWerte[c][b].equals("4") || !sudokuWerte[c][b].equals("5") || !sudokuWerte[c][b].equals("6")
                        || !sudokuWerte[c][b].equals("7") || !sudokuWerte[c][b].equals("8") || !sudokuWerte[c][b].equals("9"))
                {
                    JOptionPane.showMessageDialog(null, "Sie haben etwas anderes als eine Zahl eingetippt" +
                            " oder die Zahl ist größer als 9 , dass ist nicht zulässig!");
                    b = 8;
                    c = 8 ;
                    pruefer = false;
                    sudokuWerte[c][b] = "1";
                } */
            }
        }
    }

    //konvertiert das String Array in Ganzzahlen
    private void konvertiereZahlen ()
    {
        zahlen = new int[9][9];

        for (byte b = 0; b <= 8; b++)
        {
            for (byte c = 0; c <= 8; c++)
            {
                sudokuWerte[c][b] = sudokuWerte[c][b].substring(0, 1);
                zahlen[c][b] = Integer.parseInt(sudokuWerte[c][b]);
                //System.out.println(sudokuWerte[c][b]);
            }
        }
    }

    //Überprüfe die Zeilensummen
    private void pruefeZeilensummen()
    {
        loeser = new boolean[3];
        int zeilensumme;
        int zeileRichtig = 0;
        String alleZahlen = "";

        for (byte b = 0; b <= 8; b++)
        {
            zeilensumme = 0;

            for (byte c = 0; c <= 8; c++)
            {
                zeilensumme =  zeilensumme + zahlen[c][b];
                alleZahlen = alleZahlen + zahlen[c][b];
                if(c == 8 && zeilensumme == 45 && alleZahlen.contains("1") && alleZahlen.contains("2") && alleZahlen.contains("3")
                        && alleZahlen.contains("4") && alleZahlen.contains("5") && alleZahlen.contains("6")
                        && alleZahlen.contains("7") && alleZahlen.contains("8") && alleZahlen.contains("9")) zeileRichtig += 1;
            }
        }
        if (zeileRichtig == 9)
        {
            loeser[0] = true;
            System.out.println("Zeilen richtig!");
        }
        else System.out.println("Zeilen sind nicht korrekt.");
    }

    //Überprüfe die Spaltensummen
    private void pruefeSpaltensummen()
    {
        int spaltensumme;
        int spalteRichtig = 0;
        String alleZahlen = "";

        for (byte b = 0; b <= 8; b++)
        {
            spaltensumme = 0;

            for (byte c = 0; c <= 8; c++)
            {
                spaltensumme = spaltensumme + zahlen[b][c];
                alleZahlen = alleZahlen + zahlen[b][c];
                if(c == 8 && spaltensumme == 45 && alleZahlen.contains("1") && alleZahlen.contains("2") && alleZahlen.contains("3")
                        && alleZahlen.contains("4") && alleZahlen.contains("5") && alleZahlen.contains("6")
                        && alleZahlen.contains("7") && alleZahlen.contains("8") && alleZahlen.contains("9")) spalteRichtig += 1;
            }
        }
        if (spalteRichtig == 9)
        {
            loeser[1] = true;
            System.out.println("Spalten Richtig!");
        }
        else System.out.println("Spalten sind nicht korrekt.");
    }

    //Übprüfe die einzelnen 9er Blöcke
    private void pruefeBloecke()
    {
        int blocksumme;
        int blockRichtig = 0;
        byte zahl1 = 0;
        byte zahl2 = 2;
        byte zahl3 = 0;
        byte zahl4 = 2;
        String alleZahlen = "";

        while (zahl1 < 9)
        {
            blocksumme = 0;

            for (byte b = zahl1; b <= zahl2; b++)
            {
                for (byte c = zahl3; c <= zahl4; c++)
                {
                    blocksumme = blocksumme + zahlen[c][b];
                    alleZahlen = alleZahlen + zahlen[c][b];
                }
            }
            if (blocksumme == 45 && alleZahlen.contains("1") && alleZahlen.contains("2") && alleZahlen.contains("3")
                    && alleZahlen.contains("4") && alleZahlen.contains("5") && alleZahlen.contains("6")
                    && alleZahlen.contains("7") && alleZahlen.contains("8") && alleZahlen.contains("9")) blockRichtig += 1;
            else
            {
                System.out.println("Block nicht richtig!");
                break; //Das ist kein Clean Code aber wenn falsch dann soll die Funktion eben abgebrochen werden!!!1
            }
            zahl3 += 3;
            zahl4 += 3;
            if (zahl3 == 9 && zahl4 == 11)
            {
                zahl1 += 3;
                zahl2 += 3;
                zahl3 = 0;
                zahl4 = 2;
            }
        }

        if (blockRichtig == 9)
        {
            System.out.println("Alle Blöcke richtig");
            loeser[2] = true;
        } else System.out.println("Irgendein Block war falsch!");

    }

    //Löscht alle Eingaben aus den Textfeldern und setzt diese zurück
    private void resetEingaben ()
    {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField7.setText("");
        textField8.setText("");
        textField9.setText("");
        textField10.setText("");
        textField11.setText("");
        textField12.setText("");
        textField13.setText("");
        textField14.setText("");
        textField15.setText("");
        textField16.setText("");
        textField17.setText("");
        textField18.setText("");
        textField19.setText("");
        textField20.setText("");
        textField21.setText("");
        textField22.setText("");
        textField23.setText("");
        textField24.setText("");
        textField25.setText("");
        textField26.setText("");
        textField27.setText("");
        textField28.setText("");
        textField29.setText("");
        textField30.setText("");
        textField31.setText("");
        textField32.setText("");
        textField33.setText("");
        textField34.setText("");
        textField35.setText("");
        textField36.setText("");
        textField37.setText("");
        textField38.setText("");
        textField39.setText("");
        textField40.setText("");
        textField41.setText("");
        textField42.setText("");
        textField43.setText("");
        textField44.setText("");
        textField45.setText("");
        textField46.setText("");
        textField47.setText("");
        textField48.setText("");
        textField49.setText("");
        textField50.setText("");
        textField51.setText("");
        textField52.setText("");
        textField53.setText("");
        textField54.setText("");
        textField55.setText("");
        textField56.setText("");
        textField57.setText("");
        textField58.setText("");
        textField59.setText("");
        textField60.setText("");
        textField61.setText("");
        textField62.setText("");
        textField63.setText("");
        textField64.setText("");
        textField65.setText("");
        textField66.setText("");
        textField67.setText("");
        textField68.setText("");
        textField69.setText("");
        textField70.setText("");
        textField71.setText("");
        textField72.setText("");
        textField73.setText("");
        textField74.setText("");
        textField75.setText("");
        textField76.setText("");
        textField77.setText("");
        textField78.setText("");
        textField79.setText("");
        textField80.setText("");
        textField81. setText("");
        textField1.setEditable(true);
        textField2.setEditable(true);
        textField3.setEditable(true);
        textField4.setEditable(true);
        textField5.setEditable(true);
        textField6.setEditable(true);
        textField7.setEditable(true);
        textField8.setEditable(true);
        textField9.setEditable(true);
        textField10.setEditable(true);
        textField11.setEditable(true);
        textField12.setEditable(true);
        textField13.setEditable(true);
        textField14.setEditable(true);
        textField15.setEditable(true);
        textField16.setEditable(true);
        textField17.setEditable(true);
        textField18.setEditable(true);
        textField19.setEditable(true);
        textField20.setEditable(true);
        textField21.setEditable(true);
        textField22.setEditable(true);
        textField23.setEditable(true);
        textField24.setEditable(true);
        textField25.setEditable(true);
        textField26.setEditable(true);
        textField27.setEditable(true);
        textField28.setEditable(true);
        textField29.setEditable(true);
        textField30.setEditable(true);
        textField31.setEditable(true);
        textField32.setEditable(true);
        textField33.setEditable(true);
        textField34.setEditable(true);
        textField35.setEditable(true);
        textField36.setEditable(true);
        textField37.setEditable(true);
        textField38.setEditable(true);
        textField39.setEditable(true);
        textField40.setEditable(true);
        textField41.setEditable(true);
        textField42.setEditable(true);
        textField43.setEditable(true);
        textField44.setEditable(true);
        textField45.setEditable(true);
        textField46.setEditable(true);
        textField47.setEditable(true);
        textField48.setEditable(true);
        textField49.setEditable(true);
        textField50.setEditable(true);
        textField51.setEditable(true);
        textField52.setEditable(true);
        textField53.setEditable(true);
        textField54.setEditable(true);
        textField55.setEditable(true);
        textField56.setEditable(true);
        textField57.setEditable(true);
        textField58.setEditable(true);
        textField59.setEditable(true);
        textField60.setEditable(true);
        textField61.setEditable(true);
        textField62.setEditable(true);
        textField63.setEditable(true);
        textField64.setEditable(true);
        textField65.setEditable(true);
        textField66.setEditable(true);
        textField67.setEditable(true);
        textField68.setEditable(true);
        textField69.setEditable(true);
        textField70.setEditable(true);
        textField71.setEditable(true);
        textField72.setEditable(true);
        textField73.setEditable(true);
        textField74.setEditable(true);
        textField75.setEditable(true);
        textField76.setEditable(true);
        textField77.setEditable(true);
        textField78.setEditable(true);
        textField79.setEditable(true);
        textField80.setEditable(true);
        textField81.setEditable(true);
    }

    //Selektiert das zuletzt verwendete Design
    private void selektor ()
    {
        if (select.equals("apple")) appleButton.setSelected(true);
        else if (select.equals("window")) windowButton.setSelected(true);
        else if (select.equals("other")) otherButton.setSelected(true);
    }

    private void spieleSudoku ()
    {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog (null, "Wollen Sie ein neues Spiel beginnen?","Achtung!",dialogButton);
        if ((dialogResult == JOptionPane.YES_OPTION)) {
            resetEingaben();
            if (spiel > 2) spiel = 0;
            switch (spiel) {
                case 0:
                    textField1.setText("5");
                    textField1.setEditable(false);
                    textField2.setText("3");
                    textField2.setEditable(false);
                    textField5.setText("7");
                    textField5.setEditable(false);
                    textField10.setText("6");
                    textField10.setEditable(false);
                    textField13.setText("1");
                    textField13.setEditable(false);
                    textField14.setText("9");
                    textField14.setEditable(false);
                    textField15.setText("5");
                    textField15.setEditable(false);
                    textField20.setText("9");
                    textField20.setEditable(false);
                    textField21.setText("8");
                    textField21.setEditable(false);
                    textField26.setText("6");
                    textField26.setEditable(false);
                    textField28.setText("8");
                    textField28.setEditable(false);
                    textField32.setText("6");
                    textField32.setEditable(false);
                    textField36.setText("3");
                    textField36.setEditable(false);
                    textField37.setText("4");
                    textField37.setEditable(false);
                    textField40.setText("8");
                    textField40.setEditable(false);
                    textField42.setText("3");
                    textField42.setEditable(false);
                    textField45.setText("1");
                    textField45.setEditable(false);
                    textField46.setText("7");
                    textField46.setEditable(false);
                    textField50.setText("2");
                    textField50.setEditable(false);
                    textField54.setText("6");
                    textField54.setEditable(false);
                    textField56.setText("6");
                    textField56.setEditable(false);
                    textField61.setText("2");
                    textField61.setEditable(false);
                    textField62.setText("8");
                    textField62.setEditable(false);
                    textField67.setText("4");
                    textField67.setEditable(false);
                    textField68.setText("1");
                    textField68.setEditable(false);
                    textField69.setText("9");
                    textField69.setEditable(false);
                    textField72.setText("5");
                    textField72.setEditable(false);
                    textField77.setText("8");
                    textField77.setEditable(false);
                    textField80.setText("7");
                    textField80.setEditable(false);
                    textField81.setText("9");
                    textField81.setEditable(false);
                    spiel += 1;
                    break;

                case 1:
                    textField3.setText("8");
                    textField3.setEditable(false);
                    textField4.setText("5");
                    textField4.setEditable(false);
                    textField6.setText("2");
                    textField6.setEditable(false);
                    textField8.setText("4");
                    textField8.setEditable(false);
                    textField9.setText("1");
                    textField9.setEditable(false);
                    textField12.setText("3");
                    textField12.setEditable(false);
                    textField17.setText("2");
                    textField17.setEditable(false);
                    textField18.setText("5");
                    textField18.setEditable(false);
                    textField22.setText("1");
                    textField22.setEditable(false);
                    textField24.setText("4");
                    textField24.setEditable(false);
                    textField25.setText("8");
                    textField25.setEditable(false);
                    textField26.setText("9");
                    textField26.setEditable(false);
                    textField28.setText("1");
                    textField28.setEditable(false);
                    textField29.setText("9");
                    textField29.setEditable(false);
                    textField31.setText("2");
                    textField31.setEditable(false);
                    textField34.setText("4");
                    textField34.setEditable(false);
                    textField35.setText("8");
                    textField35.setEditable(false);
                    textField37.setText("5");
                    textField37.setEditable(false);
                    textField42.setText("6");
                    textField42.setEditable(false);
                    textField43.setText("1");
                    textField43.setEditable(false);
                    textField44.setText("7");
                    textField44.setEditable(false);
                    textField46.setText("6");
                    textField47.setEditable(false);
                    textField47.setText("8");
                    textField47.setEditable(false);
                    textField49.setText("9");
                    textField49.setEditable(false);
                    textField50.setText("7");
                    textField50.setEditable(false);
                    textField59.setText("8");
                    textField59.setEditable(false);
                    textField60.setText("9");
                    textField60.setEditable(false);
                    textField61.setText("2");
                    textField61.setEditable(false);
                    textField63.setText("7");
                    textField63.setEditable(false);
                    textField64.setText("7");
                    textField64.setEditable(false);
                    textField65.setText("4");
                    textField65.setEditable(false);
                    textField68.setText("2");
                    textField68.setEditable(false);
                    textField71.setText("1");
                    textField71.setEditable(false);
                    textField75.setText("9");
                    textField75.setEditable(false);
                    textField79.setText("3");
                    textField79.setEditable(false);
                    textField80.setText("5");
                    textField80.setEditable(false);
                    textField81.setText("4");
                    textField81.setEditable(false);
                    spiel += 1;
                    break;

                case 2:
                    textField1.setText("6");
                    textField1.setEditable(false);
                    textField3.setText("7");
                    textField3.setEditable(false);
                    textField4.setText("5");
                    textField4.setEditable(false);
                    textField7.setText("1");
                    textField7.setEditable(false);
                    textField12.setText("1");
                    textField12.setEditable(false);
                    textField13.setText("9");
                    textField13.setEditable(false);
                    textField25.setText("6");
                    textField25.setEditable(false);
                    textField27.setText("5");
                    textField27.setEditable(false);
                    textField28.setText("1");
                    textField28.setEditable(false);
                    textField30.setText("5");
                    textField30.setEditable(false);
                    textField41.setText("4");
                    textField41.setEditable(false);
                    textField42.setText("5");
                    textField42.setEditable(false);
                    textField44.setText("8");
                    textField44.setEditable(false);
                    textField50.setText("8");
                    textField50.setEditable(false);
                    textField53.setText("2");
                    textField53.setEditable(false);
                    textField54.setText("7");
                    textField54.setEditable(false);
                    textField60.setText("6");
                    textField60.setEditable(false);
                    textField61.setText("3");
                    textField61.setEditable(false);
                    textField65.setText("2");
                    textField70.setText("7");
                    textField70.setEditable(false);
                    textField71.setText("1");
                    textField71.setEditable(false);
                    textField72.setText("8");
                    textField72.setEditable(false);
                    textField74.setText("9");
                    textField74.setEditable(false);
                    textField78.setText("4");
                    textField78.setEditable(false);
                    spiel += 1;
                    break;
            }
        }
    }

    private Sudoku_GUI() {

        loeseSudokuButton.addActionListener(e ->
        {
            SudokuEinlesen();
            ueberpruefeSudoku();
            if (pruefer)
            {
                konvertiereZahlen();
                pruefeZeilensummen();
                pruefeSpaltensummen();
                pruefeBloecke();
                if(loeser[0] && loeser[1] && loeser[2]) JOptionPane.showMessageDialog(null, "Das Sudoku ist richtig!");
                else JOptionPane.showMessageDialog(null, "Das Sudoku ist falsch");
            }
        });

        sudokuResetButton.addActionListener(e ->
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Wollen Sie wirklich alle Eingaben löschen?","Achtung!",dialogButton);
            if ((dialogResult == JOptionPane.YES_OPTION)) {
                resetEingaben();
            }
        });

        anleitungAusgabeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, " Guten Tag, dieses Programm" +
                    " überprüft ein beliebiges Sudoku auf \n seine Richtigkeit. Sie können selbstverständlich auch ein ungelöstes Sudoku \n abtippen und" +
                    " in diesem Programm lösen, dass spart Papier und Radiergummi, \n praktisch! \n \n " +
                    " Klicken Sie auf 'Sudoku spielen', um ein vordefiniertes Sudoku zu lösen. \n \n" +
                    " Um das Sudoku zu überprüfen klicken sie auf 'Sudoku" +
                    " überprüfen'. \n \n Wollen Sie alle Eingaben löschen, klicken sie auf 'Reset'.");
        });

        sudokuSpielenButton.addActionListener(e -> spieleSudoku());





        //----Die weiteren Buttons sind nur für die Navigationstasten und für die Funktion des Programms nicht relevant -------------
        //Minimiert das Programmfenster
        gruenerButton.addActionListener(e -> frame.setState(Frame.ICONIFIED));

        //Maximiert das Programmfenster
        gelberButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Die Maximierung wurde deaktiviert!"));

        //Beendet das Programm
        roterButton.addActionListener(e -> System.exit(0));

        //Die Buttons machen das gleiche wie die oberen, sind aber im Apple Look nicht sichtbar
        gruen2Button.addActionListener(e -> frame.setState(Frame.ICONIFIED));

        gelb2Button.addActionListener(e -> JOptionPane.showMessageDialog(null, "Die Maximierung wurde deaktiviert!"));

        rot2Button.addActionListener(e -> System.exit(0));

        fensterleiste.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                xx = e.getX();
                yy = e.getY();
            }
        });

        fensterleiste.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                frame.setLocation(frame.getLocation().x+e.getX()-xx, frame.getLocation().y+e.getY()-yy);
            }
        });

        ButtonGroup groupie = new ButtonGroup();
        groupie.add(appleButton);
        groupie.add(windowButton);
        groupie.add(otherButton);

        //Ändert das Design in Apple Optik
        appleButton.addActionListener(e ->
        {
            frame.dispose();
            frame.setUndecorated(true);

            fensterleiste.setBackground(Color.decode("#6380C2"));
            gruenerButton.setIcon(new ImageIcon(Class.class.getResource("/img/gruen.png")));
            gruenerButton.setRolloverIcon(new ImageIcon(Class.class.getResource("/img/gruen_mouseover.png")));
            gruenerButton.setMargin(new Insets(2, 5, 2, 5));
            gruenerButton.setVisible(true);
            gruen2Button.setVisible(false);

            gelberButton.setIcon(new ImageIcon(Class.class.getResource("/img/gelb.png")));
            gelberButton.setRolloverIcon(new ImageIcon(Class.class.getResource("/img/gelb_mouseover.png")));
            gelberButton.setMargin(new Insets(2, 5, 2, 5));
            gelberButton.setVisible(true);
            gelb2Button.setVisible(false);

            roterButton.setIcon(new ImageIcon(Class.class.getResource("/img/rot.png")));
            roterButton.setRolloverIcon(new ImageIcon(Class.class.getResource("/img/rot_mouseover.png")));
            roterButton.setMargin(new Insets(2, 5, 2, 5));
            roterButton.setVisible(true);
            rot2Button.setVisible(false);

            fensterleiste.setVisible(true);
            frame.pack();
            frame.setVisible(true);
            select = "apple";
        });

        //Ändert das Design in Windows Optik
        windowButton.addActionListener(e ->
        {
            frame.dispose();
            frame.setUndecorated(true);

            fensterleiste.setBackground(Color.decode("#c2d901"));
            gruen2Button.setIcon(new ImageIcon(Class.class.getResource("/img/line.png")));
            gruen2Button.setRolloverIcon(new ImageIcon(Class.class.getResource("/img/line_rollover.png")));
            gruen2Button.setMargin(new Insets(0, 0, 0, 0));
            gruenerButton.setVisible(false);
            gruen2Button.setVisible(true);

            gelb2Button.setIcon(new ImageIcon(Class.class.getResource("/img/square.png")));
            gelb2Button.setRolloverIcon(new ImageIcon(Class.class.getResource("/img/square_rollover.png")));
            gelb2Button.setMargin(new Insets(0, 0, 0, 0));
            gelberButton.setVisible(false);
            gelb2Button.setVisible(true);

            rot2Button.setIcon(new ImageIcon(Class.class.getResource("/img/cross.png")));
            rot2Button.setRolloverIcon(new ImageIcon(Class.class.getResource("/img/cross_rollover.png")));
            rot2Button.setMargin(new Insets(0, 0, 0, 0));
            roterButton.setVisible(false);
            rot2Button.setVisible(true);

            fensterleiste.setVisible(true);
            frame.pack();
            frame.setVisible(true);
            select = "window";
        });

        //Ändert das Design in die Standardoptik des Betriebssystems
        otherButton.addActionListener(e ->
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, " Wollen Sie sich wirklich das " +
                    "Standard Design des Systems antun? \n Besonders einige Linux Distributionen wie Ubuntu oder Elementary \n" +
                    " haben ein furchtbar grottiges Design, welches keinen Wert auf eine \n" +
                    " einfache Bedienung legt, obwohl es das bei anderen Betriebssystemen \n schon vor 23 Jahren gegeben hat.","Achtung!",dialogButton);
            if ((dialogResult == JOptionPane.YES_OPTION))
            {
                fensterleiste.setVisible(false);
                frame.dispose();
                frame.setUndecorated(false);
                frame.pack();
                frame.setVisible(true);
                select = "other";
            } else selektor();
        });

        //Gibt eine kleine Info über die Funktionen der Buttons darüber
        infoButton.addActionListener(e -> JOptionPane.showMessageDialog(null, " Über diese Seitenleiste" +
                " kann die Fensterdekoration eingestellt\n werden, wählen Sie den Look aus, der Ihnen am Besten gefällt!"));
    }
}
