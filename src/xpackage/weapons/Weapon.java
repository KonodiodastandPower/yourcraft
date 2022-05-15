package xpackage.weapons;

import java.util.Random;

public class Weapon {
/**
 * 这是武器的基础类
 * 所有的武器都应当继承该类
 * 将该类实例化也可以作为一个基础的武器
 * 已取得阶段性成功
 */
    private String name;//武器的名称
    private Double damage;//武器的攻击伤害
    private Integer endurance;//武器的耐久度
    private Integer critical_sr;//暴击率（百分制） 如：暴击率为30%则输入30 暴击指理论伤害提高两倍
    private Boolean armor_breaking;//是否能无视防御
    private Boolean shield_breaking;//是否能破盾
    private Integer cold_down;//冷却时间（几回合）（如：如果是0那么每回合都能使用，是1的话那么使用后得隔一回合再使用）
    private Integer left_turn;//剩余多少回合才能继续使用
//    private Boolean isBreak;//如果为true则该武器已经破坏 破坏了的武器无法造成伤害
    private Boolean canBreak;//武器能否损坏 false则为无法损坏
    public Random random = new Random();
    public Weapon(){//构造方法（初始化）
        SETleft_turn(0);;
    }
    public Double Attack(Double HP/**被攻击者的剩余生命 */,Double DEF/**被攻击者的防御力 */){//返回造成的伤害后剩余的生命值
        if(GETarmor_breaking()){//如果破甲则执行
            DEF = 0.0;
        }
        Double final_damage = (GETendurance() == 0)?0.0:(GETdamage() + (random.nextInt(21)-10))/**这一部分为伤害浮动 ±10 */;//最终的理论伤害
        Double hp = HP;
        if(final_damage < 0){//防止伤害小于0
            final_damage = 0.0;
        }
        if(Choose(GETcritical_sr())){//判断是否暴击
            final_damage = final_damage * 2;
        }
        Double damage_hp = Math.max(final_damage-DEF,0);//计算最终剩余生命值
        hp = hp - damage_hp;
        if(hp < 0){//防止生命值小于0
            hp = 0.0;
        }
        if(GETendurance() > 0) {
        	SETendurance(GETendurance()-1);//将武器的耐久度减少1
        }
        return hp;
    }
    public void Before_Attack(){
        /**
         * 攻击前要做的事
         */
    }
    public void After_Attack(){
        /**
         * 攻击后要做的事
         */
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
    /**
     * 以下是获取该类属性的方法
     */
    public String GETname(){
        return name;
    }
    public Double GETdamage(){
        return this.damage;
    }
    public Integer GETendurance(){
        return this.endurance;
    }
    public Integer GETcritical_sr(){
        return critical_sr;
    }
    public Boolean GETarmor_breaking(){
        return this.armor_breaking;
    }
    public Boolean GETshield_breaking(){
        return this.shield_breaking;
    }
    public Integer GETcold_down(){
        return this.cold_down;
    }
    public Integer GETleft_turn(){
        return this.left_turn;
    }
//    public Boolean GETisBreak(){
//        return this.isBreak;
//    }
    public Boolean GETcanBreak(){
        return this.canBreak;
    }
    /**
     * 以下是设置属性的
     */
    public void SETname(String string){
        this.name = string;
    }
    public void SETdamage(Double dou){
        this.damage = dou;
    }
    public void SETendurance(Integer integer){
        this.endurance = integer;
    }
    public void SETcritical_sr(Integer integer){
        this.critical_sr = integer;
    }
    public void SETarmor_breaking(Boolean boo){
        this.armor_breaking = boo;
    }
    public void SETshield_breaking(Boolean boo){
        this.shield_breaking = boo;
    }
    public void SETcold_down(Integer integer){
        this.cold_down = integer;
    }
    public void SETleft_turn(Integer integer){
        this.left_turn = integer;
    }
//    public void SETisBreak(Boolean boo){
//        this.isBreak = boo;
//    }
    public void SETcanBreak(Boolean boo){
        this.canBreak = boo;
    }
}
