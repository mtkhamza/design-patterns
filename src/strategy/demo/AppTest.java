package strategy.demo;

import org.junit.Assert;
import org.junit.Test;
import strategy.demo.algorithms.StrategyImpALG;
import strategy.demo.algorithms.StrategyImpMAR;

public class AppTest {

    @Test
    public void testMoroccoImp_salary_lower_than_40000() {
        IStrategy strategy = new StrategyImpMAR();
        Assert.assertEquals(5, strategy.applyIGR(30000));
    }

    @Test
    public void testMoroccoImp_salary_greater_than_120000() {
        IStrategy strategy = new StrategyImpMAR();
        Assert.assertEquals(42, strategy.applyIGR(130000));
    }

    @Test
    public void testMoroccoImp_salary_between_40000_and_120000() {
        IStrategy strategy = new StrategyImpMAR();
        Assert.assertEquals(20, strategy.applyIGR(60000));
    }


    @Test
    public void testAlgeryImp_salary_lower_than_40000() {
        IStrategy strategy = new StrategyImpALG();
        Assert.assertEquals(7, strategy.applyIGR(30000));
    }

    @Test
    public void testAlgeryImp_salary_greater_than_120000() {
        IStrategy strategy = new StrategyImpALG();
        Assert.assertEquals(44, strategy.applyIGR(130000));
    }

    @Test
    public void testAlgeryImp_salary_between_40000_and_120000() {
        IStrategy strategy = new StrategyImpALG();
        Assert.assertEquals(22, strategy.applyIGR(60000));
    }

}
