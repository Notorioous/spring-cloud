package am.itspace.developer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class MainEndpoint {

    @Autowired
    private ServerCaller serverCaller;

    @GetMapping("/estimation")
    public String getEstimation(){
        int hours = generateTime();
        System.out.println("I think it would take " +hours + " hours");
        Integer receivedValue = serverCaller.convert(hours);
        String result = "Let it be " + receivedValue + " story points";
        System.out.println(result);
        return result;
    }

    private final int[] time = {1,3,6,15,80};

    private int generateTime() {
        return time[new Random().nextInt(time.length)];
    }

}
