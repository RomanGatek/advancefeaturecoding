package advancefeaturecoding.summary;

import advancefeaturecoding.summary.service.CompanyService;
import advancefeaturecoding.summary.service.PersonService;
import advancefeaturecoding.summary.view.CompanyView;
import advancefeaturecoding.summary.view.MainView;
import advancefeaturecoding.summary.view.PersonView;
import org.beryx.textio.TextIO;
import org.beryx.textio.TextIoFactory;

class Main {

    public static void main(String[] args) {
        TextIO textIO = TextIoFactory.getTextIO();
        PersonService personService = new PersonService();
        CompanyService companyService = new CompanyService();
        PersonView personView = new PersonView(textIO, personService);
        CompanyView companyView = new CompanyView(textIO, companyService, personService);
        MainView mainView = new MainView(textIO, personView, companyView);
        mainView.showMenu();
        textIO.dispose();
    }
}