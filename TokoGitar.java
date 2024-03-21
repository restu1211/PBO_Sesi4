public class TokoGitar {
    protected String merkGitar;
    protected String typeGitar;
    protected int hargaGitar;
    
    public TokoGitar(String merkGitar, String typeGitar, int hargaGitar){
        this.merkGitar = merkGitar;
        this.typeGitar = typeGitar;
        this.hargaGitar = hargaGitar;
    }
    
    public void InfoGitar(){
        System.out.println("Merk Gitar     : " + merkGitar);
        System.out.println("Type Gitar     : " + typeGitar);
        System.out.println("Harga Gitar    : " + hargaGitar);
    }
}