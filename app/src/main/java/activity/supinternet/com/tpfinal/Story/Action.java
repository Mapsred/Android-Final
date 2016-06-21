package activity.supinternet.com.tpfinal.Story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("button_1_text")
    @Expose
    private String button1Text;
    @SerializedName("button_2_text")
    @Expose
    private String button2Text;
    @SerializedName("node_switch")
    @Expose
    private Integer nodeSwitch;
    @SerializedName("node_class")
    @Expose
    private Integer nodeClass;
    @SerializedName("node_action")
    @Expose
    private Integer nodeAction;

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The button1Text
     */
    public String getButton1Text() {
        return button1Text;
    }

    /**
     * @param button1Text The button_1_text
     */
    public void setButton1Text(String button1Text) {
        this.button1Text = button1Text;
    }

    /**
     * @return The button2Text
     */
    public String getButton2Text() {
        return button2Text;
    }

    /**
     * @param button2Text The button_2_text
     */
    public void setButton2Text(String button2Text) {
        this.button2Text = button2Text;
    }

    /**
     * @return The nodeSwitch
     */
    public Integer getNodeSwitch() {
        return nodeSwitch;
    }

    /**
     * @param nodeSwitch The node_switch
     */
    public void setNodeSwitch(Integer nodeSwitch) {
        this.nodeSwitch = nodeSwitch;
    }

    /**
     * @return The nodeClass
     */
    public Integer getNodeClass() {
        return nodeClass;
    }

    /**
     * @param nodeClass The node_class
     */
    public void setNodeClass(Integer nodeClass) {
        this.nodeClass = nodeClass;
    }

    /**
     * @return The nodeAction
     */
    public Integer getNodeAction() {
        return nodeAction;
    }

    /**
     * @param nodeAction The node_action
     */
    public void setNodeAction(Integer nodeAction) {
        this.nodeAction = nodeAction;
    }
}
