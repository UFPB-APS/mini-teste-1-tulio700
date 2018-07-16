public class Sistema {
    
    private static String nome;
    
    public static void setNome(String nome) {
        Sistema.nome = nome;
    }
    
    public static String getNome() {
        return Sistema.nome;
    }
    
    public static String getMensagem() {
        return "Alo mundo, eu sou " + getNome();
    }
    
    
    
    
}
