public class Array {

    public static void main(String[] args) {
        String[] colors = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

//        System.out.println(colors[5]);
//        System.out.println(colors[3]);
//        System.out.println(colors[2]);
//        System.out.println(colors[1]);
//        System.out.println(colors[4]);
//        System.out.println(colors[0]);
//        System.out.println(colors[6]);

        /*
        find the shortest and longest word in array
        average length of words
         */
        int max_length = colors[0].length();
        int min_length = colors[0].length();
        double total = 0;
        String longest = colors[0];
        String shortest = colors[0];
        for(int i = 0; i < colors.length; i++){
            if (colors[i].length() > max_length){
                max_length = colors[i].length();
                longest = colors[i];
            }
            if (colors[i].length() < min_length){
                min_length = colors[i].length();
                shortest = colors[i];
            }
            total += colors[i].length();
        }
        double average = total/ colors.length;
        System.out.println("Longest: " + longest + ", length: " + max_length);
        System.out.println("Shortest: " + shortest + ", length: " + min_length);
        System.out.println("Average length: " + average + " letters");


    }
}
