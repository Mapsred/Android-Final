
package activity.supinternet.com.tpfinal.Story;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Classes {

    @SerializedName("class_1")
    @Expose
    private Class1 class1;
    @SerializedName("class_2")
    @Expose
    private Class2 class2;

    public List<Classe> classes = new ArrayList<>();

    public void ClassesAction(){
        classes.add(0, null);
        classes.add(1, class1);
        classes.add(2, class2);
    }

    public Classe getClasse(int node_class){
        return classes.get(node_class);
    }

    /**
     * 
     * @return
     *     The class1
     */
    public Class1 getClass1() {
        return class1;
    }

    /**
     * 
     * @param class1
     *     The class_1
     */
    public void setClass1(Class1 class1) {
        this.class1 = class1;
    }

    /**
     * 
     * @return
     *     The class2
     */
    public Class2 getClass2() {
        return class2;
    }

    /**
     * 
     * @param class2
     *     The class_2
     */
    public void setClass2(Class2 class2) {
        this.class2 = class2;
    }

}
