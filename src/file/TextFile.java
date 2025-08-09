package file;

import java.nio.charset.Charset;

public class TextFile extends File {

    private String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    @Override
    public long getSize() {
        return this.content.getBytes(Charset.defaultCharset()).length;
    }
}
