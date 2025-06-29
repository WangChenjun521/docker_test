package cn.wcj.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.*;
import java.util.Enumeration;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/helloworld")
    public String printHelloWorld() {
        return "Hello World";
    }

    public void getIP() throws UnknownHostException, SocketException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local HostAddress: " + addr.getHostAddress());
        String hostname = addr.getHostName();
        System.out.println("Local host name: " + hostname);

        //get all local ips
        Enumeration<NetworkInterface> interfs = NetworkInterface.getNetworkInterfaces();
        while (interfs.hasMoreElements())
        {
            NetworkInterface interf = interfs.nextElement();
            Enumeration<InetAddress> addres = interf.getInetAddresses();
            while (addres.hasMoreElements())
            {
                InetAddress in = addres.nextElement();
                if (in instanceof Inet4Address)
                {
                    System.out.println("v4:" + in.getHostAddress());
                }
                else if (in instanceof Inet6Address)
                {
                    System.out.println("v6:" + in.getHostAddress());
                }
            }
        }
    }
}
