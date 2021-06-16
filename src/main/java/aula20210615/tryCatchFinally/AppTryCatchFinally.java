package aula20210615.tryCatchFinally;

import java.io.FileOutputStream;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class AppTryCatchFinally {
	
	public static void main(String[] args) throws Exception {
		
		gravarTextoNoArquivo("d:/hello.txt", "HelloWorld! :D", 1000);
		
		JOptionPane.showMessageDialog(null, "teste");
		
	}

	private static void gravarTextoNoArquivo(String nomeDoArquivo, String texto, int repetiçõesDoTexto) throws Exception {
		FileOutputStream output = null;
		try {
			output = new FileOutputStream(nomeDoArquivo);
			PrintWriter printWriter = new PrintWriter(output);
			for (int i = 0; i < repetiçõesDoTexto; i++) {
				printWriter.println(texto);
				printWriter.flush();
				if (i == 33) {
					return;
				}
			}
		} finally {
			System.out.println("Interessante, passou no finally!");
			if (output != null) {
				output.close();
			}
		}
		System.out.println("Terminou de gravar!");
	}

}
