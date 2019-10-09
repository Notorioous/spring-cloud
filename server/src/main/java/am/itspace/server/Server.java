package am.itspace.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface Server {
    @GetMapping("/convert/{hours}")
    Integer convert(@PathVariable int hours);
}
