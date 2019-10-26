import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//与地图相关的各种操作
class MapFunctions {
    //将文件中的地图读取并转化为数组返回
    static String[][][] MapReading() throws FileNotFoundException {
        //按行将地图信息写入数组
        String[][] MapRead = new String[5][13];
        for (int i = 0; i <= 4; i++) {
            Scanner scanner = new Scanner(new File("map/" + i + ".txt"));
            for (int j = 0; j <= 12; j++) {
                MapRead[i][j] = scanner.nextLine() + "\n";
            }
        }
        //通过切割字符串，将每行地图信息按个体写入数组
        String[][][] Map = new String[5][13][13];
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 12; j++) {
                for (int k = 0; k <= 12; k++) {
                    Map[i][j][k] = MapRead[i][j].substring(k, k + 1);
                }
            }
        }

        return Map;
    }

    //打印当前楼层的地图
    static void mapPrint(int floor, String[][][] Map) {
        for (int j = 0; j <= 12; j++) {
            for (int k = 0; k <= 12; k++) {
                switch (Map[floor][j][k]) {
                    case "a":
                        PRINT.P("\u3000", PRINT.WHITE);
                        break;
                    case "b":
                        PRINT.P("墙", PRINT.BLACK, PRINT.WHITE_BACKGROUND);
                        break;
                    case "c":
                        PRINT.P("绿", PRINT.GREEN);
                        break;
                    case "d":
                        PRINT.P("红", PRINT.RED);
                        break;
                    case "e":
                        PRINT.P("黑", PRINT.BLACK);
                        break;
                    case "f":
                        PRINT.P("蝠", PRINT.BLACK);
                        break;
                    case "F":
                        PRINT.P("大", PRINT.BLACK);
                        break;
                    case "g":
                        PRINT.P("骷", PRINT.BLACK);
                        break;
                    case "h":
                        PRINT.P("兵", PRINT.BLACK);
                        break;
                    case "i":
                        PRINT.P("上", PRINT.WHITE);
                        break;
                    case "j":
                        PRINT.P("下", PRINT.WHITE);
                        break;
                    case "k":
                        PRINT.P("商", PRINT.RED);
                        break;
                    case "l":
                        PRINT.P("商", PRINT.BLUE);
                        break;
                    case "m":
                        PRINT.P("攻", PRINT.RED);
                        break;
                    case "n":
                        PRINT.P("防", PRINT.BLUE);
                        break;
                    case "o":
                        PRINT.P("瓶", PRINT.RED);
                        break;
                    case "p":
                        PRINT.P("瓶", PRINT.BLUE);
                        break;
                    case "q":
                        PRINT.P("瓶", PRINT.YELLOW);
                        break;
                    case "r":
                        PRINT.P("钥", PRINT.YELLOW);
                        break;
                    case "s":
                        PRINT.P("门", PRINT.YELLOW);
                        break;
                    case "t":
                        PRINT.P("钥", PRINT.BLUE);
                        break;
                    case "u":
                        PRINT.P("门", PRINT.BLUE);
                        break;
                    case "v":
                        PRINT.P("钥", PRINT.RED);
                        break;
                    case "w":
                        PRINT.P("门", PRINT.RED);
                        break;
                    case "x":
                        PRINT.P("魔", PRINT.BLACK);
                        break;
                    case "y":
                        PRINT.P("宝", PRINT.WHITE);
                        break;
                    case "z":
                        PRINT.P("石", PRINT.BLACK);
                        break;
                    case "B":
                        PRINT.P("勇", PRINT.RED);

                }
            }
            System.out.println();
        }
    }
}