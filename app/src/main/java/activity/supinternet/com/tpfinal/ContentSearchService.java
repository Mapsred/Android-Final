package activity.supinternet.com.tpfinal;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ContentSearchService {

    private static Retrofit retrofit;

    public static void search(Callback<Content> callback) {
        ContentSearch service = getOrCreate().create(ContentSearch.class);

        Call<Content> call = service.search();

        call.enqueue(callback);
    }

    private static Retrofit getOrCreate() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://francoismathieu.ovh/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
