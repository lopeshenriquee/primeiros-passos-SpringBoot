package dio.springboot;

import dio.springboot.scopesSingletonPrototype.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//AQUI É A EXECUCAO DO CONTAINER RODANDO O Myapp
// E RETORNANDO O OBJETO SISTEMAMENSAGEM COM UM COMMANDLINERUNNER
@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) { SpringApplication.run(PrimeirosPassosApplication.class, args);}

	@Bean
	public CommandLineRunner run(SistemaMensagem sistema) throws Exception{
		return args -> {
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
			//EU PEDINDO OUTRA/NOVAMENTE CONFIRMACAO DE CADASTRO ELE CRIA OUTRO OBJETO TIPO ZERADO
			//ENT SERÁ DE NOREPLY PARA TECH
			//SE NAO COLOCar PROTOTYPE ELE MANDARIA DE TECH PARA TECH, VIRARAM OBJETOS ISOLADOS
			sistema.enviarConfirmacaoCadastro();
			sistema.enviarMensagemBoasVindas();
		};
	}
}
