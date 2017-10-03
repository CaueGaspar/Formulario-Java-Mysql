package modelo;

import beansCustomer.BeansCustomer;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DaoCustomer {

    ConexaoBd conex = new ConexaoBd();
    BeansCustomer mod = new BeansCustomer();

    public void Insert(BeansCustomer mod) {

        try {
            conex.conexao();
            PreparedStatement pst = conex.conn.prepareStatement("insert into customer(id_customer,cpf_cnpj,nm_customer,is_active,vl_total) values (?,?,?,?,?)");
            pst.setInt(1, mod.getId_customer());
            pst.setString(2, mod.getCpf_cnpj());
            pst.setString(3, mod.getNm_customer());
            pst.setString(4, mod.getIs_active());
            pst.setFloat(5, mod.getVl_total());
            //number_format(mod.getVl_total(),2,',','.'); 

            pst.execute();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso");
        } catch (SQLException ex) {

            System.out.println("Erro ao insrir cadastro usuário" + ex);
        }
        conex.desconecta();

    }

    public BeansCustomer BuscaMedia(BeansCustomer mod) {
        conex.conexao();
        conex.executaSql("select avg(vl_total) from customer where vl_total > 560 and id_customer >1500 and id_customer < 2700;");
        try {
            conex.rs.first();
            mod.setMedia(conex.rs.getInt("avg(vl_total)"));
        } catch (SQLException ex) {
            System.out.println("Erro ao calcular média /n" + ex);
        }
        conex.desconecta();
        return mod;
    }
}
