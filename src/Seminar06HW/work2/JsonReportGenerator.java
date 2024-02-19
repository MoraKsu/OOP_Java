package Seminar06HW.work2;

public class JsonReportGenerator implements ReportGenerator {
    @Override
    public String generateXml(ReportContentProvider contentProvider) {
        throw new UnsupportedOperationException("JSON report generation does not support XML format");
    }

    @Override
    public String generateJson(ReportContentProvider contentProvider) {
        String content = contentProvider.getContent(); // Получаем содержимое отчета

        // Генерируем JSON отчет на основе полученного содержимого
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{\n");
        jsonBuilder.append("\t\"report\": {\n");
        jsonBuilder.append("\t\t\"content\": \"").append(content).append("\"\n");
        jsonBuilder.append("\t}\n");
        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }
}
