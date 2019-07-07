package cn.bounter.kafka.client;

import cn.bounter.kafka.common.Bounter;
import cn.bounter.kafka.common.JacksonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Bounter消息生产者
 */
public class BounterProducer {
    public static void main(String[] args) throws JsonProcessingException {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("acks", "all");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        Producer<String, String> producer = new KafkaProducer<>(props);
        Bounter bounter = new Bounter().setName("Simon").setAge(29);
        producer.send(new ProducerRecord<String, String>("bounter-topic", bounter.getName(), JacksonFactory.getMapper().writeValueAsString(bounter)));

        producer.close();
    }
}
