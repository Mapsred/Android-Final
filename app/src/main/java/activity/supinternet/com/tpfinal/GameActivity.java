package activity.supinternet.com.tpfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import activity.supinternet.com.tpfinal.Story.Action;
import activity.supinternet.com.tpfinal.Story.Classe;
import activity.supinternet.com.tpfinal.Story.Story;
import activity.supinternet.com.tpfinal.Story.Switch;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameActivity extends AppCompatActivity {

    @BindView(R.id.background)
    ImageView imageView;

    @BindView(R.id.textView2)
    TextView texte;

    @BindView(R.id.button)
    Button button1;

    @BindView(R.id.button2)
    Button button2;

    Story content;

    private int story = 0;
    private int node_switch;
    private int node_class;
    private int node_action = 0;
    final static boolean log = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);

        Bundle b = getIntent().getExtras();

        story = b.getInt("story");

        initContent();
    }

    @OnClick(R.id.button)
    public void guerrierAction() {
        if (node_switch == 0 || node_class == 0) {
            verifyOneAction();
        }

        buttonsAction();
    }

    @OnClick(R.id.button2)
    public void archerAction() {
        if (node_switch == 0 || node_class == 0) {
            verifyTwoAction();
        }
        buttonsAction();
    }

    private Action buttonsAction() {
        Switch switch_obj = content.getSwitch(node_switch);
        switch_obj.getClasses().ClassesAction(); //Implement the list
        Classe class_obj = switch_obj.getClasses().getClasse(node_class);
        class_obj.getActions().ActionsAction(); //Implement the list
        Action action = class_obj.getActions().getAction(node_action);
        setLocals(action);
        logLocals();
        setTexts(action);

        return action;
    }

    private void verifyOneAction() {
        if (node_switch == 0) {
            node_switch = 1;
        }
        if (node_class == 0) {
            node_class = 2;
        }
    }

    private void verifyTwoAction() {
        if (node_switch == 0) {
            node_switch = 2;
        }
        if (node_class == 0) {
            node_class = 2;
        }
    }

    private void setLocals(Action action) {
        node_switch = action.getNodeSwitch();
        node_class = action.getNodeClass();
        node_action = action.getNodeAction();
    }

    private void setTexts(Action action) {
        texte.setText(action.getText());
        button1.setText(action.getButton1Text());
        button2.setText(action.getButton2Text());
    }

    private void logLocals() {
        if (log) {
            Log.d("NODE_SWITCH", String.valueOf(node_switch));
            Log.d("NODE_CLASS", String.valueOf(node_class));
            Log.d("NODE_ACTION", String.valueOf(node_action));
        }
    }

    public void initContent() {
        ContentSearchService.search(String.valueOf(story), new Callback<Story>() {
            @Override
            public void onResponse(Call<Story> call, Response<Story> response) {
                content = response.body();
                content.StoryAction();//Implement the list
            }

            @Override
            public void onFailure(Call<Story> call, Throwable t) {
                Log.d("ERROR", t.toString());
            }
        });
    }
}
