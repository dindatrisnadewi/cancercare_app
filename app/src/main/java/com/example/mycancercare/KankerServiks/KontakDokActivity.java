package com.example.mycancercare.KankerServiks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mycancercare.R;

import java.util.ArrayList;
import java.util.List;

public class KontakDokActivity extends AppCompatActivity {

    List<Kontak1> lstKontak1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak_dok);

        lstKontak1 = new ArrayList<>();
        lstKontak1.add(new Kontak1("dr. Anggita Dewi","084773927473/anggidw@gmail.com","dr. Anggita Dewi, Sp.B (K) Onk adalah seorang Dokter Spesialis Bedah Onkologi yang berpraktek di MRCCC Siloam Hospitals Semanggi. Beliau menamatkan pendidikan Kedokteran Umum di Universitas Kristen Indonesia pada tahun 1990 kemudian melanjutkan pendidikan Spesialis Bedah di Universitas Indonesia pada tahun 2000. Dan terakhir, menamatkan pendidikan Spesialis Bedah Onkologi di Universitas Indonesia pada tahun 2005." +
                "\n" +
                "\n" +
                "Pengalaman kerja beliau yaitu sebagai Dokter Umum Puskesmas Nimboran Kabupaten Jayapura Provinsi Papua dari tahun 1992 hingga tahun 1995, kemudian sebagai Ahli Bedah RSUD Wamena, Provinsi Papua mulai tahun 2000 hingga 2002 dan sebagai Ahli Bedah Onkologi Rumah Sakit Umum Daerah Dok-2 Jayapura, Provinsi Papua dari tahun 2003 hingga 2009.\n" +
                "\n" +
                "dr. Anggita Dewi, Sp.B (K) Onk merupakan anggota Ikatan Dokter Indonesia (IDI), anggota Ikatan Ahli Bedah Indonesia (IKABI) dan anggota Perhimpunan Ahli Bedah Onkologi Indonesia (PERABOI). Adapun layanan kesehatan yang beliau berikan meliputi : Konsultasi Kanker, Skrining Kanker, Bedah Kanker, Kemoterapi.\n",R.drawable.docewek));
        lstKontak1.add(new Kontak1("dr. Alexia Nia","081746389558/alexiagram@gmail.com","dr. Alexia, Sp.B(K)Onk adalah seorang Dokter Spesialis Bedah Onkologi. Saat ini, dr. Bernard Agung Baskoro berpraktek di Siloam Hospitals Lippo Village sebagai Dokter Spesialis Bedah Onkologi. Beliau menamatkan pendidikan Spesialis Bedah di Universitas Gajah Mada, kemudian melanjutkan subspesialis Bedah Onkologi di Universitas Padjajaran Bandung.\n" +
                "\n" +
                "dr. Alexia, Sp.B(K)Onk merupakan anggota dari Ikatan Dokter Indonesia (IDI), Perhimpunan Ahli Bedah Onkologi Indonesia (PERABOI). Adapun layanan kesehatan yang diberikan oleh beliau, meliputi : Breast Cancer Surgery, Konsultasi Kanker, Aspirasi jarum halus untuk pemeriksaan sitologi, Skrining Kanker, USG Kanker, Bedah Kanker, Kemoterapi, USG Mammae, Biopsi Kelenjar Getah Bening dan Payudara, Operasi Kanker Kulit, Operasi Tumor Payudara.\n",R.drawable.docewek2));
        lstKontak1.add(new Kontak1("dr. Sugih Laksana","082664859438/astungkarasugih@gmail.co.id","dr. Sugih Laksana, Sp.B (K) Onk adalah seorang Dokter Spesialis Bedah Onkologi yang berpraktek di MRCCC Siloam Hospitals Semanggi. Beliau menamatkan pendidikan Kedokteran Umum di Universitas Gadjah Mada pada tahun 1983 kemudian melanjutkan pendidikan Spesialis Bedah di Universitas Indonesia pada tahun 1991. Dilanjutkan dengan pendidikan Spesialis Bedah Onkologi di Universitas Indonesia pada tahun 1998. Terakhir, beliau meraih gelar Doktornya di Universiteit Amsterdam.\n" +
                "\n" +
                "dr. Sugih Laksana, Sp.B (K) Onk merupakan anggota Ikatan Dokter Indonesia (IDI), anggota Ikatan Ahli Bedah Indonesia (IKABI), dan anggota Perhimpunan Ahli Bedah Onkologi Indonesia (PERABOI). Adapun layanan kesehatan yang beliau berikan meliputi : Konsultasi Kanker, Skrining Kanker, Bedah Kanker, Kemoterapi.\n",R.drawable.docowo2));
        lstKontak1.add(new Kontak1("dr. Maria Sparingga","085773625442/sparingga33@gmail.com","dr. Maria Sparingga, Sp.PD (KHOM) merupakan seorang Dokter Penyakit Dalam (Konsultan Onkologi) yang berpraktik di Rumah Sakit Mayapada Tangerang. Adapun layanan kesehatan yang diberikan beliau seperti Konsultasi Kanker, Bedah Kanker.\n" +
                "\n" +
                "dr. Maria Sparingga telah menamatkan pendidikan Spesialis Penyakit Dalam Konsultan Onkologi di Universitas Indonesia. Beliau merupakan anggota dari Perhimpunan Dokter Spesialis Penyakit Dalam Indonesia.\n",R.drawable.docewek3));
        lstKontak1.add(new Kontak1("dr. Angga Diputra","089374636221/anggaputraa@gmail.com","dr. Angga Diputra, Sp.B (K)Onk adalah seorang Dokter Spesialis Bedah Onkologi yang tergabung dalam Perhimpunan Bedah Onkologi Indonesia. Beliau menamatkan pendidikan Spesialis Bedah di Fakultas Kedokteran, Universitas Airlangga, Surabaya. Beberapa layanan yang dapat beliau tangani diantaranya, Konsultasi Kanker, USG Kanker, Skrining Kanker, Kemoterapi, USG Mammae.\n" +
                "\n" +
                "dr. Angga Diputra melakukan praktek di Rumah Sakit Mitra Keluarga Waru dan RSAL Ramelan Surabaya sebagai Dokter Bedah Kanker. Beliau juga tergabung dalam Perhimpunan Bedah Onkologi Indonesia.\uFEFF\n",R.drawable.docowo3));
        lstKontak1.add(new Kontak1("dr. Agus Dharma","087447326356/gusdhar99@gmail.com","dr. Agus Dharma, Sp.B (K) Onk adalah seorang Dokter Spesialis Bedah Onkologi yang berpraktek di MRCCC Siloam Hospitals Semanggi. Beliau menamatkan pendidikan Kedokteran Umum di Universitas Gadjah Mada pada tahun 1983 kemudian melanjutkan pendidikan Spesialis Bedah di Universitas Indonesia pada tahun 1991. Dilanjutkan dengan pendidikan Spesialis Bedah Onkologi di Universitas Indonesia pada tahun 1998. Terakhir, beliau meraih gelar Doktornya di Universiteit Amsterdam.\n" +
                "\n" +
                "dr. Agus Dharma, Sp.B (K) Onk merupakan anggota Ikatan Dokter Indonesia (IDI), anggota Ikatan Ahli Bedah Indonesia (IKABI), dan anggota Perhimpunan Ahli Bedah Onkologi Indonesia (PERABOI). Adapun layanan kesehatan yang beliau berikan meliputi : Konsultasi Kanker, Skrining Kanker, Bedah Kanker, Kemoterapi.\n",R.drawable.docowo5));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstKontak1);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
