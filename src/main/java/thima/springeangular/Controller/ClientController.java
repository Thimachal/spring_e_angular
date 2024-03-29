package thima.springeangular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import thima.springeangular.Model.Client;
import thima.springeangular.Service.ClientService;

@RestController()
@RequestMapping("/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    @Autowired
    private ClientService actionService;

    @GetMapping("/allClients")
    public ResponseEntity<?> getAllClients() {
        try {
            return new ResponseEntity<>(actionService.listAllClients().getBody(), HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

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

    @PutMapping("/updateClient")
    public ResponseEntity<?> update(@RequestBody Client clientFromBodyFront) {
        try {
            ResponseEntity<?> clientFromService = actionService.updateClient(clientFromBodyFront);
            return new ResponseEntity<>(clientFromService.getBody(), HttpStatus.ACCEPTED);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    //deleta o cliente

    @DeleteMapping("/deleteClient/{idFromUrlFront}")
    public void delete(@PathVariable Long idFromUrlFront){
        try {
            actionService.deleteClient(idFromUrlFront);

        } catch (RuntimeException e) {
            System.out.println("Algo deu errado, tente novamente");
        }
    }

}
