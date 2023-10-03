Dari hasil pembelajaran hari ini yaitu tentang  Post Processor & Understanding Jmeter Results terdapat beberapa pembahasan diantaranya

post processor adalah Elemen rencana pengujian yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler. Pemroses pos ini biasanya digunakan untuk mengekstraksi nilai tertentu dari respons permintaan sampler, misalnya. kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.

JSON extractor
JSON path
Digunakan untuk ekstrak isi dari json response
Beberapa ekspresi yang umum digunakan :
1. $ = root element
2. . = child operator (object)
3. [] = child operator (array)
4. .. = recursive descent (langsung ke objek)
5. * = wildcard (all things)
6. [start:end] = array slice operator borrowed

Specification :
BASE_URL : https://reqres.in
PATH : 
Path 1 : [GET] /api/users?page=2
Path 2 : [GET] /api/unknown/${id}
Path 3 : [POST] /api/users

