package activity.supinternet.com.tpfinal;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {


    @SerializedName("textGuerrier")
    @Expose
    private List<String> textGuerrier = new ArrayList<>();
    @SerializedName("guerrierButton2")
    @Expose
    private List<String> guerrierButton2 = new ArrayList<>();
    @SerializedName("guerrierButton1")
    @Expose
    private List<String> guerrierButton1 = new ArrayList<>();
    @SerializedName("textArcher")
    @Expose
    private List<String> textArcher = new ArrayList<>();
    @SerializedName("archerButton1")
    @Expose
    private List<String> archerButton1 = new ArrayList<>();
    @SerializedName("archerButton2")
    @Expose
    private List<String> archerButton2 = new ArrayList<>();

    /**
     *
     * @return
     * The textGuerrier
     */
    public List<String> getTextGuerrier() {
        return textGuerrier;
    }

    /**
     *
     * @param textGuerrier
     * The textGuerrier
     */
    public void setTextGuerrier(List<String> textGuerrier) {
        this.textGuerrier = textGuerrier;
    }

    /**
     *
     * @return
     * The guerrierButton2
     */
    public List<String> getGuerrierButton2() {
        return guerrierButton2;
    }

    /**
     *
     * @param guerrierButton2
     * The guerrierButton2
     */
    public void setGuerrierButton2(List<String> guerrierButton2) {
        this.guerrierButton2 = guerrierButton2;
    }

    /**
     *
     * @return
     * The guerrierButton1
     */
    public List<String> getGuerrierButton1() {
        return guerrierButton1;
    }

    /**
     *
     * @param guerrierButton1
     * The guerrierButton1
     */
    public void setGuerrierButton1(List<String> guerrierButton1) {
        this.guerrierButton1 = guerrierButton1;
    }

    /**
     *
     * @return
     * The textArcher
     */
    public List<String> getTextArcher() {
        return textArcher;
    }

    /**
     *
     * @param textArcher
     * The textArcher
     */
    public void setTextArcher(List<String> textArcher) {
        this.textArcher = textArcher;
    }

    /**
     *
     * @return
     * The archerButton1
     */
    public List<String> getArcherButton1() {
        return archerButton1;
    }

    /**
     *
     * @param archerButton1
     * The archerButton1
     */
    public void setArcherButton1(List<String> archerButton1) {
        this.archerButton1 = archerButton1;
    }

    /**
     *
     * @return
     * The archerButton2
     */
    public List<String> getArcherButton2() {
        return archerButton2;
    }

    /**
     *
     * @param archerButton2
     * The archerButton2
     */
    public void setArcherButton2(List<String> archerButton2) {
        this.archerButton2 = archerButton2;
    }}