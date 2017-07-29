package test.bwie.jiyun.com.ins7566.ipandatv.module.livechina.contract;


import test.bwie.jiyun.com.ins7566.ipandatv.base.BasePresenter;
import test.bwie.jiyun.com.ins7566.ipandatv.base.BaseView;
import test.bwie.jiyun.com.ins7566.ipandatv.module.livechina.bean.ChangchengBean;

public interface LiveChinaContract {

    interface View extends BaseView<Presenter> {
          void showChangchengFragment(ChangchengBean changchengBean);
//        void getChinaLiveTab(PopupBean popupBean);
//        void showMessage(String msg);

    }

    interface Presenter extends BasePresenter {

    }
}
