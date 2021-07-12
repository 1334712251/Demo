package demo2;

public class G {
    D d;
    public G(D d){
        this.d=d;
    }
    public void gg(){
        C c = d.createC();
        c.cc();
    }
    public static void main(String[] args) {
        E e = new E();
        F f = new F();
        G g = new G(e);
        g.gg();
    }
}
