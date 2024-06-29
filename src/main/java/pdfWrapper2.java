import java.io.*;
import java.text.*;
import java.util.*;
import com.itextpdf.text.*;
//import com.itextpdf.text.Element.*;
import com.itextpdf.text.pdf.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class pdfWrapper2 {
    public static void pdfHandler(double dc, int dt, double rc, int rt,double cc, int ct,double bc, int bt, double tc, int tt) throws Exception {
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("D:\\PRINTADMIN.pdf"));
		document.open();
		document.addCreationDate();
		document.setMargins(20, 20, 30, 30);
		Font head = FontFactory.getFont(FontFactory.TIMES_ROMAN, 32, BaseColor.GRAY);
		Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
		
		Image img1 = Image.getInstance("test.png");
		img1.setAlignment(Element.ALIGN_TOP);
		document.add(img1);
		Paragraph p = new Paragraph("Bus Ticket System", head);
		p.setAlignment(Element.ALIGN_RIGHT);
		document.add(p);
		head.setSize(14);
		p = new Paragraph("Sales Report \n Phone:  01234-567890", head);
		p.setAlignment(Element.ALIGN_RIGHT);
		document.add(p);
		p = new Paragraph("\n", head);
		p.setAlignment(Element.ALIGN_RIGHT);
		document.add(p);
		p = new Paragraph("\n", head);
		p.setAlignment(Element.ALIGN_RIGHT);
		document.add(p);
		Date dto = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		p = new Paragraph(("TIme of Report    : " + formatter.format(dto)), font);
		p.setAlignment(Element.ALIGN_RIGHT);
		document.add(p);
		p = new Paragraph(("Total Revenue from Dhaka Buses  : " + dc), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Total Tickets sold from Dhaka   : " + dt), font);
                p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
                p = new Paragraph(("Total Revenue from Dhaka Buses  : " + rc), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Total Tickets sold from Dhaka   : " + rt), font);
                p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
                p = new Paragraph(("Total Revenue from Dhaka Buses  : " + cc), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Total Tickets sold from Dhaka   : " + ct), font);
                p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
                p = new Paragraph(("Total Revenue from Dhaka Buses  : " + bc), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Total Tickets sold from Dhaka   : " + bt), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		
		
		
		p = new Paragraph("\n\n\n------------------------------------------------\n\n\n", font);
		p.setAlignment(Element.ALIGN_CENTER);
		document.add(p);
                
                p = new Paragraph(("Total Revenue                   : " + tc), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Total Tickets sold              : " + tt), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		
	
		
		
		document.close();
	}
}
