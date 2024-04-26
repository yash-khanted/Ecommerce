package my.project.ecommerce.DAO.implementations;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.project.ecommerce.DAO.interfaces.IUser;
import my.project.ecommerce.models.User;
import my.project.ecommerce.utilities.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
@Component
public class UserRestData implements IUser {

    private URI uri;
    private HttpClient httpClient;
    private ObjectMapper mapper;
    @Autowired
    public UserRestData(HttpClient httpClient){
        this.httpClient = httpClient;
        mapper = new ObjectMapper();
    }

//    @Override
//    public <S extends User> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }

    public Optional<User> findById(Integer id) {
        User[] user = null;

        try{
            uri = new URIBuilder()
                    .setScheme("https")
                    .setHost("fakestoreapi.com")
                    .setPath("/users")
                    .setParameter("id", id.toString())
                    .build();

            HttpGet req = new HttpGet(uri);
            HttpEntity entity= httpClient.createClient()
                    .execute(req)
                    .getEntity();

            user = mapper.readValue(EntityUtils.toString(entity), User[].class);
        }
        catch (URISyntaxException exception){
            System.out.println("uri address does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return Optional.of(user[0]);
    }

//    @Override
//    public boolean existsById(Integer integer) {
//        return false;
//    }
//
//    @Override
//    public Iterable<User> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<User> findAllById(Iterable<Integer> integers) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Integer integer) {
//
//    }
//
//    @Override
//    public void delete(User entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Integer> integers) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends User> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
}
