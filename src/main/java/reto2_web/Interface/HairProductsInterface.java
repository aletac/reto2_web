package reto2_web.Interface;

/**
 *
 * @author Alejandro Tacue
 */
import org.springframework.data.mongodb.repository.MongoRepository;
import reto2_web.Model.HairProducts;
public interface HairProductsInterface extends MongoRepository<HairProducts, String> {
    
}
