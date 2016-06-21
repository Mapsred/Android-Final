package activity.supinternet.com.tpfinal.Story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Switch {
    @SerializedName("classes")
    @Expose
    private Classes classes;

    /**
     *
     * @return
     *     The classes
     */
    public Classes getClasses() {
        return classes;
    }

    /**
     *
     * @param classes
     *     The classes
     */
    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
