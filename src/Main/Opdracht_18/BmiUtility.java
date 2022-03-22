package Main.Opdracht_18;



public class BmiUtility {

    public static float calculateBmi (float weight, float height){
        float sum = (weight / height / height ) * 10000;
        return sum;
    }

    public static void printBmi (float bmi){
        System.out.println(bmi);

        if (bmi < 20){
            System.out.println("Ondergewicht");
        }else if (bmi >= 20 && bmi < 25){
            System.out.println("Ok");
        }else if (bmi >= 25 && bmi < 30){
            System.out.println("Overgewicht");
        }else if (bmi >= 30 && bmi < 40){
            System.out.println("Obesitas");
        }else if (bmi > 40){
            System.out.println("Ziekelijk overgewicht");
        }
    }
}
