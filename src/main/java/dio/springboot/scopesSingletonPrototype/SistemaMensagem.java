package dio.springboot.scopesSingletonPrototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//TRANSFORMO A CLASSE EM UM COMPONENTE PARA O CONTAINER LER
//USO AUTOWIRED PARA ACESSAR O BEAN REMETENTE DUAS VEZES
//USANDO O noreply PARA ENVIAR CONFIRMACAO E O techTeam RECEBER("ENVIAR") A MENSAGEM BOAS VINDAS

@Component
public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMensagemBoasVindas(){
        techTeam.setEmail("tech@dio.com.br");
        System.out.println(techTeam);
        System.out.println("Bem vindo à Tech DIO");
    }
}
