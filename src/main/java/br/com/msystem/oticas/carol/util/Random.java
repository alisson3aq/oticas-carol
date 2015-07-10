package br.com.msystem.oticas.carol.util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.msystem.oticas.carol.enums.Perfil;
import br.com.msystem.oticas.carol.enums.TipoPessoa;

public class Random {

	public static float randomFloat() {
		
		java.util.Random random = new java.util.Random();
		return random.nextFloat() * 1000;
		
	}

	public static double randomDouble() {
		
		java.util.Random random = new java.util.Random();
		return random.nextDouble() * 1000;
		
	}

	public static Date randomDate() {
		
		java.util.Random random = new java.util.Random();
		int add = random.nextInt(60);
		if (random.nextBoolean()) {
			add = -1 * add;
		}
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, add);
		
		return cal.getTime();

	}

	public static TipoPessoa randomTipoPessoa() {

		java.util.Random random = new java.util.Random();
		return TipoPessoa.values()[random.nextInt(1)];
		
	}

	public static Integer randomInteger() {
		java.util.Random random = new java.util.Random();
		return random.nextInt(10000);
	}
	
	public static Integer randomInteger(Integer i) {
		java.util.Random random = new java.util.Random();
		return random.nextInt(i);
	}
/*	
	public static String randomString() {
		char[] chars = "abcdefghij klmnopq rstuvwxyz QWERTYUIO P�LKJHGFDS AZXCVBNM".toCharArray();
		StringBuilder sb = new StringBuilder();
		java.util.Random random = new java.util.Random();
		for (int i = 0; i < 20; i++) {
		    char c = chars[random.nextInt(chars.length)];
		    sb.append(c);
		}
		String output = sb.toString();
		return output;
	}
*/
	
	public static String randomString() {
		java.util.Random random = new java.util.Random();
		return getNome(random.nextInt(200)) + " " + getNome(random.nextInt(200));
	}

	public static Perfil randomPerfilUsuario() {
		
		java.util.Random random = new java.util.Random();
		return Perfil.values()[random.nextInt(2)];
	}
	
	private static String getNome(int i) {
		List<String> listaNomes = new ArrayList<String>();
		
		listaNomes.add("Miguel");
		listaNomes.add("Sophia");
		listaNomes.add("Davi ");
		listaNomes.add("Julia");
		listaNomes.add("Arthur");
		listaNomes.add("Alice");
		listaNomes.add("Gabriel");
		listaNomes.add("Manuela");
		listaNomes.add("Pedro");
		listaNomes.add("Isabella");
		listaNomes.add("Lucas");
		listaNomes.add("Laura");
		listaNomes.add("Matheus");
		listaNomes.add("Maria Eduarda");
		listaNomes.add("Bernardo");
		listaNomes.add("Giovanna");
		listaNomes.add("Rafael");
		listaNomes.add("Valentina");
		listaNomes.add("Guilherme");
		listaNomes.add("Beatriz");
		listaNomes.add("Enzo");
		listaNomes.add("Luiza");
		listaNomes.add("Felipe");
		listaNomes.add("Helena");
		listaNomes.add("Gustavo");
		listaNomes.add("Maria Luiza");
		listaNomes.add("Nicolas");
		listaNomes.add("Isadora");
		listaNomes.add("Heitor");
		listaNomes.add("Mariana");
		listaNomes.add("Samuel");
		listaNomes.add("Gabriela");
		listaNomes.add("Jo�o Pedro");
		listaNomes.add("Ana Clara");
		listaNomes.add("Pedro Henrique");
		listaNomes.add("Rafaela");
		listaNomes.add("Cau�");
		listaNomes.add("Maria Clara");
		listaNomes.add("Henrique");
		listaNomes.add("Isabelly");
		listaNomes.add("Murilo");
		listaNomes.add("Yasmin");
		listaNomes.add("Eduardo");
		listaNomes.add("Ana Julia");
		listaNomes.add("Vitor");
		listaNomes.add("L�via");
		listaNomes.add("Daniel");
		listaNomes.add("Lara");
		listaNomes.add("Lorenzo");
		listaNomes.add("Lorena");
		listaNomes.add("Vinicius");
		listaNomes.add("Helo�sa");
		listaNomes.add("Pietro");
		listaNomes.add("Melissa");
		listaNomes.add("Jo�o Vitor");
		listaNomes.add("Sarah");
		listaNomes.add("Leonardo");
		listaNomes.add("Ana Luiza");
		listaNomes.add("Th�o");
		listaNomes.add("Let�cia");
		listaNomes.add("Caio");
		listaNomes.add("Nicole");
		listaNomes.add("Isaac");
		listaNomes.add("Ana Beatriz");
		listaNomes.add("Lucca");
		listaNomes.add("Emanuelly");
		listaNomes.add("Jo�o");
		listaNomes.add("Esther");
		listaNomes.add("Davi Lucas");
		listaNomes.add("Lav�nia");
		listaNomes.add("Enzo Gabriel");
		listaNomes.add("Marina");
		listaNomes.add("Yuri");
		listaNomes.add("Cec�lia");
		listaNomes.add("Bryan");
		listaNomes.add("Rebeca");
		listaNomes.add("Thiago");
		listaNomes.add("Vit�ria");
		listaNomes.add("Jo�o Gabriel");
		listaNomes.add("Maria Fernanda");
		listaNomes.add("Benjamin");
		listaNomes.add("Larissa");
		listaNomes.add("Joaquim");
		listaNomes.add("Clara");
		listaNomes.add("Emanuel");
		listaNomes.add("Carolina");
		listaNomes.add("Thomas");
		listaNomes.add("Bianca");
		listaNomes.add("Ryan");
		listaNomes.add("Al�cia");
		listaNomes.add("Carlos Eduardo");
		listaNomes.add("Fernanda");
		listaNomes.add("Rodrigo");
		listaNomes.add("Gabrielly");
		listaNomes.add("Ian");
		listaNomes.add("Catarina");
		listaNomes.add("Fernando");
		listaNomes.add("Ana Laura");
		listaNomes.add("Bruno");
		listaNomes.add("Emilly");
		listaNomes.add("Ot�vio");
		listaNomes.add("Eduarda");
		listaNomes.add("Francisco");
		listaNomes.add("Amanda");
		listaNomes.add("Calebe");
		listaNomes.add("Pietra");
		listaNomes.add("Igor");
		listaNomes.add("Agatha");
		listaNomes.add("Antonio");
		listaNomes.add("Milena");
		listaNomes.add("Erick");
		listaNomes.add("Maria Alice");
		listaNomes.add("Jo�o Lucas");
		listaNomes.add("La�s");
		listaNomes.add("Luiz Felipe");
		listaNomes.add("Maria Julia");
		listaNomes.add("Andr�");
		listaNomes.add("Maria");
		listaNomes.add("Davi Lucca");
		listaNomes.add("Elisa");
		listaNomes.add("Kaique");
		listaNomes.add("Stella");
		listaNomes.add("Nathan");
		listaNomes.add("Maria Vit�ria");
		listaNomes.add("Luiz Miguel");
		listaNomes.add("Bruna");
		listaNomes.add("Breno");
		listaNomes.add("Ana Sophia");
		listaNomes.add("Vitor Hugo");
		listaNomes.add("B�rbara");
		listaNomes.add("Jo�o Guilherme");
		listaNomes.add("Maria Cec�lia");
		listaNomes.add("Ben�cio");
		listaNomes.add("Olivia");
		listaNomes.add("Augusto");
		listaNomes.add("Nathalia");
		listaNomes.add("Jo�o Miguel");
		listaNomes.add("Camila");
		listaNomes.add("Pedro Lucas");
		listaNomes.add("Ana Carolina");
		listaNomes.add("Levi");
		listaNomes.add("Mait�");
		listaNomes.add("Anthony");
		listaNomes.add("Elo�");
		listaNomes.add("Yago");
		listaNomes.add("Luana");
		listaNomes.add("Danilo");
		listaNomes.add("Luna");
		listaNomes.add("Juan");
		listaNomes.add("Ana L�via");
		listaNomes.add("Kau� ");
		listaNomes.add("Brenda");
		listaNomes.add("Diego");
		listaNomes.add("Alana");
		listaNomes.add("Vicente");
		listaNomes.add("Sophie");
		listaNomes.add("Davi Luiz ");
		listaNomes.add("Ana");
		listaNomes.add("Luiz Gustavo");
		listaNomes.add("Isabel");
		listaNomes.add("Alexandre");
		listaNomes.add("Mirella");
		listaNomes.add("Raul");
		listaNomes.add("Juliana");
		listaNomes.add("Luan");
		listaNomes.add("Marcela");
		listaNomes.add("Diogo");
		listaNomes.add("Isis");
		listaNomes.add("Marcelo");
		listaNomes.add("Iara");
		listaNomes.add("Ricardo");
		listaNomes.add("Ant�nia");
		listaNomes.add("Luiz Henrique");
		listaNomes.add("Kamilly");
		listaNomes.add("Henry ");
		listaNomes.add("Alexia");
		listaNomes.add("Noah");
		listaNomes.add("Lis");
		listaNomes.add("Enrico");
		listaNomes.add("Maria Sophia");
		listaNomes.add("Lucas Gabriel");
		listaNomes.add("Joana");
		listaNomes.add("Renan");
		listaNomes.add("Clarice");
		listaNomes.add("Luiz Ot�vio");
		listaNomes.add("Ayla");
		listaNomes.add("Pedro Miguel");
		listaNomes.add("Caroline");
		listaNomes.add("William ");
		listaNomes.add("Antonella");
		listaNomes.add("�caro ");
		listaNomes.add("Evellyn ");
		listaNomes.add("Giovanni ");
		listaNomes.add("Malu");
		listaNomes.add("Jo�o Paulo");
		listaNomes.add("Maria Laura");
		listaNomes.add("Paulo ");
		listaNomes.add("Mikaela");
		listaNomes.add("Adryan");
		listaNomes.add("Stefany");
		
		return listaNomes.get(i);

	}
}
