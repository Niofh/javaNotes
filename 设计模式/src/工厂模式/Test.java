package 工厂模式;

public class Test {
    public static void main(String[] args) {
        HairFactory hairFactory = new HairFactory();
        HairInterface left = hairFactory.getClassHair("工厂模式.LeftHair");
        left.draw();

        // 上面方法简写,那样所以className都可以在hair.properties文件里配置
        HairInterface left1 = hairFactory.getClassKeyHair("left");
        HairInterface right = hairFactory.getClassKeyHair("right");
        HairInterface in = hairFactory.getClassKeyHair("in");
        left1.draw();
        right.draw();
        in.draw();
    }
}
