package Seminar06HW.work2;

public class DocumentReportContentProvider implements ReportContentProvider {
    @Override
    public String getContent() {
        StringBuilder contentBuilder = new StringBuilder();

        contentBuilder.append("Document Report Content:\n");
        // Добавление информации о документе в отчет
        contentBuilder.append("Document Title: Quarterly Sales Report\n");
        contentBuilder.append("Document Date: 2024-02-19\n");
        contentBuilder.append("Document Author: Jane Smith\n");
        // Добавление других данных о документе

        return contentBuilder.toString();
    }

}
