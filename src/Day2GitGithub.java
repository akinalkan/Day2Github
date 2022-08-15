public class Day2GitGithub {
    /*
    1-) git init -->Local repo olusturma icin:Yani .git ile klasorumuzun icindeki dosyalari
    iliskilendirmek icin kullanilir.
    2-) git add . -->Working space'den(Yani yerel)dosyalarimi
    Staging area'ya(Yani commit'lemek icin beklenen yer) gonderir
    3-) git status --> Working space'deki ve staging area'da ki durumu gosterir
    4-) git commit -m "Mesaj" -->Staging Area;dan commit stora dosyalarimi
     gondermek icin kullanilir.(commit YAni version[surum] olusturmus olurum)
    5-) git push --> Uzak repo'ya (Yani remote -Github) gondermek icin kullandigimiz kod.
    Yalniz git push komutunu direk kullanmak istersek bir kez :
                    git remote add origin adress
                    git push -u origin master
     Not:Yukaridaki 2 komutu tek seferde kullandiktan sonra 2. commit'lerim icin sadece
     git push  kullaniriz
     6-) git pull --> Github'da ki degisiklikleri locale 'e almak icin kullaniriz
     */
    public static void main(String[] args) {
        System.out.println("Github'i da ogrendim");
        System.out.println("2. islem");
        System.out.println("3. islem");
        // Github ogrendim.Github'dan pull ettik[git pull]
    }
}
