import java.util.LinkedList;

//Buatlah sebuah LinkedList yang mana pada LinkedList tersebut dapat menambah data berupa No_Bp, Nama_Mahasiswa, Alamat.
//Kemudian Tambahkan beberapa fungsi/operasi pada LinkedList yang anda ketahui

public class tugas3linkedlist {
    public static void main(String[] args) {
        
        System.out.println("=====FUNGSI-FUNGSI PADA LINKEDLIST=====");
        System.out.println("");

        //create LinkedList
        LinkedList<String> No_BP = new LinkedList<>();
        LinkedList<String> Nama_Mahasiswa = new LinkedList<>();
        LinkedList<String> Alamat = new LinkedList<>();

        //addFirst(), add(), dan addLast() 
        No_BP.addFirst("2111521025");
        Nama_Mahasiswa.addFirst("Arieska Kharzani");
        Alamat.addFirst("Jambi");

        No_BP.add("2111522025");
        Nama_Mahasiswa.add("Genta Hasibuan");
        Alamat.add("Medan");

        No_BP.addLast("2111523025");
        Nama_Mahasiswa.addLast("Zawas Natasya");
        Alamat.addLast("Aceh");

        System.out.println("FUNGSI ADD LINKEDLIST");
        System.out.println("No. BP\t\t: "+No_BP);
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //size()
        System.out.println("SIZE LINKEDLIST");
        System.out.println("No. BP\t\t: "+No_BP.size());
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa.size());
        System.out.println("Alamat\t\t: "+Alamat.size());
        System.out.println("");

        //is Empty()
        System.out.println("FUNGSI is Empty");
        System.out.println("No. BP\t\t: "+No_BP.isEmpty());
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa.isEmpty());
        System.out.println("Alamat\t\t: "+Alamat.isEmpty());
        System.out.println("");

        //set()
        No_BP.set(1, "1911521001");
        Nama_Mahasiswa.set(2, "Sheila Senja");
        Alamat.set(0,"DKI Jakarta");

        No_BP.set(2, "1811522010");
        Nama_Mahasiswa.set(1, "Jeong Jaehyun");
        Alamat.set(2,"Bandung");

        System.out.println("FUNGSI SISIP");
        System.out.println("No. BP\t\t: "+No_BP);
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //remove()
        No_BP.remove(2);
        Nama_Mahasiswa.remove(2);
        Alamat.remove(1);

        System.out.println("FUNGSI REMOVE");
        System.out.println("No. BP\t\t: "+No_BP);
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //get()
        System.out.println("FUNGSI GET");
        System.out.println("No. BP\t\t: "+No_BP.get(0));
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa.get(0));
        System.out.println("Alamat\t\t: "+Alamat.get(1));
        System.out.println("");

        //indexOf()
        System.out.println("FUNGSI indexOf");
        System.out.println("No. BP\t\t: "+No_BP.indexOf("2011523025"));
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa.indexOf("Arieska Kharzani"));
        System.out.println("Alamat\t\t: "+Alamat.indexOf("Amerika"));
        System.out.println("");

        //pop()
        No_BP.pop();
        Nama_Mahasiswa.pop();
        Alamat.pop();

        System.out.println("FUNGSI POP");
        System.out.println("No. BP\t\t: "+No_BP);
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

        //push()
        No_BP.push("1911522022");
        Nama_Mahasiswa.push("Roseanna Park");
        Alamat.push("Aussie");

        System.out.println("FUNGSI PUSH");
        System.out.println("No. BP\t\t: "+No_BP);
        System.out.println("Nama Mahasiswa\t: "+Nama_Mahasiswa);
        System.out.println("Alamat\t\t: "+Alamat);
        System.out.println("");

    }
}