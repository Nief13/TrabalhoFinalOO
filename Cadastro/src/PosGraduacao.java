import java.util.Date;

public class PosGraduacao extends Aluno {
	private String semestreQualificacao;
	private Date dataDefesa;
	private Professor professor;
	
	public String getSemestreQualificacao() {
		return semestreQualificacao;
	}
	public void setSemestreQualificacao(String semestreQualificacao) {
		this.semestreQualificacao = semestreQualificacao;
	}
	public Date getDataDefesa() {
		return dataDefesa;
	}
	public void setDataDefesa(Date dataDefesa) {
		this.dataDefesa = dataDefesa;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public PosGraduacao() {
		
	}
}
