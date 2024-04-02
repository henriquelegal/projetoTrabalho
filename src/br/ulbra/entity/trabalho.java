
package br.ulbra.entity;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class trabalho {
    
     public ArrayList trabalho;

    public trabalho() {
        trabalho = new ArrayList();
    }
    //Create - Add

    public void salvar(String item) {
        trabalho.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    }
    
     //read - listar
    public String listar() {
        String res = "";
        if (!trabalho.isEmpty()) {
            for (int i = 0; i < trabalho.size(); i++) {
                res += (i + 1) + "- " + trabalho.get(i) + "\n";
            }
        } else {
            res = "Lista vazia!";
        }
        return res;

    }
     //delete
    public void excluir(int indice) {
        if (!trabalho.isEmpty()) {
            if (indice > 0 && indice <= trabalho.size()) {
                trabalho.remove(indice - 1);

                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Codigo não existe!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Impossivel excluir, A lista esta vazia!");
        }

    }

    public void alterar(int indice, String elemento) {
        if (!trabalho.isEmpty()) {
            if (indice > 0 && indice <= trabalho.size()) {
                trabalho.set(indice - 1, elemento);

                JOptionPane.showMessageDialog(null, "alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Codigo não existe!");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Impossivel excluir, A lista esta vazia!");
        }

}
}