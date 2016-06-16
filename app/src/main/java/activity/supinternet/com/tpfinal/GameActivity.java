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

//    @BindView(R.id.button)
//    Button guerrier;
//
//    @BindView(R.id.button2)
//    Button archer;

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
    public void archerAction(){
        if (numero == 0 && classe == 0) {

        }
    }

//    public void archer() {
//        if (numero == 0 && classe == 0) {
//            texte.setText("");
//            numero = 1;
//            classe = 1;
//            guerrier.setText("Aller dans la forêt");
//            archer.setText("Aller au cimetière");
//        } else if (numero == 1 && classe == 2) {
//            texte.setText("Vous êtes au cimetière, il semblerait que l'épée ne soit pas ici, vous décidez de rebrousser chemin");
//            numero = 3;
//            classe = 2; // guerrier
//            guerrier.setText("Aller à la tour");
//            archer.setText("Aller au cimetière");
//        } else if (numero == 3 && classe == 2) {
//            texte.setText("Vous êtes toujours au cimetière, et l'épée n'y est toujours pas ! Vous rebroussez encore chemin");
//            numero = 3;
//            classe = 2;
//            guerrier.setText("Aller à la tour");
//            archer.setText("Aller au cimetière");
//        } else if ((numero == 4 || numero == 8) && classe == 2) {
//            texte.setText("Vous avez décidé d'emprunter le chemin sans armes ni équipement, bonne chance... En chemin vous rencontrez une gargouille.");
//            numero = 7;
//            classe = 2;
//            guerrier.setText("La combattre, sans armes");
//            archer.setText("La fuir");
//        } else if (numero == 7 && classe == 2) {
//            texte.setText("Vous êtes de retour à l'intersection, que faites vous ?");
//            numero = 8;
//            classe = 2;
//            guerrier.setText("Monter les escaliers");
//            archer.setText("Continuer le chemin");
//        } else if (numero == 6 && classe == 2) {
//            texte.setText("Vous fuyez comme un lâche que vous êtes, vous abandonnez la vie d'aventurier et redevenez un simple fermier. GAME OVER");
//            numero = 0;
//            classe = 0;
//            guerrier.setText("Recommencer en Guerrier");
//            archer.setText("Recommencer en Archer");
//        } else if ((numero == 5 && classe == 2) || numero == 10) {
//            texte.setText("Vous avez décidé d'emprunter le chemin, bonne chance... En chemin vous trouvez une vieille grange.");
//            numero = 9;
//            guerrier.setText("La fouiller");
//            archer.setText("Continuer sans s'arrêter");
//        } else if (numero == 9) {
//            texte.setText("Vous avez décidé de ne pas fouiller la grange, vous arrivez devant un labyrinthe mais vous n'avez pas de clé pour y entrer ... Que faites vous ?.");
//            numero = 10;
//            guerrier.setText("Attendre");
//            archer.setText("Rebrousser chemin");
//        } else if (numero == 12) {
//            texte.setText("Vous êtes arrivé devant le labyrinthe. Que faire ?");
//            numero = 13;
//            guerrier.setText("Attendre");
//            archer.setText("Utiliser la clé donnée par le fermier");
//        } else if (numero == 11) {
//            texte.setText("Vous arrivez devant un labyrinthe mais vous n'avez pas de clé pour y entrer ... Que faites vous ?.");
//            numero = 10;
//            guerrier.setText("Attendre");
//            archer.setText("Rebrousser chemin");
//        } else if ((numero == 14 || numero == 13 || numero == 16)) {
//            texte.setText("Vous entrez dans le labyrinthe, deux chemins sont disponibles");
//            numero = 15;
//            guerrier.setText("Gauche");
//            archer.setText("Droite");
//        } else if (numero == 15) {
//            texte.setText("Vous avez choisi la droite, c'est une impasse, il y a une crevasse");
//            numero = 16;
//            guerrier.setText("Avancer vers la crevasse");
//            archer.setText("Retourner en arrière");
//        } else if (numero == 17) {
//            texte.setText("Vous avez décidé de tourner à droite. Une pierre glisse du mur et vous tombe dessus. à votre reveil vous trouvez votre dignité oubliée, vous êtes sûrement mort ... Bienvenue au paradis. GAME OVER.");
//            numero = 0;
//            classe = 0;
//            guerrier.setText("Recommencer en Guerrier");
//            archer.setText("Recommencer en Archer");
//        } else if (numero == 18) {
//            texte.setText("Vous avez choisi la droite. Vous arrivez à une inième intersection. Que choisisez-vous ?");
//            numero = 19;
//            guerrier.setText("Gauche");
//            archer.setText("Droite");
//        } else if (numero == 20) {
//            texte.setText("Vous fuyez vers la porte et perdez la clé pendant la fuite. La porte est bloquée, la mère dragon arrive, vous êtes conviés à un barbecue surprise. Bonne chance... GAME OVER");
//            numero = 0;
//            classe = 0;
//            guerrier.setText("Recommencer en Guerrier");
//            archer.setText("Recommencer en Archer");
////FIN BOUTON ARCHER
//        } else if (numero == 1 && classe == 1) {
//            texte.setText("Vous êtes au cimetière, il semblerait que l'arc ne soit pas ici, vous décidez de rebrousser chemin");
//            numero = 1;
//            classe = 1;
//            guerrier.setText("Aller à la forêt");
//            archer.setText("Aller au cimetière");
//        } else if (numero == 3 && classe == 1) {
//            texte.setText("Vous êtes sur le chemin et vous rencontrez un monstre. Que voulez-vous faire ?");
//            numero = 5;
//            classe = 1;
//            guerrier.setText("Attaquer le monstre");
//            archer.setText("Fuir le monstre");
//        } else if (numero == 2 && classe == 1) {
//            texte.setText("Vous êtes sur le chemin et rencontrez un monstre mais vous n'avez pas d'armes. Que voulez-vous faire ?");
//            numero = 4;
//            classe = 1;
//            guerrier.setText("Attaquer le monstre à main nue");
//            archer.setText("Fuir le monstre");
//        } else if (numero == 4 && classe == 1) {
//            texte.setText("Vous retournez dans la forêt. Vous fouillez un peu partout et finissez par trouver un vieux parchemin avec des indications : 3 branches, 2 fils. Que faites-vous ?");
//            numero = 2;
//            classe = 1;
//            guerrier.setText("Aller plus loin dans la forêt");
//            archer.setText("Aller au chemin");
//        } else if (numero == 5 && classe == 1) {
//            texte.setText("Vous fuyez comme un lâche que vous êtes, vous abandonnez la vie d'aventurier et redevenez un simple fermier. GAME OVER");
//            numero = 0;
//            classe = 0;
//            guerrier.setText("Recommencer en Guerrier");
//            archer.setText("Recommencer en Archer");
//        }
//    }

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
