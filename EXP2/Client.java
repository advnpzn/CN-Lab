import java.net.Socket;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;

public class Client 
{

    public static void main(String[] args) throws Exception 
    {
        
        BufferedImage img = null;
        Socket client = null;
        try
        {
            client = new Socket("localhost", 4000);
        } catch (Exception e)
        {
            System.out.println(e);
        }

        try
        {
            System.out.println("Reading image from the Disk...");
            img = ImageIO.read(new File("image.jpg"));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(img, "jpg", baos);
            baos.flush();
            byte[] bytes = baos.toByteArray();
            baos.close();
            System.out.println("Sending Image to Server...");
            OutputStream out = client.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            dos.writeInt(bytes.length);
            dos.write(bytes, 0, bytes.length);
            System.out.println("Image sent to Server...");
            dos.close();
            out.close();
        } catch (Exception e)
        {
            System.out.println("Oopsie looks like something's wrong. Check this : "+e.getMessage());
            client.close();
        }
        client.close();
    }

}