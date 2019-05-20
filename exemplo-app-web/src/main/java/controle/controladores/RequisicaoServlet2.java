package controle.controladores;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/requisicao2")
public class RequisicaoServlet2 extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer Requisicoes = (Integer) request.getServletContext().getAttribute("RequisicoesSolicitadas"); // ATUAL
        String maximaRequisicoes = request.getServletContext().getInitParameter("MaxReq"); // MAXIMA

        if(Requisicoes < Integer.parseInt(maximaRequisicoes)){
            Requisicoes = new Integer(Requisicoes + 1);
            request.getServletContext().setAttribute("RequisicoesSolicitadas", Requisicoes);

            request.setAttribute("Req2", "Requisição atual:" + Requisicoes);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }else{
            request.setAttribute("mensagemErro", "Requisições Solicitadas foram Esgotadas!");
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }

    }
}

