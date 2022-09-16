import org.testng.annotations.Test;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import java.net.URI;


class Requests {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpUriRequest httppost = RequestBuilder.post()
                    .setUri(new URI("https://api.vk.com/method/messages.editChat"))
                    .addParameter("access_token", "токен))))")
                    .addParameter("v", "5.131")
                    .addParameter("chat_id", "1257")
                    .addParameter("title", "success")
                    .build();

            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                 System.out.println(EntityUtils.toString(response.getEntity()));
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }

    }


}