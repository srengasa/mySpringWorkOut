
package myapps.cxf.proj;

import javax.jws.WebService;

@WebService(endpointInterface = "myapps.cxf.proj.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

