package xpackage.weapons;

import java.util.Random;

public class Weapon {
/**
 * 这是武器的基础类
 * 所有的武器都应当继承该类
 * 将该类实例化也可以作为一个基础的武器
 */
    public Double damage;//武器的攻击伤害
    public Integer endurance;//武器的耐久度 你可以学习mc将无法破坏的武器耐久设为负数
    public Integer critical_sr;//暴击率（百分制） 如：暴击率为30%则输入30 暴击指理论伤害提高两倍
    public Boolean armor_breaking;//是否能无视防御
    public Boolean shield_breaking;//是否能破盾
    public Integer cold_down;//冷却时间（几回合）（如：如果是0那么每回合都能使用，是1的话那么使用后得隔一回合再使用）
    public Integer left_turn;//剩余多少回合才能继续使用
    public Boolean isBreak;//如果为true则该武器已经破坏 破坏了的武器无法造成伤害
    public Random random = new Random();
    public Weapon(){//构造方法（初始化）
        left_turn = 0;
    }
    public Double Attack(Double HP/**被攻击者的剩余生命 */,Double DEF/**被攻击者的防御力 */){//返回造成的伤害后剩余的生命值
        Double final_damage = damage + (random.nextInt(21)-10)/**这一部分为伤害浮动 ±10 */;//最终的理论伤害
        Double hp = HP;
        if(final_damage < 0){//防止伤害小于0
            final_damage = 0.0;
        }
        if(Choose(critical_sr)){//判断是否暴击
            final_damage = final_damage * 2;
        }
        Double damage_hp = this.isBreak?0:Math.max(final_damage-DEF,0);//计算最终剩余生命值
        hp = hp - damage_hp;
        if(hp < 0){//防止生命值小于0
            hp = 0.0;
        }
        this.endurance--;//将武器的耐久度减少1
        return hp;
    }
    public void Begin_Turn(){
        /**
         * 回合开始时要做的事情
         */
    }
    public void End_Turn(){
        /**
         * 回合结束时要做的事情
         */
    }
    public Boolean Choose(Integer chance/**几率 */){//输入几率，有该几率的可能性返回true
        Integer randomnum = random.nextInt(100) + 1;
        if(randomnum <= chance){
            return true;
        }else{
            return false;
        }
    }
}
