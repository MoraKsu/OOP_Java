package Seminar06HW.work2;

public interface ReportGenerator {
    String generateXml(ReportContentProvider contentProvider);
    String generateJson(ReportContentProvider contentProvider);
}
