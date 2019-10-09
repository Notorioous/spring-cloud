package am.itspace.developer;

import am.itspace.server.Server;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("client")
public interface ServerFeign extends Server {
}
