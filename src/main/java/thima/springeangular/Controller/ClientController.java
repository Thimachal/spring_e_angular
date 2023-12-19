package thima.springeangular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import thima.springeangular.Model.Client;
import thima.springeangular.Service.ClientService;

@RestController("/")
public class ClientController {

    @Autowired
    private ClientService actionService;

        @GetMapping("/all")
        public String teste(){
            return ("thats ok");
        }
        @PostMapping("/registerClient")
    public ResponseEntity<?> register(@RequestBody Client clientFromBodyFront) {

            try {
                ResponseEntity<?> clientFromService = actionService.registerClient(clientFromBodyFront);
                return new ResponseEntity<>(clientFromService.getBody(), HttpStatus.CREATED);
            } catch (RuntimeException e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        }

}
