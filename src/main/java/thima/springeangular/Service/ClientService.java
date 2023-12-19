package thima.springeangular.Service;

import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import thima.springeangular.Model.Client;
import thima.springeangular.Repository.ClientRepository;

@Service
public class ClientService {

    @Autowired
    private ClientRepository actionRepository;
    public ResponseEntity<?> registerClient(Client clientFromBodyFront) {
    Client client = new Client();
       client = actionRepository.save(clientFromBodyFront);
        return ResponseEntity.ok(client);
    }
}
