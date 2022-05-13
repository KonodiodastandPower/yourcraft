package xpackage.weapons;

public class ExampleWeapon extends Weapon{
    /**
     * 这是一个例子
     */
    private String name = "剑";//武器的名称
    private Double damage = 10.0;//武器的攻击伤害
    private Integer endurance = 50;//武器的耐久度
    private Integer critical_sr = 0;//暴击率（百分制） 如：暴击率为30%则输入30 暴击指理论伤害提高两倍
    private Boolean armor_breaking = true;//是否能无视防御
    private Boolean shield_breaking = false;//是否能破盾
    private Integer cold_down = 0;//冷却时间（几回合）（如：如果是0那么每回合都能使用，是1的话那么使用后得隔一回合再使用）
    private Integer left_turn;//剩余多少回合才能继续使用
    private Boolean isBreak = false;//如果为true则该武器已经破坏 破坏了的武器无法造成伤害
    private Boolean canBreak = true;//武器能否损坏 false则为无法损坏
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
    public Boolean GETisBreak(){
        return this.isBreak;
    }
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
    public void SETisBreak(Boolean boo){
        this.isBreak = boo;
    }
    public void SETcanBreak(Boolean boo){
        this.canBreak = boo;
    }
}
