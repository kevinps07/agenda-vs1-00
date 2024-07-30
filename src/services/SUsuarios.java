package services;

import entitty.Usuarios;
import repository.RUsuarios;
import utils.PerfectFlow;

public abstract class SUsuarios {

    public static void use(String action, Usuarios usuario){
         switch ( action.toLowerCase() ){
             case "cadastrar":
                 cadastrar(usuario);
                 break;
             case "listar":
                 listar();
                 break;
         }
    };

    private static Boolean cadastrar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
           return RUsuarios.cadastrar(usuario);
        }
        return RUsuarios.succsessfully;
    }
    private static void listar() {
        RUsuarios.listar();
    }

    private static void alterar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
           RUsuarios.alterar(usuario);
        }
    }

    private static void deletar(Usuarios usuario){
        if (!PerfectFlow.verifyNullObj(usuario)){
           RUsuarios.deletar(usuario);
        }
    }



}
