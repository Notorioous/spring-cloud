package am.itspace.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainEndpoint implements Server {

    @GetMapping("/convert/{hours}")
    @Override
    public Integer convert(@PathVariable int hours){
        int storyPoints = convertFunction(hours);
        System.out.println(hours + " hours in story points would be " + storyPoints);
        return storyPoints;
    }

    private int convertFunction(int hours) {
        return hours * 2;
    }

}
