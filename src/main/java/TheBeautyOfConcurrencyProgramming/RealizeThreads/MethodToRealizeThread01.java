package TheBeautyOfConcurrencyProgramming.RealizeThreads;

/**
 * Created by sumengzhang on 18/8/20 1:21 AM
 * 1. 继承Thread类，重写run方法
 * 2. 创建线程实例，调用start方法去启动线程
 * 3. Start 之后线程进入就绪状态，这时候该线程拿到了除了CPU资源之外的其他资源，一旦它得到CPU资源那就进入运行状态
 * 4. 运行完毕就进入终止状态
 *
 * 使用继承Thread创建线程
 * pros： 在run()中直接使用this获取当前线程，无需Thread.currentThread()
 * cons: Java 不支持多继承，只有多实现
 */
public class MethodToRealizeThread01 extends Thread {
    @Override
    public void run() {
        System.out.println("This is a child thread");
    }

    public static void main(String[] args) {
        MethodToRealizeThread01 methodToRealizeThread01 = new MethodToRealizeThread01();
        methodToRealizeThread01.start();
    }
}
