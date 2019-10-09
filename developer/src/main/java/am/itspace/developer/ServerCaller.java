package am.itspace.developer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ServerCaller {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    protected Integer convert(int hours) {
        return restTemplate.getForObject("http://server/convert/"+hours,Integer.class);
    }

    private Integer fallback(int hours) {
        return 42;
    }

}
