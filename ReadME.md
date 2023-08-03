## WRITING OUR OWN LIST CLASS 
<div>
<H3> <B>Java</B> Programlama dilinin generic yapısını kullanarak verileri tuttuğumuz bir sınıf tasarlanmıştır.</H3>
<H3>Sınıfın amacı içerisinde dinamik bir Array (Dizi) tutması ve veri tipini dinamik olarak alması sağlanmıştır. </H3>
<H3>Bunun için generic bir sınıf oluşturulmuştur. </H3>
<H3>NOT : COLLECTION SINIFI KULLANILMAMIŞTIR ! KENDİ LİSTE SINIFIMIZ OLUŞTURULMUŞTUR. </H3>
<H3>Sınıf özellikleri : </H3>

<H5>Sınıf içerisindeki dizinin varsayılan boyutu 10 ve dizinin eleman sayısı ihtiyaç duydukça 2 katı şeklinde artmalı.</H5>
<H5>Sınıfa ait iki tür constructor metot bulunmalı </H5>
<H5>MyList() : Boş contructor kullanılırsa dizinin başlangıç boyutu 10 olmalıdır. </H5>
<H5>MyList(int capacity) : Dizinin başlangıç değeri capacity parametresinden alınmalıdır. </H5>
<H5>size() : dizideki eleman sayısını verir. </H5>
<H5>getCapacity() : dizinin kapasite değerini verir. </H5>
<H5>add(T data) : sınıfa ait diziye eleman eklemek için kullanılmalıdır.
Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkartılmalıdır. </H5>
<H5>get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür. </H5>
<H5>remove(int index): verilen indisteki veriyi silmeli ve silinen indis sonrasında ki
verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür. </H5>

<H5>set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır. Geçersiz indis girilerse null döndürür. </H5>
<H5>String toString() : Sınıfa ait dizideki elemanları listeleyen bir metot.  </H5>
</div>