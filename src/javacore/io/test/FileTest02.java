package javacore.io.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("archive");
        boolean mkdir = fileDirectory.mkdir();
        System.out.println("Directory created? "+mkdir);

        File fileDirectoryArchive = new File(fileDirectory, "ArchiveTwo.txt");
        boolean newFile = fileDirectoryArchive.createNewFile();
        System.out.println("New archive has been created? "+newFile);

        File fileRename = new File(fileDirectory, "RenamedArchive.txt");
        boolean fileRenamed = fileDirectoryArchive.renameTo(fileRename);
        System.out.println("Archive has been renamed? "+fileRenamed);
    }
    //Primeiro cria o diretorio, depois o arquivo dentro e por fim renomeia o arquivo
    //se o arquivo nao foi criado, nao vai ter nada para renomear.
    //se foi criado ele será renomeado.
    //após ser renomeado, rodar dnv vai criar outro arquivo, porem ele nao sera renomeado pois ja existe um

}
