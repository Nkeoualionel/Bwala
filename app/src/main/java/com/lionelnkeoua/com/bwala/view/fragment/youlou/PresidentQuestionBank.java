package com.lionelnkeoua.com.bwala.view.fragment.youlou;

/**
 * Created by Lionel on 25/08/2018.
 */
public class PresidentQuestionBank {

    public String[] mPresidentsQuestion= {
            "1- Quel est ce président congolais qui fut prète, maire et député avant de devenir président de la republique ?",
            "2- Quel est ce président congolais qui a remboursé près de 80% de la dette congolaise auprès des institutions financières internationale en moins de 5 ans ?",
            "3- Quel est ce président congolais qui a instauré pour la première fois le monopartisme au congo ?",
            "4- C\'est sous la présidence de quel président que le monopartisme a été aboli au congo",
            "5- Quel président congolais qui malgré sa fonction continuais à enseigné à l'université marien ngouabi ?",
            "6- En quel année marien ngouabi prend la présidence du pays ?",
            "7- Quel est ce président qui fut parachutiste, commandant de la zone militaire de brazzaville, ministre de la défence avant de dévenir président ?",
            "8- Quel est le premier président congolais à etre élu démocratiquement ?",
            "9- Que vous rappel la date de 5 févier 1979",
            "10- Quel est ce président congolais qui après sa présidence fut directeur de campagne d\'un autre pésident congolais ?"

    };

    public String[][] mMultipleChoice={
            {"  Fulbert Youlou  ","  Pascal Lissouba  ", "  Alphonse Massamba débat  ", "  Sassou Nguesso  "},
            {"  Sassou Nguesso  ", "  Alphonse Massamba débat  ", "  Marien Ngouabi  ","  Pascal Lissouba  "},
            {"  Fulbert Youlou  ","  Massamba Débat  ", "  Marien Ngouabi  ", "  Sassou Nguesso  "},
            {"  Pascal Lissouba  ", "  Yhombi Opangault  ", "  Mukinayi Seth ","  Sassou Nguesso  "},
            {"  Massamba débat  ", "  Chryss Mbemba  ", "  Marien Ngouabi  ", "  Yhombi Opangault  "},
            {"  1958  ", "  1963  ", "  1968  ", "  2016  "},
            {"  Sassou Nguesso   ","  Nkeoua Urbain  ", "  Yhombi Opangault  ", " Pascal Lissouba  "},
            {"  Sassou Nguesso  ", "  Massamba débat  ", "  Fulbert Youlou  ","  Pascal Lissouba  "},
            {"  Assasinat de Ngouabi  ", "  Assasinat de Emile Biyaenda  ", "  Début présidence de Sassou Nguesso  ", "  Explosion de régiment blindé  "},
            {"  Yhombi Opangault  ","  Duval Mpangani  ", "  Pascal Lissouba  ", "  Fulbert Youlou  "}

    };

    public String[] mTrueAnswer= {"  Fulbert Youlou  ", "  Pascal Lissouba  ", "  Massamba Débat  ", "  Sassou Nguesso  ", "  Marien Ngouabi  ", "  1968  ", "  Sassou Nguesso   ", "  Pascal Lissouba  ", "  Début présidence de Sassou Nguesso  ", "  Yhombi Opangault  "};

    public String getQuestion(int questions){
        String question = mPresidentsQuestion[questions];
        return question;
    }

    public String getMultipleChoice(int table1, int table2){
        String multipleChoice = mMultipleChoice[table1][table2];
        return multipleChoice;
    }

    public String getAnswer(int answer){
        String trueanswer = mTrueAnswer[answer];
        return trueanswer;
    }

    public int getLenght(){
        return mPresidentsQuestion.length;
    }
}
