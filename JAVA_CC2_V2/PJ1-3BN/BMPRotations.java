

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class BMPRotations{ 

  int i;

  public BMPRotations(){
    this.i = 0;
  }


 public static final int ROTATE_LEFT = 1;
 public static final int ROTATE_RIGHT = -1;  

 public static void rota(File input, File output, int direction){
   try{
     ImageInputStream iis = ImageIO.createImageInputStream(input);
     Iterator<ImageReader> iterator = ImageIO.getImageReaders(iis);
     ImageReader reader = iterator.next();
     String format = reader.getFormatName();
 

     BufferedImage image = ImageIO.read(iis);
     int width = image.getWidth();
     int height = image.getHeight();

     BufferedImage rotated = new BufferedImage(height, width, image.getType());

     for(int y = 0; y < height; y++){
       for(int x = 0; x < width; x++){
         switch(direction){
         case ROTATE_LEFT:
             //rotated.setRGB(y, (width-1)-x, image.getRGB(x,y));
             rotated.setRGB(y, (width-1)-x, image.getRGB(x,y));
             break;
         case ROTATE_RIGHT:
        	 rotated.setRGB((height-1)- y, x, image.getRGB(x,y));
         }

       }

     }
     ImageIO.write(rotated, format, output);

   }
   catch(IOException ex){
     ex.printStackTrace();

   }

 }
 public static void rotateArriba(File input, File output){
	   try{
	     ImageInputStream iis = ImageIO.createImageInputStream(input);
	     Iterator<ImageReader> iterator = ImageIO.getImageReaders(iis);
	     ImageReader reader = iterator.next();
	     String format = reader.getFormatName();
	 

	     BufferedImage image = ImageIO.read(iis);
	     int width = image.getWidth();
	     int height = image.getHeight();

	     BufferedImage rotated = new BufferedImage(width , height, image.getType());

	     for(int y = 0; y < height; y++){
	       for(int x = 0; x < width; x++){
	    	   rotated.setRGB((width-1) -x,(height - 1) - y, image.getRGB(x,y));

	       }

	     }
	     ImageIO.write(rotated, format, output);

	   }
	   catch(IOException ex){
	     ex.printStackTrace();

	   }

	 }
} 
