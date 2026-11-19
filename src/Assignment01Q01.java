public class Assignment01Q01 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String word = args[i];
            
            char firstChar = word.charAt(0);

            if ((int)firstChar % 5 == 0){
                System.out.println(firstChar);
            }
        }
    }
}