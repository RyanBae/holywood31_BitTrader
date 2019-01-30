package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MoveCommand extends Command{
	public MoveCommand(HttpServletRequest request,
			HttpServletResponse responset) {
		System.out.println("===== 4.무브커맨더 진입 =====");
		setRequest(request);
		setAction(request.getParameter("cmd"));
		setDomain(request.getServletPath().split("/")[1].replace(".do", ""));
		setPage(request.getParameter("page"));
		execute();
	}
}
