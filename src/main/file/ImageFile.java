package main.file;

public class ImageFile extends File {

    private int width;
    private int height;
    private int bytesPerPixel;

    public ImageFile(String name, int width, int height, int bytesPerPixel) {
        super(name);
        this.width = width;
        this.height = height;
        this.bytesPerPixel = bytesPerPixel;
    }

    @Override
    public long getSize() {
        return (long) this.width * this.height * this.bytesPerPixel;
    }
}
