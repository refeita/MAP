package almoxarifado;
import java.util.ArrayList;

//Vai verificar o estoque
public class AlmoxarifadoFachada {
    private ArrayList<Material> estoque;

    public AlmoxarifadoFachada() {

        this.estoque = new ArrayList<>();
    }

    public ArrayList<Material> getEstoque(){

        return this.estoque;
    }

    public void setEstoque(ArrayList<Material> estoque){

        this.estoque = estoque;
    }
//Vai cadastrar o material
    public boolean cadastrarMaterial(String nomeDoMaterial, double valorDoMaterial) {
        Material materialNew = new Material(nomeDoMaterial, valorDoMaterial);

        if(estoque.contains(materialNew)){
            return false;
        }
        estoque.add(materialNew);
        return true;
    }
    //Vai mostrar o estoque
    public String mostrarEstoque() {
        StringBuilder estoqueToString = new StringBuilder();
        for (Material material : estoque) {
            estoqueToString.append(material.toString()).append("\n");
        }
        return estoqueToString.toString();
    }
    //Vai comprar material se ele não tiver sido comprado antes
    public boolean comprarMaterial(String nomeDoMaterial, double valorDoMaterial) {
        if(cadastrarMaterial(nomeDoMaterial, valorDoMaterial)){
            return true;
        } 
        return false;
    }
    
}
