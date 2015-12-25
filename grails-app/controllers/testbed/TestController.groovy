package testbed

class TestController {

    def index = {
        render "Test controller"
    }

    def test1= {
        render "Test1"
    }

    def test2 = {
        redirect(action: index)
    }

    def test3 = {
        def value = "Test value " + new Date();
        def map = [key1: value ]
        render(view: "/testController/test3", model: map)
    }

}
