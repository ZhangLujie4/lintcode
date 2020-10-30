package JVM;

/**
 * @author zhanglujie
 * @since 2020-10-12 15:45
 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        System.out.println("ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader());
        System.out.println("The Parent of ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader().getParent());
        System.out.println("The GrandParent of ClassLodarDemo's ClassLoader is " + ClassLoaderDemo.class.getClassLoader().getParent().getParent());
    }
}

/**
 * AppClassLoader的父类加载器是ExtClassLoader, ExtClassLoader的父类加载器是null
 * (null代表的就是BootstrapClassLoader)
 * 类加载器之间的“父子”关系也不是通过继承来体现的，是由“优先级”来决定
 * @see java.lang.ClassLoader #401
 */