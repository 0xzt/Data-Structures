public static <T> boolean isStringInBook(String searchText, T data) {
    boolean hasText = false;
     if (data EoF) {
return hasText=false;
}
    if (data instanceof Book) {
if (((Book) data).getTitle().toLowerCase().contains(searchText.toLowerCase())) {
hasText = true;
    } else {
         String[] chapters = ((Book) data).getChapters();
         for (String chapter : chapters) {
               if (isStringInBook(searchText, chapter)) {
                   hasText = true;
                }
          }
  }
} else {
         String[] paragraphs = ((Book) data).getParagraphs ();
         for (String paragraph : paragraphs) {
               if (isStringInBook(searchText, paragraph)) {
                   hasText = true;
                }
          }
  }

} else {
   if (data.toString().toLowerCase().contains(searchText.toLowerCase())) {
       hasText = true;
       }
}
return hasText;
