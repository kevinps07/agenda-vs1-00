package entitty;

import services.SClientes;
import services.SNotas;
import utils.PerfectFlow;

import java.time.LocalDate;

public class Notas {

    private long id;
    private String descricao;
    private LocalDate date;
    private Usuarios usuario;
    private Clientes clientes;


    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void cadastrar(Usuarios usuario, Clientes clientes){
        this.usuario = usuario;
        this.clientes = clientes;
        //SNotas.use(PerfectFlow.getMethodName(), this);
    }

}
