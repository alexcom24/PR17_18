import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {
        String in="abcdefghijklmnopqrstuv18340";
        boolean regex=Pattern.matches("abcdefghijklmnopqrstuv18340",in); //шаблон для поиска совпадений в строке.
        if (regex) System.out.println("Строки совпадают"); // Для задания подобного шаблона и поиска подстрок в строке, которые удовлетворяют данному шаблону, в Java определены классы Pattern и Matcher
        else System.out.println("Строки не совпадают");

        //////////////////////////////////////////////////

        Pattern pattern=Pattern.compile("([a-f]+[A-F]+:){3}+([0-9]+[0-9]+:){2}+([0-9]+[0-9])");
        String in1="dF:bA:cE:61:23:98";
        Matcher matcher=pattern.matcher(in1);
        if (matcher.find()) System.out.println("Данная строка является МАС-адресом");
        else System.out.println("Данная строка не является МАС-адресом");

        //////////////////////////////////////////////////

        Pattern pattern1=Pattern.compile("(\\W|^)(\\d+\\.)(\\w{1,2}\\s)USD(\\W|$)");
        Pattern pattern2=Pattern.compile("(\\W|^)(\\d+\\.)(\\w{1,2}\\s)RUB(\\W|$)");
        Pattern pattern3=Pattern.compile("(\\W|^)(\\d+\\.)(\\w{1,2}\\s)EU(\\W|$)");
        String in2="421.67 USD 98.01 BLR 612.87 RUB 56.12 USD 10.10 RTY 901.23 EU";
        Matcher matcher1=pattern1.matcher(in2);
        Matcher matcher2=pattern2.matcher(in2);
        Matcher matcher3=pattern3.matcher(in2);
        System.out.println("Цены в долларах: ");
        while (matcher1.find()) 
            System.out.println(matcher1.group());
        System.out.println("Цены в рублях: ");
        while (matcher2.find())
            System.out.println(matcher2.group());
        System.out.println("Цены в евро: ");
        while (matcher3.find())
            System.out.println(matcher3.group());


    }
}
