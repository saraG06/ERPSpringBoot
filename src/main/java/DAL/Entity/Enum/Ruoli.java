package DAL.Entity.Enum;

public enum Ruoli {

    MANAGER("manager",1),
    PROJECTMANAGER("projectmanager",2),
    OPERATOR("operator",3);

    private String ruolo;
    private int i;

    public int getI() {
        return i;
    }

    Ruoli(String ruolo, int i) {
        this.ruolo = ruolo;
        this.i=i;
    }
}
