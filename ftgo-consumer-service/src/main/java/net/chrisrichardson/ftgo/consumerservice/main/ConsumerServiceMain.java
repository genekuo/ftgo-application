package net.chrisrichardson.ftgo.consumerservice.main;

import io.eventuate.tram.jdbckafka.TramJdbcKafkaConfiguration;
import io.eventuate.tram.messaging.common.spring.TramMessagingCommonAutoConfiguration;
import net.chrisrichardson.eventstore.examples.customersandorders.commonswagger.CommonSwaggerConfiguration;
import net.chrisrichardson.ftgo.consumerservice.web.ConsumerWebConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ConsumerWebConfiguration.class, TramJdbcKafkaConfiguration.class, CommonSwaggerConfiguration.class, TramMessagingCommonAutoConfiguration.class})
public class ConsumerServiceMain {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerServiceMain.class, args);
  }
}
