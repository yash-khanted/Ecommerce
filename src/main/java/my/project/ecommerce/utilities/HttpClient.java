package my.project.ecommerce.utilities;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.stereotype.Component;

@Component
public class HttpClient {
    public CloseableHttpClient createClient(){
        CloseableHttpClient httpClient = HttpClients.createDefault();
        return httpClient;
    }
}
