package AdapterDemo.Adapter;

import AdapterDemo.Stategy.IStrategy;

public class Adapter extends ImplNonStandard implements IStrategy {
    @Override
    public int[] traiter(int[] image) {
        System.out.println("## Adapter working with the old implementation");
        int[][] image2 = new int[25][25];
        traiter(image2);
        return new int[0];
    }

}
