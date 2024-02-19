/*
 *   Copyright (c) 2024 Martin Newstead.  All Rights Reserved.
 *
 *   The author makes no representations or warranties about the suitability of the
 *   software, either express or implied, including but not limited to the
 *   implied warranties of merchantability, fitness for a particular
 *   purpose, or non-infringement. The author shall not be liable for any damages
 *   suffered by licensee as a result of using, modifying or distributing
 *   this software or its derivatives.
 */
package mseries.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JAXBXMLHandler {

    // Export
    public static void marshal(BookArea books, File selectedFile)
            throws IOException, JAXBException {
        JAXBContext context;
        BufferedWriter writer = null;
        writer = new BufferedWriter(new FileWriter(selectedFile));
        context = JAXBContext.newInstance(BookArea.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(books, writer);
        writer.close();
    }

    // Import
    public static List<Book> unmarshal(File importFile) throws JAXBException {
        BookArea books = new BookArea();

        JAXBContext context = JAXBContext.newInstance(BookArea.class);
        Unmarshaller um = context.createUnmarshaller();
        books = (BookArea) um.unmarshal(importFile);

        return books.getBooks().getBooks();
    }
}
