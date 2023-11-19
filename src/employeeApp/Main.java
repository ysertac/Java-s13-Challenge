package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Employee sertac = new Employee(5,"Sertaç YILDIRIR", "ysertac96@gmail.com", "123456A", new String[] {"A sigorta", "B sigorta"});
        Healthplan plan1 = new Healthplan(1, "Full1", Plan.ADVANCE);
        Healthplan plan2 = new Healthplan(2, "Başlangıç1", Plan.BASIC);
        Company seronun_yeri = new Company(1, "Sero'nun Yeri", 25674.83, new String[] {"Sertaç YILDIRIR", "Faruk YILDIRIR", "Deniz YILDIRIR"});

        System.out.println(sertac.getId());
        System.out.println(sertac.getFullName());
        System.out.println(sertac.getEmail());
        System.out.println(sertac.getPassword());
        System.out.println(Arrays.toString(sertac.getHealthPlans()));
        System.out.println("***********************************");
        System.out.println(sertac.toString());
        System.out.println("***********************************");
        sertac.setId(10);
        sertac.setHealthPlans(new String[] {"C sigorta", null, null});
        System.out.println(sertac.toString());
        System.out.println("***********************************");
        sertac.addHealthPlan(1, "D Sigorta");
        System.out.println(sertac.toString());
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println(plan1.toString());
        System.out.println(plan2.toString());
        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println(seronun_yeri.toString());
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
