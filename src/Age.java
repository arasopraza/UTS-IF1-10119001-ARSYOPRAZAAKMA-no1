public class Age {
    private int yearBirth, yearNow;
    private String red;

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur() {
        return yearNow - yearBirth;
    }

    public String tandanyaKamu(int umur) {
        String tandanyaKamu = "";
        red = "\033[38;2;255;0;0m";
        if (0 <= umur && umur <= 5) {
            tandanyaKamu = red + "LAGI LUCU-LUCU NYA";
        } else if (5 < umur && umur <= 10) {
            tandanyaKamu = red + "MASIH ANAK-ANAK";
        } else if (10 < umur && umur <= 13) {
            tandanyaKamu = red + "MASIH REMAJA";
        } else if (13 < umur && umur <= 19) {
            tandanyaKamu = red + "ALAY";
        } else if (19 < umur && umur <= 29) {
            tandanyaKamu = red + "LAGI GALAU NYARI JODOH";
        } else if (29 < umur && umur <= 35) {
            tandanyaKamu = red + "LAGI SIBUK NYARI UANG";
        } else if (35 < umur && umur <= 150) {
            tandanyaKamu = red + "SUDAH TUA";
        } else if (0 > umur && umur > 150) {
            tandanyaKamu = red + "TIDAK TERDEKSI DI KEHIDUPAN";
        }
        return tandanyaKamu;
    }

}
