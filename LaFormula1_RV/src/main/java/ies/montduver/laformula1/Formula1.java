/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ies.montduver.laformula1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jasb
 */
public class Formula1 {

    public static final String RESET = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String MORADO = "\033[35m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here

        int opcio;
        Circuit granPremi = null;
        List<Cotxe> cotxes = new ArrayList<Cotxe>();
        List<Box> pitLane = new ArrayList<Box>();

        /* Aquest mètode s'encarrega de crear les escuderies (5), els pilots (10), els cotxes (10) i els boxes de la linea pitLane (5).
           S'assigna un cotxe a un pilot i un box a cada escuderia. */
        crearEscuderies(cotxes, pitLane);

        do {

            opcio = -1;

            System.out.println("\n" + MORADO + "\t\t\t**** F O R M U L A  1  ****\n" + RESET);
            System.out.println("\t\t\t1. Establir un nou Gran Premi");
            System.out.println("\t\t\t2. Començar la carrera");
            System.out.println("\t\t\t3. Consultar qualificació");
            System.out.println("\t\t\t4. Eixir");
            opcio = Leer.leerEntero("\t\tIntrodueix una opcio (1-4): \n");

            switch (opcio) {
                case 1:
                    granPremi = crearGranPremi();
                    break;
                case 2:
                    //Començar la carrera
                    if (granPremi != null) {
                        Cotxe guanyador = GranPremi.correr(granPremi, cotxes, pitLane);
                        
                        int hores = (int) (guanyador.getTempsCarrera() / 3600);
                        int minuts = (int) ((guanyador.getTempsCarrera() - (hores * 3600)) / 60);
                        double segons = ((int) (guanyador.getTempsCarrera() - (hores * 3600) - (minuts * 60)) * 100.0) / 100.0;

                        System.out.println(BLUE + "\n\t\t\t I EL GUANYADOR DEL GRAN PREMI ÉS..." + RESET);
                        Thread.sleep(2000);
                        System.out.println("\n\t\t" + RED + guanyador.getPilot().getNom() + " !!!" + RESET + " amb un temps total de " + RED + hores + "h:" + minuts + "':" + segons + "\"\n\n\n" + RESET);

                        granPremi = null;
                    } else {
                        JOptionPane.showMessageDialog(null, "Encara no s'ha creat el circuit (opció 1).");
                    }
                    break;
                case 3:
                    mostrarQualify(cotxes);
                    Thread.sleep(3000);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opció incorrecta.");
            }

        } while (opcio != 4);

    }

    private static Circuit crearGranPremi() {
        Circuit circuit = new Circuit(Leer.leerTextoConDialogo("Quin és el nom del circuit?"), Leer.leerTextoConDialogo("En quin pais es troba?"), Leer.leerTextoConDialogo("Quina ciutat?"),Integer.parseInt(Leer.leerTextoConDialogo("Quant mesura el circuit (en metres) ")), Integer.parseInt(Leer.leerTextoConDialogo("Quantes voltes han de donar per a completar-lo?")));

        return circuit;
    }

    private static void mostrarQualify(List<Cotxe> cotxes) {
        
        List<Cotxe> listaAux = new ArrayList<Cotxe>(cotxes); //copia de la original 
        List<Cotxe> qualificacio = new ArrayList<Cotxe>();

        while (!listaAux.isEmpty()) {
            Iterator<Cotxe> co = listaAux.iterator();
            Cotxe lider = co.next();

            while (co.hasNext()) {
                Cotxe el_cotxe = co.next();
                
                if (el_cotxe.getPilot().getPunts() > lider.getPilot().getPunts()) {
                    lider = el_cotxe;
                }
            }
            qualificacio.add(lider);
            listaAux.remove(listaAux.indexOf(lider));            
        }
        System.out.println(MORADO + "\n\t\t     QUALIFICACIÓ DEL MUNDIAL DE PILOTS " + RESET);  
        System.out.println("\n\t\t\t*****************************");
        for (int i = 0; i < qualificacio.size(); i++) {
            
            System.out.println("\t\t\t|" + BLUE + qualificacio.get(i).getPilot().getNom() + RESET + "\t | " + GREEN + qualificacio.get(i).getPilot().getPunts() + RESET + " punts |");
            if (i != (qualificacio.size() -1))
                System.out.println("\t\t\t|---------------------------|");
        }
        System.out.println("\t\t\t*****************************");

    }

    private static void crearEscuderies(List<Cotxe> cotxes, List<Box> pitLane) {
    
        Escuderia McLaren = new Escuderia();
        Escuderia RedBull = new Escuderia();
        Escuderia Alpine = new Escuderia();
        Escuderia AstonMartin = new Escuderia();
        Escuderia Ferrari = new Escuderia();
        
        //Crear els boxes de cada escuderia i afegir-los al pitLane
        Box box_ML = new Box(McLaren, 12);
        pitLane.add(box_ML);
        Box box_RB = new Box(RedBull, 12);
        pitLane.add(box_RB);
        Box box_AP = new Box(Alpine, 9);
        pitLane.add(box_AP);
        Box box_AM = new Box(AstonMartin, 11);
        pitLane.add(box_AM);
        Box box_FR = new Box(Ferrari, 10);
        pitLane.add(box_FR);
        

        //Crear 10 pilots; 2 per escuderia
        Pilot AlejndroManxa = new Pilot("A. Manxa", McLaren, 4);
        Pilot RogerFerdesa = new Pilot("R. Ferdesa", McLaren, 14);
        Pilot VicentChulia = new Pilot("Chulia", RedBull, 3);
        Pilot LidiaLacomba = new Pilot("L. Lacomba", RedBull, 6);
        Pilot IreneTorres = new Pilot("I. Torres", Alpine, 73);
        Pilot MarcMarti = new Pilot("M. Marti", Alpine, 28);
        Pilot AngelaLlopis = new Pilot("A. Llopis", AstonMartin, 18);
        Pilot LuciaConstantino = new Pilot("L. Constantino", AstonMartin, 52);
        Pilot MariluzOlmos = new Pilot("M. Olmos", Ferrari, 2);
        Pilot LinaRosello = new Pilot("L. Rosello", Ferrari, 46);
        

        //Montar els 10 cotxes i afegir-los a la llista de cotxes
        Cotxe c4 = new Cotxe(McLaren, new Rodes("Michelín"), new Motor(), new Xasis("McLaren", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c4);
        Cotxe c14 = new Cotxe(McLaren, new Rodes("Michelín"), new Motor(), new Xasis("McLaren", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c14);
        Cotxe c3 = new Cotxe(RedBull, new Rodes("Michelín"), new Motor(), new Xasis("RedBull", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c3);
        Cotxe c6 = new Cotxe(RedBull, new Rodes("Michelín"), new Motor(), new Xasis("RedBull", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c6);
        Cotxe c73 = new Cotxe(Alpine, new Rodes("Michelín"), new Motor(), new Xasis("Alpine", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c73);
        Cotxe c28 = new Cotxe(Alpine, new Rodes("Michelín"), new Motor(), new Xasis("Alpine", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c28);
        Cotxe c18 = new Cotxe(AstonMartin, new Rodes("Michelín"), new Motor(), new Xasis("AstonMartin", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c18);
        Cotxe c52 = new Cotxe(AstonMartin, new Rodes("Michelín"), new Motor(), new Xasis("AstonMartin", "F1", "Blanco", 500.0, 2.5 , 1.0));
        cotxes.add(c52);
        Cotxe c2 = new Cotxe(Ferrari, new Rodes("Michelín"), new Motor(), new Xasis("Ferrari", "F1", "Blanco", 500.0, 2.3 , 1.0));
        cotxes.add(c2);
        Cotxe c46 = new Cotxe(Ferrari, new Rodes("Michelín"), new Motor(), new Xasis("Ferrari", "F1", "Blanco", 500.0, 2.3 , 1.0));
        cotxes.add(c46);
        
       
        //Assignar un cotxe a cada pilot 
        c4.setPilot(AlejndroManxa);
        c14.setPilot(RogerFerdesa);
        c3.setPilot(VicentChulia);
        c6.setPilot(LidiaLacomba);
        c73.setPilot(IreneTorres);
        c28.setPilot(MarcMarti);
        c18.setPilot(AngelaLlopis);
        c52.setPilot(LuciaConstantino);
        c2.setPilot(MariluzOlmos);
        c46.setPilot(LinaRosello);
    }    
}
