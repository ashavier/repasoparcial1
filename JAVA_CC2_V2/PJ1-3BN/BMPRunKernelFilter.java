import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
import java.io.BufferedWriter;

import javax.imageio.ImageIO;

public class BMPRunKernelFilter {

	String img; 
  String file;
	BufferedImage imgR;
  LinkedList matrix;


	public BMPRunKernelFilter(String x, String f){
		this.img = x;
    this.matrix = new LinkedList();
    this.file = f;
	}

	public void ReadFile(){
		try {
			imgR = ImageIO.read(new File(img));
			for (int y = 0; y < imgR.getHeight(); y++){
 			  for (int x = 0; x < imgR.getWidth(); x++){
					
					if(x!=0 || y!=0 || y!=imgR.getHeight() || x!= imgR.getWidth()) {
						int resultado = (int) (imgR.getRGB(x, y)*1  +  
								imgR.getRGB(x+1, y-1)*0.1+imgR.getRGB(x-1, y)*-1+imgR.getRGB(x, y)*5+
								imgR.getRGB(x+1, y)*-1+imgR.getRGB(x-1, y+1)*0.1+imgR.getRGB(x, y+1)*-1+
								imgR.getRGB(x+1, y+1)*0.1);
						imgR.setRGB(x,y,(int)resultado);

            matrix.add(resultado);
						
					} else  {
						System.out.println("Fail ...");
					}
			  }
      }
      System.out.println(matrix);
    } catch (Exception e){
		//System.out.println("Fail # 2 ...");

		System.out.println(e.getMessage());
    /*public class CrearArchivo {
    public static void main(String ars[]){
        try {
            String ruta = "C:\\Users\\ponch\\Desktop\\Prueba\\Prueba.txt";
            String contenido = "Contenido de ejemplo"; //Aqui se inserta el texto qeu se desea 
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
		}
  }
}