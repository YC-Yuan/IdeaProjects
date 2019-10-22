import java.io.FileNotFoundException;
import java.util.Map;

public class MapPrint {
    private static Object String;

    public static void main(String[] args) throws FileNotFoundException {
        String[][][] MapOut = new String[5][13][13];
        String[][][] Map = MapReading.MapReading((java.lang.String[]) String);

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 12; j++) {
                for (int k = 0; k <= 12; k++) {
                    switch (Map[i][j][k]) {
                        case "a":
                            MapOut[i][j][k] = "空";
                            break;
                        case "b":
                            MapOut[i][j][k] = "墙";
                            break;
                        case "c":
                            MapOut[i][j][k] = "绿";
                            break;
                        case "d":
                            MapOut[i][j][k] = "红";
                            break;
                        case "e":
                            MapOut[i][j][k] = "黑";
                            break;
                        case "f":
                            MapOut[i][j][k] = "蝙";
                            break;
                        case "F":
                            MapOut[i][j][k] = "大";
                            break;
                        case "g":
                            MapOut[i][j][k] = "骷";
                            break;
                        case "h":
                            MapOut[i][j][k] = "兵";
                            break;
                        case "i":
                            MapOut[i][j][k] = "上";
                            break;
                        case "j":
                            MapOut[i][j][k] = "下";
                            break;
                        case "k":
                            MapOut[i][j][k] = "商";
                            break;
                        case "l":
                            MapOut[i][j][k] = "商";
                            break;
                        case "m":
                            MapOut[i][j][k] = "攻";
                            break;
                        case "n":
                            MapOut[i][j][k] = "防";
                            break;
                        case "o":
                            MapOut[i][j][k] = "瓶";
                            break;
                        case "p":
                            MapOut[i][j][k] = "瓶";
                            break;
                        case "q":
                            MapOut[i][j][k] = "瓶";
                            break;
                        case "r":
                            MapOut[i][j][k] = "钥";
                            break;
                        case "s":
                            MapOut[i][j][k] = "门";
                            break;
                        case "t":
                            MapOut[i][j][k] = "钥";
                            break;
                        case "u":
                            MapOut[i][j][k] = "门";
                            break;
                        case "v":
                            MapOut[i][j][k] = "钥";
                            break;
                        case "w":
                            MapOut[i][j][k] = "门";
                            break;
                        case "x":
                            MapOut[i][j][k] = "魔";
                            break;
                        case "y":
                            MapOut[i][j][k] = "宝";
                            break;
                        case "z":
                            MapOut[i][j][k] = "石";
                            break;
                    }
                }
            }
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("第" + i + "层地图为：");
            for (int j = 0; j <= 12; j++) {
                for (int k = 0; k <= 12; k++) {
                    System.out.printf(MapOut[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}