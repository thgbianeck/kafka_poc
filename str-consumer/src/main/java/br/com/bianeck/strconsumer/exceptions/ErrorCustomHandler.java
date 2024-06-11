package br.com.bianeck.strconsumer.exceptions;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        log.info("EXCEPTION_HANDLER ::: Captured exception");
        log.info("PAYLOAD ::: {}", message.getPayload());
        log.info("HEADERS ::: {}", message.getHeaders());
        log.info("OFFSET ::: {}", message.getHeaders().get("kafka_offset"));
        log.info("MESSAGE_EXCEPTION ::: {}", exception.getMessage());
        return null;
    }

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception, Consumer<?, ?> consumer) {
        return KafkaListenerErrorHandler.super.handleError(message, exception, consumer);
    }
}
