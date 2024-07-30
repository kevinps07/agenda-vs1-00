import entitty.Clientes;
import entitty.Usuarios;

public class Main {

    public static void main(String[] args) {
        Usuarios usuario = new Usuarios("maradona", "maradonaemelhorquepele123");
        usuario.cadastrar();

        Usuarios usuario2 = new Usuarios("maradona", "maradonaemelhorquepele123");
        usuario2.setPrivilegio(false);
        usuario2.cadastrar();

        usuario.listar();
        usuario2.listar();


        Clientes clientes = new Clientes();
        clientes.setNome("jose");
        clientes.setSaldoLimite(50f);
        clientes.concluir(usuario);


    }

}