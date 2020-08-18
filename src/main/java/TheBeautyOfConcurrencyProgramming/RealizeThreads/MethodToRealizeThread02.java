package TheBeautyOfConcurrencyProgramming.RealizeThreads;

/**
 * Created by sumengzhang on 18/8/20 1:28 AM
 *
 * 1. 实现Runnable 接口
 *
 * cons: 没有返回值
 */
public class MethodToRealizeThread02 implements Runnable {
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("this is a child thread and its name is thread"+this.getName());
    }

    public static void main(String[] args) throws InterruptedException {
        MethodToRealizeThread02 methodToRealizeThread02 = new MethodToRealizeThread02();
        methodToRealizeThread02.setName("01");
        new Thread(methodToRealizeThread02).start();
        // 为什么会出现两个都是02呢？？？因为第一个线程还没有启动，就已经被赋予02了
        methodToRealizeThread02.setName("02");
        new Thread(methodToRealizeThread02).start();
    }
}
