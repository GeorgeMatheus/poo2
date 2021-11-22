package adaptercliente.model;

import java.awt.List;
import lib.ClienteExterno;


public class ClienteAdapter extends Cliente{

    ClienteExterno cliente = new ClienteExterno();

    public ClienteAdapter(ClienteExterno cliente){
        this.cliente = cliente;
    }

    public String getNomeCompleto() {
        return this.cliente.getNome() + " " + this.cliente.getSobreNome();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        String[] nomeSplit = nomeCompleto.split(" ");
        String sobrenome = "";

        for(int i=1; i< nomeSplit.length;i++ ){
            if(nomeSplit.length == i+1){
                sobrenome = sobrenome + nomeSplit[i];
            }
            else {
                sobrenome = sobrenome + nomeSplit[i] + " ";
            }
        }

        this.cliente.setNome(nomeSplit[1]);
        this.cliente.setSobreNome(sobrenome);
    }

    @Override
    public String getTelefone() {
        return this.cliente.getDddTelefone() + " " + this.cliente.getTelefone();
    }

    @Override
    public void setTelefone(String telefone) {
        String[] tel = telefone.split(" ");

        this.cliente.setDddTelefone(tel[0]);
        this.cliente.setTelefone(tel[1]);
    }

    @Override
    public String getEmail() {
        return this.cliente.getEmail();
    }

    @Override
    public void setEmail(String email) {
        this.cliente.setEmail(email);
    }

    @Override
    public String getCelular() {
        return this.cliente.getDddCelular() + " " + this.cliente.getCelular();
    }

    @Override
    public void setCelular(String celular) {
        String[] cel = celular.split(" ");

        this.cliente.setDddCelular(cel[0]);
        this.cliente.setCelular(cel[1]);
    }

}
