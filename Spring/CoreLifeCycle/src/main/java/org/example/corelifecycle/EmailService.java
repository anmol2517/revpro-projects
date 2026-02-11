package org.example.corelifecycle;

public class EmailService {
    private String host, protocol, fromEmail;
    private int port, timeout;

    public String getFromEmail() {
        return fromEmail;
    }

    public void setFromEmail(String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public EmailService(String host, String protocol, String fromEmail, int port, int timeout) {
        this.host = host;
        this.protocol = protocol;
        this.fromEmail = fromEmail;
        this.port = port;
        this.timeout = timeout;
    }

    public EmailService() {}

    @Override
    public String toString() {
        return "EmailService{" +
                "host='" + host + '\'' +
                ", protocol='" + protocol + '\'' +
                ", fromEmail='" + fromEmail + '\'' +
                ", port=" + port +
                ", timeout=" + timeout +
                '}';
    }


    //  Spring Core Life Cycle (init || destroy)

    public void init(){
        System.out.println("Init Method! " + fromEmail);
    }
    public void destroy(){
        System.out.println("Destroy Method! "  + fromEmail);
    }
}

