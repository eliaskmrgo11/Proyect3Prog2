package controller;

import model.FileReader;
import view.IoManager;

public class Control {

    public IoManager io;

    public Control() {
        io = new IoManager();
    }
    public void init(){
        FileReader file = new FileReader();
        String fileList = file.showFilesList();
        io.showMenssage(fileList);
    }
}