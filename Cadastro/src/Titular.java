import java.util.Date;
public class Titular extends Associado {
	private Date concurso;
	private Date dataDeAdmissao;
	public Date getConcurso() {
		return concurso;
	}
	public void setConcurso(Date concurso) {
		this.concurso = concurso;
	}
	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public Titular() {
		
	}
}
