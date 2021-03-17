package pacote1;
public class Cachorro {
//atributos
	private String pêlos;
	private char tamanho;
	private String raça;
	private char sexo;
	private float peso;
	private String cor;
	private int idade;
	private boolean vacina;
	private boolean pedigree;
	//métodos de acesso
	
	public String getPêlos() {
		return pêlos;
	}

	public void setPêlos(String pêlos) {
		this.pêlos = pêlos;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public void setPeso(float p) {
		peso = p;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}
	
	public Cachorro(String raça, String cor1, char sexo) {
		this.raça=raça;
		cor=cor1;
		this.sexo=sexo;
		
	}
	//métodos de classes
	public void miar(){
		System.out.println("au, au, au");
	}
	
	public void roçardono(){
		System.out.println("roçar, roçar, roçar...");
	}
	
	public boolean sentar(boolean obd){
		if (obd) {
			System.out.println("sentado");
		}
		else
		{
			System.out.println("tudo menos sentado");
		}
		
		return obd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro o1=new Cachorro("Shitzu","amarelo",'F');
		o1.setIdade(20);
		Cachorro o2=new Cachorro("Buldoge Frances","branco",'M');
		o2.miar();
		Cachorro o3=new Cachorro("Rusky","preto",'F');
		o3.sentar(false);
		Cachorro o4=new Cachorro("Vira-lata","marron",'F');
		o4.sentar(true);

	}
	
}	