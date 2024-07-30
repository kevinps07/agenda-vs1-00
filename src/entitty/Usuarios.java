package entitty;

import services.SUsuarios;
import utils.PerfectFlow;

import java.util.ArrayList;
import java.util.UUID;

public class Usuarios {

    private long id;
    private String username;
    private UUID passwd;
    private ArrayList<Clientes> listClientes = new ArrayList<Clientes>();

    public Usuarios(String username, String passwd) {
        if (username != null) {
            this.id = PerfectFlow.generateUUID();
            this.username = username;
            this.passwd = PerfectFlow.generateUUID(passwd);
        }

    }

    @Override
    public String toString() {
        return "entitty.Usuario{" +
                "\nid:" + id +
                ",\n username:" + username +
                ",\n passwd:" + passwd +
                '}';
    }


    public void cadastrar() {
        SUsuarios.use(PerfectFlow.getMethodName(), this);
    }
}
