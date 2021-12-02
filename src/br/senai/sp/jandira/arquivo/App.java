package br.senai.sp.jandira.arquivo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Arquivo arquivo = new Arquivo();
		String caminho = "C:\\Users\\21276377\\eclipse-workspace\\AQV\\arquivotxt";
		String testando =  "testando o gravar na pasta senai ";
		
		String tets = arquivo.ler(caminho)+"olaaaaaaaa";
		
		
		arquivo.gravar(caminho, tets);
		
		Frame frame = new Frame();
		frame.setVisible(true);
		
		
		
		
	//arquivo.gravar(caminho, testando);

	}

}
