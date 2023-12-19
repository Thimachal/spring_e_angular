package thima.springeangular.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import thima.springeangular.Model.Client;
@Repository
public interface ClientRepository extends CrudRepository<Client,Long> {

}
