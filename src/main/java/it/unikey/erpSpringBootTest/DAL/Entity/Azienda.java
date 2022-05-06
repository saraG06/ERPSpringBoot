package it.unikey.erpSpringBootTest.DAL.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "azienda")
public class Azienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "azienda")
    private List<Collaboratore> collaboratori;
    @OneToMany(mappedBy = "azienda")
    private List<Dipendente> dipendenti;
    @OneToMany(mappedBy = "azienda")
    private List<Cliente> clienti;
    @OneToMany(mappedBy = "azienda")
    private List<Fattura> fatture;
    @OneToMany(mappedBy = "azienda")
    private List<Ordine> ordini;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Collaboratore> getCollaboratori() {
        return collaboratori;
    }

    public void setCollaboratori(List<Collaboratore> collaboratori) {
        this.collaboratori = collaboratori;
    }

    public List<Dipendente> getDipendenti() {
        return dipendenti;
    }

    public void setDipendenti(List<Dipendente> dipendenti) {
        this.dipendenti = dipendenti;
    }

    public List<Cliente> getClienti() {
        return clienti;
    }

    public void setClienti(List<Cliente> clienti) {
        this.clienti = clienti;
    }

    public List<Fattura> getFatture() {
        return fatture;
    }

    public void setFatture(List<Fattura> fatture) {
        this.fatture = fatture;
    }

    public List<Ordine> getOrdini() {
        return ordini;
    }

    public void setOrdini(List<Ordine> ordini) {
        this.ordini = ordini;
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "id=" + id +
                ", collaboratori=" + collaboratori +
                ", dipendenti=" + dipendenti +
                ", clienti=" + clienti +
                ", fatture=" + fatture +
                ", ordini=" + ordini +
                '}';
    }
/*public int numDipendenti(){
        return this.dipendenti.size() ;
    }*/

    //public Entities.Fattura generaFattura(/*Entities.Ordine o,*/ Operatore p){
//        trovi LIsta Ordini Operatore p
//                scegli un ordine
//                prendi la lista contatti di azienda associata all ordine
//                scegli il contatto
//                crei fattura
        /*Scanner sc = new Scanner(System.in) ;
        List<Ordine> ordiniP = ordini.stream().filter(o -> o.getOper().equals(p)).collect(Collectors.toList());
        System.out.println("scegli ordine");
        ordiniP.forEach(System.out::println) ;
        int i = sc.nextInt() ;
        Ordine o = ordiniP.get(i-1) ;

            System.out.println("scegli contatto");
            o.getCliente().getContatti().forEach(System.out::println);
            sc = new Scanner(System.in) ;
            i = sc.nextInt() ;
            Contatto c = o.getCliente().getContatti().get(i-1) ;
//            System.out.println("inserisci data");
//            sc = new Scanner(System.in) ;
//            String data = sc.nextLine() ;
//            return new Entities.Fattura(data,o,c) ;
            return new Entities.Fattura(LocalDate.now().toString(),o,c) ;

    }

    public List<Entities.Fattura> fattureCliente(Contatto c){
       int count = 0;

       while(count < clienti.size()){
           if (clienti.get(count).hasContatto(c))
               break;

           count++;
       }
       int finalCount = count;
        return fatture.stream().filter(f -> f.getOrdine().getCliente().equals(clienti.get(finalCount))).collect(Collectors.toList());
    }*/

    /*public void assegnoRisorse(){

    }*/

    /*public List<Dipendente> getOperators() {
        return  dipendenti.stream().filter(d -> d.getRuolo().equals(Ruoli.OPERATOR)).collect(Collectors.toList());
    }*/

    /*public  List<Cliente> getClientiContMagg10(){
        return clienti.stream().filter(c -> c.getContatti().size()>10).collect(Collectors.toList());
    }*/

    /*public List<Dipendente> getDipendenteMacchina() {
        return  dipendenti.stream().filter(d -> d.getRisorse().contains(Risorse.MACCHINA)).collect(Collectors.toList());
    }*/

    /*public List<Entities.Fattura> getFattureDopo2019(){
        return  fatture.stream().filter(f -> f.getData().isAfter(LocalDate.parse("2019-12-31"))).collect(Collectors.toList());
    }*/

    /*public List<Entities.Fattura> getFattureReply(){
        return  fatture.stream().filter(f -> f.getOrdine().getCliente().getNome().equalsIgnoreCase("reply")).collect(Collectors.toList());
    }*/
}
