package com.lionelnkeoua.com.bwala.view.fragment.youlou;

/**
 * Created by Lionel on 27/08/2018.
 */
public class DateHistoriqueQuestionBank {

    public String[] mDateQuestion = {
            "1- Que vous rappel la date du 25 février 1990 ?",
            "2- En quel année le moyen congo a pris le nom de la république du congo ?",
            "3- Que vous rappel la date du 13, 14 et 15 Aout 1963 ?",
            "4- Que vous rappel la date du 18 mars 1977 ?",
            "5- En quel année yhombi opangault devient président de la republique populaire du congo ?",
            "6- Que vous rappel la date du 4 mars 2012",
            "7- A quel date la constitution du congo a été changée pour la troisième fois après la conférence nationale ?",
            "8- Quel évenement tragique marquant dans l'histoire du congo a pris fin le 15 Octobre 1997 ?",
            "9- Que vous rappel la date du 15 aout 1960",
            "10- En quel année Sassou Nguesso devient pour la première fois président du congo ?"
    };

    public String[][] mDateProposition = {
            {"  Début de la présidence de Pascal Lissouba  ", "  Début de la guerre civile  ", "  Conférence nationale souveraine  ", "  La mort de Alphonse Massamba débat  "},
            { "  28 novembre 1958  ","  15 aout 1960  ", "  5 juin 1997  ", "  4 mars 2012  "},
            {"  Indépendance du congo  ","  Fin présidence Fulbert Youlou  ", "  Assasinat de Fulbert Youlou  ",  "  Début président Massamba Débat  "},
            {"  Début présidence de Marien Ngouabi  ", "  Mort de Fulbert Youlou  ", "  Assassinat Massamba Débat  ", "  Assassinat de Marien Ngouabi  "},
            {"  1979  ", "  1990  ", "  1997  ","  1977  "},
            {"  Assassinat du cardinal Emil Biyenda  ", "  Debut de la guerre civile  ", "  Explosion du dépot d\'arme au régiment blindé  ", "  Fin de la guerre civile  "},
            {"  25 Avril 1995  ","  6 Novembre 2015  ", "  1 janvier 1992  ",  " 9 février 2005  "},
            {"  Présidence de Marien Ngouabi  ", " La fin de la conférence nationale ", "  La guerre civile  ", " Fin de la présidence de Pascal Lissouba "},
            {"  Proclamation de la république du congo  ","  Indépendance de la république du congo  ", "  Organisation des jeux africains  ", "La Mort de Jaque Opangault  "},
            {"  2016  ", "  1963  ", "  1979  ", "  1997  "}
    };

    public String[] mDateAnswer = {
        "  Conférence nationale souveraine  ", "  28 novembre 1958  ", "  Fin présidence Fulbert Youlou  ", "  Assassinat de Marien Ngouabi  ", "  1977  ", "  Explosion du dépot d'arme au régiment blindé  ", "  6 Novembre 2015  ", "  La guerre civile  ", "  Indépendance de la république du congo  ", "  1979  "
    };

    public int getLenght(){
        return mDateQuestion.length;
    }

    public String getDateQuestion(int a){
        String question = mDateQuestion[a];
        return question;
    }

    public String getDateProposition(int b, int c){
        String proposition = mDateProposition[b][c];
        return proposition;
    }

    public String getDateAnswer(int d){
        String answer = mDateAnswer[d];
        return answer;
    }
}
