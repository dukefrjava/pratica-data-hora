import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Evento {
	static String nome;
	static LocalDateTime dataHora = LocalDateTime.of(LocalDate.of(2026, 3, 29), LocalTime.of(20, 39));
	static DiaDaSemana diaDaSemana;
	
	
	public Evento(String nome, LocalDateTime dataHora, DiaDaSemana diaDaSemana) {
		this.nome = nome;
		this.dataHora = dataHora;
		this.diaDaSemana = diaDaSemana;
	}
	
	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Evento.nome = nome;
	}

	public static LocalDateTime getDataHora() {
		return dataHora;
	}

	public static void setDataHora(LocalDateTime dataHora) {
		Evento.dataHora = dataHora;
	}

	public static DiaDaSemana getDiaDaSemana() {
		return diaDaSemana;
	}

	public static void setDiaDaSemana(DiaDaSemana diaDaSemana) {
		Evento.diaDaSemana = diaDaSemana;
	}

	public static void exibirEvento() {
		System.out.println("Evento\tNome : " + nome + "\tData : " + dataHora + "\tDia da semana : " + diaDaSemana);
	}
}
