package Applicatie;

import java.util.Random;

public class Bord {
    /* Bord was eigenlijk alleen 12 strings, maar aangezien we in de toekomst
     * hier verder op door willen bouwen, willen we hier eventueel alle extra
     * functionaliteit hebben. Een bord bestaat dus uit een array van 12 'rijen'
     */

    //Hier zien we dus dat we een array maken van de nieuwe klasse 'Rij' in plaats van de strings die weer gebruikten
    //veld = private, dus niet toegankelijk buiten deze klasse om. Dit wordt meestal gedaan voor veiligheid
    private Rij[] veld = new Rij[12];

    //De constructor kan het veld een mooie begin waarde geven
    public Bord() {
        for (int i = 0; i < veld.length; i++) {
            veld[i] = new Rij("-", "-", "-", "-");
            //this.setVeld(new Rij("-","-","-","-"), i);		<-- dit doet precies hetzelfde, maakt gebruik van de onderstaande setter

            veld[i].print();
        }


    }


}
     }

//GETTERS en SETTERS
//Omdat veld private is, maar je het wel op wilt kunnen vragen, of waarden toe wilt kunnen voegen, bestaan er SETTERS en GETTERS.
//Dit zijn methodes waarmee je private variabelen van buitenaf een waarde kan geven of op kan vragen
public void setVeld(Rij rij,int index){
        veld[index]=rij;
        }

public Rij[]getVeld(){
        return veld;
        }
        }
