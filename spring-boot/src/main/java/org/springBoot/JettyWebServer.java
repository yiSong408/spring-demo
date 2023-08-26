package org.springBoot;

public class JettyWebServer implements WebServer{
    @Override
    public void start() {
        System.out.println("JettyWebServer started");
    }
}
