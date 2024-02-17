package my.project.ecommerce.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import my.project.ecommerce.models.Product;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductJsonService implements IProductService {
    private Resource dataset;
    public ProductJsonService(){
        dataset = new ClassPathResource("ProductData.json");
    }
    @Override
    public List<Product> fetchAllProducts() {
        File productJsonFile = null;
        JSONParser parser = new JSONParser();
        JSONArray arr = null;
        //fetch json file
        try{
            productJsonFile = dataset.getFile();
            arr = (JSONArray) parser.parse(new FileReader(productJsonFile));
            System.out.println(arr.size());
        }catch (Exception err){
            System.out.println(err.getMessage());
        }

        //read json file
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> product = new HashMap<>();
        try{
            for (Object o: arr) {
                System.out.println(o);
                break;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());;
        }

        return new ArrayList<Product>();
    }

    @Override
    public Product fetchProduct(int id) {
        return null;
    }
}
