package com.conpany.proxy;

import java.util.ArrayList;
import java.util.List;

public class Tes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
   
        List<Proxy> pro =new ArrayList<Proxy>();
        pro.add(new ControllerAspect());
        ProxyManager.createProxy(ProtoTest.class, pro);
       // px.txt();
        
    }

}
