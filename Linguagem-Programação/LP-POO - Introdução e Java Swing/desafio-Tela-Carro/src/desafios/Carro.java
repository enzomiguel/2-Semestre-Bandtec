package desafios;

public class Carro {

	//atributos
	private Integer   combustivel =100, machas = 0;
	private Double velocidade =0.00;
	boolean aviso;
	
	//metodos
	public void acelerar() {
		
		velocidade +=10;
		combustivel -=10;
		
	}
	
	public void freiar() {
		if(velocidade == 0.00) {
			velocidade=0.00;
		}
		else {
			velocidade-=10;
		}
		
	}
	
	public void abastecer() {
		
		combustivel +=20;
	}
	
	public void passarMarchas() {
		
		machas ++;
	}
	public void diminuirMarchas() {
		machas--;
	}
	
	public Integer getCombustivel() {
		return combustivel;
	}
	
	public void setMachas(Integer machas) {
		this.machas = machas;
	}
	
	public Integer getMachas() {
		return machas;
	}
	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	public Double getVelocidade() {
		return velocidade;
	}
	public void setCombustivel(Integer combustivel) {
		this.combustivel = combustivel;
	}
	public Integer getCombustivel(Integer combustivel) {
		return combustivel;
	}
}
