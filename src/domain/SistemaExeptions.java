package domain;

public class SistemaExeptions extends Exception {
    private ContaBancariaInfo contaInfos;

    public boolean opcaoInvalidaResp() {
        try {
            if (!contaInfos.getRespUserSouN().equalsIgnoreCase("s") && !contaInfos.getRespUserSouN().equalsIgnoreCase("n")) {
                throw new IllegalArgumentException("Resposta inválida! Digite S ou N.");
            }
            return true;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false;
        }
    }
}

