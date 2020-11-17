package strategy.demo;

import strategy.demo.algorithms.StrategyImpALG;
import strategy.demo.algorithms.StrategyImpMAR;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("MAR416513", 1000);
        employee1.setStrategy(new StrategyImpMAR());
        Employee employee2 = new Employee("MAR987654", 130000);
        employee2.setStrategy(new StrategyImpMAR());

        Employee employee3 = new Employee("ALG416513", 1000);
        employee3.setStrategy(new StrategyImpALG());
        Employee employee4 = new Employee("ALG987654", 130000);
        employee4.setStrategy(new StrategyImpALG());

        System.out.println("MAR :");
        System.out.println(employee1.getSalaireNetMensuel());
        System.out.println(employee2.getSalaireBrutMensuel());
        System.out.println("===============================");
        System.out.println("ALG :");
        System.out.println(employee3.getSalaireNetMensuel());
        System.out.println(employee4.getSalaireNetMensuel());

    }
}
