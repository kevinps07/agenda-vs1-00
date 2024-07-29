import utils.PerfectFlow;

import java.util.UUID;

public class Usuario {

    private long id;
    private String username;
    private UUID passwd;

    public Usuario (String username, String passwd){
        if (username != null) {
            this.id = PerfectFlow.generateUUID();
            this.username = username;
            this.passwd = PerfectFlow.generateUUID(passwd);
        }

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "\nid=" + id +
                ",\n username='" + username + '\'' +
                ",\n passwd=" + passwd +
                '}';
    }
}
