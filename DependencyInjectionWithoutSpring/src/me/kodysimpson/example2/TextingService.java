package me.kodysimpson.example2;

public class TextingService {
    private MessageService messageService;

    public TextingService (MessageService messageService){
        this.messageService = messageService;
    }

    public void respondToText(){
        System.out.println(this.messageService.getMessage());
    }
}
