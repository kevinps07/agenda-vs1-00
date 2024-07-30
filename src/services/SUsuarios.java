package services;

import entitty.Usuarios;
import utils.PerfectFlow;

public abstract class SUsuarios {

    public static void use(String action, Usuarios usuario){
         switch (action.toLowerCase()){
             case "cadastrar":
                 cadastrar(usuario);
                 break;
         }
    };

    private static void cadastrar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
            System.out.println("Cadastrando usuário");
        }
    }
    private static void listar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
            System.out.println("Cadastrando usuário");
        }
    }

    private static void alterar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
            System.out.println("Cadastrando usuário");
        }
    }

    private static void deletar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
            System.out.println("Cadastrando usuário");
        }
    }



}
