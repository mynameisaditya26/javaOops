class aM {
    public int pubNum = 10;
    private int privNum = 20;
    public void getPriv(){
        System.out.println(privNum);
    }
}

public class accessModifiers{
    public static void main(String[] args){
        aM obj = new aM();
        System.out.println(obj.pubNum);
        obj.getPriv();
    }
}

