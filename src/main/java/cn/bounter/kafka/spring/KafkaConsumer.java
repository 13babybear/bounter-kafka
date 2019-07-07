package cn.bounter.kafka.spring;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Kafka消息监听器，KafkaListener注解至少需要groupId和topic
 */
@Component
public class KafkaConsumer {

    @KafkaListener(id = "spring-group", topics = "spring-topic")
    public void onMessage(ConsumerRecord<?, ?> consumerRecord) throws Exception {
        System.out.println(consumerRecord.toString());
    }
}
