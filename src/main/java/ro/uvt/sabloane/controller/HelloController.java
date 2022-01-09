package ro.uvt.sabloane.controller;

import ch.qos.logback.core.net.server.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.uvt.sabloane.services.ClientComponent;


@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HelloController {

    private final ClientComponent clientComponent;

    @GetMapping("/helloSpring")
    public String hello() {
        return "Hello from ClientComponent = " + this.clientComponent;
    }
}
