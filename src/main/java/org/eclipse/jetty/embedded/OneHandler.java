package org.eclipse.jetty.embedded;

import org.eclipse.jetty.server.Server;

public class OneHandler
{
    public static Server createServer(int port)
    {
        Server server = new Server(port);
        server.setHandler(new HelloHandler());
        return server;
    }

    public static void main(String[] args) throws Exception
    {
        int port = 8080;
        Server server = createServer(port);
        server.start();
        server.join();
    }
}
