package entidades;

public class ServidorPublico
{
        private int matricula;
        private String nome;
        private String foto;
        private String orgao;
        private String veiculo;
        private double salario;
        private int idade;
        private int tempoDeContribuicao;
        private String cargo;
        private String telefone;
        private String celular;
        private String cpf;
        private String naturalidade;
        private String lotacao;
        private String email;

        private double calcularSalario;

        private double clacularHorasExtras;

        private double somaHoras;

        public ServidorPublico(){};

        public ServidorPublico(int matricula, String nome){
                this.matricula = matricula;
                this.nome = nome;
        }

        public ServidorPublico(int matricula, String nome, String cargo){
                this.matricula = matricula;
                this.nome = nome;
                this.cargo = cargo;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getLotacao() {
                return lotacao;
        }

        public void setLotacao(String lotacao) {
                this.lotacao = lotacao;
        }

        public int getMatricula() {
                return matricula;
        }

        public void setMatricula(int matricula) {
                this.matricula = matricula;
        }


        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getFoto() {
                return foto;
        }

        public void setFoto(String foto) {
                this.foto = foto;
        }

        public String getOrgao() {
                return orgao;
        }

        public void setOrgao(String orgao) {
                this.orgao = orgao;
        }

        public String getVeiculo() {
                return veiculo;
        }

        public void setVeiculo(String veiculo) {
                this.veiculo = veiculo;
        }

        public double getSalario() {
                return salario;
        }

        public void setSalario(double salario) {
                this.salario = salario;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }

        public int getTempoDeContribuicao() {
                return tempoDeContribuicao;
        }

        public void setTempoDeContribuicao(int tempoDeContribuicao) {
                this.tempoDeContribuicao = tempoDeContribuicao;
        }

        public String getCargo() {
                return cargo;
        }

        public void setCargo(String cargo) {
                this.cargo = cargo;
        }

        public String getTelefone() {
                return telefone;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }

        public String getCelular() {
                return celular;
        }

        public void setCelular(String celular) {
                this.celular = celular;
        }

        public String getCpf() {
                return cpf;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }

        public String getNaturalidade() {
                return naturalidade;
        }

        public void setNaturalidade(String naturalidade) {
                this.naturalidade = naturalidade;
        }

        public double CalcularHorasExtras(double... numeroHoras) {
                double somaHoras = 0;
                for (double hora : numeroHoras) {
                        somaHoras += hora;
                }
                System.out.println("Soma das horas: "+somaHoras);
                return somaHoras;
        }

        public double getCalcularSalario() {
                double somasal = salario + clacularHorasExtras;
                return calcularSalario;
        }

        public void setCalcularSalario(double calcularSalario) {
                this.calcularSalario = calcularSalario;
        }
}