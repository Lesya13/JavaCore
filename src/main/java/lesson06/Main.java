package lesson06;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class Main {
    public static final String API_KEY_PARAM = "apikey";
    public static final String API_KEY = "nONUYyL0xo1w8Fe8lhQcc1VMG27VRjOT";
    public static final String CURRENT_TOWN_KEY = "295212";
    public static final String WEATHER_URL = "https://dataservice.accuweather.com/forecasts/v1/daily/5day/" + CURRENT_TOWN_KEY;

    public static void main(String[] args) throws IOException {

        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(WEATHER_URL)).newBuilder();
        urlBuilder.addQueryParameter(API_KEY_PARAM, API_KEY);

        HttpUrl httpUrl = urlBuilder.build();
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .get()
                .url(httpUrl)
                .build();

        //Get object from server
        Response response = client.newCall(request).execute();
        String body = Objects.requireNonNull(response.body()).string();

        System.out.println(response.code());
        System.out.println(response.message());
        System.out.println(body);
    }
}
