package test;

import main.file.File;
import main.file.ImageFile;
import main.file.TextFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FileTest {

    @Test
    void getTextFile() {
        TextFile textFile = new TextFile("Текст.txt","Привет");
        Assertions.assertEquals(12,textFile.getSize());
        Assertions.assertEquals("Текст.txt",textFile.getName());
    }

    @Test
    void getImageFile() {
        ImageFile imageFile = new ImageFile("Смайл.bmp",16,16, 8);
        Assertions.assertEquals(2048,imageFile.getSize());
        Assertions.assertEquals("Смайл.bmp",imageFile.getName());
    }

    @Test
    void testFile() {
        File file = new File("Файл") {
            @Override
            public long getSize() {
                return 0;
            }
        };
        Assertions.assertEquals("Файл", file.getName());
        Assertions.assertEquals(0, file.getSize());
    }
}