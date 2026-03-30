import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		DiaDaSemana diaDaSemana = DiaDaSemana.DOMINGO;
		LocalDateTime dataHora = LocalDateTime.now();
		Evento evento = new Evento("Novo Evento", dataHora, diaDaSemana);
		System.out.println();
		evento.exibirEvento();
		
		LocalDateTime novaData = evento.getDataHora().plusDays(5);
		evento.setDataHora(novaData);
		evento.setDiaDaSemana(diaDaSemana.plusDias(5));
		System.out.println();
		evento.exibirEvento();
		
		ZoneId fusoSP = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime dataSP = evento.getDataHora().atZone(fusoSP);
		System.out.println();
		evento.exibirEvento();
		
		ZoneId fusoGMT = ZoneId.of("GMT");
		ZonedDateTime dataGMT = dataSP.withZoneSameInstant(fusoGMT);
		System.out.println("Data em GMT (UTC+0): " + dataGMT.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z")));
	}
	
	

}
