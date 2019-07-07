package cn.bounter.kafka.common;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Bounter {

    private String name;

    private Integer age;
}
