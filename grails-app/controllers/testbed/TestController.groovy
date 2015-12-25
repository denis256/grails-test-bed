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

}
