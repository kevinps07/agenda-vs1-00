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
    private Boolean privilegio = PerfectFlow.ADMIN;


    public Usuarios(String username, String passwd) {
        if (username != null) {
            this.id = PerfectFlow.generateUUID();
            this.username = username;
            this.passwd = PerfectFlow.generateUUID(passwd);
        }
    }

    @Override
    public String toString() {
        return "\nid:" + id +
                "\n username:" + username +
                "\n passwd:" + passwd +
                "\n+++++++++++++++";
    }


    public String getUsername(){ return this.username; }


    public void cadastrar() {
        SUsuarios.use(PerfectFlow.getMethodName(), this);
    }

    public void setPrivilegio(Boolean privilegio){
        this.privilegio = privilegio;
    }

    public void listar(){
        if (privilegio){
            SUsuarios.use(PerfectFlow.getMethodName(), this);
        } else {
            System.out.println("Desculpe-me! somente o administrador pode listar usuários");
        }
    }
}
