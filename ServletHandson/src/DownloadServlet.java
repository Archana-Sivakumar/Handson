
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pw = response.getWriter();

		String filename = "player.txt";
		String filepath = "D:\\";
		// response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=\"" + filename + "\"");

		FileInputStream fileInputStream = new FileInputStream(filepath + filename);

		int i;
		while ((i = fileInputStream.read()) != -1) {
			pw.write(i);
		}
		fileInputStream.close();
		pw.close();

	}

}
