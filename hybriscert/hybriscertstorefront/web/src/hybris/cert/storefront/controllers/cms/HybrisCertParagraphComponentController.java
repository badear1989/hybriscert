package hybris.cert.storefront.controllers.cms;

import hybris.cert.core.model.HybrisCertParagraphComponentModel;
import hybris.cert.storefront.controllers.ControllerConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by rbadea on 26/02/2018.
 */
@Controller(value = "HybrisCertParagraphComponentController")
@RequestMapping(value = ControllerConstants.Actions.Cms.HybrisCertParagraphComponent)
public class HybrisCertParagraphComponentController extends AbstractAcceleratorCMSComponentController<HybrisCertParagraphComponentModel>{

    protected void fillModel(final HttpServletRequest request, final Model model, final HybrisCertParagraphComponentModel component)
    {
        model.addAttribute("paragraphValue","String added using the HybrisCertParagraphComponentController");
    }

}
