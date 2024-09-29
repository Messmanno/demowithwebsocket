package com.mycompany.dvdstore.demowithwebsocker.model;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Getter
@Setter
public class ChatMessage {

    private String content;

    private String sender;

    private MessageType type;

    private String time;

}
