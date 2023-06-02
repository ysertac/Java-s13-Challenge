# Java Çalışanlar Uygulaması

## Giriş

Bu proje aşağıdaki kavramların anlaşılması için oluşturulmuştur.

* Java ve JDK'nın birlikte çalışması
* Java'nın Temelleri
* Nesne Tabanlı Java Uygulamalarının temelleri

Bununla birlikte bir java uygulamasında sınıfların ve nesnelerin nasıl kullanıldığını ve Java'daki veri türlerinin nasıl uygulandığına odaklanır.

## Talimatlar

### Görev 1: Proje Kurulumu
Bu projeyi forkladıktan sonra bilgisayarınıza klonlayın.

### Görev 2: Düzen kısmındaki sınıfları kodlayın.

### Görev 3: Uygulamadaki her sınıf değişkeni private olarak tanımlanmalı ve getter & setter metodları ile çağırılmalı.

### Düzen

Uygulamanın ana yapısı

![Application Layout](application_diagram.png)

### Görev 4: Main metodun içinden başka bir metod çağırımı yapın. Tüm işlemler bu yeni çağırım yaptığınız metod içinde yapılmalı

### Sonuçlar

Uygulamanız çalıştırıldığında aşağıdaki çıktıları üretmeli

```Text
*** Query Data
employeeApp.Company@61baa894

Original: 100
Negative: -100


*** Working with Number ***
Original divided 5 20
Original mod 2     0
Original divided 7 14
Original divided 7 14.285714285714286
Original divided 7 14.285714285714286

*** Printing Numbers and Characters ***
Debt: 100100
Debt: 100100

*** Printing Objects ***
employeeApp.Company@61baa894
id: 1
fname: Steve
lname: Green
salary: 45000.0
has401K: true
companyId: 1
healthPlanId: 1


id: 5
fname: My
lname: Name
salary: 45000.0
has401K: true
companyId: 2
healthPlanId: 2


*** Emp1 gets a raise
id: 1
fname: Steve
lname: Green
salary: 46350.0
has401K: true
companyId: 1
healthPlanId: 1


*** 401K amount for emp5
2250.0

*** Company Names ***
Combined
Company A Company B
No Vowels
c_mp_ny _

Steve Green
S t e v e   G r e e n
```
