package legoset;


import jaxb.JAXBHelper;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setNumber("75211");
        legoSet.setTheme("Star Wars");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig(2, "Imperial Mudtrooper"));
        minifigs.add(new Minifig(1, "Imperial Pilot"));
        minifigs.add(new Minifig(1, "Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);

        legoSet.setWeight(new Weight(0.89,"kg"));
        legoSet.setUrl("https://brickset.com/sets/75211-1/imperial-TIE-Fighter");
        Set<String> tags = new HashSet<String>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);

        JAXBHelper.toXML(legoSet, System.out);

    }

}
