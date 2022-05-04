package DAL.Entity;

import DAL.Entity.persone.Collaboratore;
import DAL.Entity.persone.Dipendente;


import javax.persistence.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "azienda")
@Entity
public class Azienda {

    @OneToMany(mappedBy = "azienda")
    List<Collaboratore> collaboratori ;
    @OneToMany(mappedBy = "azienda")
    List<Dipendente> dipendenti ;
    @OneToMany(mappedBy = "azienda")
    List<Cliente> clienti ;
    @OneToMany(mappedBy = "azienda")
    List<Fattura> fatture ;
    @OneToMany(mappedBy = "azienda")
    List<Ordine> ordini ;
    private static final String pathfile = "ERP/Resources/Dipendenti";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Azienda(){
        this.collaboratori = new ArrayList<>();
        try(FileInputStream f= new FileInputStream(pathfile);
            ObjectInputStream i= new ObjectInputStream(f);){
            dipendenti = (ArrayList<Dipendente>) i.readObject();
        }catch(IOException | ClassNotFoundException c){
            System.out.println(c.getMessage());
        }
        this.clienti = new ArrayList<>();
        this.fatture = new ArrayList<>();
        this.ordini = new ArrayList<>();
    }

//    public int numDipendenti(){
//        return this.dipendenti.size() ;
//    }
//
//    public Fattura generaFattura(/*Ordine o,*/ Operatore p){
////        trovi LIsta Ordini Operatore p
////                scegli un ordine
////                prendi la lista contatti di azienda associata all ordine
////                scegli il contatto
////                crei fattura
//        Scanner sc = new Scanner(System.in) ;
//        List<Ordine> nonFatturati = this.getOrdineNoFatture() ;
//        List<Ordine> ordiniP = ordini.stream().filter(o -> o.getOper().equals(p)&& nonFatturati.contains(o)).collect(Collectors.toList());
//        System.out.println("scegli ordine");
//        ordiniP.forEach(System.out::println) ;
//        int i = sc.nextInt() ;
//        Ordine o = ordiniP.get(i-1) ;
//
//            System.out.println("scegli contatto");
//            o.getCliente().getContatti().forEach(System.out::println);
//            sc = new Scanner(System.in) ;
//            i = sc.nextInt() ;
//            Contatto c = o.getCliente().getContatti().get(i-1) ;
////            System.out.println("inserisci data");
////            sc = new Scanner(System.in) ;
////            String data = sc.nextLine() ;
////            return new Fattura(data,o,c) ;
//        Fattura f = new Fattura(LocalDate.now().toString(),o,c) ;
//        this.fatture.add(f) ;
//            return  f;
//
//    }
//
//    public List<Fattura> fattureCliente(Contatto c){
//       int count = 0;
//
//       while(count < clienti.size()){
//           if (clienti.get(count).hasContatto(c))
//               break;
//
//           count++;
//       }
//       int finalCount = count;
//        return fatture.stream().filter(f -> f.getOrdine().getCliente().equals(clienti.get(finalCount))).collect(Collectors.toList());
//    }
//
//    public List<Dipendente> getOperators() {
//        return  dipendenti.stream().filter(d -> d.getRuolo().equals(Ruoli.OPERATOR) && (d.getDataAssunzione().isAfter(LocalDate.now().minusDays(31)))).collect(Collectors.toList());
//    }
//
//    public  List<Cliente> getClientiContMagg10(){
//        return clienti.stream().filter(c -> c.getContatti().size()>10).collect(Collectors.toList());
//    }
//
//    public List<Dipendente> getDipendenteMacchina() {
//        return  dipendenti.stream().filter(d -> d.getRisorse().contains(Risorse.MACCHINA)).collect(Collectors.toList());
//    }
//
//    public List<Fattura> getFattureDopo2019(){
//        return  fatture.stream().filter(f -> f.getData().isAfter(LocalDate.parse("2019-12-31"))).collect(Collectors.toList());
//    }
//
//    public List<Fattura> getFattureReply(){
//        return  fatture.stream().filter(f -> f.getOrdine().getCliente().getNome().equalsIgnoreCase("reply")).collect(Collectors.toList());
//    }
//
//    public List<Ordine> getOrdineNoFatture(){
//        List<Ordine> fatturati = fatture.stream().map(f -> f.getOrdine()).collect(Collectors.toList());
//        return ordini.stream().filter(o -> !fatturati.contains(o)).collect(Collectors.toList());
//    }
//
//    public void salvaDipendenti(){
//        try(
//                FileOutputStream f = new FileOutputStream(pathfile);
//                ObjectOutputStream o = new ObjectOutputStream(f);
//        ){
//            o.writeObject(this.dipendenti);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
}
