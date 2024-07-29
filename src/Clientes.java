import utils.PerfectFlow;

import java.util.ArrayList;
import java.util.List;

public class Clientes {


    private Long id;
    private String nome;
    private Float saldoLimite;
    private List<Notas> listAnotacoes = new ArrayList<Notas>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Notas> getListAnotacoes() {
        return listAnotacoes;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSaldoLimite() {
        return saldoLimite;
    }

    public void setSaldoLimite(Float saldoLimite) {
        if (PerfectFlow.allowedMax(saldoLimite)){
            this.saldoLimite = saldoLimite;
        } else {
            System.out.println("Valor está além do permitido!");
        }
    }

}
