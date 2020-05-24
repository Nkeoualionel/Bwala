package com.lionelnkeoua.com.bwala.view.fragment.youlou;

/**
 * Created by Lionel on 27/08/2018.
 */
public class RoyaumeQuestionBank {

    public String[] mRoyaumeQuestion = {
            "1- Quel était la superficie du royaume kongo ?",
            "2- En quel année les tékés s\'émancipent du Manikongo pour formé le royaume Tio ?",
            "3- Quel nom portait la capitale du royaume kongo ?",
            "4- A quel date le roi Makoko Illoy 1er et l\'exploratoire français Pièrre Debrazza ont signés le traité ?",
            "5- En quel année le régime constitutionnel complexe fut instauré au royaume kongo ?",
            "6- En quel année le roi Manikongo écrivit au roi Jean III du portugal lui demandant de mettre fin au commerce des noirs dans son royaume ?",
            "7- Vers quel année aurait été fondé le royaume kongo ?",
            "8- En quel année meurt le roi Nombo neuvième souverin du royaume loango ?",
            "9- A quel date le lieutenat Robert Cordier signe un traité de paix avec le Maloango par lequel le Loango cesse d\'etre indépendant ?",
            "10- En quel année le roi Nzinga Nkuwu du royaume congo fut baptisé par les missionnaires catholiques ?"

    };

    public String[][] mRoyaumeProposition = {
            {"  3.000.000 km2  ", "  6.000.000km2  ", "  2.500.000 km2  ", "  10.000.000km2  "},
            {"  vers 1800  ", "  vers 1540  ", "  vers 1400  ","  vers 1620  "},
            {"  Mbanza Kongo  ","  MaLoango  ", "  Mfoa  ", "  Boko  "},
            {"  6 Aout 1800  ", "  10 septembre 1880  ", "  11 avril 1768  ", "  1 janvier 1670  "},
            {"  1773  ","  1890  ", "  1960  ", "  1800  "},
            {"  1400  ", "  1526  ", "  1560  ", "  1700  "},
            {"  1780  ", "  1880  ", "  1600  ","  1500  "},
            {"  1766  ","  1880  ", "  1700  ", "  1800  "},
            {"  25 avril 1995  ", "  1 janvier 1992  ", "  23 Mars 1883  ", "  12 octobre 1700"},
            {"  1320  ","  1490  ", "  1290  ", "  1500  "}
    };

    public String[] mRoyaumeAnswer = {"  2.500.000 km2  ", "  Vers 1620  ", "  Mbanza Kongo  ", "  10 septembre 1880  ", "  1773  ", "  1526  ", "  1500  ", "  1766  ", "  23 Mars 1883  ", "  1490  "};

    public int getLenght(){return mRoyaumeQuestion.length;}

    public String getRoyaumeQuestion(int questions){
        String question = mRoyaumeQuestion[questions];
        return question;
    }

    public String getRoyaumeProposition(int a, int b){
        String proposition = mRoyaumeProposition[a][b];
        return proposition;
    }

    public String getRoyaumeAnswer(int c){
        String answer = mRoyaumeAnswer[c];
        return answer;
    }
}
