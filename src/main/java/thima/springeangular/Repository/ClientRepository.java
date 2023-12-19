package thima.springeangular.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import thima.springeangular.Model.Client;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findAll();
}
