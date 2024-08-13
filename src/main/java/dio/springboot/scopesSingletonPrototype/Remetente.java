package dio.springboot.scopesSingletonPrototype;

import org.springframework.context.annotation.Bean;
//DECLARACAO DE INFO NORMAL
public class Remetente {
    private String nome;
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Remetente{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
