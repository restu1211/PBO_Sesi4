    public class PembuatGitar extends TokoGitar{
    protected String Pembuat;
    
    public PembuatGitar(String merkGitar, String typeGitar ,String Pembuat, int hargaGitar){
        super(merkGitar, typeGitar, hargaGitar);
        this.Pembuat = Pembuat;
    }
    
    @Override
    public void InfoGitar(){
        System.out.println("Spesifikasi Gitar   : \n");
        System.out.println("Merk Gitar     : " + super.merkGitar);
        System.out.println("Type Gitar     : " + super.typeGitar);
        System.out.println("Pembuat Gitar  : " + this.Pembuat);
        System.out.println("Harga Gitar    : " + super.hargaGitar);
    }
}

