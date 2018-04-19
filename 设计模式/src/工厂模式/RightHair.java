package 工厂模式;

/**
 * 制作右边发型
 */
public class RightHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("制作了一个右边的发型");
    }
}
