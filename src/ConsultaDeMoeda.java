import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class ConsultaDeMoeda {
        private static final String chave = "https://v6.exchangerate-api.com/v6/e91bcd303012e284ee2a3cf1/latest/";
        public double buscaTaxaDeConversao(String moeda) throws IOException, InterruptedException {
                URI endereco = URI.create(chave + moeda);
                HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

                HttpResponse<String> response = HttpClient
                        .newHttpClient()
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String responseBody = response.body();
                JsonObject objeto = new Gson().fromJson(responseBody, JsonObject.class);
                return objeto.getAsJsonObject("conversion_rates").get("BRL").getAsDouble();
        }
}
