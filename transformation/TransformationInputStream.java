package transformation;

import java.io.*;

public class TransformationInputStream extends FileInputStream {

    public TransformationInputStream(File file) throws FileNotFoundException {
        super(file);
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (Character.isLetter((char) data)) {
            return Character.isLowerCase(data) ? ((data - 'a' + 2) % 26 + 'a') : ((data - 'A' + 2) % 26 + 'A');
        }
        return data;
    }

    @Override
    public void close() throws IOException {
        super.close();
        System.out.println("closed");
    }
}