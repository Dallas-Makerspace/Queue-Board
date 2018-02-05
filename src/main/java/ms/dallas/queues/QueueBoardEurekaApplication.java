package ms.dallas.queues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class QueueBoardEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueueBoardEurekaApplication.class, args)
    }
}