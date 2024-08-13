package dio.springboot.scopesSingletonPrototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//AQUI EU DECLARO QUAL CLASSE NO CASO OBJETO SERÁ CRIADO, EM VEZ DE METER UM NEW NO MEIO DO MAIN
@Configuration
public class Beans {
    //SE DEIXAR ASSIM ELE SMP USARÁ OS MESMOS OBJETOS
    //AGORA SE COLOCAR PROTOTYPE ELE CRIARÁ UM OBJETO EXCLUSIVO PARA CADA EXECUCAO
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }
}
