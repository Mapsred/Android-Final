package activity.supinternet.com.tpfinal;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ContentSearch {
    @GET("android")
    Call<Content> search();
}
