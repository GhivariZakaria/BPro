import java.util.Vector;
import java.util.Scanner;
    
public class TokoBuku {
  
  private static void garis () {
    System.out.println("======================");
  }
  
  public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        //Deklarasi Tabel Barang
        Vector namabarang = new Vector();
        Vector kodebarang = new Vector();
        Vector hargabarang = new Vector();
        Vector stokbarang = new Vector ();
       
    //Deklarasi Tabel Penjualan
        Vector kodebarangpenjualan = new Vector();
        Vector namabarangpenjualan = new Vector();
        Vector hargabarangpenjualan = new Vector();
        Vector banyakbarangpenjualan = new Vector();
        Vector jumlahargapenjualan = new Vector();
        
        kodebarang.addElement("001");
        namabarang.addElement("Majalah");
        hargabarang.addElement("25000");
        stokbarang.addElement(" 45");
		
		kodebarang.addElement("002");
        namabarang.addElement("Buku Paket");
        hargabarang.addElement("75000");
        stokbarang.addElement("42");
		
		kodebarang.addElement("003");
        namabarang.addElement("Buku Gambar");
        hargabarang.addElement("7500");
        stokbarang.addElement("39");
        
        kodebarang.addElement("004");
        namabarang.addElement("Buku Panduan");
        hargabarang.addElement("32500");
        stokbarang.addElement("15");
        
        int pilihmenu1=0;
        int pilihmenu2=0;
        int pilihmenu4=0;
                
        do {
           garis();
            System.out.println("      W E L C O M E      ");
            System.out.println("        Toko Pustaka Buku       ");
            garis();
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Masukkan pilihan : ");
            pilihmenu1=Integer.parseInt(in.nextLine());
            switch (pilihmenu1) {
                case 1 :
                    System.out.print("Masukkan ID : ");
                    String id = in.nextLine();
                    System.out.print("Masukkan Password :");
                    String password = in.nextLine();
                    if (id.equalsIgnoreCase("14045") && password.equalsIgnoreCase("makangratisbro"))
                    {
                        do {
                    garis();
                    System.out.println("        Database          ");
                    garis();
                    String pili;
                    System.out.println("1. Insert Data");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Transaksi");
                    System.out.println("5. Stock Buku");
                    System.out.print("Masukkan pilihan (1-5): ");
                    pilihmenu2=Integer.parseInt(in.nextLine());
                    switch (pilihmenu2){
                        case 1 :
                            System.out.println("==========================");
                            System.out.println("     Insert Database      ");
                            System.out.println("==========================");
                            System.out.println("1. Tabel Buku");
                            System.out.println("2. Back to Menu");
                            System.out.print("Masukkan pilihan (1-2): ");
                            
                            pilihmenu2=Integer.parseInt(in.nextLine());
                            switch (pilihmenu2){
                                case 1 :
                                    System.out.println("===========================");
                                    System.out.println("     Insert Tabel Buku   ");
                                    System.out.println("===========================");
                                    do {
                                    System.out.print("Kode Buku : ");
                                    kodebarang.add(in.nextLine());
                                    System.out.print("Nama Buku : ");
                                    namabarang.add(in.nextLine());       
                                    System.out.print("Jumlah Buku : ");
                                    stokbarang.add(in.nextLine());
                                    System.out.print("Harga (Rp.): ");
                                    hargabarang.add(in.nextLine()); System.out.println();
                                    System.out.print("Menginputkan lagi ? (Y/T) : ");
                                    pili=in.nextLine();
                                    } while(pili.equalsIgnoreCase("y"));
                                    break;
                            }
                            break;
                            
                        case 2 :
                            System.out.println("==========================");
                            System.out.println("     Update Database      ");
                            System.out.println("==========================");
                            System.out.println("1. Tabel Buku");
                            System.out.println("2. Back to Menu");
                            System.out.print("Masukkan pilihan (1-2): ");
                            pilihmenu2=Integer.parseInt(in.nextLine());
                            switch (pilihmenu2){
                                case 1 :
                                    System.out.println("================================");
                                    System.out.println("     Update Tabel Buku        ");
                                    System.out.println("================================");
                                    String pil32;
                                    do {
                                    System.out.print("Kode Buku : ");
                                    String  tmp = in.nextLine();
                                    System.out.print("Stok Buku Saat ini : ");
                                    stokbarang.removeElementAt(kodebarang.indexOf(tmp));
                                    stokbarang.insertElementAt(in.nextLine(), kodebarang.indexOf(tmp));
                                    System.out.print("Apakah Anda ingin mengulaingi lagi? (Y/T) : ");
                                    pil32=in.nextLine();
                                    }while(pil32.equalsIgnoreCase("y"));
                                    break;
                            }
                            break;
                        case 3 : 
                            System.out.println("==========================");
                            System.out.println("     Delete Database      ");
                            System.out.println("==========================");
                            System.out.println("1. Tabel Buku");
                            System.out.println("2. Back to Menu");
                            System.out.print("Masukkan pilihan (1-2): ");
                            pilihmenu2=Integer.parseInt(in.nextLine());
                            switch (pilihmenu2){
                                case 1:
                                    System.out.println("==========================");
                                    System.out.println("    Hapus Data Buku     ");
                                    System.out.println("==========================");
                                    String pilh;
                                    int ada = 1;
                                    do {
                                        System.out.print("Kode Buku yang dihapus : ");
                                        String code =in.nextLine();
                        
                                        for (int x=0;x<kodebarang.size();x++) {
                                            if (kodebarang.elementAt(x).toString().equalsIgnoreCase(code+"")) {
                                                ada = 1;
                                            break;
                                            } else {
                                            ada = 0;
                                            }
                                                   }
                                        if (ada == 1) {
                                        namabarang.removeElementAt(kodebarang.indexOf(code));
                                        hargabarang.removeElementAt(kodebarang.indexOf(code));
                                        stokbarang.removeElementAt(kodebarang.indexOf(code));
                                        kodebarang.removeElementAt(kodebarang.indexOf(code));
                                        System.out.println("Data Buku berhasil dihapus");
                                        } else { System.out.println("Maaf Kode Buku tidak ditemukan"); }
                                    System.out.print("Apakah Anda ingin Mengulangi lagi? (Y/T) : ");
                                    pilh=in.nextLine();
                                    }while(pilh.equalsIgnoreCase("y"));
                                    break;
                            }
                            break;
                        case 4 :
                                    do {
                                    System.out.println("==========================");
                                    System.out.println("        Transaksi         ");
                                    System.out.println("==========================");
                                    System.out.println("1. Kasir");
                                    System.out.println("2. Laporan penjualan");
                                    System.out.println("3. Back to menu");
                                    System.out.print("Masukkan pilihan (1-3): ");
                                    pilihmenu4=Integer.parseInt(in.nextLine());
                                    switch (pilihmenu4) {
                                        case 1 :
                                            System.out.println("==========================");
                                            System.out.println("        Program Kasir     ");
                                            System.out.println("==========================");
                                            String pil33;
                                            
                                            int tot=0;
                                            int totharga [] = new int [20];
                                            String cod [] = new String[20];
                                            int jml []= new int [20];
                                            do {
                                                tot=0;
                                                System.out.println();
                                            System.out.print("Masukkan Banyak Kategori Buku : ");
                                            int n = Integer.parseInt(in.nextLine());
                                                for (int x=0;x<n;x++) {
                                                    
                                                    System.out.print("Masukkan Kode Buku : ");
                                                    cod[x] = in.nextLine();
                                                    System.out.print("Masukkan jumlah Buku : ");
                                                    jml[x] = Integer.parseInt(in.nextLine());
                                                    totharga[x] = jml[x]*Integer.parseInt(hargabarang.elementAt(kodebarang.indexOf(cod[x])).toString());
                                                    tot+=totharga[x];
                                                        //Untuk mengurangi Stok Buku
                                                        int totalskrng = Integer.parseInt(stokbarang.elementAt(kodebarang.indexOf(cod[x])).toString())-jml[x];
                                                        stokbarang.removeElementAt(kodebarang.indexOf(cod[x]));
                                                        stokbarang.insertElementAt(totalskrng, kodebarang.indexOf(cod[x]));
                                                    
                                                        //Untuk Record Tabel penjualan
                                                        kodebarangpenjualan.add(cod[x]);
                                                        namabarangpenjualan.add(namabarang.elementAt(kodebarang.indexOf(cod[x])));
                                                        hargabarangpenjualan.add(hargabarang.elementAt(kodebarang.indexOf(cod[x])));
                                                        banyakbarangpenjualan.add(jml[x]);
                                                        jumlahargapenjualan.add(totharga[x]);
                                                        
                                                    System.out.println();
                                                }
                                                System.out.println("Nama Buku \t\tBanyak \t\tHarga \t\tTotal");
                                                for (int x=0;x<n;x++) {
                                                System.out.println(namabarang.elementAt(kodebarang.indexOf(cod[x]))+" \t\t"+jml[x]+" \t\t"+hargabarang.elementAt(kodebarang.indexOf(cod[x]))+" \t\t"+totharga[x]);
                                                
                                                }
                                                System.out.println("TOTAL HARGA \t\t\t\t\t\t:"+tot);
                                            System.out.print("Apakah Anda ingin mengulngi lagi? (Y/T) : ");
                                            pil33=in.nextLine();
                                            }while(pil33.equalsIgnoreCase("y"));
                                            break;
                                        case 2  :
                                            garis();
                                            System.out.println("    Laporan penjualan    ");
                                            garis();
                                            System.out.println("Kode Buku \tNama Buku \t\tHarga Jual \tBanyak \tJumlah Harga");
                                            for (int x=0;x<kodebarangpenjualan.size();x++){
                                                System.out.println(kodebarangpenjualan.elementAt(x)+" \t\t"+namabarangpenjualan.elementAt(x)+" \t\t"+hargabarangpenjualan.elementAt(x)+" \t\t"+banyakbarangpenjualan.elementAt(x)+" \t\t"+jumlahargapenjualan.elementAt(x));
                                                }
                                            break;
                                    }
                        
                        }while(pilihmenu4<3);
                            break;
                            
                    case 5 :
                            System.out.println("==========================");
                            System.out.println("        Stok Buku       ");
                            System.out.println("==========================");
                            System.out.println("Kode Buku\tNama Buku\tStock Buku");
                            for (int x=0;x<kodebarang.size();x++){
                              System.out.println(kodebarang.elementAt(x)+"\t"+namabarang.elementAt(x)+"\t"+stokbarang.elementAt(x));
                            }
                    break;
                    }
                        }while(pilihmenu2<6);
                            }else{
                              System.out.println("ID atau Password Anda salah");
                            }
                            break;
            }
        }while(pilihmenu1<2);
    }
}
