package segundo_prototipo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Main {
    static JTextField txtEmailDestino;

    public static void main(String[] args) {

        JFrame tela = new JFrame("Primeira tela");
        tela.setSize(800, 400);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        tela.add(panel);
        panel.setLayout(null);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(10, 10, 150, 25);
        panel.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(10, 30, 100, 25);
        panel.add(txtNome);

        JLabel lblEndereco = new JLabel("Endereço");
        lblEndereco.setBounds(10, 60, 150, 25);
        panel.add(lblEndereco);

        JTextField txtEndereco = new JTextField();
        txtEndereco.setBounds(10, 80, 150, 25);
        panel.add(txtEndereco);

        JLabel lblEmailDestino = new JLabel("E-mail de destino");
        lblEmailDestino.setBounds(10, 100, 250, 25);
        panel.add(lblEmailDestino);

        txtEmailDestino = new JTextField();
        txtEmailDestino.setBounds(10, 120, 250, 25);
        panel.add(txtEmailDestino);

        JButton btnSalvar = new JButton("Gerar arquivo");
        btnSalvar.setBounds(10, 160, 150, 25);
        panel.add(btnSalvar);

        JButton btnEnviarEmail = new JButton("Enviar e-mail");
        btnEnviarEmail.setBounds(170, 160, 150, 25);
        panel.add(btnEnviarEmail);

        JButton btnExcluirArquivo = new JButton("Excluir Arquivo");
        btnExcluirArquivo.setBounds(340, 160, 150, 25);
        panel.add(btnExcluirArquivo);

        JButton btnLimparCampos = new JButton("Limpar Campos");
        btnLimparCampos.setBounds(510, 160, 150, 25);
        panel.add(btnLimparCampos);

        btnSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(txtNome.getText());
                cliente.setEndereco(txtEndereco.getText());
                GeraArquivo(cliente);
            }
        });

        btnLimparCampos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtEndereco.setText("");
            }

        });

        btnExcluirArquivo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ExcluiArquivo();
            }

        });

        btnEnviarEmail.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                EnviarEmail();
            }

        });

        tela.setVisible(true);
    }

    private static void GeraArquivo(Cliente cliente) {
        String caminhoArquivo = "mtp.txt";

        File arquivo = new File(caminhoArquivo);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true))) {
            writer.write("Nome: " + cliente.getNome() + "\n");
            writer.write("Endereço: " + cliente.getEndereco() + "\n");
            JOptionPane.showMessageDialog(null, "Arquivo criado", "Arquivo", 1);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados.", "Erro", 0);
            e.printStackTrace();
        }
    }

    private static void ExcluiArquivo() {
        String caminhoArquivo = "mtp.txt";

        File arquivo = new File(caminhoArquivo);

        if (arquivo.delete()) {
            JOptionPane.showMessageDialog(null, "Arquivo excluído", "Arquivo", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao excluir arquivo.", "Erro", 0);
        }
    }

    //sdfiojhgvsdfouihpgsdfahgoipadfjgoasdjfgoiásdjfoijasdoífasdoijfoíasdfjoásdfóiasd[oifjasdof]

    private static void EnviarEmail() {
        // Configurações do servidor SMTP
        String host = "smtp.gmail.com";
        final String user = "francis.yokinshan@gmail.com";
        final String password = "plfg kiqw vsrn bbde";

        String para = txtEmailDestino.getText();

        // Propriedades do servidor SMTP
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "587"); // 587 ou 465
        properties.put("mail.smtp.starttls.enable", "true"); // Requer STARTTLS

        // Criação de uma sessão com autenticação
        Session session = null;
        try {
            session = Session.getInstance(properties,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(user, password);
                        }
                    });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao gmail. " + e.getMessage(), "Erro", 0);
        }

        try {
            // Criação da mensagem
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(para));
            message.setSubject("Teste na disciplina de MTP");
            message.setText("Estou enviando um e-mail de teste");

            // Envio do e-mail
            Transport.send(message);

            JOptionPane.showMessageDialog(null, "E-mail enviado", "E-mail", 1);

        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar e-mail. " + e.getMessage(), "Erro", 0);
        }

    }

}
