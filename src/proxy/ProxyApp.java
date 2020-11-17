package proxy;

import proxy.ProxyService.Proxy;
import proxy.client.Client;
import proxy.service.ServiceImpl;

public class ProxyApp {
    public static void main(String[] args) {
        Client client = new Client();
        client.setService(new ServiceImpl());
        System.out.print("- Without proxy :");
        System.out.println(client.calculer(9));
        System.out.println("#########################");
        client.setService(new Proxy());
        System.out.println("- With proxy :");
        System.out.println(client.calculer(9));


    }
}
