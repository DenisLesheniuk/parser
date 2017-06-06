package ml.ledv.fb2parser.core;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ml.ledv.fb2parser.model.book.BookContent;
import ml.ledv.fb2parser.model.book.BookDescription;
import ml.ledv.fb2parser.model.filevalidate.FileValidator;
import ml.ledv.fb2parser.model.filevalidate.UTF8Validator;

public class BookParserFB2 implements BookParser {
	private SAXParser saxParser;
	private BookDescription bookDescription;
	private BookContent bookContent;
	
	
	@Override
	public BookDescription getBookDescription(File filePath) {
		bookDescription = new BookDescription();	
		try{
			saxParser = SAXParserFactory.newInstance().newSAXParser();
			DefaultHandler handler = new DefaultHandler(){ 
				FictionBookDescriptionTags tags = new FictionBookDescriptionTags();
				   @Override
	                public void startElement(String uri, String localName,
	                        String qName, Attributes attributes)
	                        throws SAXException {
					   markTagsTrue(tags, qName);
	                }
	 
	                @Override
	                public void endElement(String uri, String localName,
	                        String qName) throws SAXException {
	                	markTagsFalse(tags, qName);
	                }
	 
	                @Override
	                public void characters(char ch[], int start,
	                        int length) throws SAXException {
	                   fillBookFields(tags, ch, start, length);
	                }
	            };
	 
	            saxParser.parse( filePath, handler);
	            return bookDescription;
	        } catch (ParserConfigurationException | SAXException
	                | IOException ex) {
	         ex.printStackTrace();
	         return null;
	        }
	    }
	private void markTagsTrue(FictionBookDescriptionTags tags, String qName){
		if(qName.equalsIgnoreCase("genre"))tags.setGenre(true);
		if(qName.equalsIgnoreCase("book-title"))tags.setBookTitle(true);
		if(qName.equalsIgnoreCase("annotation"))tags.setAnnotation(true);
		if(qName.equalsIgnoreCase("first-name"))tags.setAuthorFirstName(true);
		if(qName.equalsIgnoreCase("middle-name"))tags.setAuthorMiddleName(true);
		if(qName.equalsIgnoreCase("last-name"))tags.setAuthorLastName(true);
		if(qName.equalsIgnoreCase("book-name"))tags.setPublishInfoBookName(true);
		if(qName.equalsIgnoreCase("publisher"))tags.setPublishInfoPublisher(true);
		if(qName.equalsIgnoreCase("city"))tags.setPublishInfoCity(true);
		if(qName.equalsIgnoreCase("year"))tags.setPublishInfoYear(true);
		if(qName.equalsIgnoreCase("isbn"))tags.setPublishInfoIsbn(true);
		if(qName.equalsIgnoreCase("p"))tags.setP(true);
		if(qName.equalsIgnoreCase("title-info"))tags.titleInfo(true);
		if(qName.equalsIgnoreCase("author"))tags.setAuthor(true);
	}
	private void markTagsFalse(FictionBookDescriptionTags tags, String qName){
		if(qName.equalsIgnoreCase("genre"))tags.setGenre(false);
		if(qName.equalsIgnoreCase("book-title"))tags.setBookTitle(false);
		if(qName.equalsIgnoreCase("annotation"))tags.setAnnotation(false);
		if(qName.equalsIgnoreCase("first-name"))tags.setAuthorFirstName(false);
		if(qName.equalsIgnoreCase("middle-name"))tags.setAuthorMiddleName(false);
		if(qName.equalsIgnoreCase("last-name"))tags.setAuthorLastName(false);
		if(qName.equalsIgnoreCase("book-name"))tags.setPublishInfoBookName(false);
		if(qName.equalsIgnoreCase("publisher"))tags.setPublishInfoPublisher(false);
		if(qName.equalsIgnoreCase("city"))tags.setPublishInfoCity(false);
		if(qName.equalsIgnoreCase("year"))tags.setPublishInfoYear(false);
		if(qName.equalsIgnoreCase("isbn"))tags.setPublishInfoIsbn(false);
		if(qName.equalsIgnoreCase("p"))tags.setP(false);
		if(qName.equalsIgnoreCase("title-info"))tags.titleInfo(false);
		if(qName.equalsIgnoreCase("author"))tags.setAuthor(false);
	}
	
	private void fillBookFields(FictionBookDescriptionTags tags, char ch[], int start, int length){
		if(tags.isGenre()){
			bookDescription.setGenre(new String(ch, start, length));

		}
		if(tags.isTitleInfo() && tags.isBookTitle()){
			bookDescription.setBookTitle(new String(ch, start, length));

		}
		if(tags.isAnnotation() && tags.isP()){
			bookDescription.setAnnotation(new String(ch, start, length));

		}
		if(tags.isTitleInfo() && tags.isAuthor() && tags.isAuthorFirstName()){
			bookDescription.getAuthor().setFirstName(new String(ch, start, length));

	    }
		if(tags.isTitleInfo() && tags.isAuthor() && tags.isAuthorMiddleName()){
			bookDescription.getAuthor().setMiddlleName(new String(ch, start, length));

		}
		if(tags.isTitleInfo() && tags.isAuthor() && tags.isAuthorLastName()){
			bookDescription.getAuthor().setLastName(new String(ch, start, length));

			
		}
		if(tags.isPublishInfoBookName()){
			bookDescription.getPublishInfo().setBookName(new String(ch, start, length));

		}
		if(tags.isPublishInfoPublisher()){
			bookDescription.getPublishInfo().setPublisher(new String(ch, start, length));

		}
		if(tags.isPublishInfoCity()){
			bookDescription.getPublishInfo().setCity(new String(ch, start, length));

		}
		if(tags.isPublishInfoYear()){
			bookDescription.getPublishInfo().setYear(new String(ch, start, length));

		}
		if(tags.isPublishInfoIsbn()){
			bookDescription.getPublishInfo().setIsbn(new String(ch, start, length));

		}
		
	}
	@Override
	public BookContent getBookContent(File fileName) {
		bookContent = new BookContent();
		try{
			saxParser = SAXParserFactory.newInstance().newSAXParser();
			DefaultHandler handler = new DefaultHandler(){ 
				boolean body = false;
				   @Override
	                public void startElement(String uri, String localName,
	                        String qName, Attributes attributes)
	                        throws SAXException {
					   if(qName.equalsIgnoreCase("body"))body = true;
	                }
	 
	                @Override
	                public void endElement(String uri, String localName,
	                        String qName) throws SAXException {
	                }
	 
	                @Override
	                public void characters(char ch[], int start,
	                        int length) throws SAXException {
	                  if(body){
	                	  bookContent.setContent(new String(ch, start, length));
	                	  body = false;
	                  }
	                }
	            };
	 
	            saxParser.parse(System.getProperty("user.dir") + File.separator
	                    + fileName, handler);
	            return bookContent;
	        } catch (ParserConfigurationException | SAXException
	                | IOException ex) {
	         ex.printStackTrace();
	         return null;
	        }
	}
	

		
}
