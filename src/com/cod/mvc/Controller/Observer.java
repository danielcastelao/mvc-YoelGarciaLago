package com.cod.mvc.Controller;

import com.cod.mvc.Model.Coche;
import com.cod.mvc.Model.Model;

public interface Observer {
    void update(Coche arg, Model model);
}
