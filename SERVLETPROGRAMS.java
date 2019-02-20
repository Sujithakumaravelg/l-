FIRST SERVLET:
*************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("<b>Hello World!</b>");
		System.out.println("Hello");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

SECOND SERVLET:
**************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("<b>Hello World!</b>");
		System.out.println("Hello");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

THIRD SERVANT:
*************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */

public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("n1");
		pw.println(name+"<br/>");
		String s=request.getParameter("n2");
		int age=Integer.parseInt(s);
		pw.println(age+"<br/>");
		String gen=request.getParameter("n3");
		pw.println(gen+"<br/>");
		String[] hobby=request.getParameterValues("n4");
		for(String h:hobby) {
			pw.println(h+"<br/>");
		}
		pw.println(request.getScheme()+"<br>");
		pw.println(request.getProtocol()+"<br>");
		pw.println(request.getContextPath()+"<br>");
		pw.println(request.getServletPath()+"<br>");
		pw.println(request.getRequestURI()+"<br>");
		pw.println(request.getQueryString()+"<br>");
		pw.println(request.getServerName()+"<br>");
		pw.println(request.getServerPort()+"<br>");





		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("inside_postmethod");
		String name=request.getParameter("n1");
		pw.println(name+"<br/>");
		String s=request.getParameter("n2");
		int age=Integer.parseInt(s);
		pw.println(age+"<br/>");
		String gen=request.getParameter("n3");
		pw.println(gen+"<br/>");
		String[] hobby=request.getParameterValues("n4");
		for(String h:hobby) {
			pw.println(h+"<br/>");
	}
		pw.println();
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()) {
			String s1=(String)e.nextElement(); 
			String s2=request.getParameter(s1);
			pw.println(s1+" "+s2+"<br>");
		}
	}
	}
	
	/*
	<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/Example2/ThirdServlet">
		Name:<input type="text" name="n1"><br>
		Age:<input type="Text" name="n2"><br>
		Gender:<input type="radio" name="n3" vlaue="male">male<br>
			   <input type="radio" name="n3" value="female">female<br>
		Hobbies:
			<input type="checkbox" name="n4" value="swim">swimming
			<input type="checkbox" name="n4" value="play">playing
			<input type="checkbox" name="n4" value="sing">singing
			<input type="checkbox" name="n4" value="Dancing">Dancing
			<br>
		<input type="submit" value="clickme">
	</form>
</body>
</html>
*/

FOURTH SERVLET:
****************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FourthServlet
 */

public class FourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FourthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("INside get method");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("INside post method");
		pw.close();

	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("inside_postmethod");
		String name=request.getParameter("n1");
		pw.println(name+"<br/>");
		String s=request.getParameter("n2");
		int age=Integer.parseInt(s);
		pw.println(age+"<br/>");
		String gen=request.getParameter("n3");
		pw.println(gen+"<br/>");
		String[] hobby=request.getParameterValues("n4");
		for(String h:hobby) {
			pw.println(h+"<br/>");
	}
		pw.println();
		Enumeration e=request.getParameterNames();
		while(e.hasMoreElements()) {
			String s1=(String)e.nextElement(); 
			String s2=request.getParameter(s1);
			pw.println(s1+" "+s2+"<br>");
		}
		pw.println("INside service method");
		String str=request.getMethod();
		if(str.equals("GET")) {
			doGet(request,response);
		}
		else {
			doPost(request,response);
		}
		pw.close();

	}

}
/*
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Example2/FourthServlet"><input type="submit"></form>

</body>
</html>

*/

FIFTH SERVLET:
**************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("<b>Hello World!</b>");
		System.out.println("Hello");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

SIXTH SERVLET:
*************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SixthServlet
 */

public class SixthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SixthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println("Inside sixth servlet");
		Integer i=(Integer)request.getAttribute("mark");
		pw.println("<br>"+i);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


SEVENTH SERVLET:
***************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SeventhServlet
 */

public class SeventhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SeventhServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		pw.println(request.getHeader("accept-language"+"<br>"));
		pw.println(request.getHeader("accept-encoding"+"<br>"));
		Enumeration e=request.getHeaderNames();
		while(e.hasMoreElements()) {
			String s1=(String)e.nextElement();
			String s2=request.getHeader(s1);
			pw.println(s1+":"+s2+"<br>");
			
		}
		pw.println("<br>");
		Enumeration e1=request.getHeaders("user-agent");
		while(e1.hasMoreElements()) {
			pw.println(e1.nextElement()+"<br>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

EIGHT SERVLET:
**************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EighthServlet
 */

public class EighthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EighthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		Date d=new Date();
		pw.println(d);
		response.setHeader("refresh", "10");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

NINTH SERVLET:
**************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class NinthServlet
 */

public class NinthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NinthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		String s=request.getParameter("data");
		Cookie c=new Cookie("MyCookie",s);
		response.addCookie(c);
		pw.println("My data has been set to"+s);
		pw.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/Example2/NinthServlet">
	Enter NAme:<input type="text" name="data">
	<input type="submit">
</form>
</body>
</html>

*/

TENTH SERVLET:
*************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TenthServlet
 */

public class TenthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TenthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		Cookie[] c1=request.getCookies();
		for(int i=0;i<c1.length;i++) {
			pw.println(c1[i].getName()+""+c1[i].getValue());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

ELEVENTH SERVLET:
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EleventhServlet
 */

public class EleventhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EleventhServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		ServletConfig sc=getServletConfig();
		pw.println(sc.getInitParameter("email")+"<br>");
		pw.println(sc.getInitParameter("website")+"<br>");
		pw.println("<br>");
		Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements()) {
			String s1=(String)e.nextElement();
			String s2=sc.getInitParameter(s1);
			pw.println(s1+""+s2+""+"<br>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

TWELTH SERVLET:
***************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EleventhServlet
 */

public class EleventhServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EleventhServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		ServletConfig sc=getServletConfig();
		pw.println(sc.getInitParameter("email")+"<br>");
		pw.println(sc.getInitParameter("website")+"<br>");
		pw.println("<br>");
		Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements()) {
			String s1=(String)e.nextElement();
			String s2=sc.getInitParameter(s1);
			pw.println(s1+""+s2+""+"<br>");
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

THIRTEEN SERVLET:
*****************
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirteenServlet
 */
@WebServlet("/ThirteenServlet")
public class ThirteenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirteenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		ServletContext sc=getServletContext();
		pw.println(sc.getInitParameter("State")+"<br>");
		pw.println(sc.getInitParameter("City")+"<br>");
		pw.println("<br>");
		Enumeration e=sc.getInitParameterNames();
		while(e.hasMoreElements()) {
			String s1=(String)e.nextElement();
			String s2=sc.getInitParameter(s1);
			pw.println(s1+""+s2+""+"<br>");
		}
		sc.setAttribute("course", "MCA");
		request.setAttribute("salary", 12000);
		pw.println("<a href='/Example2/FourteenServlet'>clickme<a>");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

FOURTEEN SERVLET:
package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FourteenServlet
 */
@WebServlet("/FourteenServlet")
public class FourteenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FourteenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html"); 
		PrintWriter pw=response.getWriter();
		ServletContext sc=getServletContext();
		pw.println(sc.getAttribute("course")+"<br>");
		pw.println(request.getAttribute("salary")+"<br>");
		pw.println(sc.getInitParameter("city")+"<br>");
		ServletConfig sc1=getServletConfig();
		pw.println(sc1.getInitParameter("email")+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

/*
XML
***

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" id="WebApp_ID" version="3.1">
  <display-name>Example2</display-name>
  <welcome-file-list>
    <welcome-file>index.html</welcome-file>
    <welcome-file>index.htm</welcome-file>
    <welcome-file>index.jsp</welcome-file>
    <welcome-file>default.html</welcome-file>
    <welcome-file>default.htm</welcome-file>
    <welcome-file>default.jsp</welcome-file>
  </welcome-file-list>
  <servlet>
    <servlet-name>FirstServlet</servlet-name>
    <servlet-class>com.pack.FirstServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>FirstServlet</servlet-name>
    <url-pattern>/FirstServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>ThirdServlet</servlet-name>
    <servlet-class>com.pack.ThirdServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>ThirdServlet</servlet-name>
    <url-pattern>/ThirdServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>FourthServlet</servlet-name>
    <servlet-class>com.pack.FourthServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>FourthServlet</servlet-name>
    <url-pattern>/FourthServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>FifthServlet</servlet-name>
    <servlet-class>com.pack.FifthServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>FifthServlet</servlet-name>
    <url-pattern>/FifthServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>SixthServlet</servlet-name>
    <servlet-class>com.pack.SixthServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>SixthServlet</servlet-name>
    <url-pattern>/SixthServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>SeventhServlet</servlet-name>
    <servlet-class>com.pack.SeventhServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>SeventhServlet</servlet-name>
    <url-pattern>/SeventhServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>EighthServlet</servlet-name>
    <servlet-class>com.pack.EighthServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>EighthServlet</servlet-name>
    <url-pattern>/EighthServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>NinthServlet</servlet-name>
    <servlet-class>com.pack.NinthServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>NinthServlet</servlet-name>
    <url-pattern>/NinthServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>TenthServlet</servlet-name>
    <servlet-class>com.pack.TenthServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>TenthServlet</servlet-name>
    <url-pattern>/TenthServlet</url-pattern>
  </servlet-mapping>
  <servlet>
    <servlet-name>EleventhServlet</servlet-name>
    <servlet-class>com.pack.EleventhServlet</servlet-class>
    <init-param>
      <param-name>email</param-name>
      <param-value>abc.com</param-value>
    </init-param>
    <init-param>
      <param-name>website</param-name>
      <param-value>xyz.com</param-value>
    </init-param>
  </servlet>
  <servlet>
    <servlet-name>ThirteenServlet</servlet-name>
    <servlet-class>com.pack.ThirteenServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>ThirteenServlet</servlet-name>
    <url-pattern>/ThirteenServlet</url-pattern>
  </servlet-mapping>
  <context-param>
    <param-name>state</param-name>
    <param-value>Tamilnadu</param-value>
  </context-param>
  <context-param>
    <param-name>city</param-name>
    <param-value>Chennai</param-value>
  </context-param>
</web-app>

*/