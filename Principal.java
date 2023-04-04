public class Principal {
    public static void main(String[] args){
        Filme f=new Filme();
        f.setCodigo(13);
        f.setNome("Madagascar");
        f.setValor(20);
        f.setDisponivel(true);
        if(f.isDisponivel()) {
            //System.out.println(" "+f.getCodigo());
       // }else{
            //System.out.println("Filme não disponível");
        //}
        System.out.println(f.getCodigo());
        System.out.println(f.getNome());
        System.out.println(f.getValor());
        }
    }
}
