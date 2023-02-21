import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class GoogleKeyboardAPIExample {

  private static final String API_KEY = "YOUR_API_KEY";

  public static void main(String[] args) {
    try {
      HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
      JacksonFactory jsonFactory = new JacksonFactory();

      GenericUrl url = new GenericUrl("https://inputtools.google.com/request?ime=transliteration_en_hi");
      url.put("key", API_KEY);

      HttpRequest request = httpTransport.createRequestFactory(new HttpRequestInitializer() {
        @Override
        public void initialize(HttpRequest request) throws IOException {
          request.setParser(new JsonObjectParser(jsonFactory));
        }
      }).buildPostRequest(url, null);

      String requestBody = "[{\"text\":\"namaste\"}]";
      request.setContent(requestBody);

      HttpResponse response = request.execute();
      System.out.println(response.parseAsString());
    } catch (GeneralSecurityException | GoogleJsonResponseException | IOException e) {
      e.printStackTrace();
    }
  }
}
