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

    Content content;

    private int numero = 0;
    private int classe = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);

        initContent();
    }

    @OnClick(R.id.button)
    public void guerrierAction() {
        if (numero == 0 && classe == 0) {
            setGuerrier(numero);
            numero = 1;
            classe = 2;
        } else if (classe == 2) {
            switch (numero) {
                case 1:
                case 2:
                case 3:
                    setGuerrier(1);
                    numero = 4;
                    classe = 2;
                    break;
                case 4:
                case 8:
                    setGuerrier(2);
                    numero = 5;
                    classe = 2;
                    break;
                case 5:
                    setGuerrier(3);
                    numero = 6;
                    classe = 2;
                    break;
                case 7:
                    setGuerrier(4);
                    numero = 0;
                    classe = 0;
                    break;
                case 6:
                    setGuerrier(5);
                    numero = 9;
                    classe = 2;
                    break;
            }
        } else if (classe == 1) {
            switch (numero) {
                case 1:
                    setGuerrier(16);
                    numero = 2;
                    classe = 1;
                    break;
                case 2:
                    setGuerrier(17);
                    numero = 3;
                    classe = 1;
                    break;
                case 3:
                    setGuerrier(18);
                    numero = 0;
                    classe = 0;
                    break;
                case 4:
                    setGuerrier(19);
                    numero = 0;
                    classe = 0;
                    break;
                case 5:
                    setGuerrier(20);
                    numero = 9;
                    classe = 1;
                    break;
            }
        }
        switch (numero) {
            case 9:
                setGuerrier(6);
                numero = 11;
                break;
            case 11:
                setGuerrier(7);
                numero = 12;
                break;
            case 12:
                setGuerrier(8);
                numero = 10;
                break;
            case 10:
            case 13:
                setGuerrier(9);
                numero = 14;
                break;
            case 14:
                setGuerrier(10);
                numero = 0;
                classe = 0;
                break;
            case 15:
                setGuerrier(11);
                numero = 17;
                classe = 2;
                break;
            case 16:
                setGuerrier(12);
                numero = 0;
                classe = 0;
                break;
            case 17:
                setGuerrier(13);
                numero = 18;
                break;
            case 18:
            case 20:
                setGuerrier(14);
                numero = 0;
                classe = 0;
                break;
            case 19:
                setGuerrier(15);
                numero = 20;
                break;
        }
    }

    @OnClick(R.id.button2)
    public void archerAction() {
        if (numero == 0 && classe == 0) {
            setArcher(numero);
            numero = 1;
            classe = 1;
        } else if (classe == 2) {
            switch (numero) {
                case 1:
                    setArcher(1);
                    numero = 3;
                    classe = 2;
                    break;
                case 3:
                    setArcher(2);
                    numero = 3;
                    classe = 2;
                    break;
                case 4:
                case 8:
                    setArcher(3);
                    numero = 7;
                    classe = 2;
                    break;
                case 7:
                    setArcher(4);
                    numero = 8;
                    classe = 2;
                    break;
                case 6:
                    setArcher(5);
                    numero = 0;
                    classe = 0;
                    break;
                case 5:
                    setArcher(6);
                    numero = 9;
                    break;
            }
        } else if (classe == 1) {
            switch (numero) {
                case 1:
                    setArcher(15);
                    numero = 1;
                    classe = 1;
                    break;
                case 3:
                    setArcher(16);
                    numero = 5;
                    classe = 1;
                    break;
                case 2:
                    setArcher(17);
                    numero = 4;
                    classe = 1;
                    break;
                case 4:
                    setArcher(18);
                    numero = 2;
                    classe = 1;
                    break;
                case 5:
                    setArcher(19);
                    numero = 0;
                    classe = 0;
                    break;
            }
        }

        switch (numero) {
            case 10:
                setArcher(6);
                numero = 9;
                break;
            case 9:
                setArcher(7);
                numero = 10;
                break;
            case 12:
                setArcher(8);
                numero = 13;
                break;
            case 11:
                setArcher(9);
                numero = 10;
                break;
            case 14:
            case 13:
            case 16:
                setArcher(10);
                numero = 15;
                break;
            case 15:
                setArcher(11);
                numero = 16;
                break;
            case 17:
                setArcher(12);
                numero = 0;
                classe = 0;
                break;
            case 18:
                setArcher(13);
                numero = 19;
                break;
            case 20:
                setArcher(14);
                numero = 0;
                classe = 0;
                break;
        }
    }

    public void initContent() {
        ContentSearchService.search(new Callback<Content>() {
            @Override
            public void onResponse(Call<Content> call, Response<Content> response) {
                content = response.body();
            }

            @Override
            public void onFailure(Call<Content> call, Throwable t) {
                Log.d("ERROR", t.toString());
            }
        });
    }


    public void setGuerrier(int number) {
        button1.setText(content.getGuerrierButton1().get(number));
        button2.setText(content.getGuerrierButton2().get(number));
        texte.setText(content.getTextGuerrier().get(number));
    }

    public void setArcher(int number) {
        button1.setText(content.getArcherButton1().get(number));
        button2.setText(content.getArcherButton2().get(number));
        texte.setText(content.getTextArcher().get(number));
    }

}
