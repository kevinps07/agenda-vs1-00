package services;

import entitty.Clientes;
import utils.PerfectFlow;

public abstract class SClientes {

    public static void use(String action, Clientes clientes) {
        switch (action) {
            case "cadastrar":
                cadastrar(clientes);
                break;
            case "listar":
                listar();
                break;
            case "alterar":
                alterar(clientes);
                break;
            case "deletar":
                deletar(clientes);
                break;
        }
    }

    private static void cadastrar(Clientes clientes) {
        if (!PerfectFlow.verifyNullObj(clientes)) {
            System.out.println("Cadastrando clientes");
        }
    }

    private static void listar() {
        SClientes.listar();
    }

    private static void alterar(Clientes clientes) {
        if (!PerfectFlow.verifyNullObj(clientes)) {
            System.out.println("alterando clientes");
        }
    }

    private static void deletar(Clientes clientes) {
        if (!PerfectFlow.verifyNullObj(clientes)) {
            System.out.println("deletando clientes");
        }
    }


}
