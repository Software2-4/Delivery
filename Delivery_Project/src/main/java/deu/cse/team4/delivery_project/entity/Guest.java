package deu.cse.team4.delivery_project.entity;

public class Guest {
    int idx;
    String id;
    String pw;

    Guest() {

    }


    public void setId(String id) {
        this.id = id;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getIdx() {
        return idx;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }
}
