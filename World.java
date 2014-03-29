public class World {
    public static void main(String[] args) {
        Spider spider = new Spider();
        Grass grass = new Grass();
        Hay hay = new Hay();
        final int herdCount = 10;
        Horse[] herd = new Horse[herdCount];

        spider.eat(grass);

        for (int i = 0; i < herdCount; ++i) {
            herd[i] = new Horse();
        }

        Horse myHorse = herd[4];

        for (Horse horse : herd) {
            horse.eat(hay);
        }


        int c = Organism.getCounter();
        if (c == 1) {
            System.out.printf("There is 1 organism\n");
        } else {
            System.out.printf("There are %d ogranisms\n", c);
        }

        int hc = Horse.getSpecificCounter(myHorse);
        System.out.printf("There are %d horses\n", hc);
        System.out.printf("A %s has %d legs\n", spider, spider.getLegs());
        System.out.printf("A %s has %d legs\n", myHorse, myHorse.getLegs());
    }
}
