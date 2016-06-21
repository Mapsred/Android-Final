package activity.supinternet.com.tpfinal;

import activity.supinternet.com.tpfinal.Story.Story;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ContentSearch {
    @GET("android")
    Call<Story> search(@Query("story") String keyword);
}
