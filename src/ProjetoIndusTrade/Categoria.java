package ProjetoIndusTrade;

public class Categoria {

    public static String classificarMaquinario(double peso, String voltagem) {
        if (peso > 1000) {
            return "Maquinário Pesado";
        } else if (voltagem.equals("380V")) {
            return "Maquinário Industrial";
        }
        return "Maquinário Geral";
    }

    public static String classificarRecurso(String tipoMaterial) {
        if (tipoMaterial.equalsIgnoreCase("Ferro") || tipoMaterial.equalsIgnoreCase("Aço")) {
            return "Metais";
        }
        return "Matéria-prima Geral";
    }
}