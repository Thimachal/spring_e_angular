package thima.springeangular.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ClientController {

        @GetMapping("/all")
        public String tste(){
            return ("thats ok");
        }

}
