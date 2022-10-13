package net_1011;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

import static java.net.InetAddress.getByName;

public class UdpEchoClient {
    DatagramSocket socket = null;
    private String serverIp;
    private int    serverPort;
    //两个参数一会会在发送数据的时候用到
    //暂时把这俩参数存起来
    public UdpEchoClient(String serverIp , int serverPort) throws SocketException {
        //OS自动指定一个空闲端口
        socket = new DatagramSocket();
        serverIp=serverIp;
        serverPort=serverPort;
    }

    public void start() throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            //1.从控制台读取用户输入的数据
            System.out.println("-> ");
            String request = scanner.next();

            //2.构造一个UDP请求,发送给服务器
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(),request.getBytes().length, InetAddress.getByName(this.serverIp),this.serverPort);
            socket.send(requestPacket);


            //3.从服务器读取
            DatagramPacket responsePacket = new DatagramPacket(new byte[4096],4096);

            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(),0,responsePacket.getLength());
            //4.把服务器的响应显示到控制台上
            System.out.println(response);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient client = new UdpEchoClient("127.0.0.1",9090);
        client.start();

    }
}
