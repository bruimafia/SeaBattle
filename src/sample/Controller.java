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
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {

    // PanePlayer1 Buttons (Cells)
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

    // PanePlayer2 Buttons (Cells)
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
    @FXML
    private ImageView test;




    // все ячейки игроков
    private final Button[][] buttonsPlayer1 = new Button[10][10];
    private final Button[][] buttonsPlayer2 = new Button[10][10];
    private Button[][] buttonsCurrentPlayer = buttonsPlayer1;
    // текущая нажатая кнопка и координаты этой кнопки
    private Button currentPressedBtn = new Button();
    private int x = 0, y = 0;
    // количество всех ячеек для одного игрока (по умолчанию 20)
    private int countAllCells = 20;
    // текущий размер расставляемого корабля
    private List<String> listCurrentAddShip = new ArrayList<>();
    // расстановка или игра
    private boolean isGame = false;
    // игрок 1 или игрок 2
    private boolean isPLayer1 = true;
    // максимально возможное количество кораблей каждого типа
    private int maxPossibleCountOneShip = 4, maxPossibleCountTwoShip = 3, maxPossibleCountThreeShip = 2, maxPossibleCountFourShip = 1;
    // подбитые ячейки игроков
    private final List<Button> listButtonsKilledShipsPlayer1 = new ArrayList<>();
    private final List<Button> listButtonsKilledShipsPlayer2 = new ArrayList<>();
    private List<Button> listButtonsKilledShipsCurrentPlayer = new ArrayList<>();
    // имена игроков (по умолчанию)
    private String namePlayer1 = "Игрок 1", namePlayer2 = "Игрок 2", nameCurrentPlayer = namePlayer1;
    // количество кораблей (ячеек) игроков
    private int countCellsPlayer1 = 0, countCellsPlayer2 = 0, countCellsCurrentPlayer = countCellsPlayer1;
    // расставленное вооружение каждого игрока
    private int[][] armorPlayer1 = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}

    };
    private int[][] armorPlayer2 = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}

    };
    private int[][] armorCurrentPlayer = armorPlayer1;




    // инициализация всех ячеек на игровых полях
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Buttons (Cells) Player1
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
        // Buttons (Cells) Player2
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

    // инициализация координат кнопки X и Y
    private void initXY(String id) {
        // получаемый шаблон p1_1_1
        String[] args = id.split("_");
        String strX = args[1];
        String strY = args[2];
        try {
            x = Integer.parseInt(strX);
            y = Integer.parseInt(strY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // нажатие ячейки на левом игровом поле PanePlayer1
    public void onButtonPane1(ActionEvent event) {
        currentPressedBtn = (Button) event.getSource();
        initXY(currentPressedBtn.getId());

        if (!isGame) { // расстановка кораблей
            placementShip();
        } else { // стрельба по кораблям
            shootingShip();
        }
    }

    // нажатие ячейки на правом игровом поле PanePlayer2
    public void onButtonPane2(ActionEvent event) {
        currentPressedBtn = (Button) event.getSource();
        initXY(currentPressedBtn.getId());

        if (!isGame) { // расстановка кораблей
            placementShip();
        } else { // стрельба по кораблям
            shootingShip();
        }
    }

    // нажатие кнопки "Готово" Player1
    public void onReadyPlayer1(ActionEvent event) {
        if (!tfPlayer1.getText().equals(""))
            namePlayer1 = tfPlayer1.getText().trim();
        lblPlayer1.setVisible(true);
        lblPlayer1.setText(namePlayer1);
        tfPlayer1.setVisible(false);
        btnReadyPlayer1.setVisible(false);
        tfPlayer2.setDisable(false);
        setDisableFalseToButtons(); // разблокировка ячеек после расстановки перед началом игры
        reversPlayer(); // переключение между игроками
    }

    // нажатие кнопки "Готово" Player2
    public void onReadyPlayer2(ActionEvent event) {
        if (!tfPlayer2.getText().equals(""))
            namePlayer2 = tfPlayer2.getText().trim();
        lblPlayer2.setVisible(true);
        lblPlayer2.setText(namePlayer2);
        tfPlayer2.setVisible(false);
        btnReadyPlayer2.setVisible(false);
        printStatusGame("Бой начался! Стреляет " + namePlayer2 + "...");
        setDisableFalseToButtons(); // разблокировка ячеек после расстановки перед началом игры
        reversPlayer(); // переключение между игроками
        isGame = true;
    }

    // переключение между игроками
    private void reversPlayer() {
        if (isPLayer1) {
            saveProgressPlayer();
            panePlayer1.setDisable(true);
            panePlayer2.setDisable(false);
            isPLayer1 = false;

            buttonsCurrentPlayer = buttonsPlayer2;
            countCellsCurrentPlayer = countCellsPlayer2;
            armorCurrentPlayer = armorPlayer2;
            nameCurrentPlayer = namePlayer1;
            listButtonsKilledShipsCurrentPlayer = listButtonsKilledShipsPlayer2;
        } else {
            saveProgressPlayer();
            panePlayer1.setDisable(false);
            panePlayer2.setDisable(true);
            isPLayer1 = true;

            buttonsCurrentPlayer = buttonsPlayer1;
            countCellsCurrentPlayer = countCellsPlayer1;
            armorCurrentPlayer = armorPlayer1;
            nameCurrentPlayer = namePlayer2;
            listButtonsKilledShipsCurrentPlayer = listButtonsKilledShipsPlayer1;
        }
    }

    // сохранение прогресса игрока
    private void saveProgressPlayer() {
        if (isPLayer1) {
            countCellsPlayer1 = countCellsCurrentPlayer;
            armorPlayer1 = armorCurrentPlayer;
        } else {
            countCellsPlayer2 = countCellsCurrentPlayer;
            armorPlayer2 = armorCurrentPlayer;
        }
    }

    // размещение корабля
    private void placementShip() {
        printStatusGame("Игроки, представьтесь и расставьте корабли...");
        if (currentPressedBtn.getText().equals("")) {
            currentPressedBtn.setText("+");
            currentPressedBtn.setStyle("-fx-background-color: #aeaeae;");
            checkAddShip(); // проверяем, продолжаем ли мы ставить тот же корабль или ставим новый
            initXY(currentPressedBtn.getId());
            setColorTabooCellsAroundShip();
            if (countCellsCurrentPlayer >= countAllCells && isPLayer1) {
                panePlayer1.setDisable(true);
                btnReadyPlayer1.setDisable(false);
                cancelShip();
                listCurrentAddShip.clear();
            }
            if (countCellsCurrentPlayer >= countAllCells && !isPLayer1) {
                panePlayer2.setDisable(true);
                btnReadyPlayer2.setDisable(false);
                cancelShip();
                listCurrentAddShip.clear();
            }
        }
    }

    // проверяем, продолжаем ли мы ставить тот же корабль или ставим новый
    private void checkAddShip() {
        System.out.println("Лист ДО = " + listCurrentAddShip.size() + "   " + listCurrentAddShip.toString());

        boolean answer = false;
        if (listCurrentAddShip.size() != 0) { // продолжаем ставить корабль (увеличиваем размер корабля)
            // есть ли вокруг нажатой ячейки уже расставленные корабли (ячейки)
            for (int ox = -1; ox < 2; ox++) {
                for (int oy = -1; oy < 2; oy++) {
                    if (checkInsideArray(x + ox, y + oy)) {
                        if (buttonsCurrentPlayer[x + ox][y + oy].getText().equals("+") && buttonsCurrentPlayer[x + ox][y + oy] != buttonsCurrentPlayer[x][y])
                            answer = true;
                    }
                }
            }

            if (!answer) {
                System.out.printf("Разрешено ли разместить еще один %d-палубный корабль | %b\n", listCurrentAddShip.size(), isNotMaxCountShip(listCurrentAddShip.size()));
                if (isNotMaxCountShip(listCurrentAddShip.size())) {
                    setColorAroundShip(); // закрашивание ячеек вокруг установленного корабля
                    setArmorPlayer(listCurrentAddShip.size()); // запись расставленого корабля
                    countCellsCurrentPlayer += listCurrentAddShip.size();
                } else {
                    cancelShip(); // отмена расставленного корабля
                    if (listCurrentAddShip.size() > 4)
                        printStatusGame("Ошибка: " + listCurrentAddShip.size() + "-палубный корабль ставить запрещено!");
                    else
                        printStatusGame("Ошибка: все " + listCurrentAddShip.size() + "-палубные корабли уже расставлены!");
                }
                listCurrentAddShip.clear();
            }
        }
        listCurrentAddShip.add(currentPressedBtn.getId());

        System.out.println("Лист ПОСЛЕ = " + listCurrentAddShip.size() + "    " + listCurrentAddShip.toString() + "\n");
    }

    // закрашивание ячеек вокруг установленного корабля
    private void setColorAroundShip() {
        for (String s : listCurrentAddShip) {
            initXY(s);
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (checkInsideArray(x + i, y + j)) {
                        if (!buttonsCurrentPlayer[x + i][y + j].getText().equals("+")) {
                            buttonsCurrentPlayer[x + i][y + j].setDisable(true);
                            buttonsCurrentPlayer[x + i][y + j].setText("~");
                            buttonsCurrentPlayer[x + i][y + j].setStyle("-fx-background-color: #0093c4");
                        }
                    }
                }
            }
        }
    }

    // запись расставленого корабля
    private void setArmorPlayer(int typeShip) {
        int i = 0;
        while (armorCurrentPlayer[i][0] != 0)
            i++;
        for (int j = 0; j < typeShip; j++)
            armorCurrentPlayer[i][j] = 1;
        System.out.println(Arrays.deepToString(armorCurrentPlayer));
    }

    // отмена расставленного корабля
    private void cancelShip() {
        for (String s : listCurrentAddShip) {
            initXY(s);
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (checkInsideArray(x + i, y + j) && !buttonsCurrentPlayer[x + i][y + j].getText().equals("~")) {
                        buttonsCurrentPlayer[x + i][y + j].setDisable(false);
                        buttonsCurrentPlayer[x + i][y + j].setStyle("-fx-background-color: #eeeeee");
                        buttonsCurrentPlayer[x + i][y + j].setText("");
                    }
                }
            }
        }
    }

    // проверка на максимум расставленых кораблей определенного типа
    private boolean isNotMaxCountShip(int typeShip) {
        switch (typeShip) {
            case 1:
                return currentCountTypeShip(typeShip) < maxPossibleCountOneShip;
            case 2:
                return currentCountTypeShip(typeShip) < maxPossibleCountTwoShip;
            case 3:
                return currentCountTypeShip(typeShip) < maxPossibleCountThreeShip;
            case 4:
                return currentCountTypeShip(typeShip) < maxPossibleCountFourShip;
            default:
                return false;
        }
    }

    // подсчет уже расставленных кораблей определенного типа
    private int currentCountTypeShip(int typeShip) {
        int returnCount = 0;
        for (int i = 0; i < 10; i++) {
            if (armorCurrentPlayer[i][0] + armorCurrentPlayer[i][1] + armorCurrentPlayer[i][2] + armorCurrentPlayer[i][3] == typeShip)
                returnCount++;
        }
        System.out.printf("Уже расставлено %d-палубных кораблей | %d\n", typeShip, returnCount);
        return returnCount;
    }

    // закраска и блокирование угловых ячеек
    private void setColorTabooCellsAroundShip() {
        for (int i = -1; i != 3 && i < 4; i += 2) {
            for (int j = -1; j != 3 && j < 4; j += 2) {
                if (checkInsideArray(x + i, y + j)) {
                    buttonsCurrentPlayer[x + i][y + j].setDisable(true);
                    buttonsCurrentPlayer[x + i][y + j].setStyle("-fx-background-color: #0093c4");
                }
            }
        }
    }

    // разблокировка ячеек после расстановки перед началом игры
    private void setDisableFalseToButtons() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                buttonsCurrentPlayer[x][y].setDisable(false);
                buttonsCurrentPlayer[x][y].setStyle("-fx-background-color: #eeeeee");
                buttonsCurrentPlayer[x][y].setTextFill(Color.web("#eeeeee"));
                if (buttonsCurrentPlayer[x][y].getText().equals("~"))
                    buttonsCurrentPlayer[x][y].setText("");
            }
        }
    }

    // стрельба корабля
    private void shootingShip() {
        if (currentPressedBtn.getText().equals("+")) { // попадание
            printStatusGame("Ранен! Стреляйте еще раз...");
            currentPressedBtn.setTextFill(Color.web("#fafafa"));
            currentPressedBtn.setStyle("-fx-background-color: #af4448;");
            currentPressedBtn.setDisable(true);
            countCellsCurrentPlayer--;
            // проверка вокруг корабля
            listButtonsKilledShipsCurrentPlayer.add(currentPressedBtn);
            if (!isAroundNotKilledShips()) {
                for (Button btn : listButtonsKilledShipsCurrentPlayer)
                    paintAroundKilledShips(btn);
                listButtonsKilledShipsCurrentPlayer.clear();
                printStatusGame("Убит! Стреляйте еще раз...");
            }
            // если убиты все корабли
            if (countCellsCurrentPlayer == 0)
                win();
        } else { // промах
            currentPressedBtn.setStyle("-fx-background-color: #0093c4;");
            currentPressedBtn.setDisable(true);
            reversPlayer();
            printStatusGame("Промах! Сейчас стреляет " + nameCurrentPlayer + "...");
        }
    }

    // проверка ячеек вокруг раненого карабля
    private boolean isAroundNotKilledShips() {
        boolean answer = false;

        for (Button btn : listButtonsKilledShipsCurrentPlayer) {
            initXY(btn.getId());
            for (int ox = -1; ox < 2; ox++) {
                for (int oy = -1; oy < 2; oy++) {
                    if (checkInsideArray(x + ox, y + oy)) {
                        if (buttonsCurrentPlayer[x + ox][y + oy].getText().equals("+") && buttonsCurrentPlayer[x + ox][y + oy].getStyle().equals("-fx-background-color: #eeeeee"))
                            answer = true;
                    }
                }
            }
        }

        System.out.println(nameCurrentPlayer + " " + answer);
        return answer;
    }

    // закрашивание ячеек вокруг убитого карабля
    private void paintAroundKilledShips(Button btn) {
        initXY(btn.getId());
        for (int ox = -1; ox < 2; ox++) {
            for (int oy = -1; oy < 2; oy++) {
                if (checkInsideArray(x + ox, y + oy)) {
                    if (!buttonsCurrentPlayer[x + ox][y + oy].getText().equals("+")) {
                        buttonsCurrentPlayer[x + ox][y + oy].setDisable(true);
                        buttonsCurrentPlayer[x + ox][y + oy].setStyle("-fx-background-color: #0093c4");
                    }
                }
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

    // конец игры и объявление победителя игры
    private void win() {
        printStatusGame("Выиграл " + nameCurrentPlayer + "!");
        panePlayer1.setDisable(true);
        panePlayer2.setDisable(true);
        btnNewGame.setVisible(true);
        openStageWin(); // всплывающее поздравительное окно в конце игры
        paintUndetectedShips(); // отображение (закрашивание) необнаруженных кораблей после окончания игры
    }

    // всплывающее поздравительное окно в конце игры
    private void openStageWin() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../ViewStage/win.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Отличная работа, боец!");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(getClass().getResourceAsStream("../medal.png")));
            stage.show();
        } catch (Exception e) {
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
        btnReadyPlayer1.setDisable(true);

        lblPlayer2.setVisible(false);
        tfPlayer2.setVisible(true);
        tfPlayer2.setDisable(true);
        tfPlayer2.clear();
        panePlayer2.setDisable(true);
        btnReadyPlayer2.setVisible(true);
        btnReadyPlayer2.setDisable(true);

        buttonsCurrentPlayer = buttonsPlayer1;
        listCurrentAddShip.clear();

        countCellsPlayer1 = 0;
        countCellsPlayer2 = 0;
        countCellsCurrentPlayer = countCellsPlayer1;

        x = 0; y = 0;

        namePlayer1 = "Игрок 1";
        namePlayer2 = "Игрок 2";
        nameCurrentPlayer = namePlayer1;

        listButtonsKilledShipsPlayer1.clear();
        listButtonsKilledShipsPlayer2.clear();
        listButtonsKilledShipsCurrentPlayer.clear();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                armorPlayer1[i][j] = 0;
                armorPlayer2[i][j] = 0;
            }
        }
        armorCurrentPlayer = armorPlayer1;

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