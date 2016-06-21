package activity.supinternet.com.tpfinal;

import activity.supinternet.com.tpfinal.Story.Story;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ContentSearchService {

    private static Retrofit retrofit;

    public static void search(String keyword, Callback<Story> callback) {
        ContentSearch service = getOrCreate().create(ContentSearch.class);

        Call<Story> call = service.search(keyword);

        call.enqueue(callback);
    }

    private static Retrofit getOrCreate() {
        if (retrofit == null) {
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://francoismathieu.ovh/")
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
