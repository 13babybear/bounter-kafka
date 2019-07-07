package cn.bounter.kafka.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * 仅做演示kafkaTemplate使用，实际项目中请直接使用kafkaTemplate
 * 具体见单元测试中的用法
 */
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void send(String topic, String key, String value) {
        kafkaTemplate.send(topic, key, value);
    }
}
