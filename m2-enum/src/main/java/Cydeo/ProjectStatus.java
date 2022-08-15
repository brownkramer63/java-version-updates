package Cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("in progress");
    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() {
    }
}
