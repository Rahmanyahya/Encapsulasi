public class person {
    private String nama, hobby;
    private int umur;
    

    person (String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }


    String getNama () {
        return nama;
    }

    int getUmur () {
        return umur;
    }


    void setHobby (String hobby) {
        this.hobby = hobby;
    }

    String getHobby () {
        return hobby;
    }


}
