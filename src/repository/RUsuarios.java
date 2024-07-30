package repository;

import entitty.Usuarios;
import utils.PerfectFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RUsuarios {

    public static Boolean succsessfully = false;
    private static List<Usuarios> bancoUsuarios = new ArrayList<Usuarios>();



    private static Boolean comparaUsername(String str1, String str2) {
        if (str1.toLowerCase() == str2.toLowerCase()) {
            return true;
        } else {
            return false;
        }
    }


    public static Boolean cadastrar(Usuarios usuarios) {

        if (bancoUsuarios.size() > 0){
            for ( Usuarios u: bancoUsuarios) {
                if (comparaUsername(u.getUsername(), usuarios.getUsername())) {
                    System.out.println("este usuário já possui um cadastro!");
                     break;
                } else {
                    System.out.println("Usuário cadastrado com sucesso!");
                    bancoUsuarios.add(usuarios);
                     succsessfully = true;
                }
            }
        } else {
            System.out.println("Usuário cadastrado com sucesso!");
            bancoUsuarios.add(usuarios);
            succsessfully = true;
        }
        return succsessfully;
    }

    public static void listar() {

        for (Usuarios u : bancoUsuarios)
        {
            System.out.println(u.toString());
        }
    }

    public static void alterar(Usuarios usuarios) {
    }

    public static void deletar(Usuarios usuarios) {
    }


}
