//package proxyDong;
//
//import com.spring.proxy.Calculator;
//import com.spring.proxy.CalculatorImpl;
//
//public class CalculatorStaticProxy implements Calculator {
//
//    private CalculatorImpl calculatorImpl;
//
//    public CalculatorStaticProxy(CalculatorImpl calculatorImpl) {
//        this.calculatorImpl = calculatorImpl;
//    }
//
//    @Override
//    public int add(int i, int j) {
//        System.out.println("[日志] add 方法开始了，参数是：" + i + "," + j);
//        int result = calculatorImpl.add(i, j);
//        System.out.println("[日志] add 方法结束了，结果是：" + result);
//
//        return result;
//    }
//
//    @Override
//    public int sub(int i, int j) {
//        System.out.println("[日志] sub 方法开始了，参数是：" + i + "," + j);
//        int result = calculatorImpl.sub(i, j);
//        System.out.println("[日志] sub 方法结束了，结果是：" + result);
//
//        return result;
//    }
//
//    @Override
//    public int mul(int i, int j) {
//        System.out.println("[日志] mul 方法开始了，参数是：" + i + "," + j);
//        int result = calculatorImpl.mul(i, j);
//        System.out.println("[日志] mul 方法结束了，结果是：" + result);
//
//        return result;
//    }
//
//    @Override
//    public int div(int i, int j) {
//        System.out.println("[日志] div 方法开始了，参数是：" + i + "," + j);
//        int result = calculatorImpl.div(i, j);
//        System.out.println("[日志] div 方法结束了，结果是：" + result);
//
//        return result;
//    }
//}
