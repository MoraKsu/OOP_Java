package Seminar06HW.work2;

public class ReportService {
    private final ReportGenerator xmlReportGenerator;
    private final ReportGenerator jsonReportGenerator;

    public ReportService(ReportGenerator xmlReportGenerator, ReportGenerator jsonReportGenerator) {
        this.xmlReportGenerator = xmlReportGenerator;
        this.jsonReportGenerator = jsonReportGenerator;
    }

    public String generateXmlReport(ReportContentProvider contentProvider) {
        return xmlReportGenerator.generateXml(contentProvider);
    }

    public String generateJsonReport(ReportContentProvider contentProvider) {
        return jsonReportGenerator.generateJson(contentProvider);
    }
}
