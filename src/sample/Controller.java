package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    // Pane1 Buttons
    @FXML
    private Button p1_0_0, p1_1_0, p1_2_0, p1_3_0, p1_4_0, p1_5_0, p1_6_0, p1_7_0, p1_8_0, p1_9_0;
    @FXML
    private Button p1_0_1, p1_1_1, p1_2_1, p1_3_1, p1_4_1, p1_5_1, p1_6_1, p1_7_1, p1_8_1, p1_9_1;
    @FXML
    private Button p1_0_2, p1_1_2, p1_2_2, p1_3_2, p1_4_2, p1_5_2, p1_6_2, p1_7_2, p1_8_2, p1_9_2;
    @FXML
    private Button p1_0_3, p1_1_3, p1_2_3, p1_3_3, p1_4_3, p1_5_3, p1_6_3, p1_7_3, p1_8_3, p1_9_3;
    @FXML
    private Button p1_0_4, p1_1_4, p1_2_4, p1_3_4, p1_4_4, p1_5_4, p1_6_4, p1_7_4, p1_8_4, p1_9_4;
    @FXML
    private Button p1_0_5, p1_1_5, p1_2_5, p1_3_5, p1_4_5, p1_5_5, p1_6_5, p1_7_5, p1_8_5, p1_9_5;
    @FXML
    private Button p1_0_6, p1_1_6, p1_2_6, p1_3_6, p1_4_6, p1_5_6, p1_6_6, p1_7_6, p1_8_6, p1_9_6;
    @FXML
    private Button p1_0_7, p1_1_7, p1_2_7, p1_3_7, p1_4_7, p1_5_7, p1_6_7, p1_7_7, p1_8_7, p1_9_7;
    @FXML
    private Button p1_0_8, p1_1_8, p1_2_8, p1_3_8, p1_4_8, p1_5_8, p1_6_8, p1_7_8, p1_8_8, p1_9_8;
    @FXML
    private Button p1_0_9, p1_1_9, p1_2_9, p1_3_9, p1_4_9, p1_5_9, p1_6_9, p1_7_9, p1_8_9, p1_9_9;

    // Pane2 Buttons
    @FXML
    private Button p2_0_0, p2_1_0, p2_2_0, p2_3_0, p2_4_0, p2_5_0, p2_6_0, p2_7_0, p2_8_0, p2_9_0;
    @FXML
    private Button p2_0_1, p2_1_1, p2_2_1, p2_3_1, p2_4_1, p2_5_1, p2_6_1, p2_7_1, p2_8_1, p2_9_1;
    @FXML
    private Button p2_0_2, p2_1_2, p2_2_2, p2_3_2, p2_4_2, p2_5_2, p2_6_2, p2_7_2, p2_8_2, p2_9_2;
    @FXML
    private Button p2_0_3, p2_1_3, p2_2_3, p2_3_3, p2_4_3, p2_5_3, p2_6_3, p2_7_3, p2_8_3, p2_9_3;
    @FXML
    private Button p2_0_4, p2_1_4, p2_2_4, p2_3_4, p2_4_4, p2_5_4, p2_6_4, p2_7_4, p2_8_4, p2_9_4;
    @FXML
    private Button p2_0_5, p2_1_5, p2_2_5, p2_3_5, p2_4_5, p2_5_5, p2_6_5, p2_7_5, p2_8_5, p2_9_5;
    @FXML
    private Button p2_0_6, p2_1_6, p2_2_6, p2_3_6, p2_4_6, p2_5_6, p2_6_6, p2_7_6, p2_8_6, p2_9_6;
    @FXML
    private Button p2_0_7, p2_1_7, p2_2_7, p2_3_7, p2_4_7, p2_5_7, p2_6_7, p2_7_7, p2_8_7, p2_9_7;
    @FXML
    private Button p2_0_8, p2_1_8, p2_2_8, p2_3_8, p2_4_8, p2_5_8, p2_6_8, p2_7_8, p2_8_8, p2_9_8;
    @FXML
    private Button p2_0_9, p2_1_9, p2_2_9, p2_3_9, p2_4_9, p2_5_9, p2_6_9, p2_7_9, p2_8_9, p2_9_9;

    @FXML
    private Button btnReadyPlayer1, btnReadyPlayer2, btnNewGame;
    @FXML
    private GridPane panePlayer1, panePlayer2;
    @FXML
    private Label lblPlayer1, lblPlayer2, lblStatusGame;
    @FXML
    private TextField tfPlayer1, tfPlayer2;

    //
    private final Button[][] buttonsPlayer1 = new Button[10][10];
    private final Button[][] buttonsPlayer2 = new Button[10][10];
    //
    private final List<Button> listButtonsKilledShipsPlayer1 = new ArrayList<>();
    private final List<Button> listButtonsKilledShipsPlayer2 = new ArrayList<>();
    //
    private final List<Button> listButtonsNotGameShipsP1 = new ArrayList<>();
    private final List<Button> listButtonsNotGameShipsP2 = new ArrayList<>();
    //
    private final List<Button> xButtonsPlayer1 = new ArrayList<>();
    private final List<Button> xButtonsPlayer2 = new ArrayList<>();
    //
    private final List<Button> conteinButtonsP1 = new ArrayList<>();
    private final List<Button> conteinButtonsP2 = new ArrayList<>();
    //
    private boolean isGame = false, isPLayer1 = true;
    private boolean isFourP1 = false, isTwoShipP1 = false, isThreeShipP1 = false, isOneShipP1 = false;
    private boolean isFourP2 = false, isTwoShipP2 = false, isThreeShipP2 = false, isOneShipP2 = false;
    //
    private int countShipsPlayer1 = 0;
    private int countShipsPlayer2 = 0;
    //
    private int x = 0;
    private int y = 0;

    private String namePlayer1 = "Игрок 1", namePlayer2 = "Игрок 2";

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Buttons Player1
        {
            // A
            {
                buttonsPlayer1[0][0] = p1_0_0;
                buttonsPlayer1[1][0] = p1_1_0;
                buttonsPlayer1[2][0] = p1_2_0;
                buttonsPlayer1[3][0] = p1_3_0;
                buttonsPlayer1[4][0] = p1_4_0;
                buttonsPlayer1[5][0] = p1_5_0;
                buttonsPlayer1[6][0] = p1_6_0;
                buttonsPlayer1[7][0] = p1_7_0;
                buttonsPlayer1[8][0] = p1_8_0;
                buttonsPlayer1[9][0] = p1_9_0;
            }
            // B
            {
                buttonsPlayer1[0][1] = p1_0_1;
                buttonsPlayer1[1][1] = p1_1_1;
                buttonsPlayer1[2][1] = p1_2_1;
                buttonsPlayer1[3][1] = p1_3_1;
                buttonsPlayer1[4][1] = p1_4_1;
                buttonsPlayer1[5][1] = p1_5_1;
                buttonsPlayer1[6][1] = p1_6_1;
                buttonsPlayer1[7][1] = p1_7_1;
                buttonsPlayer1[8][1] = p1_8_1;
                buttonsPlayer1[9][1] = p1_9_1;
            }
            // V
            {
                buttonsPlayer1[0][2] = p1_0_2;
                buttonsPlayer1[1][2] = p1_1_2;
                buttonsPlayer1[2][2] = p1_2_2;
                buttonsPlayer1[3][2] = p1_3_2;
                buttonsPlayer1[4][2] = p1_4_2;
                buttonsPlayer1[5][2] = p1_5_2;
                buttonsPlayer1[6][2] = p1_6_2;
                buttonsPlayer1[7][2] = p1_7_2;
                buttonsPlayer1[8][2] = p1_8_2;
                buttonsPlayer1[9][2] = p1_9_2;
            }
            // G
            {
                buttonsPlayer1[0][3] = p1_0_3;
                buttonsPlayer1[1][3] = p1_1_3;
                buttonsPlayer1[2][3] = p1_2_3;
                buttonsPlayer1[3][3] = p1_3_3;
                buttonsPlayer1[4][3] = p1_4_3;
                buttonsPlayer1[5][3] = p1_5_3;
                buttonsPlayer1[6][3] = p1_6_3;
                buttonsPlayer1[7][3] = p1_7_3;
                buttonsPlayer1[8][3] = p1_8_3;
                buttonsPlayer1[9][3] = p1_9_3;
            }
            // D
            {
                buttonsPlayer1[0][4] = p1_0_4;
                buttonsPlayer1[1][4] = p1_1_4;
                buttonsPlayer1[2][4] = p1_2_4;
                buttonsPlayer1[3][4] = p1_3_4;
                buttonsPlayer1[4][4] = p1_4_4;
                buttonsPlayer1[5][4] = p1_5_4;
                buttonsPlayer1[6][4] = p1_6_4;
                buttonsPlayer1[7][4] = p1_7_4;
                buttonsPlayer1[8][4] = p1_8_4;
                buttonsPlayer1[9][4] = p1_9_4;
            }
            // E
            {
                buttonsPlayer1[0][5] = p1_0_5;
                buttonsPlayer1[1][5] = p1_1_5;
                buttonsPlayer1[2][5] = p1_2_5;
                buttonsPlayer1[3][5] = p1_3_5;
                buttonsPlayer1[4][5] = p1_4_5;
                buttonsPlayer1[5][5] = p1_5_5;
                buttonsPlayer1[6][5] = p1_6_5;
                buttonsPlayer1[7][5] = p1_7_5;
                buttonsPlayer1[8][5] = p1_8_5;
                buttonsPlayer1[9][5] = p1_9_5;
            }
            // J
            {
                buttonsPlayer1[0][6] = p1_0_6;
                buttonsPlayer1[1][6] = p1_1_6;
                buttonsPlayer1[2][6] = p1_2_6;
                buttonsPlayer1[3][6] = p1_3_6;
                buttonsPlayer1[4][6] = p1_4_6;
                buttonsPlayer1[5][6] = p1_5_6;
                buttonsPlayer1[6][6] = p1_6_6;
                buttonsPlayer1[7][6] = p1_7_6;
                buttonsPlayer1[8][6] = p1_8_6;
                buttonsPlayer1[9][6] = p1_9_6;
            }
            // Z
            {
                buttonsPlayer1[0][7] = p1_0_7;
                buttonsPlayer1[1][7] = p1_1_7;
                buttonsPlayer1[2][7] = p1_2_7;
                buttonsPlayer1[3][7] = p1_3_7;
                buttonsPlayer1[4][7] = p1_4_7;
                buttonsPlayer1[5][7] = p1_5_7;
                buttonsPlayer1[6][7] = p1_6_7;
                buttonsPlayer1[7][7] = p1_7_7;
                buttonsPlayer1[8][7] = p1_8_7;
                buttonsPlayer1[9][7] = p1_9_7;
            }
            // I
            {
                buttonsPlayer1[0][8] = p1_0_8;
                buttonsPlayer1[1][8] = p1_1_8;
                buttonsPlayer1[2][8] = p1_2_8;
                buttonsPlayer1[3][8] = p1_3_8;
                buttonsPlayer1[4][8] = p1_4_8;
                buttonsPlayer1[5][8] = p1_5_8;
                buttonsPlayer1[6][8] = p1_6_8;
                buttonsPlayer1[7][8] = p1_7_8;
                buttonsPlayer1[8][8] = p1_8_8;
                buttonsPlayer1[9][8] = p1_9_8;
            }
            // K
            {
                buttonsPlayer1[0][9] = p1_0_9;
                buttonsPlayer1[1][9] = p1_1_9;
                buttonsPlayer1[2][9] = p1_2_9;
                buttonsPlayer1[3][9] = p1_3_9;
                buttonsPlayer1[4][9] = p1_4_9;
                buttonsPlayer1[5][9] = p1_5_9;
                buttonsPlayer1[6][9] = p1_6_9;
                buttonsPlayer1[7][9] = p1_7_9;
                buttonsPlayer1[8][9] = p1_8_9;
                buttonsPlayer1[9][9] = p1_9_9;
            }
        }
        // Buttons Player2
        {
            // A
            {
                buttonsPlayer2[0][0] = p2_0_0;
                buttonsPlayer2[1][0] = p2_1_0;
                buttonsPlayer2[2][0] = p2_2_0;
                buttonsPlayer2[3][0] = p2_3_0;
                buttonsPlayer2[4][0] = p2_4_0;
                buttonsPlayer2[5][0] = p2_5_0;
                buttonsPlayer2[6][0] = p2_6_0;
                buttonsPlayer2[7][0] = p2_7_0;
                buttonsPlayer2[8][0] = p2_8_0;
                buttonsPlayer2[9][0] = p2_9_0;
            }
            // B
            {
                buttonsPlayer2[0][1] = p2_0_1;
                buttonsPlayer2[1][1] = p2_1_1;
                buttonsPlayer2[2][1] = p2_2_1;
                buttonsPlayer2[3][1] = p2_3_1;
                buttonsPlayer2[4][1] = p2_4_1;
                buttonsPlayer2[5][1] = p2_5_1;
                buttonsPlayer2[6][1] = p2_6_1;
                buttonsPlayer2[7][1] = p2_7_1;
                buttonsPlayer2[8][1] = p2_8_1;
                buttonsPlayer2[9][1] = p2_9_1;
            }
            // V
            {
                buttonsPlayer2[0][2] = p2_0_2;
                buttonsPlayer2[1][2] = p2_1_2;
                buttonsPlayer2[2][2] = p2_2_2;
                buttonsPlayer2[3][2] = p2_3_2;
                buttonsPlayer2[4][2] = p2_4_2;
                buttonsPlayer2[5][2] = p2_5_2;
                buttonsPlayer2[6][2] = p2_6_2;
                buttonsPlayer2[7][2] = p2_7_2;
                buttonsPlayer2[8][2] = p2_8_2;
                buttonsPlayer2[9][2] = p2_9_2;
            }
            // G
            {
                buttonsPlayer2[0][3] = p2_0_3;
                buttonsPlayer2[1][3] = p2_1_3;
                buttonsPlayer2[2][3] = p2_2_3;
                buttonsPlayer2[3][3] = p2_3_3;
                buttonsPlayer2[4][3] = p2_4_3;
                buttonsPlayer2[5][3] = p2_5_3;
                buttonsPlayer2[6][3] = p2_6_3;
                buttonsPlayer2[7][3] = p2_7_3;
                buttonsPlayer2[8][3] = p2_8_3;
                buttonsPlayer2[9][3] = p2_9_3;
            }
            // D
            {
                buttonsPlayer2[0][4] = p2_0_4;
                buttonsPlayer2[1][4] = p2_1_4;
                buttonsPlayer2[2][4] = p2_2_4;
                buttonsPlayer2[3][4] = p2_3_4;
                buttonsPlayer2[4][4] = p2_4_4;
                buttonsPlayer2[5][4] = p2_5_4;
                buttonsPlayer2[6][4] = p2_6_4;
                buttonsPlayer2[7][4] = p2_7_4;
                buttonsPlayer2[8][4] = p2_8_4;
                buttonsPlayer2[9][4] = p2_9_4;
            }
            // E
            {
                buttonsPlayer2[0][5] = p2_0_5;
                buttonsPlayer2[1][5] = p2_1_5;
                buttonsPlayer2[2][5] = p2_2_5;
                buttonsPlayer2[3][5] = p2_3_5;
                buttonsPlayer2[4][5] = p2_4_5;
                buttonsPlayer2[5][5] = p2_5_5;
                buttonsPlayer2[6][5] = p2_6_5;
                buttonsPlayer2[7][5] = p2_7_5;
                buttonsPlayer2[8][5] = p2_8_5;
                buttonsPlayer2[9][5] = p2_9_5;
            }
            // J
            {
                buttonsPlayer2[0][6] = p2_0_6;
                buttonsPlayer2[1][6] = p2_1_6;
                buttonsPlayer2[2][6] = p2_2_6;
                buttonsPlayer2[3][6] = p2_3_6;
                buttonsPlayer2[4][6] = p2_4_6;
                buttonsPlayer2[5][6] = p2_5_6;
                buttonsPlayer2[6][6] = p2_6_6;
                buttonsPlayer2[7][6] = p2_7_6;
                buttonsPlayer2[8][6] = p2_8_6;
                buttonsPlayer2[9][6] = p2_9_6;
            }
            // Z
            {
                buttonsPlayer2[0][7] = p2_0_7;
                buttonsPlayer2[1][7] = p2_1_7;
                buttonsPlayer2[2][7] = p2_2_7;
                buttonsPlayer2[3][7] = p2_3_7;
                buttonsPlayer2[4][7] = p2_4_7;
                buttonsPlayer2[5][7] = p2_5_7;
                buttonsPlayer2[6][7] = p2_6_7;
                buttonsPlayer2[7][7] = p2_7_7;
                buttonsPlayer2[8][7] = p2_8_7;
                buttonsPlayer2[9][7] = p2_9_7;
            }
            // I
            {
                buttonsPlayer2[0][8] = p2_0_8;
                buttonsPlayer2[1][8] = p2_1_8;
                buttonsPlayer2[2][8] = p2_2_8;
                buttonsPlayer2[3][8] = p2_3_8;
                buttonsPlayer2[4][8] = p2_4_8;
                buttonsPlayer2[5][8] = p2_5_8;
                buttonsPlayer2[6][8] = p2_6_8;
                buttonsPlayer2[7][8] = p2_7_8;
                buttonsPlayer2[8][8] = p2_8_8;
                buttonsPlayer2[9][8] = p2_9_8;
            }
            // K
            {
                buttonsPlayer2[0][9] = p2_0_9;
                buttonsPlayer2[1][9] = p2_1_9;
                buttonsPlayer2[2][9] = p2_2_9;
                buttonsPlayer2[3][9] = p2_3_9;
                buttonsPlayer2[4][9] = p2_4_9;
                buttonsPlayer2[5][9] = p2_5_9;
                buttonsPlayer2[6][9] = p2_6_9;
                buttonsPlayer2[7][9] = p2_7_9;
                buttonsPlayer2[8][9] = p2_8_9;
                buttonsPlayer2[9][9] = p2_9_9;
            }
        }
    }

    // нажатие кнопки "Готово" Player1
    public void onReadyPlayer1(ActionEvent event) {
        if (!tfPlayer1.getText().equals(""))
            namePlayer1 = tfPlayer1.getText();
        lblPlayer1.setVisible(true);
        lblPlayer1.setText(namePlayer1);
        tfPlayer1.setVisible(false);
        btnReadyPlayer1.setVisible(false);
        tfPlayer2.setDisable(false);
        btnReadyPlayer2.setDisable(false);
        reversPlayer();
        hideOrShowXButtons("p1");
        setDisableFalseToButtons();
    }

    // нажатие кнопки "Готово" Player2
    public void onReadyPlayer2(ActionEvent event) {
        if (!tfPlayer2.getText().equals(""))
            namePlayer2 = tfPlayer2.getText();
        lblPlayer2.setVisible(true);
        lblPlayer2.setText(namePlayer2);
        tfPlayer2.setVisible(false);
        btnReadyPlayer2.setVisible(false);
        printStatusGame("Бой начался! Стреляет " + namePlayer1 + "...");
        hideOrShowXButtons("p2");
        setDisableFalseToButtons();
        isGame = true;
        isPLayer1 = true;
        reversPlayer();
    }

    // нажатие ячейки на левом поле Pane1
    public void onSlotPane1(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (!isGame) { // расстановка кораблей
            if (btn.getText().equals("")) {
                btn.setText("+");
                btn.setStyle("-fx-background-color: #aeaeae;");
                xButtonsPlayer1.add(btn);
                countShipsPlayer1++;

                conteinButtonsP1.add(btn);
                listButtonsNotGameShipsP1.add(btn);
                searchMove("player1", btn.getId());
            }
        } else { // стрельба по кораблям
            if (btn.getText().equals("+")) { // попадание
                initXAndY(btn.getId());
                //
                btn.setTextFill(Color.web("#fafafa"));
                btn.setStyle("-fx-background-color: #af4448;");
                btn.setDisable(true);
                printStatusGame("Ранен! Стреляйте еще раз...");
                countShipsPlayer1--;
                //
                listButtonsKilledShipsPlayer1.add(btn);
                for (Button button : listButtonsKilledShipsPlayer1)
                    System.out.println("pane_1 : " + button.getId());
                //
                if (!checkAroundNotKilledShips("player1")) {
                    for (Button button : listButtonsKilledShipsPlayer1)
                        paintAroundKilledShips("player1", button);
                    listButtonsKilledShipsPlayer1.clear();
                    printStatusGame("Убит! Стреляйте еще раз...");
                }
                //
                if (countShipsPlayer1 == 0)
                    win(namePlayer2);
            } else { // промах
                printStatusGame("Промах! Сейчас стреляет " + namePlayer1 + "...");
                btn.setStyle("-fx-background-color: #0093c4;");
                btn.setDisable(true);
                reversPlayer();
            }
        }
    }

    // нажатие ячейки на правом поле Pane2
    public void onSlotPane2(ActionEvent event) {
        Button btn = (Button) event.getSource();
        if (!isGame) { // расстановка кораблей
            if (btn.getText().equals("")) {
                btn.setText("+");
                btn.setStyle("-fx-background-color: #aeaeae;");
                xButtonsPlayer2.add(btn);
                countShipsPlayer2++;

                conteinButtonsP2.add(btn);
                listButtonsNotGameShipsP2.add(btn);
                searchMove("player2", btn.getId());
            }
        } else { // стрельба по кораблям
            if (btn.getText().equals("+")) { // попадание
                initXAndY(btn.getId());
                //
                btn.setTextFill(Color.web("#fafafa"));
                btn.setStyle("-fx-background-color: #af4448;");
                btn.setDisable(true);
                printStatusGame("Ранен! Стреляйте еще раз...");
                countShipsPlayer2--;
                //
                listButtonsKilledShipsPlayer2.add(btn);
                for (Button button : listButtonsKilledShipsPlayer2)
                    System.out.println("pane_2 : " + button.getId());
                //
                if (!checkAroundNotKilledShips("player2")) {
                    for (Button button : listButtonsKilledShipsPlayer2)
                        paintAroundKilledShips("player2", button);
                    listButtonsKilledShipsPlayer2.clear();
                    printStatusGame("Убит! Стреляйте еще раз...");
                }
                //
                if (countShipsPlayer2 == 0)
                    win(namePlayer1);
            } else { // промах
                printStatusGame("Промах! Сейчас стреляет " + namePlayer2 + "...");
                btn.setStyle("-fx-background-color: #0093c4;");
                btn.setDisable(true);
                reversPlayer();
            }
        }
    }

    // инициализация X и Y
    private void initXAndY(String id) {
        // шаблон p1_1_1
        String[] args = id.split("_");

        String strOX = args[1];
        String strOY = args[2];

        try {
            x = Integer.parseInt(strOX);
            y = Integer.parseInt(strOY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // переключение между игроками
    private void reversPlayer() {
        if (isPLayer1) {
            panePlayer1.setDisable(true);
            panePlayer2.setDisable(false);
            isPLayer1 = false;
        } else {
            panePlayer1.setDisable(false);
            panePlayer2.setDisable(true);
            isPLayer1 = true;
        }
    }

    // скрытие/показ ячеек с x-ми
    private void hideOrShowXButtons(String isPlayer) {
        String[] pl = isPlayer.split("_");
        if (isPlayer.equals("p1")) {
            for (Button btn : xButtonsPlayer1) {
                btn.setTextFill(Color.web("#eeeeee"));
                btn.setStyle("-fx-background-color: #eeeeee");
            }
        } else if (isPlayer.equals("p2")) {
            for (Button btn : xButtonsPlayer2) {
                btn.setTextFill(Color.web("#eeeeee"));
                btn.setStyle("-fx-background-color: #eeeeee");
            }
        } else if (pl[0].equals("win")) {
            paintUndetectedShips();
        }
    }


    // проверка ячеек вокруг раненого карабля
    private boolean checkAroundNotKilledShips(String player) {
        boolean answer = false;

        switch (player) {
            case "player1": {
                for (Button button : listButtonsKilledShipsPlayer1) {
                    initXAndY(button.getId());
                    for (int ox = -1; ox < 2; ox++) {
                        for (int oy = -1; oy < 2; oy++) {
                            if (checkInsideArray(x + ox, y + oy)) {
                                if (buttonsPlayer1[x + ox][y + oy].getText().equals("+") && buttonsPlayer1[x + ox][y + oy].getStyle().equals("-fx-background-color: #eeeeee"))
                                    answer = true;
                            }
                        }
                    }
                }
            }
            break;

            case "player2": {
                for (Button button : listButtonsKilledShipsPlayer2) {
                    initXAndY(button.getId());
                    for (int ox = -1; ox < 2; ox++) {
                        for (int oy = -1; oy < 2; oy++) {
                            if (checkInsideArray(x + ox, y + oy)) {
                                if (buttonsPlayer2[x + ox][y + oy].getText().equals("+") && buttonsPlayer2[x + ox][y + oy].getStyle().equals("-fx-background-color: #eeeeee"))
                                    answer = true;
                            }
                        }
                    }
                }
            }
            break;
        }

        System.out.println(player + " " + answer);
        return answer;
    }











    // поиск возможных соседних нажатий на клетки для одного корабля
    private void searchMove(String player, String id) {
        initXAndY(id);
        switch (player) {
            case "player1": {
                for (int i = -1; i != 3 && i < 4; i += 2) {
                    for (int j = -1; j != 3 && j < 4; j += 2) {
                        if (checkInsideArray(x + i, y + j)) {
                            buttonsPlayer1[x + i][y + j].setDisable(true);
                            buttonsPlayer1[x + i][y + j].setStyle("-fx-background-color: #0093c4");
                            buttonsPlayer1[x + i][y + j].setText("~");
                            checkIsShip("player1");
                        }
                    }
                }
            }
            break;

            case "player2": {
                for (int i = -1; i != 3 && i < 4; i += 2) {
                    for (int j = -1; j != 3 && j < 4; j += 2) {
                        if (checkInsideArray(x + i, y + j)) {
                            buttonsPlayer2[x + i][y + j].setDisable(true);
                            buttonsPlayer2[x + i][y + j].setStyle("-fx-background-color: #0093c4");
                            buttonsPlayer2[x + i][y + j].setText("~");
                            checkIsShip("player2");
                        }
                    }
                }
            }
            break;
        }
    }

    // проверка на карабль (блокировка клеток если 4-х палубный есть!)
    private void checkIsShip(String player) {
        switch (player) {
            case "player1": {
                for (int ox = -1; ox < 2; ox++) {
                    for (int oy = -1; oy < 2; oy++) {
                        if (checkInsideArray(x + ox, y + oy)) {
                            if (buttonsPlayer1[x + ox][y + oy].getText().equals("+") && !buttonsPlayer1[x + ox][y + oy].getStyle().equals("-fx-background-color: #eeeeee")) {

                                if (conteinButtonsP1.size() == 4 && !isFourP1) {
                                    isFourP1 = true;
                                }
                                if (conteinButtonsP1.size() == 3 && isFourP1 && !isThreeShipP1 && !isTwoShipP1) {
                                    isThreeShipP1 = true;
                                    countPal3_Player1++;
                                }
                                if (conteinButtonsP1.size() == 2 && isFourP1 && isThreeShipP1 && !isOneShipP1) {
                                    isTwoShipP1 = true;
                                    countPal2_Player1++;
                                }
                                if (conteinButtonsP1.size() == 1 && isFourP1 && isThreeShipP1 && isTwoShipP1) {
                                    isOneShipP1 = true;
                                    countPal1_Player1++;
                                }
                            }

                            if (isFourP1 && conteinButtonsP1.size() == 4) {
                                for (Button btn : listButtonsNotGameShipsP1)
                                    disableAroundShip_inStartGame("player1", btn);
                                listButtonsNotGameShipsP1.clear();
                            }

                            if (isFourP1 && isThreeShipP1 && !isTwoShipP1 && conteinButtonsP1.size() == 3) {
                                for (Button btn : listButtonsNotGameShipsP1)
                                    disableAroundShip_inStartGame("player1", btn);
                                listButtonsNotGameShipsP1.clear();
                            }

                            if (isFourP1 && isThreeShipP1 && isTwoShipP1 && !isOneShipP1 && conteinButtonsP1.size() == 2) {
                                for (Button btn : listButtonsNotGameShipsP1)
                                    disableAroundShip_inStartGame("player1", btn);
                                listButtonsNotGameShipsP1.clear();
                            }

                            if (isFourP1 && isThreeShipP1 && isTwoShipP1 && isOneShipP1) {
                                for (Button btn : listButtonsNotGameShipsP1)
                                    disableAroundShip_inStartGame("player1", btn);
                                listButtonsNotGameShipsP1.clear();
                            }
                        }
                    }
                }
            }
            break;

            case "player2": {
                for (int ox = -1; ox < 2; ox++) {
                    for (int oy = -1; oy < 2; oy++) {
                        if (checkInsideArray(x + ox, y + oy)) {
                            if (buttonsPlayer2[x + ox][y + oy].getText().equals("+") && !buttonsPlayer2[x + ox][y + oy].getStyle().equals("-fx-background-color: #eeeeee")) {
                                if (conteinButtonsP2.size() == 4) {
                                    isFourP2 = true;
                                }
                                if (conteinButtonsP2.size() == 3 && isFourP2 && !isThreeShipP2 && !isTwoShipP2) {
                                    isThreeShipP2 = true;
                                    countPal3_Player2++;
                                }
                                if (conteinButtonsP2.size() == 2 && isFourP2 && isThreeShipP2 && !isOneShipP2) {
                                    isTwoShipP2 = true;
                                    countPal2_Player2++;
                                }
                                if (conteinButtonsP2.size() == 1 && isFourP2 && isThreeShipP2 && isTwoShipP2) {
                                    isOneShipP2 = true;
                                    countPal1_Player2++;
                                }
                            }

                            if (isFourP2 && conteinButtonsP2.size() == 4) {
                                for (Button btn : listButtonsNotGameShipsP2)
                                    disableAroundShip_inStartGame("player2", btn);
                                listButtonsNotGameShipsP2.clear();
                            }

                            if (isFourP2 && isThreeShipP2 && !isTwoShipP2 && conteinButtonsP2.size() == 3) {
                                for (Button btn : listButtonsNotGameShipsP2)
                                    disableAroundShip_inStartGame("player2", btn);
                                listButtonsNotGameShipsP2.clear();
                            }

                            if (isFourP2 && isThreeShipP2 && isTwoShipP2 && !isOneShipP2 && conteinButtonsP2.size() == 2) {
                                for (Button btn : listButtonsNotGameShipsP2)
                                    disableAroundShip_inStartGame("player2", btn);
                                listButtonsNotGameShipsP2.clear();
                            }

                            if (isFourP2 && isThreeShipP2 && isTwoShipP2 && isOneShipP2) {
                                for (Button btn : listButtonsNotGameShipsP2)
                                    disableAroundShip_inStartGame("player2", btn);
                                listButtonsNotGameShipsP2.clear();
                            }
                        }
                    }
                }
            }
            break;
        }
    }

    private int countPal3_Player1 = 0, countPal2_Player1 = 0, countPal1_Player1 = 0;
    private int countPal3_Player2 = 0, countPal2_Player2 = 0, countPal1_Player2 = 0;

    // запрет на нажатие кнопок вокруг карабля во время расстановки
    private void disableAroundShip_inStartGame(String player, Button btn) {
        initXAndY(btn.getId());
        switch (player) {
            case "player1": {
                for (int ox = -1; ox < 2; ox++) {
                    for (int oy = -1; oy < 2; oy++) {
                        if (checkInsideArray(x + ox, y + oy)) {
                            if (!buttonsPlayer1[x + ox][y + oy].getText().equals("+")) {
                                if (isFourP1 && !isTwoShipP1) {
                                    if (countPal3_Player1 < 2) {
                                        isThreeShipP1 = false;
                                    } else if (countPal3_Player1 == 2) {
                                        isThreeShipP1 = true;
                                    }
                                    conteinButtonsP1.clear();
                                }
                                if (isFourP1 && isThreeShipP1 && !isOneShipP1) {
                                    if (countPal2_Player1 < 3) {
                                        isTwoShipP1 = false;
                                    } else if (countPal2_Player1 == 3) {
                                        isTwoShipP1 = true;
                                    }
                                    conteinButtonsP1.clear();
                                }
                                if (isFourP1 && isThreeShipP1 && isTwoShipP1) {
                                    if (countPal1_Player1 < 4) {
                                        isOneShipP1 = false;
                                    } else if (countPal1_Player1 == 4) {
                                        isOneShipP1 = true;
                                        panePlayer1.setDisable(true);
                                    }
                                    conteinButtonsP1.clear();
                                }
                                buttonsPlayer1[x + ox][y + oy].setDisable(true);
                                buttonsPlayer1[x + ox][y + oy].setText("~");
                                buttonsPlayer1[x + ox][y + oy].setStyle("-fx-background-color: #0093c4");
                            }
                        }
                    }
                }
            }
            break;

            case "player2": {
                for (int ox = -1; ox < 2; ox++) {
                    for (int oy = -1; oy < 2; oy++) {
                        if (checkInsideArray(x + ox, y + oy)) {
                            if (!buttonsPlayer2[x + ox][y + oy].getText().equals("+")) {
                                if (isFourP2 && !isTwoShipP2) {
                                    if (countPal3_Player2 < 2) {
                                        isThreeShipP2 = false;
                                    } else if (countPal3_Player2 == 2) {
                                        isThreeShipP2 = true;
                                    }
                                    conteinButtonsP2.clear();
                                }
                                if (isFourP2 && isThreeShipP2 && !isOneShipP2) {
                                    if (countPal2_Player2 < 3) {
                                        isTwoShipP2 = false;
                                    } else if (countPal2_Player2 == 3) {
                                        isTwoShipP2 = true;
                                    }
                                    conteinButtonsP2.clear();
                                }
                                if (isFourP2 && isThreeShipP2 && isTwoShipP2) {
                                    if (countPal1_Player2 < 4) {
                                        isOneShipP2 = false;
                                    } else if (countPal1_Player2 == 4) {
                                        isOneShipP2 = true;
                                        panePlayer2.setDisable(true);
                                    }
                                    conteinButtonsP2.clear();
                                }
                                buttonsPlayer2[x + ox][y + oy].setDisable(true);
                                buttonsPlayer2[x + ox][y + oy].setText("~");
                                buttonsPlayer2[x + ox][y + oy].setStyle("-fx-background-color: #0093c4");
                            }
                        }
                    }
                }
            }
            break;
        }
    }











    // закрашивание ячеек вокруг убитого карабля
    private void paintAroundKilledShips(String player, Button btn) {

        switch (player) {
            case "player1": {
                initXAndY(btn.getId());
                for (int ox = -1; ox < 2; ox++) {
                    for (int oy = -1; oy < 2; oy++) {
                        if (checkInsideArray(x + ox, y + oy)) {
                            if (!buttonsPlayer1[x + ox][y + oy].getText().equals("+")) {
                                buttonsPlayer1[x + ox][y + oy].setDisable(true);
                                buttonsPlayer1[x + ox][y + oy].setStyle("-fx-background-color: #0093c4");
                            }
                        }
                    }
                }
            }
            break;

            case "player2": {
                initXAndY(btn.getId());
                for (int ox = -1; ox < 2; ox++) {
                    for (int oy = -1; oy < 2; oy++) {
                        if (checkInsideArray(x + ox, y + oy)) {
                            if (!buttonsPlayer2[x + ox][y + oy].getText().equals("+")) {
                                buttonsPlayer2[x + ox][y + oy].setDisable(true);
                                buttonsPlayer2[x + ox][y + oy].setStyle("-fx-background-color: #0093c4");
                            }
                        }
                    }
                }
            }
            break;
        }
    }

    // отображение (закрашивание) необнаруженных кораблей после окончания игры
    private void paintUndetectedShips() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                if (buttonsPlayer1[x][y].getStyle().equals("-fx-background-color: #eeeeee") && buttonsPlayer1[x][y].getText().equals("+")) {
                    buttonsPlayer1[x][y].setStyle("-fx-background-color: #c8a415");
                    buttonsPlayer1[x][y].setTextFill(Color.web("#fafafa"));
                }
                if (buttonsPlayer2[x][y].getStyle().equals("-fx-background-color: #eeeeee") && buttonsPlayer2[x][y].getText().equals("+")) {
                    buttonsPlayer2[x][y].setStyle("-fx-background-color: #c8a415");
                    buttonsPlayer2[x][y].setTextFill(Color.web("#fafafa"));
                }
            }
        }

    }

    // разблокировка ячеек после расстановки перед началом игры
    private void setDisableFalseToButtons() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                buttonsPlayer1[x][y].setDisable(false);
                buttonsPlayer2[x][y].setDisable(false);
                buttonsPlayer1[x][y].setStyle("-fx-background-color: #eeeeee");
                buttonsPlayer2[x][y].setStyle("-fx-background-color: #eeeeee");
                if (buttonsPlayer1[x][y].getText().equals("~"))
                    buttonsPlayer1[x][y].setText("");
                if (buttonsPlayer2[x][y].getText().equals("~"))
                    buttonsPlayer2[x][y].setText("");
            }
        }
    }

    // проверка на вхождение в игровое поле
    private boolean checkInsideArray(int x, int y) {
        return (x >= 0 && x < 10) && (y < 10 && y >= 0);
    }

    // вывод на экран статуса игры
    private void printStatusGame(String text) {
        lblStatusGame.setText(text);
    }

    // конец игры и определение победителя игры
    private void win(String player) {
        printStatusGame("Выиграл " + player + "!");
        panePlayer1.setDisable(true);
        panePlayer2.setDisable(true);
        btnNewGame.setVisible(true);
        openStageWin();
        hideOrShowXButtons("win_" + player);
    }

    // поздравительное окно в конце игры
    private void openStageWin() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../ViewStage/win.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Отличная работа, боец!");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(getClass().getResourceAsStream("../medal.png")));
            stage.show();
        } catch (IOException ignored) {
        }
    }

    // нажатие кнопки "Новая игра"
    public void onNewGame(ActionEvent event) {
        isGame = false;
        isPLayer1 = true;
        printStatusGame("Игроки, представьтесь и расставьте корабли...");
        btnNewGame.setVisible(false);

        lblPlayer1.setVisible(false);
        tfPlayer1.setVisible(true);
        tfPlayer1.clear();
        panePlayer1.setDisable(false);
        btnReadyPlayer1.setVisible(true);
        btnReadyPlayer1.setDisable(false);

        lblPlayer2.setVisible(false);
        tfPlayer2.setVisible(true);
        tfPlayer2.setDisable(true);
        tfPlayer2.clear();
        panePlayer2.setDisable(true);
        btnReadyPlayer2.setVisible(true);
        btnReadyPlayer2.setDisable(true);

        countShipsPlayer1 = 0;
        countShipsPlayer2 = 0;

        x = 0;
        y = 0;

        namePlayer1 = "Игрок 1";
        namePlayer2 = "Игрок 2";

        isFourP1 = false;
        isTwoShipP1 = false;
        isThreeShipP1 = false;
        isOneShipP1 = false;

        isFourP2 = false;
        isTwoShipP2 = false;
        isThreeShipP2 = false;
        isOneShipP2 = false;

        listButtonsKilledShipsPlayer1.clear();
        listButtonsKilledShipsPlayer2.clear();
        listButtonsNotGameShipsP1.clear();
        listButtonsNotGameShipsP2.clear();
        xButtonsPlayer1.clear();
        xButtonsPlayer2.clear();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                buttonsPlayer1[i][j].setText("");
                buttonsPlayer1[i][j].setTextFill(Color.web("#424242"));
                buttonsPlayer1[i][j].setStyle("-fx-background-color: #eeeeee");
                buttonsPlayer1[i][j].setDisable(false);
                buttonsPlayer2[i][j].setText("");
                buttonsPlayer2[i][j].setTextFill(Color.web("#424242"));
                buttonsPlayer2[i][j].setStyle("-fx-background-color: #eeeeee");
                buttonsPlayer2[i][j].setDisable(false);
            }
        }
    }
}