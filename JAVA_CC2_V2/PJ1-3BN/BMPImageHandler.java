import java.util.Arrays;
import java.io.File;

public class BMPImageHandler {
    public static void main(String[] args){
        
        
        if(args.length == 3){
           if(args[0].equals("-kernel")){
            BMPRunKernelFilter x = new BMPRunKernelFilter(args[2], args[1]);
            x.ReadFile();
            int i = 0;
  
          } else if(args[0].equals("-all")){
            BMPCore x = new BMPCore(args[1]);
            x.ReadFile();

            BMPRotations x2 = new BMPRotations();
            File input = new File(args[1]);
		        File output = new File("ImageUPRotation.bmp");
		        BMPRotations.rotateArriba(input, output);
        
		        File input1 = new File(args[1]);
		        File output1 = new File("ImageHRotation.bmp");
		        BMPRotations.rota(input1, output1, BMPRotations.ROTATE_RIGHT);
        
		        File input2 = new File(args[1]);
		        File output2 = new File("ImageVRotation.bmp");
		        BMPRotations.rota(input2, output2,BMPRotations.ROTATE_LEFT);

            BMPResize x3 = new BMPResize(args[1]);

            BMPGrayscale x4 = new BMPGrayscale(args[1]);
            x4.readFile();

            //BMPRunKernelFilter x5 = new BMPRunKernelFilter(args[2],// args[1]);
            //x5.ReadFile();  
          }

        } else if(args.length == 2){

          if(args[0].equals("-core")){
            BMPCore x = new BMPCore(args[1]);
            x.ReadFile();
            
          } else if (args[0].equals("-rotate")) {
            BMPRotations x = new BMPRotations();
            File input = new File(args[1]);
		        File output = new File("ImageUPRotation.bmp");
		        BMPRotations.rotateArriba(input, output);
        
		        File input1 = new File(args[1]);
		        File output1 = new File("ImageHRotation.bmp");
		        BMPRotations.rota(input1, output1, BMPRotations.ROTATE_RIGHT);
        
		        File input2 = new File(args[1]);
		        File output2 = new File("ImageVRotation.bmp");
		        BMPRotations.rota(input2, output2,BMPRotations.ROTATE_LEFT);
            
          } else if(args[0].equals("-resize")){
            BMPResize x = new BMPResize(args[1]);
  
          } else if(args[0].equals("-grayscale")){
            BMPGrayscale x = new BMPGrayscale(args[1]);
            x.readFile();
  
          } else {
            System.out.println("\nInvalid Input");
          }
  
        } else if(args.length == 1){
          if(args[0].equals("-help")){
            HelpBMPImageHandler help = new HelpBMPImageHandler();
            System.out.println(help.toString());
          } else {
            System.out.println("\nArgument missing");
          }

        } else {
          System.out.println("\n>> No arguments found.");
        }
    }
  }