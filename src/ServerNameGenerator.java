public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] nouns = new String[10];
        nouns[0] = "Dog";
        nouns[1] = "Taco";
        nouns[2] = "Spaceship";
        nouns[3] = "Hamburger";
        nouns[4] = "Pizza";
        nouns[5] = "Juice";
        nouns[6] = "Duck";
        nouns[7] = "Squirrel";
        nouns[8] = "Coffee";
        nouns[9] = "Computer";


        String[] adjectives = new String[10];
        adjectives[0] = "Slow";
        adjectives[1] = "Quick";
        adjectives[2] = "Lucky";
        adjectives[3] = "Sloppy";
        adjectives[4] = "Sweet";
        adjectives[5] = "Salty";
        adjectives[6] = "Large";
        adjectives[7] = "Slick";
        adjectives[8] = "Tiny";
        adjectives[9] = "Blue";

            int random = (int) (Math.random()* + nouns.length-1);
            int randomAdj = (int) (Math.random()* + adjectives.length-1);
            System.out.println("Your Randomly Generated Server Name: \n" + adjectives[randomAdj] + "-" + nouns[random] + ".");





//  closes Main
    }


//    closes ServerNameGenerator
}
