import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите что хотите записать IPV4 - 1, IPV6 - 2");
        Scanner input = new Scanner(System.in);
        int vibor = input.nextInt();
        if(vibor == 1){
            Scanner input1 = new Scanner(System.in);
            System.out.println("Введите IPV4:");
            String ipv4 = input1.nextLine();
            Pattern p = Pattern.compile("\\b(25[0-5]\\.|2[0-4]\\d\\.|1\\d\\d\\.|\\d\\d?\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|\\d\\d?)\\b");
            Matcher m = p.matcher(ipv4);
            try(FileWriter text = new FileWriter("C:\\Users\\99499\\IdeaProjects\\Laba15JAVA\\text.txt")){
                while(m.find()){
                    text.write(m.group());
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        if(vibor == 2){
            Scanner input2 = new Scanner(System.in);
            System.out.println("Введите IPV6:");
            String ipv6 = input2.nextLine();
            Pattern p = Pattern.compile("\\b(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,5}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,1}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,4}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,2}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,3}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,3}((?:[0-9a-fA-F]{1,4}::){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,2}[0-9a-fA-F]{1,4}\\b|" +
                    "\\b(?:[0-9a-fA-F]{1,4}:){0,4}((?:[0-9a-fA-F]{1,4}::|::[0-9a-fA-F]{1,4}){1}|(::[0-9a-fA-F]{1,4}){1})(?:[0-9a-fA-F]{1,4}:){0,1}[0-9a-fA-F]{1,4}\\b|" +
                    "([0-9a-fA-F]{0,4}::[0-9a-fA-F]{0,4})");
            Matcher m = p.matcher(ipv6);
            try(FileWriter text = new FileWriter("C:\\Users\\99499\\IdeaProjects\\Laba15JAVA\\text.txt")){
                while(m.find()){
                    text.write(m.group());
                }
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}