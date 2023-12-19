package thima.springeangular.Service;

import org.modelmapper.internal.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import thima.springeangular.Model.Client;
import thima.springeangular.Repository.ClientRepository;

@Service
public class ClientService {
    @Autowired
    private ClientRepository actionRepository;

    //registra o cliente
    public ResponseEntity<?> registerClient(Client clientFromBodyFront) {
        Client client = new Client();
        client = actionRepository.save(clientFromBodyFront);
        return ResponseEntity.ok(client);
    }

    //lista o cliente
    public ResponseEntity<?> listAllClients() {
        return ResponseEntity.ok(actionRepository.findAll());
    }

    //atualiza o cliente
    public ResponseEntity<?> updateClient(Client clientFromBodyFront) {
        Client client = new Client();

        client = actionRepository.save(clientFromBodyFront);
        return ResponseEntity.ok(client);
    }


    public ResponseEntity<?> deleteClient(Long idFromUrlFront) {

        actionRepository.deleteById(idFromUrlFront);
        return (ResponseEntity<?>) ResponseEntity.ok();
    }
}
