/**
 * @Author: tgede46 gedeonkpara@gmail.com
 * @Date: 2024-12-23 20:01:18
 * @LastEditors: tgede46 gedeonkpara@gmail.com
 * @LastEditTime: 2024-12-23 23:40:48
 * @FilePath: src/main/java/gedon/net/Personnage.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package gedon.net;

public abstract class Personnage {
    protected String nom;
    protected int pointDeVie, force;
    public Personnage(String n, int f){
        this.nom = n;
        this.force = f;
        this.pointDeVie =100;
    }
    public void mange(){
        if (this.pointDeVie< 100){
            this.pointDeVie ++;
        }
    }
    public abstract void rencontre(Personnage p);
}
