import entitty.Clientes;
import entitty.Usuarios;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {

        Usuarios usuario = new Usuarios("maradona", "maradonaemelhorquepele123");
        usuario.cadastrar();

        Usuarios usuario2 = new Usuarios("messimaiorquepele", "maradonaemelhorquepele123");
        usuario2.setPrivilegio(false);
        usuario2.cadastrar();

        Usuarios usuario3 = new Usuarios("portugal1", "devolvaonossoouro");
        usuario3.setPrivilegio(false);
        usuario3.cadastrar();

        Usuarios usuario4 = new Usuarios("portugal", "devolvaonossoouro");
        usuario4.setPrivilegio(false);
        usuario4.cadastrar();

        usuario.listar();
        usuario2.listar();

        List<String> dados = new ArrayList<>();
        dados.add("messi");
        dados.add("meninoney");

        usuario.alterar(usuario3, dados);
        usuario.listar();
        usuario.deletar(usuario3);

        usuario.listar();

        Clientes clientes = new Clientes();
        clientes.setNome("jose");
        clientes.setSaldoLimite(50f);
        clientes.concluir(usuario);

    }
}