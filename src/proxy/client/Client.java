package proxy.client;

import proxy.service.IService;

public class Client{
    private IService service;

    public double calculer(double x){
        double res = service.compute(x);
        double r = res + 123;
        return r;
    }

    public IService getService() {
        return service;
    }

    public void setService(IService service) {
        this.service = service;
    }
}


