package reto2_web.Interface;

/**
 *
 * @author Alejandro Tacue
 */
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import reto2_web.Model.User;

public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
