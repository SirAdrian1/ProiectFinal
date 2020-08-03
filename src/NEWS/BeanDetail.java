package NEWS;
import java.sql.*;


public class BeanDetail

{
  

   String erreur="OK";
   String titre="";
   String corps="";
   String lien="";
   java.sql.Date date;
   String libelForm="1";
   String libelTheme="2";
   public Formation form=new Formation();
   public Theme theme=new Theme();
    private Object news;
    private Object Outils;

    public void setNumInfo(String numInfo)
   {
   	 try
   	 {
		Connection cnx=Connexion.connect();
		Statement requete=cnx.createStatement();
        ResultSet rs = requete.executeQuery("SELECT * FROM news where refnews="+numInfo);
        rs.next();
        titre=rs.getString("titre");
		corps=rs.getString("corps");        
		lien=rs.getString("lien");
		date=rs.getDate("dateParu");        
        libelForm=getForm(rs.getString("refform"));
		libelTheme=getTheme(rs.getString("reftheme"));        
        requete.close();
        cnx.close();
	 }
	 catch(Exception e)
     {
     	erreur=e.toString();	
     }
   	
   }
   public String getTitre()
   {
     return titre;
   }

   public String getCorps()
   {
   	 return (String) Outils;
   }

public String getLien()
{
	if (lien.lastIndexOf("http") != -1)
		return "<a href=\"" + lien + "\">" + lien + "</a>";
	else
		return "<a href=\"http://" + lien + "\">" + lien + "</a>";
}
   public Object getDate()
   {
       Object outils = Outils;
       return outils = getDetail();
   }
 
   public String getForm(String refForm) 
   {
	 return form.getLibel(refForm);
   }
	
   public String getTheme(String refTheme) 
   {
	 return theme.getLibel(refTheme);	
   }
   
   public String getForm() 
   {
	 return libelForm;
   }
	
   public String getTheme() 
   {
	 return libelTheme;	
   }
 
	public String getErreur()
	{
		return erreur;
	}

    public String getDetail() {
        return null;
    }


    private static class Outils {
    }

}
