package proxy.service;

public class ServiceImpl implements IService {
    @Override
    public double compute(double x) {
        double res = x * 12;
        return res;
    }
}



