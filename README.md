1.Thread.start(): Phương thức này tạo một luồng mới và bắt đầu thực hiện phương thức run() trên luồng mới tạo.
Sau khi phương thức start() được gọi, một luồng mới sẽ được tạo ra, sẵn sàng để được lên lịch thực thi bởi hệ điều hành.
Phương thức start() sẽ trả về ngay lập tức và không chờ đợi việc thực hiện phương thức run().

2.Thread.run(): Phương thức này chỉ là một phương thức bình thường trong lớp Thread.
Nó thực hiện các hoạt động được xác định trong phương thức run() trên luồng hiện tại.
Nó không tạo ra một luồng mới, mà chỉ thực hiện các hoạt động trong luồng hiện tại.
Phương thức run() chỉ hoạt động trên một luồng duy nhất và nó không bắt đầu một luồng mới.

3.Thread.join(): một phương thức được sử dụng để chờ đợi cho đến khi một thread khác kết thúc hoặc
giải phóng tài nguyên được nó sử dụng trước khi tiếp tục chạy.
Khi một thread gọi phương thức join() của một thread khác,
nó sẽ tạm thời bị block và chờ đợi cho đến khi thread kia hoàn thành công việc của nó
hoặc thời gian tối đa đã được chỉ định trôi qua.

Ví dụ, giả sử có hai thread A và B đang chạy đồng thời và thread A muốn chờ đợi cho đến khi thread B kết thúc.
Trong trường hợp này, thread A có thể gọi phương thức join() của thread B để đợi đến khi thread B kết thúc trước khi tiếp tục thực hiện.

Một số trường hợp sử dụng phương thức join() bao gồm đợi cho các thread con hoàn thành trong một tiến trình,
hoặc đợi cho các thread khác kết thúc trước khi tiếp tục thực hiện các tác vụ khác.
