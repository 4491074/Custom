package com.wang.websocket;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

/**
 * Created by wangwenxiang on 15-12-7.
 */
@ServerEndpoint("/cutomEnpoint")
public class CustomEnpoint {
    @OnMessage
    public void onMessage(String message, Session session)
            throws IOException, InterruptedException {
        // Send the first message to the client
        session.getBasicRemote().sendText(message);
    }

    @OnOpen
    public void onOpen () {
        System.out.println("Client connected");
    }

    @OnClose
    public void onClose () {
        System.out.println("Connection closed");
    }
}
