<%-- 
    Document   : FileUpload
    Created on : Mar 5, 2019, 11:39:36 AM
    Author     : Anjanee Herath
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
           <style>
body, html {
  height: 100%;
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

* {
  box-sizing: border-box;
}

.bg-image {
  /* The image used */
  background-image: url("SourceFiles/Backimage/onee.jpg");
  
  /* Add the blur effect */
  filter: blur(20px);
  filter: blur(8px);
  
  /* Full height */
  height: 100%; 
  
  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}

/* Position text in the middle of the page/image */
.bg-text {
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
  color: white;
  font-weight: bold;
  border: 3px solid #f1f1f1;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  z-index: 2;
  width: 80%;
  padding: 20px;
  text-align: center;
}
</style>
    </head>
    <body>
        <div class="bg-image"><h1>Ongoing Reasearches</h1></div>
        <div  class="bg-text">
    <p>Upload your problem here</p>
    <form method="post" action="UploadServlet" enctype="multipart/form-data">
        <Table a>
            <tr>
                <td align="left">University</td>
                <td  align="left" ><input type="text" name="University" size="50"/></td>
            </tr>
                        
             <tr>  
                 <td align="left">Student ID</td>
                <td  align="left"><input type="text" name="StudentID" size="50"/></td>
             </tr> 
             
             <tr>
                <td align="left">Year</td>
                <td  align="left"><input type="text" name="Year" size="50"></td>
             </tr> 
             
              <tr> 
                <td align="left">Select your file</td>
                <td  align="left"><input type="file" name="uploads"></td>
              </tr>
              <tr>
                  <td colspan="2">
                      
                  </td><td> <input type="submit"> </td> 
                 
                
            </tr>
        </Table>
    </form>
        </div>
       
    </body>
</html>
