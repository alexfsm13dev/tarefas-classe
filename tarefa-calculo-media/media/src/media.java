public class media {
    public static void main(String[] args){
        calculoMedia();
    }

    public static void calculoMedia() {
        double nota1 = 80.0;
        double nota2 = 45.0;
        double nota3 = 60.0;
        double nota4 = 93.0;

        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Media: " + mediaFinal);

        if(mediaFinal >= 70.0){
            System.out.println("Parabens! Sua media: " + mediaFinal + ", voce passou!");
        } else if(mediaFinal < 70.0){
            System.out.println("Recuperacao! Sua media: " + mediaFinal);
        }
    }
}
