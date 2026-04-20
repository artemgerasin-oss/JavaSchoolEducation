
public class MasterShawerman {
    public static void main(String[] args) {
        String name = "Ибрагим";
        String position ="ШаурманШейх";
        int rateOneDay = 800;
        int workDay = 21;
        int benefits = 3000;
        int fineForLavash = 600;
        int priceOneShaverma = 230;
        int allSaleShaverma = 672;

        int mounthSalary = rateOneDay * workDay; //считаем зарплату без штрафов и премий
        int mounthSalaryResult = (mounthSalary + benefits) - fineForLavash; //зарплата с учётом надбавок и вычетов
        int amountOfProfit = priceOneShaverma*allSaleShaverma;

        System.out.println("Сотрудник - " + name + "\nДолжность - " + position);
        System.out.println("Оплата за смены - " + mounthSalary);
        System.out.println("Премия - " + benefits + "\nШтраф - " + fineForLavash);
        System.out.println("Итоговая зарплата = " + mounthSalaryResult);
        System.out.println("Шаур-выручка = " + amountOfProfit);
    }
}
