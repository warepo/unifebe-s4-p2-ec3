package ec3.agenda;

import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.util.ListIterator;
import ec3.agenda.Contato.*;

public class Program
{
    public static void main(String args[]) throws IOException
    {
        String entrada, nome;
        int escolha, numero;
        Contato pessoa;

        LinkedList lista = new LinkedList();

        FileOutputStream local      = new FileOutputStream(".\\files\\Contatos.dat");
        ObjectOutputStream escrever = new ObjectOutputStream(local);

        for (int i = 0; i <= 5; i++) {
            nome   = JOptionPane.showInputDialog("Digite o nome: ");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de telefone: "));

            pessoa = new Contato(nome, numero);

            lista.add(pessoa);
        }

        escrever.writeObject(lista);
        escrever.close();
    }
}