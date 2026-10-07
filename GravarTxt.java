import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GravarTxt implements OperacaoArquivo {
    @Override
    public void executar() throws IOException {

      Scanner sc = new Scanner(System.in);
      System.out.println("Digite o nome do arquivo:");
      String nomeArquivo = sc.nextLine();

      System.out.println("Digite o texto para ser gravado no arquivo");
      String texto = sc.nextLine();

      Path caminho = criaPasta.obterCaminho(nomeArquivo);

        BufferedWriter writer = Files.newBufferedWriter(caminho);

        try(writer) {
            
            writer.write(texto);
                
            }

        }

        
    }
    
    
    
    

}
