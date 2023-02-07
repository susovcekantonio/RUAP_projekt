# CarService
Za potrebe projekta korištena je i prilagođena  aplikacija na kojoj radim za vježbu.
Pisana je u Spring frameworku.
Baza podataka koja se koristi je PostGreSQL.\
Aplikacija se sastoji od nekoliko dijelova:\
Controller je prvi sloj u kojemu se nalaze endpointovi za sve requestove.\
Controller mapira dobivene podatke i poziva metodu iz servisnog sloja.\
ServiceImpl sadrži logiku funkcionalnosti metoda.\
Model sadrži klase entiteta koji su zapravo zapis kako se podatci spremaju u bazu.\
DTO su objekt klase koje prenose podatke između slojeva sustava.\
\
\
5 testova koje sam napravio su:\
2 testa Controller klase, koji provjeravaju da li su metode getById te deleteById uspješno pozvane.\
Ovi testovi su rađeni pomoću WebMvc frameworka.\
3 testa Impl sloja, gdje sam provjerio dohvaćanje pojedinih podataka entiteta( u ovom slučaju ime i prezime klijenta) te provjera hoće li getById vratiti EntityNotFoundException u slučaju da klijent ne postoji.\
Ovi testovi su rađeni pomoću Mockito frameworka.
