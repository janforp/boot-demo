// package 第4讲;
//
//
// class Resource {
//
//     public void action() {
//         try {
//             // 需要被保护的代码
//             int i = 1;
//             Resource.update(externalResourceArray[i]);
//         } finally {
//             // 调用 reachbilityFence，明确保障对象 strongly reachable
//             Reference.reachabilityFence(this);
//         }
//     }
//     private static void update(ExternalResource ext) {
//         ext.status = ...;
//     }
// }
