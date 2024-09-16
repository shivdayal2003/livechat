public @MessageMapping("/send")
@SendTo("/topic/messages")
public ChatMessage sendMessage(ChatMessage message) {
    // Save to DB and forward the message
    return message;
}
 {
    
}
