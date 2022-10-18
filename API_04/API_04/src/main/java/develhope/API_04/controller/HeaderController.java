package develhope.API_04.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaderController {

    @GetMapping("/headers")
    public String returnHeaders(@RequestHeader(HttpHeaders.HOST) String host,@RequestHeader(HttpHeaders.SERVER) String server) {

        return host+server;
    }
}
