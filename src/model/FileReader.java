package model;

import java.io.File;

public class FileReader {
    private File fichero;

    public FileReader() {
        fichero = new File("D:\\Desktop\\UPTC");
    }

    public String showFilesList() {
        String message = "";
        String[] filesArray = fichero.list();
        for (int i = 0; i < filesArray.length; i++) {
            message += i + 1 + ". " + filesArray[i] + "\n";
        }
        return message;
    }
}