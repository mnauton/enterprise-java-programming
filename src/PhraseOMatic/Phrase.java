package PhraseOMatic;

public class Phrase {

    // make three sets of words to choose from
    private String[] L1 = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end",
            "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
    private String[] L2 = {"empowered", "value-added", "customer-centric", "sticky", "networked",
            "cooperative", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box",
            "positioned", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
    private String[] L3 = {"solution", "architecture", "space", "core competency", "tipping-point", "mission",
            "process", "strategy", "mindshare", "portal", "vision", "paradigm"};


    // TODO 2. Change the existing procedure to generate phrases into a method called generatePhrase(String[] s1 ...)
    public String generatePhrase() {

        // find out how many words are in each list
        int oneLength = L1.length;
        int twoLength = L2.length;
        int threeLength = L3.length;

        // generate three random numbers
        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        String sentence = L1[randOne] + " " + L2[randTwo] + " " + L3[randThree] + ".";
        System.out.println("What we need is " + sentence);
        return sentence;
    }
}
