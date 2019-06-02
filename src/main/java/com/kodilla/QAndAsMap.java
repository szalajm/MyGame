package com.kodilla;

import java.util.*;

public class QAndAsMap {
    private Map<String, List<QAndAs>> theMap = new HashMap<String, List<QAndAs>>();

    public void addQuestionItem(QAndAs questionItem) {
        if(theMap.containsKey(questionItem.getLevel())){
            List<QAndAs> questions =  theMap.get(questionItem.getLevel());
            questions.add(questionItem);
        } else {
            List<QAndAs> questions = new ArrayList<>();
            questions.add(questionItem);
            theMap.put(questionItem.getLevel(), questions);
        }
    }

    public QAndAs getActualQuestion (String levelIndex) {

        Random random = new Random();
        List<QAndAs> questions = theMap.get(levelIndex);
        Integer questionNumber = random.nextInt(questions.size());

        return questions.get(questionNumber);
    }

    public QAndAsMap () {
        QAndAs q1_1 = new QAndAs("Stolica Polski to", "500", 500,2,"Lublin", "Pozna\u0144", "Warszawa","Bruksela");
        QAndAs q1_2 = new QAndAs("Trzeci\u0105 planet\u0105 Uk\u0142adu S\u0142onecznego to", "500", 500, 0,"Ziemia", "Mars", "Jupiter", "Pluton");

        /// Lista do poziomu trudnośc

        List<QAndAs> level1 = new ArrayList<>();
        level1.add(q1_1);
        level1.add(q1_2);

        theMap.put("500", level1);

        QAndAs q2_1 = new QAndAs("\u015Awięto g\u00F3rnik\u00F3w to inaczej", "1000", 1000, 1, "Andrzejki", "Barb\u00F3rka", "Sob\u00F3tka", "Ostatki");
        QAndAs q2_2 = new QAndAs("Jak cz\u0119\u015B\u0107 mowy odpowiada na pytania: kto? co?", "1000", 1000, 2, "Przymiotnik", "Czasownik", "Rzeczownik", "Pu\u0142kownik");

        List<QAndAs> level2 = new ArrayList<>();
        level2.add(q2_1);
        level2.add(q2_2);

        theMap.put("1000", level2);

        QAndAs q3_1 = new QAndAs("Jak si\u0119 nazywa\u0142 pierwszy Prezydent RP", "2000", 2000, 3, "Daszy\u0144ski", "Pi\u0142sudski", "Wa\u0142\u0119sa", "Narutowicz");
        QAndAs q3_2 = new QAndAs("Tradycyjn\u0105 potraw\u0105 wigilijn\u0105 NIE jest", "2000", 2000, 0, "Golonka", "Barszcz", "Karp", "Kutia");

        List<QAndAs> level3 = new ArrayList<>();
        level3.add(q3_1);
        level3.add(q3_2);

        theMap.put("2000", level3);

        QAndAs q4_1 = new QAndAs("Liczba PI pozwala obliczy\u0107 obw\u00F3d...", "5000", 5000, 0, "ko\u0142a", "pasa", "mieszkania", "obw\u00F3d wyborczy");
        QAndAs q4_2 = new QAndAs("Delifn nale\u017Cy do", "5000", 5000, 1, "ryb", "ssak\u00F3w", "gad\u00F3w", "p\u0142az\u00F3w");

        List<QAndAs> level4 = new ArrayList<>();
        level4.add(q4_1);
        level4.add(q4_2);

        theMap.put("5000", level4);

        QAndAs q5_1 = new QAndAs("Polska jest tradycyjnym ta\u0144cem....", "10000", 10000, 2, "polskim", "ukrai\u0144skim", "czeskim", "litewski");
        QAndAs q5_2 = new QAndAs("Kt\u00F3ry polski pi\u0142karz zosta\u0142 kr\u00F3lem strzelc\u00F3w Mistrzostw \u015Awiata", "10000", 10000, 1, "Lato", "Lewandowski", "Boniek", "Deyna");

        List<QAndAs> level5 = new ArrayList<>();
        level5.add(q5_1);
        level5.add(q5_2);

        theMap.put("10000", level5);

        QAndAs q6_1 = new QAndAs("Kod DNA tworz\u0105.....", "20000", 20000, 3, "Gangliony", "Embriony", "Mitochondria", "Chromosomy");
        QAndAs q6_2 = new QAndAs("Grafen to struktura z\u0142o\u017Cona z atom\u00F3w...", "20000", 20000, 0, "w\u0119gla", "tlenu", "z\u0142ota", "wodoru");

        List<QAndAs> level6 = new ArrayList<>();
        level6.add(q6_1);
        level6.add(q6_2);

        theMap.put("20000", level6);

        QAndAs q7_1 = new QAndAs("Prezesem kt\u00F3rego banku by\u0142 Nikodem Dyzma", "40000", 40000, 2, "Polskiego", "Handlowego", "Zbo\u017Cowego", "Narodowego");
        QAndAs q7_2 = new QAndAs("Grippen to samoloty bojowe produkowane przez koncern pochodz\u0105cy z jakiego kraju", "40000", 40000, 0, "Szwecji", "Niemiec", "USA", "Wielkiej Brytanii");

        List<QAndAs> level7 = new ArrayList<>();
        level7.add(q7_1);
        level7.add(q7_2);

        theMap.put("40000", level7);

        QAndAs q8_1 = new QAndAs("Winston Churchil by\u0142 laureatem nagrody...", "75000", 75000, 3, "Pullitzera", "Sacharowa", "Kardyna\u0142a Sapiechy", "Nobla");
        QAndAs q8_2 = new QAndAs("Kt\u00F3re miast NIE wchodzi w sk\u0142ad tzw. ma\u0142ego tr\u00F3jmiasta", "75000", 75000, 1, "Rumia", "Sopot", "Wejherowo", "Reda");

        List<QAndAs> level8 = new ArrayList<>();
        level8.add(q8_1);
        level8.add(q8_2);

        theMap.put("75000", level8);

        QAndAs q9_1 = new QAndAs("W kt\u00F3rym z wymienionych kraj\u00F3w kobiety najwcze\u015Bniej uzyska\u0142y prawa wyborcze", "125000", 125000, 2, "Szwecja", "USA", "Polska", "Holandia");
        QAndAs q9_2 = new QAndAs("Nazwa rodzaju musztardy - sarepska - pochodzi od", "125000", 125000, 0, "Miasta", "Nazwiska", "Krzewu", "Zwierz\u0119cia");

        List<QAndAs> level9 = new ArrayList<>();
        level9.add(q9_1);
        level9.add(q9_2);

        theMap.put("125000", level9);

        QAndAs q10_1 = new QAndAs("Jak ma na imi\u0119 brat, a zarazem nast\u0119pca Fidela Castro", "250000", 250000, 0, "Raul", "Pedro", "Juan", "Domingo");
        QAndAs q10_2 = new QAndAs("Dawna nazwa Tallina to....", "250000", 250000, 1, "Leninogorsk", "Rewel", "Baltenburg", "Tertu");

        List<QAndAs> level10 = new ArrayList<>();
        level10.add(q10_1);
        level10.add(q10_2);

        theMap.put("250000", level10);

        QAndAs q11_1 = new QAndAs("W kt\u00F3rym roku powsta\u0142o Pa\u0144stwo Watyka\u0144skie", "500000", 500000, 3, "1430", "1190", "1850", "1929");
        QAndAs q11_2 = new QAndAs("Stolic\u0105 po\u0142o\u017Con\u0105 nabli\u01Cej Warszawy jest", "500000", 500000, 0, "Wilno", "Praga", "Berlin", "Bratys\u0142awa");

        List<QAndAs> level11 = new ArrayList<>();
        level11.add(q11_1);
        level11.add(q11_2);

        theMap.put("500000", level11);

        QAndAs q12_1 = new QAndAs("Kt\u00F3ry polski klub jako jedyny zdoby\u0142 europejskich puchar w pi\u0142ce no\u017Cnej", "1000000", 1000000, 1, "G\u00F3rnik Zabrze", "Polonia Bytom", "Legia Warszawa", "Widzew Lodz");
        QAndAs q12_2 = new QAndAs("Koktajle Mo\u0142otowa - jako pierwsi stworzyli...", "1000000", 1000000, 3, "Polacy", "Rosjanie", "Amerykanie", "Finowie");

        List<QAndAs> level12 = new ArrayList<>();
        level12.add(q12_1);
        level12.add(q12_2);

        theMap.put("1000000", level12);
    }
}




