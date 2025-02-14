package alanlee;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Java9新增的方法
 *
 * @author AlanLee
 * @date 2024-12-27
 */
public class TestInputStream {

    private InputStream inputStream;

    private static final String CONTENT = "Hello World";

    public void setUp() throws Exception {
        this.inputStream =
                TestInputStream.class.getResourceAsStream("/input.txt");
    }

    public void testReadAllBytes() throws Exception {
        //final String content = new String(this.inputStream.readAllBytes());
    }

    public void testReadNBytes() throws Exception {
        final byte[] data = new byte[5];
        //this.inputStream.readNBytes(data, 0, 5);
    }

    public void testTransferTo() throws Exception {
        final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //this.inputStream.transferTo(outputStream);
    }

}