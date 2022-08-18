import javax.imageio.*;
import java.io.FileInputStream;
import java.io.*;
import java.io.IOException;
import java.util.LinkedList;
import java.awt.image.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class BMPCore {
    String img;
    BufferedImage imgR;
    BufferedImage imgG;
    BufferedImage imgB;
    BufferedImage imgS;


    public BMPCore(String x){
        this.img = x;
    }

    public void ReadFile(){
        try{
            imgR = ImageIO.read(new File(this.img));
            imgG = ImageIO.read(new File(this.img));
            imgB = ImageIO.read(new File(this.img));
            imgS = ImageIO.read(new File(this.img));

            
            for (int x = 0; x < imgR.getWidth(); x++){
                for (int y = 0; y < imgR.getHeight(); y++){
                    int rgb = imgR.getRGB(x, y);
                    Color c = new Color(rgb, true);
    
                    int r = c.getRed();
                    int g = c.getGreen();
                    int b = c.getBlue();

                    Color rRgb = new Color(r, 0 , 0);
                    imgR.setRGB(x, y, rRgb.getRGB());

                    Color gRgb = new Color(0, g, 0);
                    imgG.setRGB(x, y, gRgb.getRGB());

                    Color bRgb = new Color(0, 0, b);
                    imgB.setRGB(x, y, bRgb.getRGB());

                    int p = imgS.getRGB(x,y);
                    int as = (p>>24)&0xff;
                    int rs = (p>>16)&0xff;
                    int gs = (p>>8)&0xff;
                    int bs = p&0xff;


                    int tr = (int)(0.393*rs + 0.769*gs + 0.189*bs);
                    int tg = (int)(0.349*rs + 0.686*gs + 0.168*bs);
                    int tb = (int)(0.272*rs + 0.534*gs + 0.131*bs);


                    // -----------------------------
                    if(tr > 255){
                        rs = 255;
                    } else {
                        rs = tr;
                    } 
                    // -----------------------------
                    if(tg > 255){
                        gs = 255;
                    } else {
                        gs = tg;
                    }
                    // -----------------------------
                    if(tb > 255){
                        bs = 255;
                    } else {
                        bs = tb;
                    }

                    p = (as<<24) | (rs<<16) | (gs<<8) | bs;
                    imgS.setRGB(x, y, p);

                }
            }

            String loc = System.getProperty("user.dir");

            File f = new File(loc + "/RedImage.bmp");
            ImageIO.write(imgR, "BMP", f);

            File f2 = new File(loc + "/GreenImage.bmp");
            ImageIO.write(imgG, "BMP", f2);

            File f3 = new File(loc + "/BlueImage.bmp");
            ImageIO.write(imgB, "BMP", f3);

            File f4 = new File(loc + "/SepiaImage.bmp");
            ImageIO.write(imgS, "BMP", f4);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}