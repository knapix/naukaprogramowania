package pl.naukaprogramowania;

import pl.naukaprogramowania.drive.Drive;
import pl.naukaprogramowania.drive.HDDDrive;
import pl.naukaprogramowania.file.File;
import pl.naukaprogramowania.file.imagefile.GIFImageFile;
import pl.naukaprogramowania.file.imagefile.JPGImageFile;
import pl.naukaprogramowania.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200, 80);

        MP3MusicFile mp3file = new MP3MusicFile("plik.mp3", 4000, "Dire Straits", "Money For Nothing", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp3file);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());


    }
}
