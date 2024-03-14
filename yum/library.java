package yum;

import yum.books;
import java.util.ArrayList;

public class library {
    public static void main(String[] args) {
        ArrayList<books> teknologi = new ArrayList();
        teknologi.add(new books("Teknologi", "Buku1", "Maya"));
        teknologi.add(new books("Teknologi", "Buku2", "Ayu"));
        teknologi.add(new books("Teknologi", "Buku3", "Anjay"));
        teknologi.add(new books("Teknologi", "Buku4", "AMngjay"));
        teknologi.add(new books("Teknologi", "Buku5", "Jawanese"));

        ArrayList<books> filsafat = new ArrayList();
        filsafat.add(new books("Filsafat", "Buku1", "Maya"));
        filsafat.add(new books("Filsafat", "Buku2", "Ayu"));
        filsafat.add(new books("Filsafat", "Buku3", "Anjay"));
        filsafat.add(new books("Filsafat", "Buku4", "Puna"));
        filsafat.add(new books("Filsafat", "Buku5", "Jawanese"));

        ArrayList<books> sejarah = new ArrayList();
        sejarah.add(new books("Sejarah", "Buku1", "Maya"));
        sejarah.add(new books("Sejarah", "Buku2", "Ayu"));
        sejarah.add(new books("Sejarah", "Buku4", "Puna"));
        sejarah.add(new books("Sejarah", "Buku5", "Jawanese"));
        sejarah.add(new books("Filsafat", "Buku5", "Jaja & Baba"));

        ArrayList<books> agama = new ArrayList();
        agama.add(new books("Agama", "Buku1", "Maya"));
        agama.add(new books("Agama", "Buku2", "Ayu"));
        agama.add(new books("Agama", "Buku3", "Anjay"));
        agama.add(new books("Agama", "Buku4", "Puna"));
        agama.add(new books("Agama", "Buku5", "Jawanese"));

        ArrayList<books> psikologi = new ArrayList();
        psikologi.add(new books("Psikologi", "Buku1", "Maya"));
        psikologi.add(new books("Psikologi", "Buku2", "Ayu"));
        psikologi.add(new books("Psikologi", "Buku3", "Anjay"));
        psikologi.add(new books("Psikologi", "Buku4", "Puna"));
        psikologi.add(new books("Psikologi", "Buku5", "Jawanese"));

        ArrayList<books> politik = new ArrayList();
        politik.add(new books("Politik", "Buku1", "Maya"));
        politik.add(new books("Politik", "Buku2", "Ayu"));
        politik.add(new books("Politik", "Buku3", "Anjay"));
        politik.add(new books("Politik", "Buku4", "Puna"));
        politik.add(new books("Politik", "Buku5", "Jawanese"));

        ArrayList<books> fiksi = new ArrayList();
        fiksi.add(new books("Fiksi", "Buku1", "Maya"));
        fiksi.add(new books("Fiksi", "Buku2", "Ayu"));
        fiksi.add(new books("Fiksi", "Buku3", "Anjay"));
        fiksi.add(new books("Fiksi", "Buku4", "Puna"));
        fiksi.add(new books("Fiksi", "Buku5", "Jawanese"));

        System.out.println(teknologi);
        System.out.println(filsafat);
        System.out.println(sejarah);
        System.out.println(agama);
        System.out.println(psikologi);
        System.out.println(politik);
        System.out.println(fiksi);

    }
}
