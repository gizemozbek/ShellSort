package ShellSort;
public class ShellSort {
    private long [] dizi;
    private int elemanSayisi;

    public ShellSort(int max) {
        dizi = new long [max]; //long turunde max boyutunda bir dizi
        elemanSayisi=0; //dizi baslangicta bos

    }
    public void insert(long d){
        dizi[elemanSayisi]=d; //d, diziye eklenir, bos oldugu icin basi ya da sonu yoktur
        elemanSayisi++; //dizideki toplam eleman sayisini bir arttirir
    }

    public void display(){
        for (int i =0;i<elemanSayisi; i++){ //0'dan elemanSayisi'na kadar olan elemanlari yazdir
            System.out.print(dizi[i]+" ");
        }
        System.out.println("");

    }
    //SHELL SORT
    //Farkli araliklarla karsilastirma yaparak siralama yapan algoritma
    // diziyi siralarken kullanilan araligi hesaplayacagiz
    public void ShellSort(){
        int i, j;
        long temp;
        //gap(aralik-bosluk)
        int h=1;

        //siralamanin baslangicinda belirli bir aralikla yapilacak siralamalar icin h hesaplanir
        while (h<=elemanSayisi/3){ //dizinin eleman sayisina gore h artar
            //eleman sayisi 10 ise 1,4,13 şeklinde bosluklarla ilerler
            h=h*3+1; // bosluk hesaplama

        }

        // siralama araligini kucult
        // h degeri 0 olana kadar siralama yapilir
        //once buyuk araliklarla baslayip daha kucuk araliklara dogru ilerler
        //araliklar arasinda elemanlar karsilastilir, siralamaya gore yer degistirilir
        while (h>0){
            for (i=h;i<elemanSayisi;i++){ //ilk elemandan h kadar ileriden baslanir
                temp=dizi[i]; // eleman gecici bir degiskende saklanir
                j=i; // mevcut durum kontrolu
                //j her adimda bir onceki araliga (gap kadar geri) kaydirilacak

                while (j>h-1 && dizi[j-h] >= temp) { //dizi[j-h] degeri temp degerinden buyuk ya da esitse yer degistir
                    dizi[j] = dizi[j - h]; // yer degistirilir
                    j -= h; //j degeri h kadar azalt
                }
                dizi[j]=temp; //temp dogru pozisyona yerlestilir

            }
            h=(h-1)/3; //Knuth siralama dizisi formulu
        }
    }
}
