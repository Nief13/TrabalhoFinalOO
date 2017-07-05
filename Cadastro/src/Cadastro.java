import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cadastro {
	public static Auxiliar validaProfessorAux(int matricula, ArrayList<Auxiliar> array){
		int i=0;
		while (true){
			if(array.get(i).getMatriculaSiape()==matricula){
				return array.get(i);
			}
			i++;
			
		}
	}
	
	public static Assistente validaProfessorAssi(int matricula, ArrayList<Assistente> array){
		int i=0;
		while (true){
			if(array.get(i).getMatriculaSiape()==matricula){
				return array.get(i);
			}
			i++;
			
		}
	}
	
	public static Adjunto validaProfessorAdj(int matricula, ArrayList<Adjunto> array){
		int i=0;
		while (true){
			if(array.get(i).getMatriculaSiape()==matricula){
				return array.get(i);
			}
			i++;
			
		}
	}
	public static Associado validaProfessorAsso(int matricula, ArrayList<Associado> array){
		int i=0;
		while (true){
			if(array.get(i).getMatriculaSiape()==matricula){
				return array.get(i);
			}
			i++;
			
		}
	}
	public static Titular validaProfessorTit(int matricula, ArrayList<Titular> array){
		int i=0;
		while (true){
			if(array.get(i).getMatriculaSiape()==matricula){
				return array.get(i);
			}
			i++;
			
		}
	}
	public static Disciplina validaDisciplina(String disciplina, ArrayList<Disciplina> array){
		Disciplina objeto =null;
		for (int i =0; i< array.size(); i++){
			if(array.get(i).getNome().equals(disciplina)){
				objeto=array.get(i);	
			}
		}
		return objeto;
	}
	public static void main(String[] args) {
		System.out.println("Bem vindo ao cadastro!\n");
		int h=1, k=0;
		System.out.println("Para bom funcionamento do cadastro não utize 'espaço'"
				+ "\nPortanto utilize 'underline'\n");
		
		ArrayList<Auxiliar> listaDeAuxiliar = new ArrayList <>();
		ArrayList<Graduacao> listaDeGraduacao = new ArrayList <>();
		ArrayList<Especial> listaDeEspecial = new ArrayList <>();
		ArrayList<PosGraduacao> listaDePosGraduacao = new ArrayList <>();
		ArrayList<Assistente> listaDeAssistente = new ArrayList <>();
		ArrayList<Adjunto> listaDeAdjunto = new ArrayList <>();
		ArrayList<Titular> listaDeTitular = new ArrayList <>();
		ArrayList<Associado> listaDeAssociado = new ArrayList <>();
		ArrayList<Disciplina> listaDeDisciplina = new ArrayList <>();
		ArrayList<Turma> listaDeTurma = new ArrayList <>();
		ArrayList<Estagio> listaDeEstagio = new ArrayList <>();
		
		Auxiliar profer = new Auxiliar();
		profer.setMatriculaSiape(000);
		listaDeAuxiliar.add(profer);
		Disciplina disc = new Disciplina();
		disc.setNome("default");
		listaDeDisciplina.add(disc);
		
		while (h==1){
			h=1;
			k=0;
			System.out.println("O que vc gostaria de cadastrar? ");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Disciplina");
			System.out.println("4 - Turma");
			try{	
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				@SuppressWarnings("resource")
				Scanner ler = new Scanner(System.in);
				
				int n=0,m=0,p=0,q=0,s=0; 
				while (n!=1 && n!=2 && n!=3 && n!=4){
					n = ler.nextInt();
					switch (n){
					case 1:
						int matricula;
						String nome, semestreingresso;
						System.out.println("1 - Graduação");
						System.out.println("2 - Pós-Graduação");
						while (m!=1 && m!=2){
							m = ler.nextInt();
							switch (m){
							case 1:
								String formaingresso, curso,x;
								Date provavelFormatura = null;
								System.out.println("Matrícula do aluno: ");
								matricula = ler.nextInt();
								System.out.println("Nome do Aluno: ");
								nome = ler.next();
								System.out.println("Semestre de ingresso: ");
								semestreingresso=ler.next();
								System.out.println("Forma de Ingresso na Universidade: ");
								formaingresso=  ler.next();
								System.out.println("Curso: ");
								curso= ler.next();
								System.out.println("Provavel data para a formatura: ");
								while(provavelFormatura == null){
									x=ler.next();
									try {
										provavelFormatura = f.parse(x);
										//System.out.println(f.format(provavelFormatura));
									} catch (ParseException e) {
									
										System.out.println("Data inválida, digite novamente: ");
									}
								}
							
								
								Graduacao g1 = new Graduacao();
								g1.setMatricula(matricula);
								g1.setNome(nome);
								g1.setSemestreingresso(semestreingresso);
								g1.setFormaingresso(formaingresso);
								g1.setCurso(curso);
								g1.setProvavelFormatura(provavelFormatura);
								
								listaDeGraduacao.add(g1);
								System.out.println("Aluno cadastrado com sucesso.");
								
								break;
							case 2:
								System.out.println("Matrícula do aluno: ");
								matricula = ler.nextInt();
								System.out.println("Nome do Aluno: ");
								nome = ler.next();
								System.out.println("Semestre de ingresso: ");
								semestreingresso=ler.next();
								String semestreQualificacao;
								Date dataDefesa= null;
								
								System.out.println("Semestre de qualificação: ");
								semestreQualificacao = ler.next();
								System.out.println("Provável data de defesa: ");
								while(dataDefesa == null){
									x=ler.next();
									try {
										dataDefesa = f.parse(x);
										//System.out.println(f.format(dataDefesa));
									} catch (ParseException e) {
									
										System.out.println("Data inválida, digite novamente: ");
									}
								}
								int matricula_prof;
								System.out.println("Aluno especial? ");
								System.out.println("1 - Sim");
								System.out.println("2 - Não");
								while(p!=1 && p!=2){
									p = ler.nextInt();
									switch (p){
									case 1:
										Especial esp = new Especial();
										boolean taxaPaga= false;
										String semestreCursando;
										System.out.println("A taxa foi paga? ");
										System.out.println("1 - Sim ");
										System.out.println("2 - Não ");
										while(q!=1 && q!=2){
											q=ler.nextInt();
											switch (q){
											case 1:
												taxaPaga=true;
												break;
											case 2:
												taxaPaga=false;
												break;
											default:
												 System.out.println("Digito inválido, tente de novo: ");
												 q=0;
												 break;
											}
										}
										System.out.println("Semestre Cursando: ");
										semestreCursando=ler.next();
										System.out.println("Lista de Professores cadastrados: \n");
										for(int i =0; i< listaDeAuxiliar.size(); i++){
											System.out.println(listaDeAuxiliar.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeAssistente.size(); i++){
											System.out.println(listaDeAssistente.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeAdjunto.size(); i++){
											System.out.println(listaDeAdjunto.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeAssociado.size(); i++){
											System.out.println(listaDeAssociado.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeTitular.size(); i++){
											System.out.println(listaDeTitular.get(i).getMatriculaSiape());
										}
										System.out.println("\nDigite a Matricula do professor orientedor: ");
										matricula_prof = ler.nextInt();
										if (validaProfessorAux(matricula_prof,listaDeAuxiliar) != null){
											esp.setProfessor(validaProfessorAux(matricula_prof,listaDeAuxiliar));
										}
										else if (validaProfessorAssi(matricula_prof,listaDeAssistente) != null){
											esp.setProfessor(validaProfessorAssi(matricula_prof,listaDeAssistente));
										}
										else if (validaProfessorAdj(matricula_prof,listaDeAdjunto) != null){
											esp.setProfessor(validaProfessorAdj(matricula_prof,listaDeAdjunto));
										}
										else if (validaProfessorAsso(matricula_prof,listaDeAssociado) != null){
											esp.setProfessor(validaProfessorAsso(matricula_prof,listaDeAssociado));
										}
										else if (validaProfessorTit(matricula_prof,listaDeTitular) != null){
											esp.setProfessor(validaProfessorTit(matricula_prof,listaDeTitular));
										}
										else{
											System.out.println("Matrícula inválida");
											break;
										}
										
										
										
										esp.setMatricula(matricula);
										esp.setNome(nome);
										esp.setSemestreQualificacao(semestreQualificacao);
										esp.setDataDefesa(dataDefesa);
										esp.setTaxaPaga(taxaPaga);
										esp.setSemestreCursando(semestreCursando);
										
										listaDeEspecial.add(esp);
										System.out.println("Aluno cadastrado com sucesso.");
										
										break;
									case 2:
										PosGraduacao pos = new PosGraduacao();
										pos.setMatricula(matricula);
										pos.setNome(nome);
										pos.setSemestreQualificacao(semestreQualificacao);
										pos.setDataDefesa(dataDefesa);
										System.out.println("Lista de Professores cadastrados: \n");
										for(int i =0; i< listaDeAuxiliar.size(); i++){
											System.out.println(listaDeAuxiliar.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeAssistente.size(); i++){
											System.out.println(listaDeAssistente.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeAdjunto.size(); i++){
											System.out.println(listaDeAdjunto.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeAssociado.size(); i++){
											System.out.println(listaDeAssociado.get(i).getMatriculaSiape());
										}
										for(int i =0; i< listaDeTitular.size(); i++){
											System.out.println(listaDeTitular.get(i).getMatriculaSiape());
										}
										System.out.println("\nMatricula do professor orientedor: ");
										matricula_prof = ler.nextInt();
										if (validaProfessorAux(matricula_prof,listaDeAuxiliar) != null){
											pos.setProfessor(validaProfessorAux(matricula_prof,listaDeAuxiliar));
										}
										else if (validaProfessorAssi(matricula_prof,listaDeAssistente) != null){
											pos.setProfessor(validaProfessorAssi(matricula_prof,listaDeAssistente));
										}
										else if (validaProfessorAdj(matricula_prof,listaDeAdjunto) != null){
											pos.setProfessor(validaProfessorAdj(matricula_prof,listaDeAdjunto));
										}
										else if (validaProfessorAsso(matricula_prof,listaDeAssociado) != null){
											pos.setProfessor(validaProfessorAsso(matricula_prof,listaDeAssociado));
										}
										else if (validaProfessorTit(matricula_prof,listaDeTitular) != null){
											pos.setProfessor(validaProfessorTit(matricula_prof,listaDeTitular));
										}
										else{
											System.out.println("Matrícula inválida");
											break;
										}
										
										listaDePosGraduacao.add(pos);
										System.out.println("Aluno cadastrado com sucesso.");
										
										break;
									default:
										 System.out.println("Digito inválido, tente de novo: ");
										 p=0;
										 break;
									}
								}
								break;
							default:
								 System.out.println("Digito inválido, tente de novo: ");
								 m=0;
								 break;
							}
						}
						break;
					
					case 2:
						int matriculaSiape, matriculaFUB,anoGraduacao,anoMestrado,anoDoutorado;
						String formacao,graduacao,mestrado,tituloDissertacao,doutorado;
						String tituloTese,areaDePesquisa,y,z;
						float salario;
						Date concurso=null, dataDeAdmissao=null;
						
						System.out.println("Matricula SIAPE do professor: ");
						matriculaSiape=ler.nextInt();
						System.out.println("Matricula FUB do professsor");
						matriculaFUB=ler.nextInt();
						System.out.println("Formação do professor: ");
						formacao = ler.next();
						System.out.println("Salário do professor: ");
						salario=ler.nextFloat();
						
						System.out.println("Qual a cadegoria de professor: ");
						System.out.println("1 - Auxiliar");
						System.out.println("2 - Assistente");
						System.out.println("3 - Adjunto");
						System.out.println("4 - Associado");
						System.out.println("5 - Titular");
						
						
						while(s!=1 && s!=2 && s!=3 && s !=4 && s!=5){
							s=ler.nextInt();
							switch (s){
							case 1:
								System.out.println("Graduação do professor: ");
								graduacao=ler.next();
								System.out.println("Ano de Graduação: ");
								anoGraduacao=ler.nextInt();
								
								Auxiliar aux = new Auxiliar();
								aux.setMatriculaSiape(matriculaSiape);
								aux.setMatriculaFUB(matriculaFUB);
								aux.setFormacao(formacao);
								aux.setSalario(salario);
								aux.setGraduacao(graduacao);
								aux.setAnoGraduacao(anoGraduacao);
								
								listaDeAuxiliar.add(aux);
								System.out.println("Professor auxiliar cadastrado com sucesso.");
								
								break;
							case 2:
								System.out.println("Graduação do professor: ");
								graduacao=ler.next();
								System.out.println("Ano de Graduação: ");
								anoGraduacao=ler.nextInt();
								System.out.println("Área do mestrado: ");
								mestrado=ler.next();
								System.out.println("Ano do mestrado: ");
								anoMestrado=ler.nextInt();
								System.out.println("Título da dissertação: ");
								tituloDissertacao=ler.next();
								
								Assistente assi = new Assistente();
								assi.setMatriculaSiape(matriculaSiape);
								assi.setMatriculaFUB(matriculaFUB);
								assi.setFormacao(formacao);
								assi.setSalario(salario);
								assi.setGraduacao(graduacao);
								assi.setAnoGraduacao(anoGraduacao);
								assi.setMestrado(mestrado);
								assi.setAnoMestrado(anoMestrado);
								assi.setTituloDissertacao(tituloDissertacao);
								
								listaDeAssistente.add(assi);
								System.out.println("Professor assistente cadastrado com sucesso.");
								
								break;
							case 3:
								System.out.println("Graduação do professor: ");
								graduacao=ler.next();
								System.out.println("Ano de Graduação: ");
								anoGraduacao=ler.nextInt();
								System.out.println("Área do mestrado: ");
								mestrado=ler.next();
								System.out.println("Ano do mestrado: ");
								anoMestrado=ler.nextInt();
								System.out.println("Título da dissertação: ");
								tituloDissertacao=ler.next();
								System.out.println("Área do doutorado: ");
								doutorado=ler.next();
								System.out.println("Ano do doutorado: ");
								anoDoutorado=ler.nextInt();
								System.out.println("Título da tese: ");
								tituloTese=ler.next();
								
								Adjunto adj = new Adjunto();
								adj.setMatriculaSiape(matriculaSiape);
								adj.setMatriculaFUB(matriculaFUB);
								adj.setFormacao(formacao);
								adj.setSalario(salario);
								adj.setGraduacao(graduacao);
								adj.setAnoGraduacao(anoGraduacao);
								adj.setMestrado(mestrado);
								adj.setAnoMestrado(anoMestrado);
								adj.setTituloDissertacao(tituloDissertacao);
								adj.setDoutorado(doutorado);
								adj.setAnoDoutorado(anoDoutorado);
								adj.setTituloTese(tituloTese);
								
								listaDeAdjunto.add(adj);
								System.out.println("Professor adjunto cadastrado com sucesso.");
								
								break;
							case 4:
								System.out.println("Graduação do professor: ");
								graduacao=ler.next();
								System.out.println("Ano de Graduação: ");
								anoGraduacao=ler.nextInt();
								System.out.println("Área do mestrado: ");
								mestrado=ler.next();
								System.out.println("Ano do mestrado: ");
								anoMestrado=ler.nextInt();
								System.out.println("Título da dissertação: ");
								tituloDissertacao=ler.next();
								System.out.println("Área do doutorado: ");
								doutorado=ler.next();
								System.out.println("Ano do doutorado: ");
								anoDoutorado=ler.nextInt();
								System.out.println("Título da tese: ");
								tituloTese=ler.next();
								System.out.println("Área de pesquisa: ");
								areaDePesquisa=ler.next();
								
								Associado asso = new Associado();
								asso.setMatriculaSiape(matriculaSiape);
								asso.setMatriculaFUB(matriculaFUB);
								asso.setFormacao(formacao);
								asso.setSalario(salario);
								asso.setGraduacao(graduacao);
								asso.setAnoGraduacao(anoGraduacao);
								asso.setMestrado(mestrado);
								asso.setAnoMestrado(anoMestrado);
								asso.setTituloDissertacao(tituloDissertacao);
								asso.setDoutorado(doutorado);
								asso.setAnoDoutorado(anoDoutorado);
								asso.setTituloTese(tituloTese);
								asso.setAreaDePesquisa(areaDePesquisa);
								
								listaDeAssociado.add(asso);
								System.out.println("Professor associado cadastrado com sucesso.");
								
								break;
							case 5:
								System.out.println("Graduação do professor: ");
								graduacao=ler.next();
								System.out.println("Ano de Graduação: ");
								anoGraduacao=ler.nextInt();
								System.out.println("Área do mestrado: ");
								mestrado=ler.next();
								System.out.println("Ano do mestrado: ");
								anoMestrado=ler.nextInt();
								System.out.println("Título da dissertação: ");
								tituloDissertacao=ler.next();
								System.out.println("Área do doutorado: ");
								doutorado=ler.next();
								System.out.println("Ano do doutorado: ");
								anoDoutorado=ler.nextInt();
								System.out.println("Título da tese: ");
								tituloTese=ler.next();
								System.out.println("Área de pesquisa: ");
								areaDePesquisa=ler.next();
								System.out.println("Data de realização do concurso: ");
								while(concurso == null){
									y=ler.next();
									try {
										concurso = f.parse(y);
									} catch (ParseException e) {
									
										System.out.println("Data inválida, digite novamente: ");
									}
								}
								while(dataDeAdmissao == null){
									z=ler.next();
									try {
										dataDeAdmissao = f.parse(z);
									} catch (ParseException e) {
									
										System.out.println("Data inválida, digite novamente: ");
									}
								}
								
								Titular t = new Titular();
								t.setMatriculaSiape(matriculaSiape);
								t.setMatriculaFUB(matriculaFUB);
								t.setFormacao(formacao);
								t.setSalario(salario);
								t.setGraduacao(graduacao);
								t.setAnoGraduacao(anoGraduacao);
								t.setMestrado(mestrado);
								t.setAnoMestrado(anoMestrado);
								t.setTituloDissertacao(tituloDissertacao);
								t.setDoutorado(doutorado);
								t.setAnoDoutorado(anoDoutorado);
								t.setTituloTese(tituloTese);
								t.setAreaDePesquisa(areaDePesquisa);
								t.setConcurso(concurso);
								t.setDataDeAdmissao(dataDeAdmissao);
								
								listaDeTitular.add(t);
								System.out.println("Professor titular cadastrado com sucesso.");
								
								break;
							default:
								break;
							}
						}
				
						break;
						
					case 3:
						String nomed;
						int cargaHoraria,r=0;
						System.out.println("Nome da disciplina: ");
						nomed=ler.next();
						System.out.println("Carga horária da disciplina: ");
						cargaHoraria= ler.nextInt();
						System.out.println("Disciplina normal ou de estágio? ");
						System.out.println("1 - Nomal ");
						System.out.println("2 - Estágio ");
						while(r!=1 && r!=2){
							r=ler.nextInt();
							switch (r){
							case 1:
								Disciplina dis = new Disciplina();
								dis.setNome(nomed);
								dis.setCargaHoraria(cargaHoraria);
								
								listaDeDisciplina.add(dis);
								System.out.println("Disciplina cadastrada com sucesso.");
								break;
							case 2:
								int matricula_prof;
								String localDeEstagio,responsavel;
								System.out.println("Local de estagio");
								localDeEstagio=ler.next();
								System.out.println("Responsável: ");
								responsavel=ler.next();
								Estagio est = new Estagio();
								System.out.println("Lista de Professores cadastrados: \n");
								for(int i =0; i< listaDeAuxiliar.size(); i++){
									System.out.println(listaDeAuxiliar.get(i).getMatriculaSiape());
								}
								for(int i =0; i< listaDeAssistente.size(); i++){
									System.out.println(listaDeAssistente.get(i).getMatriculaSiape());
								}
								for(int i =0; i< listaDeAdjunto.size(); i++){
									System.out.println(listaDeAdjunto.get(i).getMatriculaSiape());
								}
								for(int i =0; i< listaDeAssociado.size(); i++){
									System.out.println(listaDeAssociado.get(i).getMatriculaSiape());
								}
								for(int i =0; i< listaDeTitular.size(); i++){
									System.out.println(listaDeTitular.get(i).getMatriculaSiape());
								}
								System.out.println("\nMatricula do professor responsável pela disciplina: ");
								matricula_prof = ler.nextInt();
								if (validaProfessorAux(matricula_prof,listaDeAuxiliar) != null){
									est.setProfessor(validaProfessorAux(matricula_prof,listaDeAuxiliar));
								}
								else if (validaProfessorAssi(matricula_prof,listaDeAssistente) != null){
									est.setProfessor(validaProfessorAssi(matricula_prof,listaDeAssistente));
								}
								else if (validaProfessorAdj(matricula_prof,listaDeAdjunto) != null){
									est.setProfessor(validaProfessorAdj(matricula_prof,listaDeAdjunto));
								}
								else if (validaProfessorAsso(matricula_prof,listaDeAssociado) != null){
									est.setProfessor(validaProfessorAsso(matricula_prof,listaDeAssociado));
								}
								else if (validaProfessorTit(matricula_prof,listaDeTitular) != null){
									est.setProfessor(validaProfessorTit(matricula_prof,listaDeTitular));
								}
								else{
									System.out.println("Matrícula inválida");
									break;
								}
								est.setNome(nomed);
								est.setCargaHoraria(cargaHoraria);
								est.setLocalDeEstagio(localDeEstagio);
								est.setResponsavel(responsavel);
								
								listaDeEstagio.add(est);
								System.out.println("Disciplina de estágio cadastrada com sucesso.");
								
								break;
							default:
								 System.out.println("Digito inválido, tente de novo: ");
								 r=0;
								 break;
							}
						}
						
						break;
					case 4:
						int codigo;
						String horario;
						int matricula_prof;
						String disciplina;
						Turma tur = new Turma();
						System.out.println("Codigo da Turma: ");
						codigo = ler.nextInt();
						System.out.println("Horário da turma: ");
						horario=ler.next();
						System.out.println("Lista de Professores cadastrados: \n");
						for(int i =0; i< listaDeAuxiliar.size(); i++){
							System.out.println(listaDeAuxiliar.get(i).getMatriculaSiape());
						}
						for(int i =0; i< listaDeAssistente.size(); i++){
							System.out.println(listaDeAssistente.get(i).getMatriculaSiape());
						}
						for(int i =0; i< listaDeAdjunto.size(); i++){
							System.out.println(listaDeAdjunto.get(i).getMatriculaSiape());
						}
						for(int i =0; i< listaDeAssociado.size(); i++){
							System.out.println(listaDeAssociado.get(i).getMatriculaSiape());
						}
						for(int i =0; i< listaDeTitular.size(); i++){
							System.out.println(listaDeTitular.get(i).getMatriculaSiape());
						}
						
						System.out.println("\nMatricula do professor responsável: ");
						matricula_prof = ler.nextInt();
						if (validaProfessorAux(matricula_prof,listaDeAuxiliar) != null){
							tur.setProfessor(validaProfessorAux(matricula_prof,listaDeAuxiliar));
						}
						else if (validaProfessorAssi(matricula_prof,listaDeAssistente) != null){
							tur.setProfessor(validaProfessorAssi(matricula_prof,listaDeAssistente));
						}
						else if (validaProfessorAdj(matricula_prof,listaDeAdjunto) != null){
							tur.setProfessor(validaProfessorAdj(matricula_prof,listaDeAdjunto));
						}
						else if (validaProfessorAsso(matricula_prof,listaDeAssociado) != null){
							tur.setProfessor(validaProfessorAsso(matricula_prof,listaDeAssociado));
						}
						else if (validaProfessorTit(matricula_prof,listaDeTitular) != null){
							tur.setProfessor(validaProfessorTit(matricula_prof,listaDeTitular));
						}
						else{
							System.out.println("Matrícula inválida");
							break;
						}
						System.out.println("Lista de Disciplinas cadastradas:\n");
						for(int i =0; i< listaDeDisciplina.size(); i++){
							System.out.println(listaDeDisciplina.get(i).getNome());
						}
						System.out.println("\nDisciplina ministrada à Turma: ");
						disciplina = ler.next();
						if (validaDisciplina(disciplina,listaDeDisciplina)!= null){
							tur.setDisciplina(validaDisciplina(disciplina,listaDeDisciplina));
						}
						else {
							System.out.println("Disciplina inválida");
						}
						tur.setCodigo(codigo);
						tur.setHorario(horario);
						
						listaDeTurma.add(tur);
						System.out.println("Turma cadastrada com sucesso.");
						
						break;
					default:
						 System.out.println("Digito inválido, tente de novo: ");
						 n=0;
						 break;
					}
					break;
				}
				System.out.println("Você gostaria de cadastrar mais alguma coisa? ");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				while(k!=1 && k!=2){
					k=ler.nextInt();
					switch(k){
					case 1:
						h=k;
						break;
					case 2:
						h=0;
						System.out.println("Escreva um nome para o arquivo .txt aonde o cadastro será gravado:");
						String arquivo;
						arquivo = ler.next();
						try {
							FileWriter fw = new FileWriter(arquivo);
							PrintWriter pw= new PrintWriter(fw);
							pw.println("Alunos:\n");
							for(int i =0; i< listaDeGraduacao.size(); i++){
								pw.println(listaDeGraduacao.get(i).getNome());
							}
							for(int i =0; i< listaDePosGraduacao.size(); i++){
								pw.println(listaDePosGraduacao.get(i).getNome());
							}
							for(int i =0; i< listaDeEspecial.size(); i++){
								pw.println(listaDeEspecial.get(i).getNome());
							}
							pw.println("\n\nProfessores:\n");
							for(int i =0; i< listaDeAuxiliar.size(); i++){
								pw.println(listaDeAuxiliar.get(i).getMatriculaSiape());
							}
							for(int i =0; i< listaDeAssistente.size(); i++){
								pw.println(listaDeAssistente.get(i).getMatriculaSiape());
							}
							for(int i =0; i< listaDeAdjunto.size(); i++){
								pw.println(listaDeAdjunto.get(i).getMatriculaSiape());
							}
							for(int i =0; i< listaDeAssociado.size(); i++){
								pw.println(listaDeAssociado.get(i).getMatriculaSiape());
							}
							for(int i =0; i< listaDeTitular.size(); i++){
								pw.println(listaDeTitular.get(i).getMatriculaSiape());
							}
							pw.println("\n\nDisciplinas:\n");
							for(int i =0; i< listaDeDisciplina.size(); i++){
								pw.println(listaDeDisciplina.get(i).getNome());
							}
							for(int i =0; i< listaDeEstagio.size(); i++){
								pw.println(listaDeEstagio.get(i).getNome());
							}
							pw.println("\n\nTurmas:\n");
							for(int i =0; i< listaDeTurma.size(); i++){
								pw.println(listaDeTurma.get(i).getCodigo());
							}
							pw.flush();
							pw.close();
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						
						break;
					default:
						System.out.println("Digito inválido, digite novamente: ");
						break;
					}
				}
			}catch(InputMismatchException w){
				System.out.println("Digitação inválida, começe de novo: ");
			}
		}
 	}
}