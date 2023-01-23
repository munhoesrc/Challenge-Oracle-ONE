import javax.swing.*;

public class cotacaoMoedas {
    public static void main(String[] args) {
        conversorMoedas c = new conversorMoedas();
        Object[] opcao1 = {"Dollar", "Euro", "Sair"};
        Object[] opcao2 = {"Converter novamente?", "Sair"};

        ImageIcon icon = new ImageIcon("C:\\Users\\Alexandre Chaves\\Pictures\\moedas.png");


        while (true){
            String input = JOptionPane.showInputDialog(null, "Digite um valor");
            System.out.println(input);

            if(c.check(input) == true){
                double Minput = Double.parseDouble(input);

                int msg1 = JOptionPane.showOptionDialog(null, "Escolha a moeda que deseja converter",
                        "Conversosr de Moedas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icon,
                        opcao1, opcao1[2]);
                if(msg1 == 0){
                    c.RealparaDollar(Minput);

                    int mgs2 = JOptionPane.showOptionDialog(null, "O que deseja fazer ? ", "" +
                                    "Conversor de Moedas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            icon, opcao2, opcao2[1]);
                    if(mgs2 == 0){

                    }else {break;}

                } else if (msg1 == 1) {
                    c.RealparaEuro(Minput);

                    int mgs2 = JOptionPane.showOptionDialog(null, "O que deseja fazer ? ", "" +
                                    "Conversor de Moedas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                            icon, opcao2, opcao2[1]);
                    if(mgs2 == 0){

                    }else {break;}


                }else {break;}


            }
            else{
                JOptionPane.showMessageDialog(null, "Saida inválida, tente novamente !");

                int mgs2 = JOptionPane.showOptionDialog(null, "O que deseja fazer ? ", "" +
                        "Conversor de Moedas", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                        icon, opcao2, opcao2[1]);
                if(mgs2 == 0){

                }else {break;}
            }
        }


    }
}
