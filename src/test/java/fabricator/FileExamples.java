package fabricator;

import fabricator.enums.FileType;

public class FileExamples {
    public static void main(String[] args) {
        FileGenerator file = Fabricator.file();

        System.out.println(file.image(200, 300, "drawing.png")); // will create a 200x300 image in place what did you specify
        System.out.println(file.fileExtension(FileType.AUDIO)); //mp3


    }
}
