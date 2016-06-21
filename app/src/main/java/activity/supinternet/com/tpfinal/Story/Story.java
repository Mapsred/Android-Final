
package activity.supinternet.com.tpfinal.Story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Story {

    @SerializedName("switch_1")
    @Expose
    public Switch1 switch1;
    @SerializedName("switch_2")
    @Expose
    public Switch2 switch2;

    private List<Switch> switches = new ArrayList<>();

    public void StoryAction(){
        switches.add(0, null);
        switches.add(1, switch1);
        switches.add(2, switch2);
    }

    public Switch getSwitch(int node_switch){
        return switches.get(node_switch);
    }
}
