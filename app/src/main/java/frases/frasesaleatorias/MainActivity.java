package frases.frasesaleatorias;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void gerarNovaFrase(View view){

        String[] frases = {"O Senhor é meu pastor; nada me faltará. \uD83D\uDC11 Salmos 23:1",
                "O amor é paciente, o amor é bondoso. \uD83D\uDC951 Coríntios 13:4",
                "O Senhor é bom, um refúgio em tempos de angústia. ⛪Naum 1:7",
                "Deus limpará de seus olhos todas as lágrimas. \uD83D\uDE4FApocalipse 7:17",
                "Tudo é possível ao que crê. ✨Marcos 9:23",
                "Tudo posso naquele que me fortalece. \uD83D\uDCAAFilipenses 4:13",
                "Ainda que eu andasse pelo vale da sombra da morte, não temeria mal algum, porque tu estás comigo. \uD83E\uDD1DSalmos 23:4",
                "Quem é correto nunca fracassará e será lembrado para sempre. \uD83D\uDE4FSalmos 112:6",
                "Se Deus é por nós, quem será contra nós? \uD83E\uDD1DRomanos 8:31",
                "O meu mandamento é este: amem uns aos outros como eu amo vocês. ❤️João 15:12",
                "Seja feita a tua vontade, assim na terra como no céu. \uD83D\uDE4FMateus 6:10",
                "Espera no Senhor, anima-te, e ele fortalecerá o teu coração. \uD83D\uDE4CSalmos 27:14",
                "Ora, a fé é a certeza de coisas que se esperam, a convicção de fatos que não se veem. ✨Hebreus 11:1",
                "Deleite-se no Senhor, e ele atenderá aos desejos do seu coração. \uD83D\uDC96Salmos 37:4",
                "Felizes são os que ouvem a palavra de Deus e a guardam! \uD83D\uDE0ALucas 11:28",
                "Eu vim para que tenham vida e a tenham em abundância. \uD83C\uDF3FJoão 10:10",
                "O Senhor é a minha luz e a minha salvação. \uD83D\uDE4CSalmos 27:1",
                "Que a paz de Cristo seja o juiz em seus corações. \uD83D\uDD4A️Colossenses 3:15",
                "Os impossíveis dos homens são possíveis para Deus. \uD83D\uDE4FLucas 18:27",
                "Venham a mim, todos os que estão cansados e sobrecarregados, e eu lhes darei descanso. \uD83E\uDD17Mateus 11:28",
                "Confie no Senhor de todo o seu coração e não se apoie em seu próprio entendimento. \uD83D\uDE4CProvérbios 3:5",
                "O que Deus uniu, ninguém o separe. ❤️Mateus 19:6",
                "Não amemos de palavras nem de língua, mas por ações e em verdade." +
                        "1 João 3:18",
                "Se Cristo vos libertar, verdadeiramente sereis livres." +
                        "João 8:36",
                "Lavo as minhas mãos na inocência; e assim andarei, Senhor, ao redor do teu altar. Para publicar com voz de louvor, e contar todas as tuas maravilhas.Bíblia Sagrada \n" +
                        "Salmos 26:6,7",
                "Toda a educação, no momento, não parece motivo de alegria, mas de tristeza. Depois, no entanto, produz naqueles que assim foram exercitados um fruto de paz e de justiça.Bíblia Sagrada \n" +
                        "Hebreus 12:11.",
                "Felizes são aqueles que não se deixam levar pelos conselhos dos maus.Salmos \n" +
                        "Salmos 1:1",
                "O ódio provoca dissensão, mas o amor cobre todos os pecados.Bíblia \n" +
                        "Provérbios 10:12",
                "Quem semeia a injustiça colherá a desgraça.Textos Bíblicos \n" +
                        "Provérbios 22:8",
                "Deus converte o deserto em lago e a terra seca em fontes.Salmos \n" +
                        "Salmos 107:35",
                "Mais vale um homem lento à cólera do que um herói, e um homem senhor de si do que o conquistador de uma cidade.Textos Bíblicos \n" +
                        "Provérbios 16:32",
                "A falta de coração despreza o seu próximo.Textos Bíblicos",
                "Tu que estás lá nas alturas, assim mesmo te interesses pelos humildes.Salmos \n" +
                        "Salmos 138:6",
                "Um corpo corruptível pesa sobre a alma e - tenda de argila - oprime a mente pensativa.Textos Bíblicos",
                "Cada qual mente ao seu próximo, falando com lábios fluentes e duplo coração.Textos Bíblicos \n" +
                        "Salmos 12:2",
                "Fazei justiça ao fraco e ao órfão, procedei retamente para com o aflito e o desamparado.Salmos \n" +
                        "Salmos 82:3",
                "Por isso, não fiquem preocupados com o dia de amanhã, pois o dia de amanhã trará as suas próprias preocupações. Para cada dia bastam as suas próprias dificuldades.Bíblia Sagrada \n" +
                        "Mateus 6:34",
                "Como flechas na mão do guerreiro, assim os filhos da mocidade.Salmos \n" +
                        "Salmo 127:4",
                "Nada há encoberto que não haja de revelar-se, nem oculto que não haja de saber-se.Bíblia Sagrada \n" +
                        "Mateus 10:26",
                "Porque eu, o Senhor teu Deus, te tomo pela tua mão direita; e te digo: Não temas, eu te ajudo.Bíblia Sagrada \n" +
                        "Isaías 41:13",
                "Quem não se ama não sabe amar os outros.Bíblia\n" +
                        "Lucas 10:27",
                "Entreguem todas as suas preocupações a Deus, pois ele cuida de vocês.Bíblia Sagrada \n" +
                        "1 Pedro 5:7",
                "E muita gente se uniu ao Senhor.\n" +
                        "E partiu Barnabé para Tarso, a buscar Saulo; e, achando-o, o conduziu para Antioquia.\n" +
                        "E sucedeu que todo um ano se reuniram naquela igreja, e ensinaram muita gente; e em Antioquia foram os discípulos, pela primeira vez, chamados cristãos. Bíblia Sagrada\n" +
                        "Atos dos Apóstolos 11:25-26"

        };
        int numero = new Random().nextInt(43);

        TextView texto = findViewById(R.id.resultado);
        texto.setText(frases[numero]);

    }
}