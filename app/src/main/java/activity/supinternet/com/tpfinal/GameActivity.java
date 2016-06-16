package activity.supinternet.com.tpfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
    Button guerrier;

    @BindView(R.id.button2)
    Button archer;

    Content content;

    private int numero = 0;
    private int classe = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ButterKnife.bind(this);

        initContent();

        guerrierAction();
    }

    @OnClick(R.id.button)
    public void guerrierAction() {
        if (numero == 0 && classe == 0) {
            texte.setText("Vous êtes un guerrier, Vous devez aller chercher votre épée pour " +
                    "combattre et vous défendre ! Le dernier l'ayant vu ne se souviens " +
                    "plus si c'était au cimetière ou dans une tour, à vous de décider " +
                    "le chemin à prendre.");
            numero = 1;
            classe = 2;
            guerrier.setText("Aller à la tour");
            archer.setText("Aller au cimetière");
        } else if ((numero == 1 || numero == 2 || numero == 3) && classe == 2) {
            texte.setText("Vous êtes arrivé à la tour, vous fouillez les environs et trouvez " +
                    "un escalier pour monter et un chemin pour continuer, que faites-vous ?");
            numero = 4;
            classe = 2;
            guerrier.setText("Monter les escaliers");
            archer.setText("Continuer le chemin");
        } else if ((numero == 4 || numero == 8) && classe == 2) {
            texte.setText("Vous tombez sur une pièce avec plein de commodes, vous les fouillez " +
                    "toutes sans succès, au moment de repartir une lueur apparait et " +
                    "vous trouvez enfin votre épée ! Vous continuez donc sur le chemin " +
                    "trouvé précédemment");
            numero = 5;
            classe = 2;
            guerrier.setText("Retour à l'intersection");
            archer.setText("Aller sur le chemin");
        } else if (numero == 5 && classe == 2) {
            texte.setText("Un monstre vous bloque la route; zut alors ...");
            numero = 6;
            classe = 2;
            guerrier.setText("Le combattre !");
            archer.setText("Fuir comme un lache !");
        } else if (numero == 7 && classe == 2) {
            texte.setText("La gargouille vous saute dessus et vous met votre slip sur la tête et vous mourrez asphixié, vous êtes MORT. GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 6 && classe == 2) {
            texte.setText("Vous arrivez à porter un coup final au monstre à l'aide de votre nouvelle épée tant bien que mal, vous décidez donc de continuer le chemin et arrivez devant une vieille grange, que faites vous");
            numero = 9;
            classe = 2;
            guerrier.setText("La fouiller");
            archer.setText("Continuer sans s'arrêter");
        } else if (numero == 9) {
            texte.setText("Vous fouillez la grange et trouvez un vieux bout de papier avec marqué gauche, gauche, droite, gauche. Qu'est-ce donc ?");
            numero = 11;
            guerrier.setText("Se reposer dans la grange");
            archer.setText("Continuer le chemin");
        } else if (numero == 11) {
            texte.setText("Vous vous êtes reposé dans la grange, au moment de repartir vous croisez le fermier qui vous confie une clé en disant que cela pourra vous aider dans votre aventure");
            numero = 12;
            guerrier.setText("Partir sans la clé");
            archer.setText("Allez vers la labyrinthe");
        } else if (numero == 12) {
            texte.setText("Vous arrivez devant un labyrinthe mais vous n'avez pas de clé pour y entrer ... Que faites vous ?.");
            numero = 10;
            guerrier.setText("Attendre");
            archer.setText("Rebrousser chemin");
        } else if ((numero == 10 || numero == 13)) {
            texte.setText("Vous avez attendu et pendant votre sommeil vous entendez la porte qui s'ouvre... Que faites-vous ?.");
            numero = 14;
            guerrier.setText("Abandonner la vie d'aventurier");
            archer.setText("Entrer dans le labyrinthe");
        } else if (numero == 14) {
            texte.setText("Vous décidez d'abandonner la vie d'aventurier... GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 15) {
            texte.setText("Vous choisissez gauche, une autre intersection s'offre à vous");
            numero = 17;
            classe = 2;
            guerrier.setText("Gauche");
            archer.setText("Droite");
        } else if (numero == 16) {
            texte.setText("Vous avancez vers la crevasse glissez sur une peau de banane et tombez comme un gland, vous MOURREZ. GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 17) {
            texte.setText("Vous arrivez ENCORE à une intersection ... Que faites-vous ?");
            numero = 18;
            guerrier.setText("Gauche");
            archer.setText("Droite");
        } else if ((numero == 18 || numero == 20)) {
            texte.setText("Vous recontrez John Snow, il y a une couille quelque part ... Vous êtes mort ! GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 19) {
            texte.setText("Vous arrivez au bout du chemin, vous trouvez un oeuf de dragon. La mère dragon arrive, vous fuyez !");
            numero = 20;
            guerrier.setText("Revenir en arrière");
            archer.setText("Aller à la porte");
//FIN DU GUERRIER BOUTON GUERRIER
        } else if (numero == 1 && classe == 1) {
            texte.setText("Vous arrivez dans la forêt. Vous fouillez un peu partout et finissez par trouver un vieux parchemin avec des indications : 3 branches, 2 fils. Que faites-vous ?");
            numero = 2;
            classe = 1;
            guerrier.setText("Aller plus loin dans la forêt");
            archer.setText("Aller au chemin");
        } else if (numero == 2 && classe == 1) {
            texte.setText("Vous avez décidé de vous aventurer plus loin dans la forêt. Vous trouvez des branches d'arbre et quelques fils, comme demandé sur le parchemin, vous arrivez donc à vous fabriquer un pauvre arc");
            numero = 3;
            classe = 1;
            guerrier.setText("Mettre fin à l'aventure...");
            archer.setText("Aller sur le chemin");
        } else if (numero == 3 && classe == 1) {
            texte.setText("Vous décidez que la vie d'aventurier n'est pas faite pour vous, vous décidez de redevenir fermier ! GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 4 && classe == 1) {
            texte.setText("La gargouille vous saute dessus et vous met votre slip sur la tête et vous mourrez asphixié, vous êtes MORT. GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 5 && classe == 1) {
            texte.setText("Vous attaquer la gargouille et réussissez un tir parfait digne d'un coup de chance, une flêche entre les deux yeux de la gargouille qui tombe raide morte. Vous continuez donc votre chemin et arrivez devant une grange, que faire ?");
            numero = 9;
            classe = 1;
            guerrier.setText("La fouiller");
            archer.setText("Continuer sans la fouiller");
        }
    }

    @OnClick(R.id.button2)
    public void archerAction() {
        if (numero == 0 && classe == 0) {
            texte.setText("");
            numero = 1;
            classe = 1;
            guerrier.setText("Aller dans la forêt");
            archer.setText("Aller au cimetière");
        } else if (numero == 1 && classe == 2) {
            texte.setText("Vous êtes au cimetière, il semblerait que l'épée ne soit pas ici, vous décidez de rebrousser chemin");
            numero = 3;
            classe = 2; // guerrier
            guerrier.setText("Aller à la tour");
            archer.setText("Aller au cimetière");
        } else if (numero == 3 && classe == 2) {
            texte.setText("Vous êtes toujours au cimetière, et l'épée n'y est toujours pas ! Vous rebroussez encore chemin");
            numero = 3;
            classe = 2;
            guerrier.setText("Aller à la tour");
            archer.setText("Aller au cimetière");
        } else if ((numero == 4 || numero == 8) && classe == 2) {
            texte.setText("Vous avez décidé d'emprunter le chemin sans armes ni équipement, bonne chance... En chemin vous rencontrez une gargouille.");
            numero = 7;
            classe = 2;
            guerrier.setText("La combattre, sans armes");
            archer.setText("La fuir");
        } else if (numero == 7 && classe == 2) {
            texte.setText("Vous êtes de retour à l'intersection, que faites vous ?");
            numero = 8;
            classe = 2;
            guerrier.setText("Monter les escaliers");
            archer.setText("Continuer le chemin");
        } else if (numero == 6 && classe == 2) {
            texte.setText("Vous fuyez comme un lâche que vous êtes, vous abandonnez la vie d'aventurier et redevenez un simple fermier. GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if ((numero == 5 && classe == 2) || numero == 10) {
            texte.setText("Vous avez décidé d'emprunter le chemin, bonne chance... En chemin vous trouvez une vieille grange.");
            numero = 9;
            guerrier.setText("La fouiller");
            archer.setText("Continuer sans s'arrêter");
        } else if (numero == 9) {
            texte.setText("Vous avez décidé de ne pas fouiller la grange, vous arrivez devant un labyrinthe mais vous n'avez pas de clé pour y entrer ... Que faites vous ?.");
            numero = 10;
            guerrier.setText("Attendre");
            archer.setText("Rebrousser chemin");
        } else if (numero == 12) {
            texte.setText("Vous êtes arrivé devant le labyrinthe. Que faire ?");
            numero = 13;
            guerrier.setText("Attendre");
            archer.setText("Utiliser la clé donnée par le fermier");
        } else if (numero == 11) {
            texte.setText("Vous arrivez devant un labyrinthe mais vous n'avez pas de clé pour y entrer ... Que faites vous ?.");
            numero = 10;
            guerrier.setText("Attendre");
            archer.setText("Rebrousser chemin");
        } else if ((numero == 14 || numero == 13 || numero == 16)) {
            texte.setText("Vous entrez dans le labyrinthe, deux chemins sont disponibles");
            numero = 15;
            guerrier.setText("Gauche");
            archer.setText("Droite");
        } else if (numero == 15) {
            texte.setText("Vous avez choisi la droite, c'est une impasse, il y a une crevasse");
            numero = 16;
            guerrier.setText("Avancer vers la crevasse");
            archer.setText("Retourner en arrière");
        } else if (numero == 17) {
            texte.setText("Vous avez décidé de tourner à droite. Une pierre glisse du mur et vous tombe dessus. à votre reveil vous trouvez votre dignité oubliée, vous êtes sûrement mort ... Bienvenue au paradis. GAME OVER.");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
        } else if (numero == 18) {
            texte.setText("Vous avez choisi la droite. Vous arrivez à une inième intersection. Que choisisez-vous ?");
            numero = 19;
            guerrier.setText("Gauche");
            archer.setText("Droite");
        } else if (numero == 20) {
            texte.setText("Vous fuyez vers la porte et perdez la clé pendant la fuite. La porte est bloquée, la mère dragon arrive, vous êtes conviés à un barbecue surprise. Bonne chance... GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
//FIN BOUTON ARCHER
        } else if (numero == 1 && classe == 1) {
            texte.setText("Vous êtes au cimetière, il semblerait que l'arc ne soit pas ici, vous décidez de rebrousser chemin");
            numero = 1;
            classe = 1;
            guerrier.setText("Aller à la forêt");
            archer.setText("Aller au cimetière");
        } else if (numero == 3 && classe == 1) {
            texte.setText("Vous êtes sur le chemin et vous rencontrez un monstre. Que voulez-vous faire ?");
            numero = 5;
            classe = 1;
            guerrier.setText("Attaquer le monstre");
            archer.setText("Fuir le monstre");
        } else if (numero == 2 && classe == 1) {
            texte.setText("Vous êtes sur le chemin et rencontrez un monstre mais vous n'avez pas d'armes. Que voulez-vous faire ?");
            numero = 4;
            classe = 1;
            guerrier.setText("Attaquer le monstre à main nue");
            archer.setText("Fuir le monstre");
        } else if (numero == 4 && classe == 1) {
            texte.setText("Vous retournez dans la forêt. Vous fouillez un peu partout et finissez par trouver un vieux parchemin avec des indications : 3 branches, 2 fils. Que faites-vous ?");
            numero = 2;
            classe = 1;
            guerrier.setText("Aller plus loin dans la forêt");
            archer.setText("Aller au chemin");
        } else if (numero == 5 && classe == 1) {
            texte.setText("Vous fuyez comme un lâche que vous êtes, vous abandonnez la vie d'aventurier et redevenez un simple fermier. GAME OVER");
            numero = 0;
            classe = 0;
            guerrier.setText("Recommencer en Guerrier");
            archer.setText("Recommencer en Archer");
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
            }
        });
    }
}
