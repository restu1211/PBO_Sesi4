public class DetailGitar {
    static int discount(int harga_gitar, int diskon){
        return harga_gitar;
    }
    
    static double discount(double harga_gitar, double diskon){
        diskon = diskon * harga_gitar;
        return harga_gitar - diskon;
    }
    
    public static void main(String[] args) {
        String merk_gitar = "Yamaha 2024";
        String type_gitar = "Akustik";
        int harga_gitar = 100000;
        double diskon_gitar = discount(harga_gitar, 0.25);
        
        PembuatGitar gitarPub = new PembuatGitar(merk_gitar, type_gitar, "Restu", harga_gitar);  
        gitarPub.InfoGitar();
        
        System.out.println("Harga Setelah Diskon  : " + diskon_gitar);

    }

    
}
