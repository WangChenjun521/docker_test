package cn.wcj.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.*;
import java.util.Enumeration;

@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("hello")
    public String printHelloWorld() throws SocketException, UnknownHostException {
        return "Hello World";
    }

    public String getIP() throws UnknownHostException, SocketException {
        String ips="";
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("Local HostAddress: " + addr.getHostAddress());
        ips+="Local HostAddress: " + addr.getHostAddress()+"\n";
        String hostname = addr.getHostName();
        System.out.println("Local host name: " + hostname);
        ips+="Local host name: " + hostname+"\n";
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
                    ips+="v4:" + in.getHostAddress()+"\n";
                }
                else if (in instanceof Inet6Address)
                {
                    System.out.println("v6:" + in.getHostAddress());
                    ips+="v6:" + in.getHostAddress()+"\n";
                }
            }
        }
        return ips;
    }
}
