package br.senai.sp.jandira.arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;

public class Arquivo {

	// criar e grava dados
	public boolean gravar(String posicao, String texto) {
		try {

			FileWriter arquivo = new FileWriter(posicao);
			// ajjuda a manipular
			PrintWriter textoescrito = new PrintWriter(arquivo);

			// pegar oq esta no txt tipo o scanner//
			textoescrito.append(texto);
			textoescrito.close();
			return true;

		} catch (IOException e) {

			System.out.println("erro : " + e.getMessage());
			return false;

		}

	}

	public String ler(String caminho) {

		String conteudo = "";

		try {
			// representa o arquivo em modo de leitura
			FileReader lerArquivo = new FileReader(caminho);
			// representa o dado na memoria do programa
			BufferedReader lerdados = new BufferedReader(lerArquivo);

			String linha = "";
 
			String quebrar ="\n";
			
			
			linha = lerdados.readLine();
			while (linha != null) {
				conteudo += linha+quebrar;
				linha = lerdados.readLine();
			}
			lerdados.close();

			

		} catch (IOException e) {

			
			System.out.println("erro aaaa " +e.getMessage());
			
		}
		  return conteudo;
	}

}
