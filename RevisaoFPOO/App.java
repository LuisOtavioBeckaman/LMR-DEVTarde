package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Cachorro;
import RevisaoFPOO.Cadastro.Gato;
import RevisaoFPOO.Cadastro.Outros;
import RevisaoFPOO.Cadastro.Peixe;

public class App {
    private static final String intereger = null;

    public static void main(String[] args) {

        boolean menu = true;

        Cachorro cachorro[] = new Cachorro[30];
        Gato gato[] = new Gato[30];
        Peixe peixe[] = new Peixe[30];
        Outros outros[] = new Outros[30];

        int contCachorro = 0;
        int contGato = 0;
        int contAves = 0;
        int contOutro = 0;

        while (menu) {
            int acao = Integer.parseInt(
                    JOptionPane.showInputDialog("Deseja fazer um cadastro do seu animal?" + "\n 1: Sim" + "\n 2: Não"));
            if (acao == 1) {
                int especieAnimal = Integer
                        .parseInt(JOptionPane.showInputDialog("De qual espécie é o animal que você vai cadastrar?"
                                + "\n 1- Cachorro" + "\n 2- Gato" + "\n 3- Ave" + "\n 4- Outro"));

                if (especieAnimal == 1) {

                    cachorro[contCachorro] = new Cachorro();

                    cachorro[contCachorro].setNome(JOptionPane.showInputDialog("Digite o nome do animal:"));
                    cachorro[contCachorro].setRaca(JOptionPane.showInputDialog("Digite a raça do animal:"));
                    cachorro[contCachorro]
                            .setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:")));
                    cachorro[contCachorro].setPorte(JOptionPane.showInputDialog("Digite o porte do animal:"));
                    cachorro[contCachorro]
                            .setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário do animal:"));
                    contCachorro++;
                } else if (especieAnimal == 2) {
                    gato[contGato] = new Gato();

                    gato[contGato].setNome(JOptionPane.showInputDialog("Digite o nome do animal:"));
                    gato[contGato].setRaca(JOptionPane.showInputDialog("Digite a raça do animal:"));
                    gato[contGato].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:")));
                    gato[contGato].setPorte(JOptionPane.showInputDialog("Digite o porte do animal:"));
                    gato[contGato]
                            .setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário do animal:"));
                    contGato++;
                } else if (especieAnimal == 3) {
                    peixe[contAves] = new Peixe();

                    peixe[contAves].setNome(JOptionPane.showInputDialog("Digite o nome do animal:"));
                    peixe[contAves].setRaca(JOptionPane.showInputDialog("Digite a raça do animal:"));
                    peixe[contAves].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:")));
                    peixe[contAves].setPorte(JOptionPane.showInputDialog("Digite o porte do animal:"));
                    peixe[contAves]
                            .setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário do animal:"));
                    contAves++;
                } else if (especieAnimal == 4) {
                    outros[contOutro] = new Outros();

                    outros[contOutro].setNome(JOptionPane.showInputDialog("Digite o nome do animal:"));
                    outros[contOutro].setRaca(JOptionPane.showInputDialog("Digite a espécie do animal:"));
                    outros[contOutro]
                            .setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do animal:")));
                    outros[contOutro].setPorte(JOptionPane.showInputDialog("Digite o porte do animal:"));
                    outros[contOutro]
                            .setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário do animal:"));
                    contOutro++;
                } else {
                    JOptionPane.showMessageDialog(null, "Digite um número válido",
                            "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else if ( acao == 2) {
                menu = false;
            } else {
                JOptionPane.showMessageDialog(null, "Digite um número válido",
                            "ERRO", JOptionPane.ERROR_MESSAGE);
            }

        }

    }


    }

