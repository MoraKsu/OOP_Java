package Seminar06HW.work2;

/*
классы AccountReportGenerator и DocumentReportGenerator нарушают принцип единственной ответственности (Single
Responsibility Principle - SRP). Они отвечают не только за генерацию отчета в формате XML или JSON, но и за логику
формирования самого отчета.

Подходящее решение было бы разделить ответственность на два класса: один для генерации отчета, а другой - для
формирования содержимого отчета. Таким образом, мы соблюдаем принцип единственной ответственности, разделяя логику
формирования отчета от логики его генерации. Классы XmlReportGenerator и JsonReportGenerator реализуют интерфейс
ReportGenerator и отвечают за генерацию отчета в соответствующих форматах. Теперь ответственность за формирование
содержимого и генерацию отчета разделены, что соответствует принципу единственной ответственности.
 */

public class AccountReportContentProvider implements ReportContentProvider {
    @Override
    public String getContent() {
        StringBuilder contentBuilder = new StringBuilder();

        contentBuilder.append("Account Report Content:\n");
        // Добавление информации об учетной записи в отчет
        contentBuilder.append("Account Name: John Doe\n");
        contentBuilder.append("Account ID: 123456\n");
        contentBuilder.append("Account Balance: $5000\n");

        return contentBuilder.toString();
    }
}
