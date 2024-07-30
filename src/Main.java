import entitty.Clientes;
import entitty.Usuarios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {
        Usuarios usuario = new Usuarios("maradona", "maradonaemelhorquepele123");
        usuario.cadastrar();

        Clientes clientes = new Clientes();
        clientes.setNome("jose");
        clientes.setSaldoLimite(50f);
        clientes.concluir(usuario);



    }

}