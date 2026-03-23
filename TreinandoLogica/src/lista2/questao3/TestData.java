package lista2.questao3;

public class TestData {

    public static Data criarObjData (int dia, int mes, int ano){
        Data obj = new Data(dia, mes, ano);
        obj.imprimiData();
        return obj;
    }

    public static void main(String[] args) {
        //Juntei a inicialização da instância com a função de imprimir data
        Data data1 = TestData.criarObjData(8,1,2004);
        Data data2 = TestData.criarObjData(2,4,2022);
        Data data3 = TestData.criarObjData(3,4,2022);

        /*
        Data data1 = new Data(8, 1, 2004);
        data1.imprimiData();

        Data data2 = new Data(2, 4, 2022);
        data2.imprimiData();

        Data data3 = new Data(3, 4, 2022);
        data3.imprimiData();
         */
    }
}
