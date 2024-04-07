package com.ignateva.tags_task;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyContent;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class StudentsTableTag extends BodyTagSupport {
    private int rows;
    private String head;

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.write("<table class=\"example\">");
            out.write("<thead>" + head + "</thead>");
            out.write("<tbody>");
            out.write ("<tr>\n" +
                    "        <td>Номер</td>\n" +
                    "        <td>Фамилия</td>\n" +
                    "        <td>Имя</td>\n" +
                    "        <td>Балл</td>\n" +
                    "    </tr>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return EVAL_BODY_INCLUDE;
    }


    @Override
    public int doEndTag() throws JspException {

        try {
            pageContext.getOut().write("</tbody></table>");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return EVAL_PAGE;
    }
}

