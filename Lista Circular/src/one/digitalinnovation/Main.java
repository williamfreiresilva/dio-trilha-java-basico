package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        
        ListaCircular<String> minhalisListaCircular = new ListaCircular<>();

        minhalisListaCircular.add("C0");
        System.out.println(minhalisListaCircular);

        minhalisListaCircular.remove(0);
        System.out.println(minhalisListaCircular);

        minhalisListaCircular.add("C1");
        System.out.println(minhalisListaCircular);

        minhalisListaCircular.add("C2");
        minhalisListaCircular.add("C3");
        System.out.println(minhalisListaCircular);
        
        for(int i = 0; i < 20; i++){
            System.out.println(minhalisListaCircular.get(i));
        }
    }
}
