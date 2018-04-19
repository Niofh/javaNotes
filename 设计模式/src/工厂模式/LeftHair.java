package 工厂模式;

/**
 * 制作左边发型
 */
public class LeftHair implements HairInterface {
    @Override
    public void draw() {
        System.out.println("制作了一个左边的发型");
    }
}
