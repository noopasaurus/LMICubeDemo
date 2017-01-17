package com.example.david.rubikscubedemo;

/**
 * Created by David on 8/18/2016.
 */
public class RubiksCube {
    int[][] cube;

    // WHITE - 1
    // GREEN - 2
    // BLUE - 3
    // YELLOW - 4
    // RED - 5
    // ORANGE - 6

    public RubiksCube() {
        cube = new int[7][10];
        for(int i = 1; i < 7; i ++) {
            for(int j = 1; j < 10; j++) {
                cube[i][j] = i;
            }
        }
    }

    public String getCube() {
        String returnString = "";

        for(int i = 1; i < 7; i++) {
            for(int j = 1; j < 10; j ++) {
                returnString+= ""+cube[i][j];

            }

        }

        return returnString;
    }

    public int getCube(int face, int piece) {
        return cube[face][piece];
    }


    public String Turn(int direction) {
        String turn;
        int[] temp = new int[4];
        int temp2;
        switch (direction) {
            case 1: turn = "R";
                temp[1] = cube[1][3];
                temp[2] = cube[1][6];
                temp[3] = cube[1][9];
                cube[1][3] = cube[3][3];
                cube[1][6] = cube[3][6];
                cube[1][9] = cube[3][9];
                cube[3][3] = cube[4][3];
                cube[3][6] = cube[4][6];
                cube[3][9] = cube[4][9];
                cube[4][3] = cube[2][3];
                cube[4][6] = cube[2][6];
                cube[4][9] = cube[2][9];
                cube[2][3] = temp[1];
                cube[2][6] = temp[2];
                cube[2][9] = temp[3];

                temp2 = cube[6][1];
                cube[6][1] = cube[6][7];
                cube[6][7] = cube[6][9];
                cube[6][9] = cube[6][3];
                cube[6][3] = temp2;

                temp2 = cube[6][2];
                cube[6][2] = cube[6][4];
                cube[6][4] = cube[6][8];
                cube[6][8] = cube[6][6];
                cube[6][6] = temp2;

                    break;
            case 2: turn = "R'";
                Turn(1);
                Turn(1);
                Turn(1);
                    break;
            case 3: turn = "L";
                Turn(4);
                Turn(4);
                Turn(4);
                    break;
            case 4: turn = "L'";
                temp[1] = cube[1][1];
                temp[2] = cube[1][4];
                temp[3] = cube[1][7];
                cube[1][1] = cube[3][1];
                cube[1][4] = cube[3][4];
                cube[1][7] = cube[3][7];
                cube[3][1] = cube[4][1];
                cube[3][4] = cube[4][4];
                cube[3][7] = cube[4][7];
                cube[4][1] = cube[2][1];
                cube[4][4] = cube[2][4];
                cube[4][7] = cube[2][7];
                cube[2][1] = temp[1];
                cube[2][4] = temp[2];
                cube[2][7] = temp[3];

                temp2 = cube[5][1];
                cube[5][1] = cube[5][3];
                cube[5][3] = cube[5][9];
                cube[5][9] = cube[5][7];
                cube[5][7] = temp2;

                temp2 = cube[5][2];
                cube[5][2] = cube[5][6];
                cube[5][6] = cube[5][8];
                cube[5][8] = cube[5][4];
                cube[5][4] = temp2;

                    break;
            case 5: turn = "U";
                temp[1] = cube[1][1];
                temp[2] = cube[1][2];
                temp[3] = cube[1][3];
                cube[1][1] = cube[6][1];
                cube[1][2] = cube[6][2];
                cube[1][3] = cube[6][3];
                cube[6][1] = cube[4][9];
                cube[6][2] = cube[4][8];
                cube[6][3] = cube[4][7];
                cube[4][9] = cube[5][1];
                cube[4][8] = cube[5][2];
                cube[4][7] = cube[5][3];
                cube[5][1] = temp[1];
                cube[5][2] = temp[2];
                cube[5][3] = temp[3];

                temp2 = cube[2][1];
                cube[2][1] = cube[2][7];
                cube[2][7] = cube[2][9];
                cube[2][9] = cube[2][3];
                cube[2][3] = temp2;

                temp2 = cube[2][2];
                cube[2][2] = cube[2][4];
                cube[2][4] = cube[2][8];
                cube[2][8] = cube[2][6];
                cube[2][6] = temp2;

                    break;
            case 6: turn = "U'";
                Turn(5);
                Turn(5);
                Turn(5);
                    break;
            case 7: turn = "F";
                temp[1] = cube[2][7];
                temp[2] = cube[2][8];
                temp[3] = cube[2][9];
                cube[2][7] = cube[5][9];
                cube[2][8] = cube[5][6];
                cube[2][9] = cube[5][3];
                cube[5][9] = cube[3][3];
                cube[5][6] = cube[3][2];
                cube[5][3] = cube[3][1];
                cube[3][3] = cube[6][1];
                cube[3][2] = cube[6][4];
                cube[3][1] = cube[6][7];
                cube[6][1] = temp[1];
                cube[6][4] = temp[2];
                cube[6][7] = temp[3];

                temp2 = cube[1][1];
                cube[1][1] = cube[1][7];
                cube[1][7] = cube[1][9];
                cube[1][9] = cube[1][3];
                cube[1][3] = temp2;

                temp2 = cube[1][2];
                cube[1][2] = cube[1][4];
                cube[1][4] = cube[1][8];
                cube[1][8] = cube[1][6];
                cube[1][6] = temp2;

                    break;
            case 8: turn = "F'";
                Turn(7);
                Turn(7);
                Turn(7);
                    break;
            case 9: turn = "D";
                temp[1] = cube[1][7];
                temp[2] = cube[1][8];
                temp[3] = cube[1][9];
                cube[1][7] = cube[5][7];
                cube[1][8] = cube[5][8];
                cube[1][9] = cube[5][9];
                cube[5][7] = cube[4][3];
                cube[5][8] = cube[4][2];
                cube[5][9] = cube[4][1];
                cube[4][3] = cube[6][7];
                cube[4][2] = cube[6][8];
                cube[4][1] = cube[6][9];
                cube[6][7] = temp[1];
                cube[6][8] = temp[2];
                cube[6][9] = temp[3];

                temp2 = cube[6][1];
                cube[3][1] = cube[3][7];
                cube[3][7] = cube[3][9];
                cube[3][9] = cube[3][3];
                cube[3][3] = temp2;

                temp2 = cube[3][2];
                cube[3][2] = cube[3][4];
                cube[3][4] = cube[3][8];
                cube[3][8] = cube[3][6];
                cube[3][6] = temp2;

                    break;
            case 10: turn = "D'";
                Turn(9);
                Turn(9);
                Turn(9);
                    break;
            case 11: turn = "B";
                temp[1] = cube[2][1];
                temp[2] = cube[2][2];
                temp[3] = cube[2][3];
                cube[2][1] = cube[6][3];
                cube[2][2] = cube[6][6];
                cube[2][3] = cube[6][9];
                cube[6][3] = cube[3][9];
                cube[6][6] = cube[3][8];
                cube[6][9] = cube[3][7];
                cube[3][9] = cube[5][7];
                cube[3][8] = cube[5][4];
                cube[3][7] = cube[5][1];
                cube[5][7] = temp[1];
                cube[5][4] = temp[2];
                cube[5][1] = temp[3];

                temp2 = cube[4][1];
                cube[4][1] = cube[6][7];
                cube[4][7] = cube[6][9];
                cube[4][9] = cube[6][3];
                cube[4][3] = temp2;

                temp2 = cube[4][2];
                cube[4][2] = cube[4][4];
                cube[4][4] = cube[4][8];
                cube[4][8] = cube[4][6];
                cube[4][6] = temp2;

                    break;
            case 12: turn = "B'";
                Turn(11);
                Turn(11);
                Turn(11);
                    break;
            default: turn = "Invalid";
                    break;


        }

        return getCube();
    }




}
