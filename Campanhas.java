
public class Campanhas {
    private String idCampanhas;

    
    
    public Campanhas(String idCampanhas) {
        this.idCampanhas = idCampanhas;
    }


    public String getIdCampanhas() {
        return idCampanhas;
    }

    public void setIdCampanhas(String idCampanhas) {
        this.idCampanhas = idCampanhas;
    }

    
    @Override
    public String toString() {
        return "Campanhas [idCampanhas=" + idCampanhas + "]";
    }
}
