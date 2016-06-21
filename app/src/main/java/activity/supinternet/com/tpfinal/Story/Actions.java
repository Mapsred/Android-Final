
package activity.supinternet.com.tpfinal.Story;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Actions {

    @SerializedName("action_0")
    @Expose
    private Action0 action0;
    @SerializedName("action_1")
    @Expose
    private Action1 action1;
    @SerializedName("action_2")
    @Expose
    private Action2 action2;
    @SerializedName("action_3")
    @Expose
    private Action3 action3;
    @SerializedName("action_4")
    @Expose
    private Action4 action4;
    @SerializedName("action_8")
    @Expose
    private Action8 action8;
    @SerializedName("action_5")
    @Expose
    private Action5 action5;
    @SerializedName("action_7")
    @Expose
    private Action7 action7;
    @SerializedName("action_6")
    @Expose
    private Action6 action6;
    @SerializedName("action_9")
    @Expose
    private Action9 action9;
    @SerializedName("action_11")
    @Expose
    private Action11 action11;
    @SerializedName("action_12")
    @Expose
    private Action12 action12;
    @SerializedName("action_10")
    @Expose
    private Action10 action10;
    @SerializedName("action_13")
    @Expose
    private Action13 action13;
    @SerializedName("action_14")
    @Expose
    private Action14 action14;
    @SerializedName("action_15")
    @Expose
    private Action15 action15;
    @SerializedName("action_16")
    @Expose
    private Action16 action16;
    @SerializedName("action_17")
    @Expose
    private Action17 action17;
    @SerializedName("action_18")
    @Expose
    private Action18 action18;
    @SerializedName("action_20")
    @Expose
    private Action20 action20;
    @SerializedName("action_19")
    @Expose
    private Action19 action19;

    public List<Action> actions = new ArrayList<>();

    public void ActionsAction(){
        actions.add(0, action0);
        actions.add(1, action1);
        actions.add(2, action2);
        actions.add(3, action3);
        actions.add(4, action4);
        actions.add(5, action5);
        actions.add(6, action6);
        actions.add(7, action7);
        actions.add(8, action8);
        actions.add(9, action9);
        actions.add(10, action10);
        actions.add(11, action11);
        actions.add(12, action12);
        actions.add(13, action13);
        actions.add(14, action14);
        actions.add(15, action15);
        actions.add(16, action16);
        actions.add(17, action17);
        actions.add(18, action18);
        actions.add(19, action19);
        actions.add(20, action20);
    }

    public Action getAction(int node_action) {
        return actions.get(node_action);
    }

    /**
     * @return The action0
     */
    public Action0 getAction0() {
        return action0;
    }

    /**
     * @param action0 The action_0
     */
    public void setAction0(Action0 action0) {
        this.action0 = action0;
    }

    /**
     * @return The action1
     */
    public Action1 getAction1() {
        return action1;
    }

    /**
     * @param action1 The action_1
     */
    public void setAction1(Action1 action1) {
        this.action1 = action1;
    }

    /**
     * @return The action2
     */
    public Action2 getAction2() {
        return action2;
    }

    /**
     * @param action2 The action_2
     */
    public void setAction2(Action2 action2) {
        this.action2 = action2;
    }

    /**
     * @return The action3
     */
    public Action3 getAction3() {
        return action3;
    }

    /**
     * @param action3 The action_3
     */
    public void setAction3(Action3 action3) {
        this.action3 = action3;
    }

    /**
     * @return The action4
     */
    public Action4 getAction4() {
        return action4;
    }

    /**
     * @param action4 The action_4
     */
    public void setAction4(Action4 action4) {
        this.action4 = action4;
    }

    /**
     * @return The action8
     */
    public Action8 getAction8() {
        return action8;
    }

    /**
     * @param action8 The action_8
     */
    public void setAction8(Action8 action8) {
        this.action8 = action8;
    }

    /**
     * @return The action5
     */
    public Action5 getAction5() {
        return action5;
    }

    /**
     * @param action5 The action_5
     */
    public void setAction5(Action5 action5) {
        this.action5 = action5;
    }

    /**
     * @return The action7
     */
    public Action7 getAction7() {
        return action7;
    }

    /**
     * @param action7 The action_7
     */
    public void setAction7(Action7 action7) {
        this.action7 = action7;
    }

    /**
     * @return The action6
     */
    public Action6 getAction6() {
        return action6;
    }

    /**
     * @param action6 The action_6
     */
    public void setAction6(Action6 action6) {
        this.action6 = action6;
    }

    /**
     * @return The action9
     */
    public Action9 getAction9() {
        return action9;
    }

    /**
     * @param action9 The action_9
     */
    public void setAction9(Action9 action9) {
        this.action9 = action9;
    }

    /**
     * @return The action11
     */
    public Action11 getAction11() {
        return action11;
    }

    /**
     * @param action11 The action_11
     */
    public void setAction11(Action11 action11) {
        this.action11 = action11;
    }

    /**
     * @return The action12
     */
    public Action12 getAction12() {
        return action12;
    }

    /**
     * @param action12 The action_12
     */
    public void setAction12(Action12 action12) {
        this.action12 = action12;
    }

    /**
     * @return The action10
     */
    public Action10 getAction10() {
        return action10;
    }

    /**
     * @param action10 The action_10
     */
    public void setAction10(Action10 action10) {
        this.action10 = action10;
    }

    /**
     * @return The action13
     */
    public Action13 getAction13() {
        return action13;
    }

    /**
     * @param action13 The action_13
     */
    public void setAction13(Action13 action13) {
        this.action13 = action13;
    }

    /**
     * @return The action14
     */
    public Action14 getAction14() {
        return action14;
    }

    /**
     * @param action14 The action_14
     */
    public void setAction14(Action14 action14) {
        this.action14 = action14;
    }

    /**
     * @return The action15
     */
    public Action15 getAction15() {
        return action15;
    }

    /**
     * @param action15 The action_15
     */
    public void setAction15(Action15 action15) {
        this.action15 = action15;
    }

    /**
     * @return The action16
     */
    public Action16 getAction16() {
        return action16;
    }

    /**
     * @param action16 The action_16
     */
    public void setAction16(Action16 action16) {
        this.action16 = action16;
    }

    /**
     * @return The action17
     */
    public Action17 getAction17() {
        return action17;
    }

    /**
     * @param action17 The action_17
     */
    public void setAction17(Action17 action17) {
        this.action17 = action17;
    }

    /**
     * @return The action18
     */
    public Action18 getAction18() {
        return action18;
    }

    /**
     * @param action18 The action_18
     */
    public void setAction18(Action18 action18) {
        this.action18 = action18;
    }

    /**
     * @return The action20
     */
    public Action20 getAction20() {
        return action20;
    }

    /**
     * @param action20 The action_20
     */
    public void setAction20(Action20 action20) {
        this.action20 = action20;
    }

    /**
     * @return The action19
     */
    public Action19 getAction19() {
        return action19;
    }

    /**
     * @param action19 The action_19
     */
    public void setAction19(Action19 action19) {
        this.action19 = action19;
    }

}
