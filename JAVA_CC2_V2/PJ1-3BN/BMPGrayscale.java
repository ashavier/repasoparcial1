import javax.imageio.*;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.image.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class BMPGrayscale{
    String img;
    BufferedImage imgs;

    public BMPGrayscale(String x){
        this.img = x;
    }

    public void readFile(){
        try{
            imgs = ImageIO.read(new File(this.img));
    
            for (int x = 0; x < imgs.getWidth(); x++){
                for (int y = 0; y < imgs.getHeight(); y++){
    
                    int p = imgs.getRGB(x,y);
                    int a = (p>>24)&0xff;
                    int r = (p>>16)&0xff;
                    int g = (p>>8)&0xff;
                    int b = p&0xff;
    
                    int prom = (r+g+b)/3;
                    p = (a<<24) | (prom<<16) | (prom<<8) | prom;
    
                    imgs.setRGB(x, y, p);
                }
            }
    
            String loc = System.getProperty("user.dir");
    
            File f = new File(loc + "/GrayScaleImage.bmp");
            ImageIO.write(imgs, "BMP", f);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
}