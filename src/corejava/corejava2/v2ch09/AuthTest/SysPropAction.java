package corejava.corejava2.v2ch09.AuthTest;

import java.security.*;

/**
   This action looks up a system property.
 * @version 1.01 2007-10-06
 * @author Cay Horstmann   
*/
public class SysPropAction implements PrivilegedAction<String>
{
   /**
      Constructs an action for looking up a given property.
      @param propertyName the property name (such as "user.home")
   */
   public SysPropAction(String propertyName) { this.propertyName = propertyName; }

   public String run()
   {
      return System.getProperty(propertyName);
   }

   private String propertyName;
}
