package cn.bounter.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BounterKafkaApplicationTests {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    public void contextLoads() {
        kafkaTemplate.send("spring-topic", "simon", "29");
        //防止应用关闭来保证Kafka消费者能收到监听消息
        while (true) {}
    }

}
