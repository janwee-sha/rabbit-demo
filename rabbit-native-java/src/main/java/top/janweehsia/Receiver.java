package top.janweehsia;

import com.rabbitmq.client.Channel;

import java.nio.charset.StandardCharsets;

public class Receiver {
    public static void main(String[] args) throws Exception {
        try (Channel channel = ConnectionFactory.createChannel()) {
            channel.queueDeclare(Property.QUEUE_HELLO, false, false, false, null);

            System.out.println("[*] Waiting for messages...");
            channel.basicConsume(Property.QUEUE_HELLO, false, (consumerTag, delivery) -> {
                String msg = new String(delivery.getBody(), StandardCharsets.UTF_8);
                System.out.printf("[x] Message '%s' received.\n", msg);
            }, consumerTag -> {
            });
        }
    }
}
