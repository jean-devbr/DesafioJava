package entities;

public class Eleitores {
	public double municipio;
	public double votoBranco;
	public double votoNulo;
	public double votoValido;
	
	public double porcentagemVotoBranco(){
		return (votoBranco / municipio) * 100;
		
	}
	
	public double porcentagemVotoNulo(){
		return (votoNulo / municipio) * 100;
		
	}
	
	public double porcentagemVotoValido(){
		return (votoValido / municipio) * 100;
		
	}
}
