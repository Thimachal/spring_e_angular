package thima.springeangular.Repository;

import org.springframework.data.repository.CrudRepository;
import thima.springeangular.Model.Client;

public interface ClientRepository extends CrudRepository<Client,Long> {
}
