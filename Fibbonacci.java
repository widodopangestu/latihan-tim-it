import java.io.*;

public class Fibbonacci{
    public static void main(String[] args) {
        System.out.println("input bilangan : ");
        Integer input = Integer.parseInt(System.console().readLine());
        //i++ sama dengan i = i + 1
        //i-- sama dengan i = i - 1
        for(int i =0;i < input;i++){
            System.out.println("Hello World " + i);
        }

    }
}