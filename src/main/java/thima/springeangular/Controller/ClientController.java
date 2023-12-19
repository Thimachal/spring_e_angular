package thima.springeangular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import thima.springeangular.Service.ClientService;

@RestController("/")
public class ClientController {

    @Autowired
    private ClientService actionService;

        @GetMapping("/all")
        public String tste(){
            return ("thats ok");
        }

}
