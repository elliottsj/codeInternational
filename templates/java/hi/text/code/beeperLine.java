/*
 * फ़ाइल: कोनो लाइन। जावा
 * ---------------------
 * beeper लाइन beeper लिए "जबकि" लूप का उपयोग करता है
 * । यह कार्यक्रम किसी भी आकार की दुनिया के लिए काम क
 * रता है।
 */
import stanford.कैरेल.*;
public class Conoलाइन extends कैरेल {
   public void run() {
      /* जब तक करेल एक दीवार का सामना करता है तब तक दोहराता है */
      while(frontIsClear()) {
         /* वर्तमान वर्ग पर beeper */ 
         putBeeper();
         /* move अगले वर्ग के लिए */
         move();
      }
      /* बाड़-पोस्ट बग को हल करता है */
      putBeeper();
   }
}