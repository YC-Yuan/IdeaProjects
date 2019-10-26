class Fighting {

    //与怪物战斗
    static int[] fight(int health, int attack, int defence, int money,int heal,int atk,int def,int mon) {
        int[] result = new int[3];
        final int healthPoint=health;
        result[2] = 0;

        money += mon;
        System.out.println("勇者脑补起了战斗场面");
        while (heal > 0) {
            System.out.println("勇者和怪物相互攻击！");
            health = health - (atk - defence);
            heal = heal - (attack - def);
            System.out.println("勇者还剩"+health+"血，怪物还剩"+heal+"血");
            if(health<=0){//勇者打不过！
                money-=mon;
                health=healthPoint;
                result[2]=1;//勇者把梦到的失败结局告诉自己
            }
        }

        result[0] = health;
        result[1] = money;

        System.out.println("胜负已分！");
        return result;
    }
}