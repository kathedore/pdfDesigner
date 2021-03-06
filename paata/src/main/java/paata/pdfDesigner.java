package paata;

import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.colors.DeviceGray;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;


import java.util.Scanner;

import static com.itextpdf.kernel.pdf.PdfName.List;


public class pdfDesigner {

    //declaring resources
    public static final String FONT = "/Users/ketikakhniauri/IdeaProjects/paata/src/ttf/sylfaen.ttf";
    public static final String dest = "result/addingTable.pdf";
    public static final String image = "/Users/ketikakhniauri/IdeaProjects/paata/src/ttf/aldagi.png";
    public static final String stamp = "/Users/ketikakhniauri/IdeaProjects/paata/src/ttf/stamp.png";

    public static void main(String[] args) throws Exception {

        PdfFont gefont = PdfFontFactory.createFont(FONT, "Identity-H");
        PdfWriter writer = new PdfWriter(dest);
        PdfDocument pdf = new PdfDocument(writer);
        Document doc = new Document(pdf, PageSize.A4);
        Image img = new Image(ImageDataFactory.create(image));
        Image stmp = new Image(ImageDataFactory.create(stamp));
        Scanner sc = new Scanner(System.in);

        System.out.println("which service would you like ? ");
        String response = sc.next();
        if (response.equals("Travel")){

            //data for head table
            String pheadergeo = "სერთიფიკატი, დამზღვევის ელექტრონულად მოწოდებული ინფორმაცია და დეპონირებული დაზღვევის პირობები წარმოადგენს ერთიან სადაზღვევი პოლისს მზღვეველი - სს \"რისკების\"\nმართვისა და სადაზღვევო კომპანია გლობალ ბენეფიტს ჯორჯია\"(ს / ნ: 404526777), მისამართი: ქ.თბილისი, მთაწმინდის რ-ნი, ჭანტურიას ქ.5, ტელ.: +995 322 50 00 01; +995 557 50 00 02";
            String pheader = "This Certificate, electronically sent information and deposited Insurance Terms and conditions is a single insurance agreement of JSC. Risk Management and Insurance Company\nGlobal Benefits Georgia(ID 404526777), address: G.Chanturia street N5, Tbilisi, Tel.: +995 322 50 00 01; +995 557 50 00 02";
            String insurer = "დამზღვევი / Policy Holder : ჯამჭურჭელაშვილი ნიკიფორე";
            String insured = "დაზღვეული /Insured person : კოჭლამაზაშვილი მარგარიტა";

            //data for body table
            String pnumberinsurer = "პირადი ნომერი/Personal Number : ##########";
            String pnumberinsuded = "პირადი ნომერი/Personal Number : ##########";
            String cityzenshipinsurer = "მოქალაქეობა/Citizenship :  Belorusia";
            String cityzenshipinsured = "მოქალაქეობა/Citizenship :  Ukraina";
            String sexinsurer = "სქესი / Gender : Male ";
            String sexinsured = "სქესი / Gender : Female ";
            String bithdayinsurer = "დაბადების თარიღი / Birthday : ##.##.##";
            String bithdayinsured = "დაბადების თარიღი / Birthday : ##.##.##";
            String phoneinsurer = "ტელეფონი / Phone : #########";
            String phoneinsured = "ტელეფონი / Phone : #########";
            String mailinsurer = "მეილი / Email : ####################@##########";
            String mailinsured = "მეილი / Email : ####################@##########";
            String addressinsurer = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";
            String addressinsured = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";

            // data for info table
            String policyinfoheader = "ინფორმაცია პოლისის შესახებ/Police Info ";
            String countries = "ქვეყნები / Countries";
            String countriesvalue = "ევროკავშირი, თურქეთი, ზანზიბარი";
            String coveragelimit = "დაზღვევის ლიმიტი / Coverage limit";
            String coveragelimitvalue = "5000 EURO";
            String period = "სადაზღვევო პერიოდი / Insurance period";
            String datefrom = "##.##.## დან";
            String dateto = "##.##.## მდე/ჩათვლით";
            String addservice = "დამატებითი სერვისები / Additional coverages";
            String flight = "ფრენა / Flight";
            String luggage = "ბარგი / Luggage";
            String pushasedate = "შეძენის თარიღი / Purchase date";
            String pushasedatevalue = "##.##.##";
            String provider = "დამზღვევი / Insurer";
            String providervalue = "Company Name-Benefit";

            //data for footertable
            String signature = "ელექტრონული ხელმოწერა / Signature";
            String providermail = "მეილი / Contact email";
            String providermailvaluer = "####################@##########";
            String providerphone = "საკონტაქტო ტელეფონის ნომერი /Contact phone numbers";
            String providerphonevalue = "##########";
            String provideraddress = "მისამართი/Address";
            String provideraddressvalue = "######### ########## # ## ## ## ### #### ###";

            // declaring tables
            Table head = new Table(2).useAllAvailableWidth();
            Table headerstrings = new Table(1, true);
            Table body = new Table(2, true);
            Table info = new Table(2, true);
            Table cperiod = new Table(2, true);
            Table addservices = new Table(2, true);
            Table footertable = new Table(2,true);

            //setting fonts
            head.setFont(gefont);
            headerstrings.setFont(gefont);
            body.setFont(gefont);
            info.setFont(gefont);
            cperiod.setFont(gefont);
            footertable.setFont(gefont);
            addservices.setFont(gefont);

            //setting font sizes
            headerstrings.setFontSize(8.0F);
            body.setFontSize(8.0F);
            body.setFontSize(8.0F);
            info.setFontSize(8.0F);
            cperiod.setFontSize(8.0F);
            addservices.setFontSize(8.0F);
            footertable.setFontSize(8.0F);

            // creating paragraphs for head table
            Cell policeheadC= new Cell();
            Paragraph p;
            p = new Paragraph( "სამოგზაურო დაზღვევის პოლისი").setTextAlignment(TextAlignment.CENTER).setBold();
            policeheadC.add(p);
            p = new Paragraph( "Travel Insurance Policy").setTextAlignment(TextAlignment.CENTER).setBold();
            policeheadC.add(p);

            // adding cells to head table
            head.addCell(img.scale(0.2F, 0.2F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            head.addCell(policeheadC);

            headerstrings.addCell(pheader);
            headerstrings.addCell(pheadergeo);

            //adding cells to body table
            body.addCell(insurer);
            body.addCell(insured);
            body.addCell(pnumberinsurer);
            body.addCell(pnumberinsuded);
            body.addCell(cityzenshipinsurer);
            body.addCell(cityzenshipinsured);
            body.addCell(sexinsurer);
            body.addCell(sexinsured);
            body.addCell(bithdayinsurer);
            body.addCell(bithdayinsured);
            body.addCell(phoneinsurer);
            body.addCell(phoneinsured);
            body.addCell(mailinsurer);
            body.addCell(mailinsured);
            body.addCell(addressinsurer);
            body.addCell(addressinsured);

            //adding cells to info table
            Cell poCell = new Cell(1, 2);
            Paragraph myparagraph = new Paragraph(policyinfoheader);
            poCell.add(myparagraph);
            info.addCell(poCell);
            info.addCell(countries);
            info.addCell(countriesvalue);
            info.addCell(coveragelimit);
            info.addCell(coveragelimitvalue);
            info.addCell(period);
            cperiod.addCell(datefrom);
            cperiod.addCell(dateto);
            info.addCell(cperiod);
            info.addCell(addservice);
            addservices.addCell(flight);
            addservices.addCell(luggage);
            info.addCell(addservices);

            //adding cells to footertable
            footertable.addCell(signature).setHorizontalAlignment(HorizontalAlignment.CENTER);
            footertable.addCell(stmp.scale(0.08F, 0.08F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            footertable.addCell(providermail);
            footertable.addCell(providermailvaluer);
            footertable.addCell(providerphone);
            footertable.addCell(providerphonevalue);
            footertable.addCell(provideraddress);
            footertable.addCell(provideraddressvalue);

            //adding tables to the doc
            doc.add(head);
            doc.add(headerstrings);
            headerstrings.complete();
            //setting gap between headers and body
            body.setMarginTop(80f);
            doc.add(body);
            body.complete();
            //setting gap between body and info
            info.setMarginTop(65f);
            doc.add(info);
            info.complete();
            //setting gap between info and footertable
            footertable.setMarginTop(80f);
            doc.add(footertable);
            footertable.complete();
            doc.close();
            System.out.println("Table created successfully..");

        } else if (response.equals("MTPL")){

            //data for head table
            String pheadergeo = "სერთიფიკატი, დამზღვევის ელექტრონულად მოწოდებული ინფორმაცია და დეპონირებული დაზღვევის პირობები წარმოადგენს ერთიან სადაზღვევი პოლისს მზღვეველი - სს \"რისკების\"\nმართვისა და სადაზღვევო კომპანია გლობალ ბენეფიტს ჯორჯია\"(ს / ნ: 404526777), მისამართი: ქ.თბილისი, მთაწმინდის რ-ნი, ჭანტურიას ქ.5, ტელ.: +995 322 50 00 01; +995 557 50 00 02";
            String pheader = "This Certificate, electronically sent information and deposited Insurance Terms and conditions is a single insurance agreement of JSC. Risk Management and Insurance Company\nGlobal Benefits Georgia(ID 404526777), address: G.Chanturia street N5, Tbilisi, Tel.: +995 322 50 00 01; +995 557 50 00 02";
            String insurer = "დამზღვევი / Policy Holder : ჯამჭურჭელაშვილი ნიკიფორე";
            String insured = "დაზღვეული /Insured person : კოჭლამაზაშვილი მარგარიტა";

            //data for body table
            String pnumberinsurer = "პირადი ნომერი/Personal Number : ##########";
            String pnumberinsuded = "პირადი ნომერი/Personal Number : ##########";
            String cityzenshipinsurer = "მოქალაქეობა/Citizenship :  Belorusia";
            String cityzenshipinsured = "მოქალაქეობა/Citizenship :  Ukraina";
            String sexinsurer = "სქესი / Gender : Male ";
            String sexinsured = "სქესი / Gender : Female ";
            String bithdayinsurer = "დაბადების თარიღი / Birthday : ##.##.##";
            String bithdayinsured = "დაბადების თარიღი / Birthday : ##.##.##";
            String phoneinsurer = "ტელეფონი / Phone : #########";
            String phoneinsured = "ტელეფონი / Phone : #########";
            String mailinsurer = "მეილი / Email : ####################@##########";
            String mailinsured = "მეილი / Email : ####################@##########";
            String addressinsurer = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";
            String addressinsured = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";

            // data for coverage table
            String coverage0 = "დაფარვა / Coverage ";
            String limit0 = "ლიმიტი / Limit";
            String cosponsor0 = "თანადაფინანსება  / Cosponsor";
            String coverage1= "coverage1";
            String limit1= "limit1";
            String cosponsor1= "cosponsor1";
            String coverage2= "coverage2";
            String limit2= "limit2";
            String cosponsor2= "cosponsor2";
            String coverage3= "coverage3";
            String limit3= "limit3";
            String cosponsor3= "cosponsor3";
            String coverage4= "coverage4";
            String limit4= "limit4";
            String cosponsor4= "cosponsor4";
            String coverage5= "coverage5";
            String limit5= "limit5";
            String cosponsor5= "cosponsor5";
            String coverage6= "coverage6";
            String limit6= "limit6";
            String cosponsor6= "cosponsor6";
            String coverage7= "coverage7";
            String limit7= "limit7";
            String cosponsor7= "cosponsor7";
            String coverage8= "coverage8";
            String limit8= "limit8";
            String cosponsor8= "cosponsor8";
            String coverage9= "coverage9";
            String limit9= "limit9";
            String cosponsor9= "cosponsor9";
            String coverage10= "coverage10";
            String limit10= "limit10";
            String cosponsor10= "cosponsor10";
            String coverage11= "coverage11";
            String limit11= "limit11";
            String cosponsor11= "cosponsor11";
            String coverage12= "coverage12";
            String limit12= "limit12";
            String cosponsor12= "cosponsor12";

            // data for info table
            String responsibility = "პასუხისმგებლობის დეტალები / Responsibility Details ";
            String parameters = "პარამეტრების ცვლილება / Change Parameters";
            String countrynum = "სახელმწიფო ნომერი / Country code";
            String countrynumValue = "ad112ha";
            String vincode = "ვინკოდი / VIN code";
            String vincodeValue = "112234";
            String carMark = "მარკა/ Mark ";
            String carMarkValue ="alfa romeo";
            String carModel = "მოდელი / Model";
            String carModelValue = "13";
            String releaseYear = " წელი / Year";
            String releaseYearValue = " 2002";
            String period = "სადაზღვევო პერიოდი / Insurance period";
            String datefrom = "##.##.## დან";
            String dateto = "##.##.## მდე/ჩათვლით";
            String amount = " სადაზღვევო თანხა / Insurance bill";
            String amountValue = "5000 ლარი / GEL";
            String monthlyAmount = "ყოველთვიური თანხა / Monthly bill";
            String monthlyAmountValue = "4.17 ლარი / GEL";


            //data for money table
            String InsuranceBill = "სადაზღვევო თანხა / Insurance Bill";
            String InsuranceBillValue = "5000 ლარი / GEL";
            String SumAmount = "ჯამური ფასი / Total cost ";
            String SumAmountValue = "50 ლარი / GEL ";
            String rule = "სადაზღვეო პრემიის გადახდის წესი / Terms of Payment";

            //data for footertable
            String signature = "ელექტრონული ხელმოწერა / Signature";
            String providermail = "მეილი / Contact email";
            String providermailvaluer = "####################@##########";
            String providerphone = "საკონტაქტო ტელეფონის ნომერი /Contact phone numbers";
            String providerphonevalue = "##########";
            String provideraddress = "მისამართი/Address";
            String provideraddressvalue = "######### ########## # ## ## ## ### #### ###";

            // declaring tables
            Table head = new Table(2).useAllAvailableWidth();
            Table headerstrings = new Table(1, true);
            Table body = new Table(2, true);
            Table coverage = new Table(3,true);
            Table info = new Table(2, true);
            Table cperiod = new Table(2, true);
            Table addservices = new Table(2, true);
            Table footertable = new Table(2,true);
            Table money = new Table(2, true);

            //setting fonts
            head.setFont(gefont);
            headerstrings.setFont(gefont);
            body.setFont(gefont);
            coverage.setFont(gefont);
            info.setFont(gefont);
            money.setFont(gefont);
            cperiod.setFont(gefont);
            footertable.setFont(gefont);
            addservices.setFont(gefont);

            //setting font sizes
            headerstrings.setFontSize(4.0F);
            body.setFontSize(6.0F);
            body.setFontSize(6.0F);
            coverage.setFontSize(6.0F);
            info.setFontSize(6.0F);
            money.setFontSize(6.0F);
            cperiod.setFontSize(6.0F);
            addservices.setFontSize(6.0F);
            footertable.setFontSize(6.0F);

            // creating paragraphs for head table
            Cell policeheadC= new Cell();
            Paragraph p;
            p = new Paragraph( "ავტომფლობელთა მესამე პირისადმი პასუხისმგებლობა").setTextAlignment(TextAlignment.CENTER).setFontSize(9F);
            policeheadC.add(p);
            p = new Paragraph( "MTPL").setTextAlignment(TextAlignment.CENTER).setFontSize(9F);
            policeheadC.add(p);

            // adding cells to head table
            head.addCell(img.scale(0.15F, 0.15F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            head.addCell(policeheadC);

            headerstrings.addCell(pheader);
            headerstrings.addCell(pheadergeo);

            //adding cells to body table
            body.addCell(insurer);
            body.addCell(insured);
            body.addCell(pnumberinsurer);
            body.addCell(pnumberinsuded);
            body.addCell(cityzenshipinsurer);
            body.addCell(cityzenshipinsured);
            body.addCell(sexinsurer);
            body.addCell(sexinsured);
            body.addCell(bithdayinsurer);
            body.addCell(bithdayinsured);
            body.addCell(phoneinsurer);
            body.addCell(phoneinsured);
            body.addCell(mailinsurer);
            body.addCell(mailinsured);
            body.addCell(addressinsurer);
            body.addCell(addressinsured);

            //adding cells to coverage table
            Paragraph fs = new Paragraph(coverage0).setBold();
            Paragraph sec = new Paragraph(limit0).setBold();
            Paragraph thr = new Paragraph(cosponsor0).setBold();
            coverage.addCell(fs);
            coverage.addCell(sec);
            coverage.addCell(thr);
            coverage.addCell(coverage1);
            coverage.addCell(limit1);
            coverage.addCell(cosponsor1);
            coverage.addCell(coverage2);
            coverage.addCell(limit2);
            coverage.addCell(cosponsor2);
            coverage.addCell(coverage3);
            coverage.addCell(limit3);
            coverage.addCell(cosponsor3);
            coverage.addCell(coverage4);
            coverage.addCell(limit4);
            coverage.addCell(cosponsor4);
            coverage.addCell(coverage5);
            coverage.addCell(limit5);
            coverage.addCell(cosponsor5);
            coverage.addCell(coverage6);
            coverage.addCell(limit6);
            coverage.addCell(cosponsor6);
            coverage.addCell(coverage7);
            coverage.addCell(limit7);
            coverage.addCell(cosponsor7);
            coverage.addCell(coverage8);
            coverage.addCell(limit8);
            coverage.addCell(cosponsor8);
            coverage.addCell(coverage9);
            coverage.addCell(limit9);
            coverage.addCell(cosponsor9);
            coverage.addCell(coverage10);
            coverage.addCell(limit10);
            coverage.addCell(cosponsor10);
            coverage.addCell(coverage11);
            coverage.addCell(limit11);
            coverage.addCell(cosponsor11);
            coverage.addCell(coverage12);
            coverage.addCell(limit12);
            coverage.addCell(cosponsor12);

            //adding cells to info table
            Paragraph second = new Paragraph(parameters).setFontColor(ColorConstants.BLUE);
            info.addCell(responsibility);
            info.addCell(second);
            info.addCell(countrynum);
            info.addCell(countrynumValue);
            info.addCell(vincode);
            info.addCell(vincodeValue);
            info.addCell(carMark);
            info.addCell(carMarkValue);
            info.addCell(carModel);
            info.addCell(carModelValue);
            info.addCell(releaseYear);
            info.addCell(releaseYearValue);


            //adding cells to money table
            money.addCell(period);
            cperiod.addCell(datefrom);
            cperiod.addCell(dateto);
            money.addCell(cperiod);
            money.addCell(amount);
            money.addCell(amountValue);
            money.addCell(monthlyAmount);
            money.addCell(monthlyAmountValue);
            money.addCell(InsuranceBill).setBorder(null);
            money.addCell(InsuranceBillValue).setBorder(null);
            money.addCell(SumAmount).setBorder(null);
            money.addCell(SumAmountValue).setBorder(null);

            //rule table
            Table rulesHead = new Table(1,true);
            rulesHead.setFontSize(6.0F);
            rulesHead.setFont(gefont);
            rulesHead.addCell(new Paragraph(rule).setTextAlignment(TextAlignment.CENTER));
            Table rulesVal = new Table(6, true);
            rulesVal.setFontSize(6.0F);
            rulesVal.setFont(gefont);
            for(int i = 0; i<12; i++){
                rulesVal.addCell("2018."+String.valueOf(01+i)+".01 - 70 ლარი");
            }

            //adding cells to footertable
            footertable.addCell(signature).setHorizontalAlignment(HorizontalAlignment.CENTER);
            footertable.addCell(stmp.scale(0.08F, 0.08F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            footertable.addCell(providermail);
            footertable.addCell(providermailvaluer);
            footertable.addCell(providerphone);
            footertable.addCell(providerphonevalue);
            footertable.addCell(provideraddress);
            footertable.addCell(provideraddressvalue);

            //adding tables to the doc
            doc.add(head);
            doc.add(headerstrings);
            headerstrings.complete();
            //setting gap between headers and body
            body.setMarginTop(14f);
            doc.add(body);
            body.complete();
            //setting gap between body and coverage
            coverage.setMarginTop(14f);
            doc.add(coverage);
            coverage.complete();
            //setting gap between coverage and info
            info.setMarginTop(14f);
            doc.add(info);
            info.complete();
            money.setMarginTop(14f);
            doc.add(money);
            money.complete();
            doc.add(rulesHead);
            doc.add(rulesVal);
            rulesVal.complete();
            //setting gap between info and footertable
            footertable.setMarginTop(14f);
            doc.add(footertable);
            footertable.complete();
            doc.close();
            System.out.println("Table created successfully..");
        } else if(response.equals("Health")) {

            //data for head table
            String pheadergeo = "სერთიფიკატი, დამზღვევის ელექტრონულად მოწოდებული ინფორმაცია და დეპონირებული დაზღვევის პირობები წარმოადგენს ერთიან სადაზღვევი პოლისს მზღვეველი - სს \"რისკების\"\nმართვისა და სადაზღვევო კომპანია გლობალ ბენეფიტს ჯორჯია\"(ს / ნ: 404526777), მისამართი: ქ.თბილისი, მთაწმინდის რ-ნი, ჭანტურიას ქ.5, ტელ.: +995 322 50 00 01; +995 557 50 00 02";
            String pheader = "This Certificate, electronically sent information and deposited Insurance Terms and conditions is a single insurance agreement of JSC. Risk Management and Insurance Company\nGlobal Benefits Georgia(ID 404526777), address: G.Chanturia street N5, Tbilisi, Tel.: +995 322 50 00 01; +995 557 50 00 02";
            String insurer = "დამზღვევი / Policy Holder : ჯამჭურჭელაშვილი ნიკიფორე";
            String insured = "დაზღვეული /Insured person : კოჭლამაზაშვილი მარგარიტა";

            //data for body table
            String pnumberinsurer = "პირადი ნომერი/Personal Number : ##########";
            String pnumberinsuded = "პირადი ნომერი/Personal Number : ##########";
            String cityzenshipinsurer = "მოქალაქეობა/Citizenship :  Belorusia";
            String cityzenshipinsured = "მოქალაქეობა/Citizenship :  Ukraina";
            String sexinsurer = "სქესი / Gender : Male ";
            String sexinsured = "სქესი / Gender : Female ";
            String bithdayinsurer = "დაბადების თარიღი / Birthday : ##.##.##";
            String bithdayinsured = "დაბადების თარიღი / Birthday : ##.##.##";
            String phoneinsurer = "ტელეფონი / Phone : #########";
            String phoneinsured = "ტელეფონი / Phone : #########";
            String mailinsurer = "მეილი / Email : ####################@##########";
            String mailinsured = "მეილი / Email : ####################@##########";
            String addressinsurer = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";
            String addressinsured = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";

            // data for info table
            String coverage = "დაფარვა / Coverage ";
            String limit = "ლიმიტი / Limit";
            String cosponsor = "თანადაფინანსება  / Cosponsor";
            String death = "უბედური შემთხვევით გამოწვეული გარდაცვალება";
            String deathValue = "5000  / GEL";
            String codeath = "100%";
            String nurse = "პირადი ექიმის მომსახურება";
            String nurseValue = "12 ვიზიტი / 12 Appointment";
            String conurse = "100%";
            String service = "გეგმიური ამბულატორიული მომსახურება ფასდაკლების ვაუჩერით";
            String serviceValue = "ულიმიტო / Unlimited";
            String coservice = "50%";
            String medicament = "მედიკამენტები პირადი ექიმის გაცემული ფასდაკლების ვაუჩერით";
            String medicamentValue = "ულიმიტო / Unlimited";
            String comedicament = "20%";
            String stomatolog = "გეგმიური სტომატოლოგია (პროვაიდერ კლინიკებში)";
            String stomatologValue = "ულიმიტო / Unlimited";
            String costomatolog = "50%";
            String gadauvadebel = "გადაუვადებელი სტომატოლოგია (პროვაიდერ კლინიკებში)";
            String gadauvadebelValue = "ულიმიტო / Unlimited";
            String cogadauvadebel = "50%";
            String satelofono = "24 საათიანი სატელეფონო მომსახურება";
            String satelofonoValue = "ულიმიტო / Unlimited";
            String cosatelofono = " 50%";

            String period = "სადაზღვევო პერიოდი / Insurance period";
            String datefrom = "##.##.## დან";
            String dateto = "##.##.## მდე/ჩათვლით";



            //data for money table
            String InsuranceLimit = "დაზღვევის ლიმიტი / Insurance Limit";
            String InsuranceLimitValue = "5000 ლარი / GEL";
            String SumAmount = "ჯამური ფასი / Total cost ";
            String SumAmountValue = "96 ლარი / GEL ";
            String mounthly = " თვიური / Mounthly";
            String mounthlyValue = "8 ლარი / GEL";
            String rule = "სადაზღვეო პრემიის გადახდის წესი / Terms of Payment";

            //data for footertable
            String signature = "ელექტრონული ხელმოწერა / Signature";
            String providermail = "მეილი / Contact email";
            String providermailvaluer = "####################@##########";
            String providerphone = "საკონტაქტო ტელეფონის ნომერი / Contact phone numbers";
            String providerphonevalue = "##########";
            String provideraddress = "მისამართი / Address";
            String provideraddressvalue = "######### ########## # ## ## ## ### #### ###";

            // declaring tables
            Table head = new Table(2).useAllAvailableWidth();
            Table headerstrings = new Table(1, true);
            Table body = new Table(2, true);
            Table info = new Table(3, true);
            Table cperiod = new Table(2, true);
            Table addservices = new Table(2, true);
            Table footertable = new Table(2,true);
            Table money = new Table(2, true);

            //Width for info table
            //info.setWidth(float.valueOf(2.0f),float.valueOf(1.0f),float.valueOf(1.0f));

            //setting fonts
            head.setFont(gefont);
            headerstrings.setFont(gefont);
            body.setFont(gefont);
            info.setFont(gefont);
            money.setFont(gefont);
            cperiod.setFont(gefont);
            footertable.setFont(gefont);
            addservices.setFont(gefont);

            //setting font sizes
            headerstrings.setFontSize(4.0F);
            body.setFontSize(6.0F);
            body.setFontSize(6.0F);
            info.setFontSize(6.0F);
            money.setFontSize(6.0F);
            cperiod.setFontSize(6.0F);
            addservices.setFontSize(6.0F);
            footertable.setFontSize(6.0F);

            // creating paragraphs for head table
            Cell policeheadC= new Cell();
            Paragraph p;
            p = new Paragraph( "ჯანმრთელობის დაზღვევა").setTextAlignment(TextAlignment.CENTER).setBold();
            policeheadC.add(p);
            p = new Paragraph( "Health Insurance").setTextAlignment(TextAlignment.CENTER).setBold();
            policeheadC.add(p);

            // adding cells to head table
            head.addCell(img.scale(0.2F, 0.2F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            head.addCell(policeheadC);

            headerstrings.addCell(pheader);
            headerstrings.addCell(pheadergeo);

            //adding cells to body table
            body.addCell(insurer);
            body.addCell(insured);
            body.addCell(pnumberinsurer);
            body.addCell(pnumberinsuded);
            body.addCell(cityzenshipinsurer);
            body.addCell(cityzenshipinsured);
            body.addCell(sexinsurer);
            body.addCell(sexinsured);
            body.addCell(bithdayinsurer);
            body.addCell(bithdayinsured);
            body.addCell(phoneinsurer);
            body.addCell(phoneinsured);
            body.addCell(mailinsurer);
            body.addCell(mailinsured);
            body.addCell(addressinsurer);
            body.addCell(addressinsured);

            //adding cells to info table
            Paragraph first = new Paragraph(coverage).setBold();
            Paragraph second = new Paragraph(limit).setBold();
            Paragraph third = new Paragraph(cosponsor).setBold();
            info.addCell(first);
            info.addCell(second);
            info.addCell(third);
            info.addCell(death);
            info.addCell(deathValue);
            info.addCell(codeath);
            info.addCell(nurse);
            info.addCell(nurseValue);
            info.addCell(conurse);
            info.addCell(service);
            info.addCell(serviceValue);
            info.addCell(coservice);
            info.addCell(medicament);
            info.addCell(medicamentValue);
            info.addCell(comedicament);
            info.addCell(stomatolog);
            info.addCell(stomatologValue);
            info.addCell(costomatolog);
            info.addCell(gadauvadebel);
            info.addCell(gadauvadebelValue);
            info.addCell(cogadauvadebel);
            info.addCell(satelofono);
            info.addCell(satelofonoValue);
            info.addCell(cosatelofono);
            info.addCell(medicament);
            info.addCell(medicamentValue);
            info.addCell(comedicament);
            info.addCell(stomatolog);
            info.addCell(stomatologValue);
            info.addCell(costomatolog);
            info.addCell(gadauvadebel);
            info.addCell(gadauvadebelValue);
            info.addCell(cogadauvadebel);
            info.addCell(satelofono);
            info.addCell(satelofonoValue);
            info.addCell(cosatelofono);
            info.addCell(satelofono);
            info.addCell(satelofonoValue);
            info.addCell(cosatelofono);


            //adding cells to money table
            money.addCell(period);
            cperiod.addCell(datefrom);
            cperiod.addCell(dateto);
            money.addCell(cperiod);
            money.addCell(InsuranceLimit).setBorder(null);
            money.addCell(InsuranceLimitValue).setBorder(null);
            money.addCell(SumAmount).setBorder(null);
            money.addCell(SumAmountValue).setBorder(null);
            money.addCell(mounthly);
            money.addCell(mounthlyValue);

            //rule table
            Table rulesHead = new Table(1,true);
            rulesHead.setFontSize(6.0F);
            rulesHead.setFont(gefont);
            rulesHead.addCell(new Paragraph(rule).setTextAlignment(TextAlignment.CENTER));
            Table rulesVal = new Table(6, true);
            rulesVal.setFontSize(6.0F);
            rulesVal.setFont(gefont);
            for(int i = 0; i<12; i++){
                rulesVal.addCell("2018."+String.valueOf(01+i)+".01 - 70 ლარი");
            }

            //adding cells to footertable
            footertable.addCell(signature).setHorizontalAlignment(HorizontalAlignment.CENTER);
            footertable.addCell(stmp.scale(0.08F, 0.08F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            footertable.addCell(providermail);
            footertable.addCell(providermailvaluer);
            footertable.addCell(providerphone);
            footertable.addCell(providerphonevalue);
            footertable.addCell(provideraddress);
            footertable.addCell(provideraddressvalue);

            //adding tables to the doc
            doc.add(head);
            doc.add(headerstrings);
            headerstrings.complete();
            //setting gap between headers and body
            body.setMarginTop(15f);
            doc.add(body);
            body.complete();
            //setting gap between body and info
            info.setMarginTop(15f);
            doc.add(info);
            info.complete();
            money.setMarginTop(15f);
            doc.add(money);
            money.complete();
            doc.add(rulesHead);
            doc.add(rulesVal);
            rulesVal.complete();
            //setting gap between info and footertable
            footertable.setMarginTop(15f);
            doc.add(footertable);
            footertable.complete();
            doc.close();
            System.out.println("Table created successfully..");
        } else if(response.equals("Casco")){
            //data for head table
            String pheadergeo = "სერთიფიკატი, დამზღვევის ელექტრონულად მოწოდებული ინფორმაცია და დეპონირებული დაზღვევის პირობები წარმოადგენს ერთიან სადაზღვევი პოლისს მზღვეველი - სს \"რისკების\"\nმართვისა და სადაზღვევო კომპანია გლობალ ბენეფიტს ჯორჯია\"(ს / ნ: 404526777), მისამართი: ქ.თბილისი, მთაწმინდის რ-ნი, ჭანტურიას ქ.5, ტელ.: +995 322 50 00 01; +995 557 50 00 02";
            String pheader = "This Certificate, electronically sent information and deposited Insurance Terms and conditions is a single insurance agreement of JSC. Risk Management and Insurance Company\nGlobal Benefits Georgia(ID 404526777), address: G.Chanturia street N5, Tbilisi, Tel.: +995 322 50 00 01; +995 557 50 00 02";
            String insurer = "დამზღვევი / Policy Holder : ჯამჭურჭელაშვილი ნიკიფორე";
            String insured = "დაზღვეული / Insured person : კოჭლამაზაშვილი მარგარიტა";

            //data for body table
            String pnumberinsurer = "პირადი ნომერი/Personal Number : ##########";
            String pnumberinsuded = "პირადი ნომერი/Personal Number : ##########";
            String cityzenshipinsurer = "მოქალაქეობა/Citizenship :  Belorusia";
            String cityzenshipinsured = "მოქალაქეობა/Citizenship :  Ukraina";
            String sexinsurer = "სქესი / Gender : Male ";
            String sexinsured = "სქესი / Gender : Female ";
            String bithdayinsurer = "დაბადების თარიღი / Birthday : ##.##.##";
            String bithdayinsured = "დაბადების თარიღი / Birthday : ##.##.##";
            String phoneinsurer = "ტელეფონი / Phone : #########";
            String phoneinsured = "ტელეფონი / Phone : #########";
            String mailinsurer = "მეილი / Email : ####################@##########";
            String mailinsured = "მეილი / Email : ####################@##########";
            String addressinsurer = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";
            String addressinsured = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";

            // data for coverage table
            String coverage0 = "დაფარვა / Coverage ";
            String limit0 = "ლიმიტი / Limit";
            String cosponsor0 = "თანადაფინანსება  / Cosponsor";
            String coverage1= "coverage1";
            String limit1= "limit1";
            String cosponsor1= "cosponsor1";
            String coverage2= "coverage2";
            String limit2= "limit2";
            String cosponsor2= "cosponsor2";
            String coverage3= "coverage3";
            String limit3= "limit3";
            String cosponsor3= "cosponsor3";
            String coverage4= "coverage4";
            String limit4= "limit4";
            String cosponsor4= "cosponsor4";
            String coverage5= "coverage5";
            String limit5= "limit5";
            String cosponsor5= "cosponsor5";
            String coverage6= "coverage6";
            String limit6= "limit6";
            String cosponsor6= "cosponsor6";
            String coverage7= "coverage7";
            String limit7= "limit7";
            String cosponsor7= "cosponsor7";
            String coverage8= "coverage8";
            String limit8= "limit8";
            String cosponsor8= "cosponsor8";
            String coverage9= "coverage9";
            String limit9= "limit9";
            String cosponsor9= "cosponsor9";
            String coverage10= "coverage10";
            String limit10= "limit10";
            String cosponsor10= "cosponsor10";
            String coverage11= "coverage11";
            String limit11= "limit11";
            String cosponsor11= "cosponsor11";
            String coverage12= "coverage12";
            String limit12= "limit12";
            String cosponsor12= "cosponsor12";

            // data for info table
            String responsibility = "დაზღვევის დეტალები / Insurance Details ";
            String parameters = "";
            String countrynum = "სახელმწიფო ნომერი / Country code";
            String countrynumValue = "ad112ha";
            String vincode = "ვინკოდი / VIN code";
            String vincodeValue = "112234";
            String carMark = "მარკა/ Mark ";
            String carMarkValue ="alfa romeo";
            String carModel = "მოდელი / Model";
            String carModelValue = "13";
            String releaseYear = " წელი / Year";
            String releaseYearValue = " 2002";
            String period = "სადაზღვევო პერიოდი / Insurance period";
            String datefrom = "##.##.## დან";
            String dateto = "##.##.## მდე/ჩათვლით";
            String amount = " სადაზღვევო თანხა / Insurance bill";
            String amountValue = "5000 ლარი / GEL";
            String monthlyAmount = "ყოველთვიური თანხა / Monthly bill";
            String monthlyAmountValue = "4.17 ლარი / GEL";
            String rule = "სადაზღვეო პრემიის გადახდის წესი / Terms of Payment";


            //data for money table
            String InsuranceBill = "სადაზღვევო თანხა / Insurance Bill";
            String InsuranceBillValue = "5000 ლარი / GEL";
            String SumAmount = "ჯამური ფასი / Total cost ";
            String SumAmountValue = "50 ლარი / GEL ";


            //data for footertable
            String signature = "ელექტრონული ხელმოწერა / Signature";
            String providermail = "მეილი / Contact email";
            String providermailvaluer = "####################@##########";
            String providerphone = "საკონტაქტო ტელეფონის ნომერი /Contact phone numbers";
            String providerphonevalue = "##########";
            String provideraddress = "მისამართი/Address";
            String provideraddressvalue = "######### ########## # ## ## ## ### #### ###";

            // declaring tables
            Table head = new Table(2,true);
            Table headerstrings = new Table(1, true);
            Table body = new Table(2, true);
            Table coverage = new Table(3,true);
            Table info = new Table(2, true);
            Table cperiod = new Table(2, true);
            Table addservices = new Table(2, true);
            Table footertable = new Table(2,true);
            Table money = new Table(2, true);

            //setting fonts
            head.setFont(gefont);
            headerstrings.setFont(gefont);
            body.setFont(gefont);
            coverage.setFont(gefont);
            info.setFont(gefont);
            money.setFont(gefont);
            cperiod.setFont(gefont);
            footertable.setFont(gefont);
            addservices.setFont(gefont);

            //setting font sizes
            headerstrings.setFontSize(4.0F);
            body.setFontSize(6.0F);
            body.setFontSize(6.0F);
            coverage.setFontSize(6.0F);
            info.setFontSize(6.0F);
            money.setFontSize(6.0F);
            cperiod.setFontSize(6.0F);
            addservices.setFontSize(6.0F);
            footertable.setFontSize(6.0F);

            // creating paragraphs for head table
            Cell policeheadC= new Cell();
            Paragraph p;
            p = new Paragraph( "Casco").setTextAlignment(TextAlignment.CENTER);
            policeheadC.add(p);

            // adding cells to head table
            head.addCell(img.scale(0.16F, 0.16F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            head.addCell(policeheadC);

            headerstrings.addCell(pheader);
            headerstrings.addCell(pheadergeo);

            //adding cells to body table
            body.addCell(insurer);
            body.addCell(insured);
            body.addCell(pnumberinsurer);
            body.addCell(pnumberinsuded);
            body.addCell(cityzenshipinsurer);
            body.addCell(cityzenshipinsured);
            body.addCell(sexinsurer);
            body.addCell(sexinsured);
            body.addCell(bithdayinsurer);
            body.addCell(bithdayinsured);
            body.addCell(phoneinsurer);
            body.addCell(phoneinsured);
            body.addCell(mailinsurer);
            body.addCell(mailinsured);
            body.addCell(addressinsurer);
            body.addCell(addressinsured);

            //adding cells to coverage table
            Paragraph fs = new Paragraph(coverage0).setBold();
            Paragraph sec = new Paragraph(limit0).setBold();
            Paragraph thr = new Paragraph(cosponsor0).setBold();
            coverage.addCell(fs);
            coverage.addCell(sec);
            coverage.addCell(thr);
            coverage.addCell(coverage1);
            coverage.addCell(limit1);
            coverage.addCell(cosponsor1);
            coverage.addCell(coverage2);
            coverage.addCell(limit2);
            coverage.addCell(cosponsor2);
            coverage.addCell(coverage3);
            coverage.addCell(limit3);
            coverage.addCell(cosponsor3);
            coverage.addCell(coverage4);
            coverage.addCell(limit4);
            coverage.addCell(cosponsor4);
            coverage.addCell(coverage5);
            coverage.addCell(limit5);
            coverage.addCell(cosponsor5);
            coverage.addCell(coverage6);
            coverage.addCell(limit6);
            coverage.addCell(cosponsor6);
            coverage.addCell(coverage7);
            coverage.addCell(limit7);
            coverage.addCell(cosponsor7);
            coverage.addCell(coverage8);
            coverage.addCell(limit8);
            coverage.addCell(cosponsor8);
            coverage.addCell(coverage9);
            coverage.addCell(limit9);
            coverage.addCell(cosponsor9);
            coverage.addCell(coverage10);
            coverage.addCell(limit10);
            coverage.addCell(cosponsor10);
            coverage.addCell(coverage11);
            coverage.addCell(limit11);
            coverage.addCell(cosponsor11);
            coverage.addCell(coverage12);
            coverage.addCell(limit12);
            coverage.addCell(cosponsor12);

            //adding cells to info table
            Paragraph second = new Paragraph(parameters).setFontColor(ColorConstants.BLUE);
            info.addCell(responsibility);
            info.addCell(second);
            info.addCell(countrynum);
            info.addCell(countrynumValue);
            info.addCell(vincode);
            info.addCell(vincodeValue);
            info.addCell(carMark);
            info.addCell(carMarkValue);
            info.addCell(carModel);
            info.addCell(carModelValue);
            info.addCell(releaseYear);
            info.addCell(releaseYearValue);
            info.addCell(period);
            cperiod.addCell(datefrom);
            cperiod.addCell(dateto);
            info.addCell(cperiod);
            info.addCell(amount);
            info.addCell(amountValue);
            info.addCell(monthlyAmount);
            info.addCell(monthlyAmountValue);

            //adding cells to money table
            money.addCell(InsuranceBill).setBorder(null);
            money.addCell(InsuranceBillValue).setBorder(null);
            money.addCell(SumAmount).setBorder(null);
            money.addCell(SumAmountValue).setBorder(null);

            //rule table
            Table rulesHead = new Table(1,true);
            rulesHead.setFontSize(6.0F);
            rulesHead.setFont(gefont);
            rulesHead.addCell(new Paragraph(rule).setTextAlignment(TextAlignment.CENTER));
            Table rulesVal = new Table(6, true);
            rulesVal.setFontSize(6.0F);
            rulesVal.setFont(gefont);
            for(int i = 0; i<12; i++){
                rulesVal.addCell("2018."+String.valueOf(01+i)+".01 - 70 ლარი");
            }

            //adding cells to footertable
            footertable.addCell(signature).setHorizontalAlignment(HorizontalAlignment.CENTER);
            footertable.addCell(stmp.scale(0.08F, 0.08F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            footertable.addCell(providermail);
            footertable.addCell(providermailvaluer);
            footertable.addCell(providerphone);
            footertable.addCell(providerphonevalue);
            footertable.addCell(provideraddress);
            footertable.addCell(provideraddressvalue);

            //adding tables to the doc
            doc.add(head);
            doc.add(headerstrings);
            headerstrings.complete();
            //setting gap between headers and body
            body.setMarginTop(15f);
            doc.add(body);
            body.complete();
            //setting gap between body and coverage
            coverage.setMarginTop(15f);
            doc.add(coverage);
            coverage.complete();
            //setting gap between coverage and info
            info.setMarginTop(15f);
            doc.add(info);
            info.complete();
            doc.add(money);
            money.complete();
            doc.add(rulesHead);
            doc.add(rulesVal);
            rulesVal.complete();
            //setting gap between info and footertable
            footertable.setMarginTop(15f);
            doc.add(footertable);
            footertable.complete();
            doc.close();
            System.out.println("Table created successfully..");

        } else if(response.equals("Property")){
            //data for head table
            String pheadergeo = "სერთიფიკატი, დამზღვევის ელექტრონულად მოწოდებული ინფორმაცია და დეპონირებული დაზღვევის პირობები წარმოადგენს ერთიან სადაზღვევი პოლისს მზღვეველი - სს \"რისკების\"\nმართვისა და სადაზღვევო კომპანია გლობალ ბენეფიტს ჯორჯია\"(ს / ნ: 404526777), მისამართი: ქ.თბილისი, მთაწმინდის რ-ნი, ჭანტურიას ქ.5, ტელ.: +995 322 50 00 01; +995 557 50 00 02";
            String pheader = "This Certificate, electronically sent information and deposited Insurance Terms and conditions is a single insurance agreement of JSC. Risk Management and Insurance Company\nGlobal Benefits Georgia(ID 404526777), address: G.Chanturia street N5, Tbilisi, Tel.: +995 322 50 00 01; +995 557 50 00 02";
            String insurer = "დამზღვევი / Policy Holder : ჯამჭურჭელაშვილი ნიკიფორე";
            String insured = "დაზღვეული / Insured person : კოჭლამაზაშვილი მარგარიტა";

            //data for body table
            String pnumberinsurer = "პირადი ნომერი/Personal Number : ##########";
            String pnumberinsuded = "პირადი ნომერი/Personal Number : ##########";
            String cityzenshipinsurer = "მოქალაქეობა/Citizenship :  Belorusia";
            String cityzenshipinsured = "მოქალაქეობა/Citizenship :  Ukraina";
            String sexinsurer = "სქესი / Gender : Male ";
            String sexinsured = "სქესი / Gender : Female ";
            String bithdayinsurer = "დაბადების თარიღი / Birthday : ##.##.##";
            String bithdayinsured = "დაბადების თარიღი / Birthday : ##.##.##";
            String phoneinsurer = "ტელეფონი / Phone : #########";
            String phoneinsured = "ტელეფონი / Phone : #########";
            String mailinsurer = "მეილი / Email : ####################@##########";
            String mailinsured = "მეილი / Email : ####################@##########";
            String addressinsurer = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";
            String addressinsured = "მისამართი / Address : ######### ########## # ## ## ## ### #### ###";


            // data for coverage table
            String coverage0 = "დაფარვა / Coverage ";
            String limit0 = "ლიმიტი / Limit";
            String cosponsor0 = "თანადაფინანსება  / Cosponsor";
            String coverage1= "coverage1";
            String limit1= "limit1";
            String cosponsor1= "cosponsor1";
            String coverage2= "coverage2";
            String limit2= "limit2";
            String cosponsor2= "cosponsor2";
            String coverage3= "coverage3";
            String limit3= "limit3";
            String cosponsor3= "cosponsor3";
            String coverage4= "coverage4";
            String limit4= "limit4";
            String cosponsor4= "cosponsor4";
            String coverage5= "coverage5";
            String limit5= "limit5";
            String cosponsor5= "cosponsor5";
            String coverage6= "coverage6";
            String limit6= "limit6";
            String cosponsor6= "cosponsor6";
            String coverage7= "coverage7";
            String limit7= "limit7";
            String cosponsor7= "cosponsor7";
            String coverage8= "coverage8";
            String limit8= "limit8";
            String cosponsor8= "cosponsor8";
            String coverage9= "coverage9";
            String limit9= "limit9";
            String cosponsor9= "cosponsor9";
            String coverage10= "coverage10";
            String limit10= "limit10";
            String cosponsor10= "cosponsor10";
            String coverage11= "coverage11";
            String limit11= "limit11";
            String cosponsor11= "cosponsor11";
            String coverage12= "coverage12";
            String limit12= "limit12";
            String cosponsor12= "cosponsor12";

            // data for info table
            String header="დაზღვევის დეტალები / Insurance Details";
            String risks = "სადაზღვეო რისკები / Risks Insured ";
            com.itextpdf.layout.element.List riskval = new List();
            riskval.setFontSize(6.0F);
            riskval.add("       "+"ხანძარი, მეხის დაცემა, აფეთქება, საჰაერო ხომალდის ან მათი ნაწილების დაცემა.");
            riskval.add("შტორმი, გრიგალი, ქარიშხალი, წყალდიდობა, სეტყვა, გრუნტის დაჯდომა, მეწყერი, ზვავი, თოვლის ჩამოშლა.");
            riskval.add("წყლით დაზიანება;დატბორვა");
            riskval.add("სხვადასხვა საგნების დაცემა");
            riskval.add("მესამე პირთა მართლსაწინააღმდეგო ქმედება, ვანდალიზმი");
            Paragraph risksValue = new Paragraph("* დაზღვევის სხვა დეტალური პირობები წარმოდგენილია, მხარეთა მიერ ხელმოწერებით " +
                    "დადასტურებული დანართი #1-ის სახით და წარმოადგენს შესაბამისი ხელშეკრულების და წინამდებარე ქონების დაზღვევის " +
                    "პოლისის განუყოფელ ნაწილს.").setItalic().setFontSize(6.0F);
            String address = "დაზღვეული ქონების მისამართი / Insured Property Address";
            String addressValue = "მაღაზია MOD - 29, 99 და M9 - 1, სავაჭრო ცენტრი ლილო მოლი, მის. კახეთის გზატკელიცილი N 112";
            String type = "დაზღვეული ქონების ტიპი / Insured Property Type";
            String typeValue ="სასაქონლო-მატერიალური მარაგები, ტანსაცმელი, ფეხსამელი, ბოტასები, კეტები";
            String insmon = "სადაზღვეო თანხა / Total Sum Insured";
            String insmonValue = "100 000 (ასი ათასი ლარი) / 100 000 (hundred thousand) Lari";
            String deduct = "უპირობო ფრანშიზა / Unconditional Deductible";
            String deductValue = "მზღვევევლის მიერ დადგენილი ზარალის 10%, მინიმუმ 400 (ოთხასი) ლარი";
            String annprem = "წლიური სადაზღვეო პრემია / Annual Insurance Premium";
            String annpremValue = " 840 (რვაას ორმოცი) ლარი / 840 (eight hundred and forty) Lari";
            String rule = "სადაზღვეო პრემიის გადახდის წესი / Terms of Payment";
            String teritorry = "დაზღვევის ტერიტორია / Coverage Area";
            String teritorryValue = "საქართველო / Georgia";

            //data for money table
            String InsuranceBill = "სადაზღვევო თანხა / Insurance Bill";
            String InsuranceBillValue = "5000 ლარი / GEL";
            String SumAmount = "ჯამური ფასი / Total cost ";
            String SumAmountValue = "50 ლარი / GEL ";


            //data for footertable
            String signature = "ელექტრონული ხელმოწერა / Signature";
            String providermail = "მეილი / Contact email";
            String providermailvaluer = "####################@##########";
            String providerphone = "საკონტაქტო ტელეფონის ნომერი /Contact phone numbers";
            String providerphonevalue = "##########";
            String provideraddress = "მისამართი/Address";
            String provideraddressvalue = "######### ########## # ## ## ## ### #### ###";

            // declaring tables
            Table head = new Table(2).useAllAvailableWidth();
            Table headerstrings = new Table(1, true);
            Table body = new Table(2, true);
            Table coverage = new Table(3,true);
            Table info = new Table(2, true);
            Table cperiod = new Table(2, true);
            Table addservices = new Table(2, true);
            Table footertable = new Table(2,true);
            Table money = new Table(2, true);

            //setting fonts
            head.setFont(gefont);
            headerstrings.setFont(gefont);
            body.setFont(gefont);
            coverage.setFont(gefont);
            info.setFont(gefont);
            money.setFont(gefont);
            cperiod.setFont(gefont);
            footertable.setFont(gefont);
            addservices.setFont(gefont);


            //setting font sizes
            headerstrings.setFontSize(4.0F);
            body.setFontSize(6.0F);
            body.setFontSize(6.0F);
            coverage.setFontSize(6.0F);
            info.setFontSize(6.0F);
            money.setFontSize(6.0F);
            addservices.setFontSize(6.0F);
            footertable.setFontSize(6.0F);

            // creating paragraphs for head table
            Cell policeheadC= new Cell();
            Paragraph p;
            p = new Paragraph( "ქონების დაზღვევის პოლისი").setTextAlignment(TextAlignment.CENTER).setFontSize(9.0F);
            policeheadC.add(p);
            p = new Paragraph( "Property Insurance").setTextAlignment(TextAlignment.CENTER).setFontSize(9.0F);
            policeheadC.add(p);

            // adding cells to head table
            head.addCell(img.scale(0.14F, 0.14F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            head.addCell(policeheadC);

            headerstrings.addCell(pheader);
            headerstrings.addCell(pheadergeo);

            //adding cells to body table
            body.addCell(insurer);
            body.addCell(insured);
            body.addCell(pnumberinsurer);
            body.addCell(pnumberinsuded);
            body.addCell(cityzenshipinsurer);
            body.addCell(cityzenshipinsured);
            body.addCell(sexinsurer);
            body.addCell(sexinsured);
            body.addCell(bithdayinsurer);
            body.addCell(bithdayinsured);
            body.addCell(phoneinsurer);
            body.addCell(phoneinsured);
            body.addCell(mailinsurer);
            body.addCell(mailinsured);
            body.addCell(addressinsurer);
            body.addCell(addressinsured);

            //adding cells to coverage table
            Paragraph fs = new Paragraph(coverage0).setBold();
            Paragraph sec = new Paragraph(limit0).setBold();
            Paragraph thr = new Paragraph(cosponsor0).setBold();
            coverage.addCell(fs);
            coverage.addCell(sec);
            coverage.addCell(thr);
            coverage.addCell(coverage1);
            coverage.addCell(limit1);
            coverage.addCell(cosponsor1);
            coverage.addCell(coverage2);
            coverage.addCell(limit2);
            coverage.addCell(cosponsor2);
            coverage.addCell(coverage3);
            coverage.addCell(limit3);
            coverage.addCell(cosponsor3);
            coverage.addCell(coverage4);
            coverage.addCell(limit4);
            coverage.addCell(cosponsor4);
            coverage.addCell(coverage5);
            coverage.addCell(limit5);
            coverage.addCell(cosponsor5);
            coverage.addCell(coverage6);
            coverage.addCell(limit6);
            coverage.addCell(cosponsor6);
            coverage.addCell(coverage7);
            coverage.addCell(limit7);
            coverage.addCell(cosponsor7);
            coverage.addCell(coverage8);
            coverage.addCell(limit8);
            coverage.addCell(cosponsor8);
            coverage.addCell(coverage9);
            coverage.addCell(limit9);
            coverage.addCell(cosponsor9);
            coverage.addCell(coverage10);
            coverage.addCell(limit10);
            coverage.addCell(cosponsor10);
            coverage.addCell(coverage11);
            coverage.addCell(limit11);
            coverage.addCell(cosponsor11);
            coverage.addCell(coverage12);
            coverage.addCell(limit12);
            coverage.addCell(cosponsor12);

            //adding cells to info table
            info.addCell(header);
            info.addCell(" ");
            info.addCell(risks);
            Cell riskebi = new Cell();
            riskebi.add(riskval);
            riskebi.add(risksValue);
            info.addCell(riskebi);
            info.addCell(address);
            info.addCell(addressValue);
            info.addCell(type);
            info.addCell(typeValue);
            info.addCell(insmon);
            info.addCell(insmonValue);
            info.addCell(deduct);
            info.addCell(deductValue);
            info.addCell(annprem);
            info.addCell(annpremValue);
            info.addCell(teritorry);
            info.addCell(teritorryValue);


            //adding cells to money table
            money.addCell(InsuranceBill).setBorder(null);
            money.addCell(InsuranceBillValue).setBorder(null);
            money.addCell(SumAmount).setBorder(null);
            money.addCell(SumAmountValue).setBorder(null);

            //rule table
            Table rulesHead = new Table(1,true);
            rulesHead.setFontSize(6.0F);
            rulesHead.setFont(gefont);
            rulesHead.addCell(new Paragraph(rule).setTextAlignment(TextAlignment.CENTER));
            Table rulesVal = new Table(6, true);
            rulesVal.setFontSize(6.0F);
            rulesVal.setFont(gefont);
            for(int i = 0; i<12; i++){
                rulesVal.addCell("2018."+String.valueOf(01+i)+".01 - 70 ლარი");
            }

            //adding cells to footertable
            footertable.addCell(signature).setHorizontalAlignment(HorizontalAlignment.CENTER);
            footertable.addCell(stmp.scale(0.08F, 0.08F).setHorizontalAlignment(HorizontalAlignment.CENTER));
            footertable.addCell(providermail);
            footertable.addCell(providermailvaluer);
            footertable.addCell(providerphone);
            footertable.addCell(providerphonevalue);
            footertable.addCell(provideraddress);
            footertable.addCell(provideraddressvalue);

            //adding tables to the doc
            doc.add(head);
            doc.add(headerstrings);
            headerstrings.complete();
            //setting gap between headers and body
            body.setMarginTop(13f);
            doc.add(body);
            body.complete();
            //setting gap between body and coverage
            coverage.setMarginTop(13f);
            doc.add(coverage);
            coverage.complete();
            //setting gap between coverage and info
            info.setMarginTop(13f);
            doc.add(info);
            info.complete();
            doc.add(money);
            money.complete();
            doc.add(rulesHead);
            doc.add(rulesVal);
            rulesVal.complete();
            //setting gap between info and footertable
            footertable.setMarginTop(13f);
            doc.add(footertable);
            footertable.complete();
            doc.close();
            System.out.println("Table created successfully..");

        } else {
            System.out.println(" Enter a valid response ");
          }
        }
// page break;
    }

