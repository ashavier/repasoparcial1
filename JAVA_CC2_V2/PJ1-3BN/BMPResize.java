import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File ;
import java.io.IOException;
import javax.imageio.ImageIO;



//Se deben de revisar los main
public class BMPResize {

	public BMPResize(String var) {
		File jpgOriginal = new File(var);
		File jpgResised = new File("ImageThin.bmp");
		resizeImage(jpgOriginal, jpgResised , 320, 480, "bmp");
		
		

	
		File jpgOriginal1 = new File(var);
		File jpgResised1 = new File("ImageFlat.bmp");
		resizeImage1(jpgOriginal1, jpgResised1 , 640, 240, "bmp");
	
	}
	
	
	private static void resizeImage(File originalImage, File resizedImage, int width, int height, String format) {
		try {
			BufferedImage original = ImageIO.read(originalImage);
			BufferedImage resized = new BufferedImage(width, height, original.getType());
			Graphics2D g2 = resized.createGraphics();
			g2.drawImage(original, 0, 0, width, height, null);
			g2.dispose();
			ImageIO.write(resized, format, resizedImage);
			
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
	}
	private static void resizeImage1(File originalImage, File resizedImage, int width, int height, String format) {
		try {
			BufferedImage original = ImageIO.read(originalImage);
			BufferedImage resized = new BufferedImage(width, height, original.getType());
			Graphics2D g2 = resized.createGraphics();
			g2.drawImage(original, 0, 0, width, height, null);
			g2.dispose();
			ImageIO.write(resized, format, resizedImage);
			
			
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
	}

}
