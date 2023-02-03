package ru.rt.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.concurrent.CountDownLatch;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaReceiverServiceImpl implements KafkaReceiverService {

//    private final CountDownLatch latch = new CountDownLatch(3);

    @KafkaListener(topics = "${message.topic.name}"/*, containerFactory = "headersKafkaListenerContainerFactory"*/)
    public void listenWithHeaders(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        log.info("Received Message from partition: '{}' - '{}' ", partition, message);
//        latch.countDown();
    }
}
