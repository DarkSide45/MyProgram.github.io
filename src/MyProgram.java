import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {

        String operation = null;
        Scanner scanner = new Scanner(System.in);

        int v1 = 0;
        int v2 = 0;


        if (v1 > 0 || v2 < 10){
            v1 = scanner.nextInt();
            operation = scanner.next();
            v2 = scanner.nextInt();
        }
        if (operation.equals("+")){
            System.out.println(v1 + v2);
        }
        if (operation.equals("-")){
            System.out.println(v1 - v2);
        }
        if (operation.equals("*")){
            System.out.println(v1 * v2);
        }
        if (operation.equals("/")){
            System.out.println(v1 / v2);
        }
        else {
            System.out.println("error!");
        }


        int v1Int = GetIntFromString(v1);
        int v2Int = GetIntFromString(v2);


        System.out.println("V1: " + v1Int);
        System.out.println("V2: " + v2Int);

    }

    private static int GetIntFromString (String str)
    {
        int value = 0;

        try {
            value = Integer.parseInt(str);
            return value;
        } catch (NumberFormatException nfe) {
//System.out.println("Can't get int from string " + str);
//тут мы понимаем что из строки нихуя не получается цифру извлечь,
//значит надо проверить может это римская цифра
        }

//тут мы через свич перебираем варианты, сравниваем с римскими цифрами
        switch (str)
        {
            case "I": return 1;
            case "II": return 2;
            case "III": return 3;
            case "IV": return 4;
            case "V": return 5;
            case "VI": return 6;
            case "VII": return 7;
            case "VIII": return 8;
            case "IX": return 9;
            case "X": return 10;
        }

        return 0;
        // Здравствуйте, три дня делал это...
        // При условии того, что я работал в ночь эти 3 дня
        //  Порнимаю что не доделал задание :(
        // Дадите шанс ? :)
    }

}