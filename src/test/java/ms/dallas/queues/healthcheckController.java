package ms.dallas.queues;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class healthcheckController {
    @RequestMapping
    public String healthcheck() {
        return "Discovery Service is Alive";
    }
}