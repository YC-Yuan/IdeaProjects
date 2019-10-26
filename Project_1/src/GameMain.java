import java.io.FileNotFoundException;
import java.util.Scanner;

//游戏的主体程序

public class GameMain {

    public static void main(String[] args) throws FileNotFoundException {
        //启动游戏
        while (true) {
            //外层功能初始化
            int restart = 1;
            Scanner input = new Scanner(System.in);
            String Input;
            String[][][] Map = MapFunctions.MapReading();//从原始文件中读取地图，放入三维数组Map
            int[] result = {0, 0, 0};

            //游戏数据初始化
            int floor = 0;//出生在一楼
            int[] position = {10, 6};//初始化勇者位置
            Map[floor][position[0]][position[1]] = "B";//将勇者位置写入地图
            int[] oldPosition;
            int oldfloor;

            //创建勇者属性
            int healthPoint = 1000;
            int attackPoint = 10;
            int defencePoint = 10;
            int money = 0;
            int yellowKeyNumber = 0;
            int blueKeyNumber = 0;
            int redKeyNumber = 0;

            //游戏介绍与说明
            OrderPrint.helpPrint();
            //输出地图
            MapFunctions.mapPrint(floor, Map);
            //进入游戏循环
            while (restart == 1) {
                //部分参数可能在玩家操作后改变，先保存旧位置用于复原
                oldPosition = position.clone();
                oldfloor = floor;
                //读取玩家的操作
                Input = input.next();
                switch (Input) {
                    //输入w、s、a、d-改变勇士位置
                    case "w":
                        position[0] -= 1;
                        break;
                    case "s":
                        position[0] += 1;
                        break;
                    case "a":
                        position[1] -= 1;
                        break;
                    case "d":
                        position[1] += 1;
                        break;
                    //help，打印help文档
                    case "help":
                        OrderPrint.helpPrint();
                        break;
                    //status，输出勇者属性
                    case "status":
                        System.out.println("勇者生命值：" + healthPoint + ",攻击值：" + attackPoint + "，防御值：" + defencePoint + "，金钱：" + money + "，黄钥匙：" + yellowKeyNumber + "个，蓝钥匙：" + blueKeyNumber + "个，红钥匙：" + redKeyNumber + "个");
                        break;
                    //exit，退出游戏
                    case"exit":
                        System.out.println("退出游戏");
                        System.exit(0);
                        break;
                    //restart，回到启动游戏（设置continue种子）
                    case"restart":
                        System.out.println("重新开始游戏");
                        restart=0;
                }
                //勇者的新位置与地图发生交互，不能移动或修改属性
                switch (Map[floor][position[0]][position[1]]) {
                    case "b"://撞墙
                        position = oldPosition.clone();//勇者无法前进
                        break;
                    //遭遇各种怪物
                    case "c":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 50, 20, 1, 1);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");

                        break;
                    case "d":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 80, 30, 1, 2);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "e":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 200, 45, 15, 5);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "f":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 100, 35, 5, 3);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "F":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 200, 60, 25, 8);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "g":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 120, 70, 0, 5);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "h":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 200, 100, 5, 8);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "x":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 350, 150, 25, 20);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    case "z":
                        result = Fighting.fight(healthPoint, attackPoint, defencePoint, money, 70, 60, 50, 8);
                        healthPoint = result[0];
                        money = result[1];
                        if (result[2] == 1) {
                            System.out.println("勇者脑补发现他打不过怪物，竟然就退缩了！");
                            position = oldPosition.clone();//勇者无法前进
                        } else
                            System.out.println("勇者脑补发现他打得过怪物，勇者A了上去！");
                        break;
                    //上下楼
                    case "i":
                        floor += 1;
                        break;
                    case "j":
                        floor -= 1;
                        break;
                    //捡钥匙
                    case "r":
                        yellowKeyNumber = FunctionalItems.pickUpKey(yellowKeyNumber);
                        System.out.println("天哪！一把金灿灿的黄钥匙");
                        break;
                    case "t":
                        blueKeyNumber = FunctionalItems.pickUpKey(blueKeyNumber);
                        System.out.println("天哪！一把黑黢黢的蓝钥匙");
                        break;
                    case "v":
                        redKeyNumber = FunctionalItems.pickUpKey(redKeyNumber);
                        System.out.println("天哪！一把血淋淋的红钥匙");
                        break;
                    //捡血瓶
                    case "o":
                        healthPoint = FunctionalItems.pickUpBottle(50, healthPoint);
                        System.out.println("勇者打开瓶子喝完，血色液体让他感到血气喷涌！\n生命值+50");
                        break;
                    case "p":
                        healthPoint = FunctionalItems.pickUpBottle(100, healthPoint);
                        System.out.println("勇者打开瓶子喝完，蓝瓶的就是好喝~\n生命值+100");
                        break;
                    case "q":
                        healthPoint = FunctionalItems.pickUpBottle(250, healthPoint);
                        System.out.println("勇者打开瓶子喝完，黄黄的奇怪液体让他心潮澎盘飘飘欲仙！！\n生命值狂加250！！");
                        break;
                    //捡宝石
                    case "m":
                        attackPoint = FunctionalItems.pickUpGem(attackPoint);
                        System.out.println("勇者捡到了攻击宝石，力量涌来，胸口的彩虹纹封印若隐若现！\n攻击力+2");
                        break;
                    case "n":
                        defencePoint = FunctionalItems.pickUpGem(defencePoint);
                        System.out.println("勇者捡到了防御宝石，胸口碎大石技术更上一层楼！\n防御力+2");
                        break;
                    case "k":
                        if (money >= 20) {
                            FunctionalItems.purchaseInStore(money);
                            FunctionalItems.enhanceAbilityInStore(attackPoint);
                        } else
                            System.out.println("口袋空空的勇者被拒之门外，去打些怪赚钱吧");
                        position = oldPosition.clone();
                        break;
                    case "l":
                        if (money >= 20) {
                            FunctionalItems.purchaseInStore(money);
                            FunctionalItems.enhanceAbilityInStore(defencePoint);
                        } else
                            System.out.println("口袋空空的勇者被拒之门外，去打些怪赚钱吧");
                        position = oldPosition.clone();
                        break;
                }
                //将勇者之前的位置从地图中删除(如果是楼梯，则要恢复）
                Map[oldfloor][oldPosition[0]][oldPosition[1]] = "a";
                //将勇者改变后的位置写入地图
                Map[floor][position[0]][position[1]] = "B";

                //输出更新后的地图
                MapFunctions.mapPrint(floor, Map);

                //打印勇者的状态
                System.out.println("勇者生命值：" + healthPoint + ",攻击值：" + attackPoint + "，防御值：" + defencePoint + "，金钱：" + money + "，黄钥匙：" + yellowKeyNumber + "个，蓝钥匙：" + blueKeyNumber + "个，红钥匙：" + redKeyNumber + "个");
                //将世界的新状态写入内存

                //save,load
                //将世界的当前状态写入硬盘
                //从硬盘中找回世界

                //undo,redo
                //从内存中找回世界

                //f，计算并打印内容（基于勇者当前属性，本质上是战斗系统）
            }
        }
    }
}