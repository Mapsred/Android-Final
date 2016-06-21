package activity.supinternet.com.tpfinal.Story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Classe {
    @SerializedName("actions")
    @Expose
    private Actions actions;

    /**
     *
     * @return
     *     The actions
     */
    public Actions getActions() {
        return actions;
    }

    /**
     *
     * @param actions
     *     The actions
     */
    public void setActions(Actions actions) {
        this.actions = actions;
    }
}
