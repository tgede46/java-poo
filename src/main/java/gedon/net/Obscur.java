/**
 * @Author: tgede46 gedeonkpara@gmail.com
 * @Date: 2024-12-23 20:11:46
 * @LastEditors: tgede46 gedeonkpara@gmail.com
 * @LastEditTime: 2024-12-23 23:43:34
 * @FilePath: src/main/java/gedon/net/Obscur.java
 * @Description: 这是默认设置, 可以在设置》工具》File Description中进行配置
 */
package gedon.net;

//definition de la class obscure qui est la classe fille de Personnage
public class Obscur  extends  Personnage {
    public Obscur(String n, int f) {
        super(n, f);

    }

    @Override
    public void rencontre(Personnage p) {
        if (this.force > p.force) {
            System.out.println("Obscur a gagné");
            
        } else {
            System.out.println("Lumineux a gagné");
        }
    }
}