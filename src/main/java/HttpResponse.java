import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.util.List;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 28.09.2022
 */
public class HttpResponse {
    private static final String URL = "https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats";
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        List<FactsAboutCat> factsAboutCat = gettingDataAboutCat();
        factsAboutCat.forEach(System.out::println);
    }

    private static List<FactsAboutCat> gettingDataAboutCat() {
        List<FactsAboutCat> responseList;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(URL);
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                responseList = mapper.readValue(response.getEntity().getContent(), new TypeReference<>() {
                });
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return responseList.stream()
                .filter(upvotes -> upvotes.getUpvotes() > 0)
                .toList();
    }
}
