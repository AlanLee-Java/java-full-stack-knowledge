package alanlee.innerclass;

public class Enclosingone {

    public class Insideone {

    }

    public static class Insidetwo {

    }

    public static void main(String[] args) {
        // 构造内部类对象需要外部类的引用
        Enclosingone.Insideone obj1 = new Enclosingone().new Insideone();
        // 构造静态内部类的对象
        Enclosingone.Insidetwo obj2 = new Enclosingone.Insidetwo();
    }

}