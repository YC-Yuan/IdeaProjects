import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MapReading {
    public static String[][][] MapReading(String[] args) throws FileNotFoundException {
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
        /*测试地图读取效果
        for (int i = 0; i <= 4; i++) {
            System.out.println("第" + i + "层地图为：");
            for (int j = 0; j <= 12; j++) {
                for (int k = 0; k <= 12; k++) {
                    System.out.print(Map[i][j][k]);
                }
                System.out.println();
            }
        }
         */
        return Map;
    }
}