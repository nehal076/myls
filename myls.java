import java.io.*;
import java.util.*;
import java.text.*;

class myls
{
 public static void main(String...arg) throws IOException
 {
  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy  hh:mm");
  String dn=".";

  if(arg.length>0)
  {
   dn=arg[0];
  }
  
  File d=new File(dn);

  if(!d.isDirectory())
  {
   System.err.println("\ndirectory not found - "+dn+"\n");
   System.exit(2);
  }

  System.out.println("\n Directory of "+d.getCanonicalPath()+"\n\n");


  File files[]=d.listFiles();
  for(File f : files)
  {
   String dir="";
   if(f.isDirectory())
   {
    dir="<DIR>";
   }
   System.out.printf("%s %9s %8s %s",sdf.format(f.lastModified()),dir,f.length(),f.getName()+"\n");
  }

  System.out.println();
 }
}

