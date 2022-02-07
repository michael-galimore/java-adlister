import java.util.ArrayList;
import java.util.List;

// Create a class, BeanTest
public class BeanTest {
//    include a main method
    public static void main(String[] args) {
//  instantiate a few instances of Album, Author and Quote.
        Album testAlbum = new Album(989,"Mike", "Mikers", 1999, "R&B", 549);
        Quote testQuote = new Quote(899,"It’s easier to fool ppl than to convince them that they’ve been fooled", "Mark Twain");
        Quote secQuote = new Quote(1000,"No act of kindness, no matter how small,is ever wasted", "AESOP");
        Quote thirdQuote = new Quote(1002,"The soul that is within me no man can degrade.", "Frederick Douglass");

        Author testAuthor = new Author(1999,"Mike", "G");

        List<Quote> quoteList = new ArrayList<>();
        quoteList.add(thirdQuote);
        quoteList.add(testQuote);
        quoteList.add(secQuote);

        for(Quote quoteLists: quoteList){
            System.out.println(secQuote.getContent());

        }


        System.out.println(testAlbum.getArtist());

    }
}
