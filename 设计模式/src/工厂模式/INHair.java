package 工厂模式;

/**
 * 制作中间的发型
 */
public class INHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("制作了一个中间的发型");
    }
}
