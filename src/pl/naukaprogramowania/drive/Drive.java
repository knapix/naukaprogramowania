package pl.naukaprogramowania.drive;

import pl.naukaprogramowania.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
