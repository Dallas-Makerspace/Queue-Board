package ms.dallas.queues;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.est.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUint4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import ms.dallas.queues.QueueBoardApplication;

@RunWith(SpringJUint4ClassRunner.class)
@SpringApplicationConfiguration(classes = QueueBoardApplication.class)
@WebAppConfiguration
public class QueueBoardApplicationTests {

    @Test
    public void contextLoads() {
    }

}