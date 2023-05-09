package br.com.footed.CentroEsportivo.domain.modalidade;


public enum Modalidade {
    FUTSAL{
        @Override
        public String getSigla() {
            return "FUTS";
        }
        @Override
        public int getId() {
            return 1;
        }
    },
    FUTEBOL7{
        @Override
        public String getSigla() {
            return "FUT7";
        }
        @Override
        public int getId() {
            return 2;
        }
    },
    FUTEBOL11{
        @Override
        public String getSigla() {
            return "FU11";
        }
        @Override
        public int getId() {
            return 3;
        }
    },
    VOLEI{
        @Override
        public String getSigla() {
            return "VOL";
        }
        @Override
        public int getId() {
            return 4;
        }
    },
    BASQUETE{
        @Override
        public String getSigla() {
            return "BAS";
        }
        @Override
        public int getId() {
            return 5;
        }
    },
    TENIS{
        @Override
        public String getSigla() {
            return "TEN";
        }
        @Override
        public int getId() {
            return 6;
        }
    },PADEL{
        @Override
        public String getSigla() {
            return "PED";
        }
        @Override
        public int getId() {
            return 7;
        }
    };

    public abstract String getSigla();
    public abstract int getId();
}
