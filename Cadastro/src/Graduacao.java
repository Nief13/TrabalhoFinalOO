import java.util.Date;

public class Graduacao extends Aluno {
	
	private String formaingresso;
	private String curso;
	private Date provavelFormatura;
	
	public String getFormaingresso() {
		return formaingresso;
	}
	public void setFormaingresso(String formaingresso) {
		this.formaingresso = formaingresso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Date getProvavelFormatura() {
		return provavelFormatura;
	}
	public void setProvavelFormatura(Date provavelFormatura) {
		this.provavelFormatura = provavelFormatura;
	}
	
	public Graduacao() {
	}
}
