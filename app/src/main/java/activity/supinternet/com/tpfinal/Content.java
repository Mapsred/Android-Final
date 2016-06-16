package activity.supinternet.com.tpfinal;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("archer")
    @Expose
    private List<String> archer = new ArrayList<>();
    @SerializedName("textArcher")
    @Expose
    private List<String> textArcher = new ArrayList<>();
    @SerializedName("guerrier")
    @Expose
    private List<String> guerrier = new ArrayList<>();
    @SerializedName("textGuerrier")
    @Expose
    private List<String> textGuerrier = new ArrayList<>();

    /**
     * No args constructor for use in serialization
     */
    public Content() {
    }

    public Content(List<String> archer, List<String> textArcher, List<String> guerrier, List<String> textGuerrier) {
        this.archer = archer;
        this.textArcher = textArcher;
        this.guerrier = guerrier;
        this.textGuerrier = textGuerrier;
    }

    /**
     * @return The archer
     */
    public List<String> getArcher() {
        return archer;
    }

    /**
     * @param archer The archer
     */
    public void setArcher(List<String> archer) {
        this.archer = archer;
    }

    /**
     * @return The textArcher
     */
    public List<String> getTextArcher() {
        return textArcher;
    }

    /**
     * @param textArcher The textArcher
     */
    public void setTextArcher(List<String> textArcher) {
        this.textArcher = textArcher;
    }

    /**
     * @return The guerrier
     */
    public List<String> getGuerrier() {
        return guerrier;
    }

    /**
     * @param guerrier The guerrier
     */
    public void setGuerrier(List<String> guerrier) {
        this.guerrier = guerrier;
    }

    /**
     * @return The textGuerrier
     */
    public List<String> getTextGuerrier() {
        return textGuerrier;
    }

    /**
     * @param textGuerrier The textGuerrier
     */
    public void setTextGuerrier(List<String> textGuerrier) {
        this.textGuerrier = textGuerrier;
    }

}