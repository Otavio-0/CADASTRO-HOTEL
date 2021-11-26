import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
public class main {

    public static void main(String args[])  {

        Scanner scan = new Scanner(System.in);

        Pessoa ps1 = new Pessoa();
        ReservaQuarto rq = new ReservaQuarto();
        ReservaRestaurante rr = new ReservaRestaurante();
        GuiaTuristico gt = new GuiaTuristico();
        ReservaMaritma rm = new ReservaMaritma();

        ArrayList<String> nome = new ArrayList<String>();
        ArrayList<BigInteger> cpf = new ArrayList<BigInteger>();
        ArrayList<BigInteger> rg = new ArrayList<BigInteger>();
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<Integer> qtdQuartos = new ArrayList<Integer>();
        ArrayList<Integer> qtdDias = new ArrayList<Integer>();
        ArrayList<Integer> opcAndar = new ArrayList<Integer>();
        ArrayList<String> opcSuiteQuarto = new ArrayList<String>();
        ArrayList<Integer> opcVista = new ArrayList<Integer>();
        ArrayList<Integer> reservaQtdPessoas = new ArrayList<Integer>();
        ArrayList<String> reservaTipoBife = new ArrayList<String>();
        ArrayList<String> reservaDataRestaurante = new ArrayList<String>();
        ArrayList<String> reservaHorarioRestaurante = new ArrayList<String>();
        ArrayList<Integer> qtdPessoasPasseio = new ArrayList<Integer>();
        ArrayList<String> tipoPasseio = new ArrayList<String>();
        ArrayList<String> tipoLocomocao = new ArrayList<String>();
        ArrayList<Integer> maritmaQtdPessoas = new ArrayList<Integer>();
        ArrayList<Integer> maritmaQtdDias = new ArrayList<Integer>();
        ArrayList<String> maritmaDataReserva =  new ArrayList<String>();
        ArrayList<String> maritmaTipoBarco = new ArrayList<String>();
        ArrayList<String> maritmaTipoPasseio = new ArrayList<String>();



        for (int i = 0; i < 1; i++) {

            System.out.println("DIGITE SEU E-MAIL");
            ps1.setEmail(scan.nextLine());
            email.add(ps1.getEmail());

            System.out.println("NOME COMPLETO:");
            ps1.setNome(scan.nextLine());
            nome.add(ps1.getNome());

            System.out.println("DIGITE O SEU CPF:");
            ps1.setCpf(scan.nextBigInteger());
            cpf.add(ps1.getCpf());

            System.out.println("DIGITE O SEU RG:");
            ps1.setRg(scan.nextBigInteger());
            rg.add(ps1.getRg());
        }

        for (int i = 0; i <= 5; i++) {

            System.out.println("MENU");
            System.out.println("1 - RESERVA DE QUARTOS");
            System.out.println("2 - RESERVA MESAS/RESTAURANTE");
            System.out.println("3 - RESERVA DE GUIA TURISTICO");
            System.out.println("4 - RESERVA MARITMA");
            System.out.println("5 - FECHAR E MOSTRAR ITENS RESERVADOS");
            System.out.println("    DIGITE A OPÇÃO DESEJADA:");

            int opcao;

            Scanner menu = new Scanner(System.in);

            opcao = menu.nextInt();
            if (opcao == 1) {

                int andar = 0;

                System.out.println("DIGITE (SUITE) PARA RESERVAR SUA SUITE, OU (QUARTO) PARA RESERVAR SEU QUARTO");
                System.out.println("LEMBRANDO QUE OS 19° E 20° ANDAR CONTAM APENAS COM SUITES");
                Scanner opcaoSuiteQuarto = new Scanner(System.in);
                rq.setOpcaoSuiteQuarto(opcaoSuiteQuarto.nextLine());
                opcSuiteQuarto.add(rq.getOpcaoSuiteQuarto());

                System.out.println("OBS: OS QUARTOS OU SUITES TEM CAPACIDADE PARA NO MAXIMO 5 PESSOAS");
                System.out.println("DIGITE A QUANTIDADE DE QUARTOS OU SUITES QUE DESEJA RESERVAR");
                Scanner quantQuarto = new Scanner(System.in);
                rq.setQtdQuartos(quantQuarto.nextInt());
                qtdQuartos.add(rq.getQtdQuartos());

                System.out.println("DIGITE A QUANDIDADE DE DIAS QUE DESEJA SE HOSPEDAR");
                Scanner quantDias = new Scanner(System.in);
                rq.setQtdDias(quantDias.nextInt());
                qtdDias.add(rq.getQtdDias());

                System.out.println("DIGITE EM QUAL ANDAR DESEJA SE HOSPEDAR");
                System.out.println("LEMBRANDO QUE OS 19° E 20° ANDAR SÃO APENAS SUITES DE FRENTE PARA O MAR:");
                Scanner opAndar = new Scanner(System.in);
                rq.setOpcaoAndar(opAndar.nextInt());
                opcAndar.add(rq.getOpcaoAndar());

                if (opcAndar.get(i) <= 18) {

                    System.out.println("DIGITE A OPÇÃO DE VISTA PARA SEUS DIAS DE HOSPEDAGEM");
                    System.out.println("TEMOS A OPÇÃO DE VISTA PARA O MAR OU NAO");
                    System.out.println("DIGITE" + " (1) PARA SIM" + " OU" + " (2) PARA NÃO" + "CASO NAO DESEJA TER A VISTA PARA O MAR");

                    Scanner opVista = new Scanner(System.in);
                    rq.setOpcaoVista(opVista.nextInt());
                    opcVista.add(rq.getOpcaoVista());

                    if (opcVista.get(i) == 1){

                        System.out.println("VOCE ESTA ALUGANDO: " + qtdQuartos.get(i) + " QUARTO(S), NO " + opcAndar.get(i) + " ANDAR, POR " + qtdDias.get(i) + " DIAS." );
                        System.out.println("SEU QUARTO ESTA RESERVADO, E COM VISTA DE FRENTE PARA O MAR");
                    }
                    if (opcVista.get(i) == 2) {

                        System.out.println("VOCE ESTA ALUGANDO: " + qtdQuartos.get(i) + " QUARTO(S), NO " + opcAndar.get(i) + " ANDAR, POR " + qtdDias.get(i) +  " DIAS.");
                        System.out.println("SEU QUARTO ESTA RESERVADO, SEM VISTA DE FRENTE PARA O MAR");
                    }
                }
                if (opcAndar.get(i) > 18 && opcAndar.get(i) <= 20 ){

                    System.out.println("VOCE ESTA ALUGANDO: " + qtdQuartos.get(i) + " QUARTO(S), NO " + opcAndar.get(i) + " ANDAR");
                    System.out.println("SEU QUARTO ESTA RESERVADO, E COM VISTA PARA O MAR");

                }
                if (opcAndar.get(i) > 20){

                    System.out.println("OPÇAO INVALIDA");
                }

            }
            if (opcao == 2){

                System.out.println("DIGITE A QUANTIDADE TOTAL DE PESSOAS QUE IRÃO COMPARECER: ");
                Scanner quantPessoas = new Scanner(System.in);
                rr.setQtdPessoas(quantPessoas.nextInt());
                reservaQtdPessoas.add(rr.getQtdPessoas());

                System.out.println("DIGITE A OPÇÃO DE BIFE QUE DESEJA NO DIA DE SUA RESERVA: ");
                Scanner opcBife = new Scanner(System.in);
                rr.setTipoBife(opcBife.nextLine());
                reservaTipoBife.add(rr.getTipoBife());

                System.out.println("DIGITE O DIA QUE DESEJA REALIZAR SUA RESERVA");
                Scanner diaReserva = new Scanner(System.in);
                rr.setData(diaReserva.nextLine());
                reservaDataRestaurante.add(rr.getData());

                System.out.println("DIGITE O HORARIO DE DESEJA FAZER SUA RESERVA");
                Scanner hrReserva = new Scanner(System.in);
                rr.setHorario(hrReserva.nextLine());
                reservaHorarioRestaurante.add(rr.getHorario());
            }
            if (opcao == 3){

                System.out.println("DIGITE A QUANTIDADE PESSOAS QUE IRÃO PARTICIPAR DO PASSEIO: ");
                Scanner quantPessoasPasseio = new Scanner(System.in);
                gt.setQtdPessoas(quantPessoasPasseio.nextInt());
                qtdPessoasPasseio.add(gt.getQtdPessoas());

                System.out.println("DIGITE O TIPO DE PASSAEIO QUE DESEJA REALIZAR");
                System.out.println("LEMBRANDO QUE CONTAMOS COM PASSEIOS DO TIPO: DUNAS, TRILHAS E LENÇÕES DE AREIA");
                Scanner tpPasseio = new Scanner(System.in);
                gt.setTipoPasseio(tpPasseio.nextLine());
                tipoPasseio.add(gt.getTipoPasseio());

                System.out.println("DIGITE O TIPO DE LOCOMOÇÃO QUE DESEJA PARA REALIZAR O PASSEIO");
                System.out.println("LEMBRANDO QUE CONTAMOS COM: BICICLTAS OU BUGUE, MAS TAMBÉM TEM A OPÇÃO DE FAZER O PERCURSO ANDANDO");
                Scanner tpLocomocao = new Scanner(System.in);
                gt.setTipoLocomoção(tpLocomocao.nextLine());
                tipoLocomocao.add(gt.getTipoLocomoção());


            }

            if (opcao == 4){

                System.out.println("DIGITE A QUANTIDADE DE PESSOAS QUE IRÃO REALIZAR O PASSEIO: ");
                Scanner quantPessoasPasseio = new Scanner(System.in);
                rm.setQtdPessoas(quantPessoasPasseio.nextInt());
                maritmaQtdPessoas.add(rm.getQtdPessoas());

                System.out.println("DIGITE A QUANTIDADE DE DIAS QUE DESEJA RESERVAR O TRANSPORTE MARITMO");
                Scanner quantDiasTranspMaritmo = new Scanner(System.in);
                rm.setQtdDias(quantDiasTranspMaritmo.nextInt());
                maritmaQtdDias.add(rm.getQtdDias());

                System.out.println("DIGITE A PARTIR DE QUE DATA DESEJA RESERVAR O TRANSPORTE MARITMO: ");
                Scanner dataReserva = new Scanner(System.in);
                rm.setDataReserva(dataReserva.nextLine());
                maritmaDataReserva.add(rm.getDataReserva());

                System.out.println("DIGITE O TIPO DE TRANPORTE QUE DESEJA REALIZAR SEU PASSEIO");
                System.out.println("LEMBRANDO QUE CONTAMOS COM: BARCO SIMPLES, KAIAQUE, LANCHAS E JETSKY");
                Scanner tpbarco = new Scanner(System.in);
                rm.setTipoBarco(tpbarco.nextLine());
                maritmaTipoBarco.add(rm.getTipoBarco());

                System.out.println("DIGITE O TIPO DE PASSEIO QUE DESEJA REALIZAR");
                System.out.println("LEMBRANDO QUE REALIZAMOS PASSEIO DO TIPO: MAR ABERTO, ILHAS E PISCINAS NATURAIS");
                Scanner tpPasseio = new Scanner(System.in);
                rm.setTipoPasseio(tpPasseio.nextLine());
                maritmaTipoPasseio.add(rm.getTipoPasseio());

            }

            if (opcao == 5){

                System.out.println("NOME DO LOCATÁRIO: " + nome.get(i));
                System.out.println("CPF DO LOCATÁRIO: " + cpf.get(i));
                System.out.println("REGISTRO GERAL DO LOCATÁRIO: " + rg.get(i));
                System.out.println("E-MAIL DO LOCATÁRIO: " + email.get(i));
                System.out.println("VOCE RESERVOU:" + qtdQuartos.get(i) + " QUARTOS.");
                System.out.println("SUA RESERVA É VALIDA POR: " + qtdDias.get(i) + " DIAS.");
                System.out.println("SUA RESERVA ESTÁ ALOCADA NO: " + opcAndar.get(i) + " ANDAR");
                System.out.println("VOCE OPTOU POR RESERVAR UM(A): " + opcSuiteQuarto.get(i));
                System.out.println("VOCE REALIZOU UMA RESERVA NO RESTAURANTE PARA: " + reservaQtdPessoas.get(i) + " PESSOAS.");
                System.out.println("VOCÊ ESCOLHEU O BIFE DE: " + reservaTipoBife.get(i) + " PARA SUA REFEIÇÃO.");
                System.out.println("VOCE RESERVOU UMA MESA PARA A DATA DO DIA: " + reservaDataRestaurante.get(i));
                System.out.println("SUA MESA FICOU RESERVADA PARA AS: " + reservaHorarioRestaurante.get(i) + " Horas.");
                System.out.println("VOCE RESERVOU UM GUIA TURISTICO PARA: " + qtdPessoasPasseio.get(i) + " PESSOAS.");
                System.out.println("DURANTE SEU PASSEIO VOCE ESCOLHEU AS OPÇÕES DE: " + tipoPasseio.get(i));
                System.out.println("PARA REALIZAR SEU PASSEIO VOCE ESCOLHEU A OPÇÃO DE IR: " + tipoLocomocao.get(i));
                System.out.println("VOCE RESERVOU UM PASSEIO MARITMO PARA: " + maritmaQtdPessoas.get(i));
                System.out.println("PARA ESSE PASSEIO VOCE OPTOU POR IR DE: " + maritmaTipoBarco.get(i));
                System.out.println("VOCE OPTOU PARA IR A: " + maritmaTipoPasseio.get(i) + " DE " + maritmaTipoBarco.get(i));
                System.out.println("VOCE RESERVOU O TRANPOSRTE MARITMO PARA: " + maritmaQtdDias.get(i) + " DIA(S)");
                System.out.println("VOCE RESERVOU PARA O(S) DIA(S): " + maritmaDataReserva.get(i));
            }
        }
    }
}
