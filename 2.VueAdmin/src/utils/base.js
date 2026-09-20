const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootleyzna78/",
            name: "springbootleyzna78",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootleyzna78/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "店铺租赁租凭平台的设计与实现"
        } 
    }
}
export default base
