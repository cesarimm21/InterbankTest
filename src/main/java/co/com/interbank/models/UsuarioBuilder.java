package co.com.interbank.models;
import co.com.interbank.util.Builder;
public class UsuarioBuilder implements Builder<Usuario> {

    private String name;
    private String job;

    private UsuarioBuilder(String name) {
        this.name = name;
    }

    public static UsuarioBuilder withName(String name){
        return new UsuarioBuilder(name);
    }

    public Usuario andJob(String job) {
        this.job = job;
        return build();
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    @Override
    public Usuario build() {
        return new Usuario(this);
    }
}
