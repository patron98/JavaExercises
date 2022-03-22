package Main.Opdracht_18;


public class BmiApplication {

    public static void main(String[] args){

        System.out.println("Enter your height (Cm): ");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your weight (Kg)");
        int weight = KeyboardUtility.readInt();
        float bmi = (float) BmiUtility.calculateBmi(weight, height);
        BmiUtility.printBmi(bmi);



        //System.out.println(height + "Cm " + weight + "Kg");

    }

}
