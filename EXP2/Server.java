import java.awt.event.WindowAdapter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Server {
    
    public static void main(String[] args) 
    {
        
        ServerSocket server = null;
        Socket client = null;
        try
        {
            server = new ServerSocket(4000);
            System.out.println("Server Started!\nServer waiting for an image...");
            client = server.accept();
            InputStream in = client.getInputStream();
            DataInputStream dis = new DataInputStream(in);
            int image_len = dis.readInt();
            System.out.println("Image size : "+image_len/1024+"KiB");
            byte[] data = new byte[image_len];
            dis.readFully(data);
            dis.close();
            in.close();
            InputStream in_strm = new ByteArrayInputStream(data);
            BufferedImage img = ImageIO.read(in_strm);

            //GUI

            JFrame frame = new JFrame("Server");
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel();
            label.setIcon(icon);
            frame.add(label);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.addWindowListener(new WindowAdapter()
            {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent)
                {
                    System.out.println("Server Closed.");
                }
            }
            );
            frame.setVisible(true);
            server.close();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
