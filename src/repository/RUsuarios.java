package repository;

import entitty.Usuarios;
import utils.PerfectFlow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

    private static Boolean comparaID(Long str1, Long str2) {
        if ( str1 == str2 ) {
            return true;
        } else {
            return false;
        }
    }


    public static Boolean cadastrar(Usuarios usuarios) {

        if (bancoUsuarios.size() > 0) {
            for (Usuarios u : bancoUsuarios) {
                if ( u.getId().equals(usuarios.getId()) || comparaUsername( u.getUsername(), usuarios.getUsername()) ) {
                    System.out.println("este usuário já possui um cadastro!");
                    break;
                } else {
                    System.out.println("Usuário cadastrado com sucesso!");
                    bancoUsuarios.add(usuarios);
                    succsessfully = true;
                    break;
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
        for (Usuarios u : bancoUsuarios) {
            System.out.println(u.toString());
        }
    }

    public static Boolean alterar(Usuarios usuarios) {
        int index = 0;
        while(index <= bancoUsuarios.size()){
            if (bancoUsuarios.get(index).getId().equals(usuarios.getId())){
                bancoUsuarios.get(index).setUsername(usuarios.getUsername());
                bancoUsuarios.get(index).setPasswd(usuarios.getPasswd());
                System.out.println("Usuário alterado com sucesso!");
                succsessfully = true;
                break;
            }
            index++;
        }

        return succsessfully;
    }

    public static Boolean deletar(Usuarios usuarios) {
        int index = 0;
        while(index <= bancoUsuarios.size()){
            if (bancoUsuarios.get(index).getId().equals(usuarios.getId())){
                bancoUsuarios.remove(index);
                System.out.println("Usuário deletado com sucesso!\n" + usuarios);
                succsessfully = true;
                break;
            }
            index++;
        }
        return succsessfully;
    }


}
