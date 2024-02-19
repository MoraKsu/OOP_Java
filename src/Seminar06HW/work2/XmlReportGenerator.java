package Seminar06HW.work2;

public class XmlReportGenerator implements ReportGenerator {
    @Override
    public String generateXml(ReportContentProvider contentProvider) {
        String content = contentProvider.getContent(); // Получаем содержимое отчета

        // Генерируем XML отчет на основе полученного содержимого
        StringBuilder xmlBuilder = new StringBuilder();
        xmlBuilder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        xmlBuilder.append("<report>\n");
        xmlBuilder.append("\t<content>").append(content).append("</content>\n");
        xmlBuilder.append("</report>");

        return xmlBuilder.toString();
    }
    @Override
    public String generateJson(ReportContentProvider contentProvider) {
        throw new UnsupportedOperationException("XML report generation does not support JSON format");
    }
}
