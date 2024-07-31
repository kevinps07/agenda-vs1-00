package entitty;

import services.SUsuarios;
import utils.PerfectFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuarios implements Cloneable {

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

    private void setNewValue(List<String> dados){
     if ( dados.size() <= 2 ){
         this.username = dados.getFirst();
         this.passwd = PerfectFlow.generateUUID( dados.getLast() );
     } else {
         this.username = dados.get(1);
         this.passwd = PerfectFlow.generateUUID( dados.get(2) );
         this.privilegio = Boolean.valueOf(dados.get(3));
     }
    }

    public void setUsername(String username){ this.username = username;}
    public String getUsername(){ return this.username; }

    public Long getId(){
        return this.id;
    }

    public void setPasswd(UUID passwd){ this.passwd = passwd; }
    public UUID getPasswd(){
        return this.passwd;
    }


    public void setPrivilegio(Boolean privilegio){
        this.privilegio = privilegio;
    }


    public void cadastrar() {
        SUsuarios.use(PerfectFlow.getMethodName(), this);
    }

    public void listar(){
        if (privilegio){
            SUsuarios.use(PerfectFlow.getMethodName(), this);
        } else {
            System.out.println("Desculpe-me! somente o administrador pode listar usuários");
        }
    }

    public void alterar(Usuarios usuarios, List<String> dados) throws CloneNotSupportedException {
        if (privilegio){
            try {
                System.out.println("alterando ....");
                Usuarios user = (Usuarios) usuarios.clone();
                user.setNewValue(dados);
                SUsuarios.use(PerfectFlow.getMethodName(), user);
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Desculpe-me! somente o administrador pode alterar usuários");
        }
}

    public void deletar(Usuarios usuarios){
        if (privilegio){
            SUsuarios.use(PerfectFlow.getMethodName(), usuarios);
        } else {
            System.out.println("Desculpe-me! somente o administrador pode deletar usuários");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
