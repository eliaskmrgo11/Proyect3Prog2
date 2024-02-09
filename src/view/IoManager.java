package view;

import java.util.Scanner;
public class IoManager {
    private Scanner sc;

    public IoManager() {
        sc = new Scanner(System.in);
    }
    public void showMenssage(String message) {
        System.out.println(message);
    }
    public short readShort(String message){
        this.showMenssage((message));
        return sc.nextShort();
    }
    public int readInt(String message){
        System.out.println(message);;
        return sc.nextInt();
    }
    public String readString(String message){
        System.out.println(message);
        return sc.next();
    }
    public String readStringLine(String message){
        System.out.println(message);
        return sc.nextLine();
    }
    public double readDouble(String message){
        System.out.println(message);
        return sc.nextDouble();
    }
    public float readFloat(String message){
        System.out.println(message);
        return sc.nextFloat();
    }
}
