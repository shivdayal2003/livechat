const socket = new SockJS('/chat');
const stompClient = Stomp.over(socket);

stompClient.connect({}, function (frame) {
    stompClient.subscribe('/topic/messages', function (message) {
        showMessage(JSON.parse(message.body));
    });
});
