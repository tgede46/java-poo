/**
 * @Author: tgede46 gedeonkpara@gmail.com
 * @Date: 2024-12-23 20:51:07
 * @LastEditors: tgede46 gedeonkpara@gmail.com
 * @LastEditTime: 2024-12-23 23:38:02
 * @FilePath: src/main/java/gedon/net/Lumineux.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package gedon.net;

public class Lumineux extends Personnage{
    public Lumineux(String n, int f){
        super(n, f);
    }
    @Override
    public void rencontre(Personnage p){
        if (this.force > p.force) {
            System.out.println("Lumineux a gagné");
        } else {
            System.out.println("Obscur a gagné");
        }
    }
    
 }


 