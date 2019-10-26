public class Setup {
    //这个类用于各种属性设置（废弃）
    public static void setupAll() {
        Monster c = new Monster("绿史莱姆", "绿", "GREEN", 50, 20, 1, 1);
        Monster d = new Monster("红史莱姆", "红", "RED", 80, 30, 1, 2);
        Monster e = new Monster("黑史莱姆", "黑", "BLACK", 200, 45, 15, 5);
        Monster f = new Monster("蝙蝠", "蝙", "BLACK", 100, 35, 5, 3);
        Monster F = new Monster("大蝙蝠", "大", "BLACK", 200, 60, 25, 8);
        Monster g = new Monster("骷髅人", "骷", "BLACK", 120, 70, 0, 5);
        Monster h = new Monster("骷髅士兵", "兵", "BLACK", 200, 100, 5, 8);
        Monster x = new Monster("魔王", "魔", "BLACK", 350, 150, 25, 20);
        Monster z = new Monster("石头人", "石", "BLACK", 70, 60, 50, 8);

        Block a = new Block("空地", "", "");
        Block b = new Block("墙壁", "墙", "BLACK");
        Block s = new Block("黄门", "门", "YELLOW");
        Block u = new Block("蓝门", "门", "BLUE");
        Block w = new Block("红门", "门", "RED");

        Item k = new Item("攻击商店", "商", "RED", "attack", "money", 3, 20);
        Item l = new Item("防御商店", "商", "BLUE", "defence", "money", 3, 20);
        Item m = new Item("攻击宝石", "攻", "RED", "attack", "", 2, 0);
        Item n = new Item("防御宝石", "防", "BLUE", "defence", "", 2, 0);
        Item o = new Item("小血瓶", "瓶", "RED", "health", "", 50, 0);
        Item p = new Item("中血瓶", "瓶", "BLUE", "health", "", 100, 0);
        Item q = new Item("大血瓶", "瓶", "YELLOW", "health", "", 250, 0);
        Item r = new Item("黄钥匙", "钥", "YELLOW", "yellowKey", "", 1, 0);
        Item t = new Item("蓝钥匙", "钥", "BLUE", "blueKey", "", 1, 0);
        Item v = new Item("红钥匙", "钥", "RED", "redKey", "", 1, 0);

        Brave B = new Brave();
    }

    //创建怪物类（可阻值勇者前进或被消灭并改变勇者属性）
    public static class Monster {
        private String monsterName;
        private String name;
        private String colour;
        private int health;
        private int attack;
        private int defence;
        private int money;

        public Monster(String N, String n, String col, int hp, int atk, int def, int mon) {
            monsterName = N;
            name = n;
            colour = col;
            health = hp;
            attack = atk;
            defence = def;
            money = mon;
        }
    }


    //创建地图块类（可阻值勇者前进）
    public static class Block {
        private String blockName;
        private String name;
        private String colour;

        public Block(String N, String n, String col) {
            blockName = N;
            name = n;
            colour = col;
        }
    }

    //创建物品类（可拾取并改变勇者属性）
    public static class Item {
        private String itemName;
        private String name;
        private String colour;
        private String propertyUp;
        private String propertyDown;
        private int up;
        private int down;

        public Item(String N, String n, String col, String pU, String pD, int u, int d) {
            itemName = N;
            name = n;
            colour = col;
            propertyUp = pU;
            propertyDown = pD;
            up = u;
            down = d;
        }
    }

    public static class Brave {
        //勇士的属性
        private int health;
        private int attack;
        private int defence;
        private int money;
        private int yellowKeyNumber;
        private int blueKeyNumber;
        private int redKeyNumber;
        //勇士的位置
        private int floor;
        private int row;
        private int col;

        //初始化勇者的方法
        public Brave(){
            health=1000;
            attack=10;
            defence=10;
            money=0;
            yellowKeyNumber=0;
            blueKeyNumber=0;
            redKeyNumber=0;
            floor=0;
            row=10;
            col=6;
        }
    }
}
