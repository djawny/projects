package sda.zadanie20_json_cdn;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class ApiClient {
    public static void main(String[] args) throws UnirestException, IOException {
//        String response = Unirest.get("http://192.168.2.17:8080/customers/").asString().getBody();
//        System.out.println(response);

        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://192.168.2.17:8080/customers");
        CloseableHttpResponse execute = closeableHttpClient.execute(httpGet);
        String resp = IOUtils.toString(execute.getEntity().getContent());
        System.out.println(resp);


    }
}
