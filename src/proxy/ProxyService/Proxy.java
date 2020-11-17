package proxy.ProxyService;

import proxy.service.IService;
import proxy.service.ServiceImpl;

public class Proxy implements IService {
    private ServiceImpl service;

    @Override
    public double compute(double x) {
        if (service == null) service = new ServiceImpl(); // Lazy Instanciation
        System.out.println("--- Do treatments before the operation ---");
        System.out.println("--- Verification phase ---");
        System.out.println("--- Security Check ---");
        double res = service.compute(x);
        System.out.println("--- Check the result and do treatments after the operation ---");
        return res;
    }
}


