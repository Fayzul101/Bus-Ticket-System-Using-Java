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
public class pdfWrapper {
    
	public static void pdfHandler(String Name, String Ticket, String
			Dep, String Dest, String Adult, String Child, String ac, String ret, String total) throws Exception {
		
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("D:\\FIXME.pdf"));
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
		p = new Paragraph("Safest Journey Ever \n Phone:  01234-567890", head);
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
		
		p = new Paragraph(("Time of issue: " + formatter.format(dto)), font);
		p.setAlignment(Element.ALIGN_RIGHT);
		document.add(p);
		p = new Paragraph(("Name              : " + Name), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Departure         : " + Dep), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Destination       : " + Dest), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Adult Tickets     : " + Adult), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("Child Tickets     : " + Child), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		p = new Paragraph(("AC BUS?           : " + ac), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
                p = new Paragraph(("Return?           : " + ret), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
                p = new Paragraph(("Total Cost        : " + total), font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		
		
		
		p = new Paragraph("\n\n\n------------------------------------------------\n\n\n", font);
		p.setAlignment(Element.ALIGN_CENTER);
		document.add(p);
		
	
		font.setColor(BaseColor.RED);
		p = new Paragraph("HAPPY TRAVELLING!", font);
		p.setAlignment(Element.ALIGN_LEFT);
		document.add(p);
		
		document.close();
	}
    
}
