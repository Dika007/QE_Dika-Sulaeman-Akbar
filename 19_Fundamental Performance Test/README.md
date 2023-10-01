Dari hasil pembelajaran hari ini yaitu tentang Fundamental Performance Test terdapat beberapa pembahasan diantaranya

performance test adalah sebuah teknik non fungsional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban(load)kerja.

performance testing mengukur kualitas atribut dari sistem seperti :
1. stabilitas
2. ketahanan (reliability)
3. penggunaan sumber daya

hal yang diperhatikan dari performance testing adalah 
1. throughput (satuan waktu contoh request per second, reques per menit)
2. respon data

jenis performance testing :
1. load test
2. endurance test
3. stress test
4. peak test
5. smoke test

smoke testing dilakukan untuk verify script yang sudah dibuat, untuk mengecek sistem tersebut dapat di handle minimal load, tanpa masalah sama sekali. biasanya hanya 1-2 VUs

load testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. hasil dari load test digunakan untuk mengukur terhadap database, application server atau pendukung lainnya
load testing menentukan kelakukan sistem pada saat kondisi normal dan puncak

stress testing adalah sebuah metode yang dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem.
dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery

spike testing sama dengan stress testing namu kenaikan langsung menuju melebihi puncak dilakukan dalah waktu singkat. jika stress test memberi waktu untuk scale-out, di spike test tidak
contohnya pada saat flash sale di suatu e-commerce

soak testing adalah untuk mengetahui reliability ketika dalam tekanan dibawah puncak dalam jangka panjang (>= 1 jam). untuk mengetahui ada tidaknya bug pada race condition, memory leaks, db connection dan sebagainya
metode ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem jika test dilakukan di production
