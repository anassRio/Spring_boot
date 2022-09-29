Spring boot
https://www.youtube.com/watch?v=9SGDpanrc8U


#API @nnotations : 
    @RestController : define class to serve an Endpoint
    @RequestMappin : define mapping to rest controller ( path = "api/v1/..." )
    @GetMapping : define a GET EndPoint
    @PostMapping : define a POST Endpoint
    @RequestBody : param passed on Body to postRequest
    @DeleteMapping(path = "{var}") : define a Delete Endpoint, var : variable passed in the path.
    @PathVariable : refere to the variable passed on the path.
    @PutMapping : update a resource on system.


#Service @nnotations :
    @Autowired (Optional): will instanciate for us the service and inject it in the constructor of the class using it.
    @Component : allows Spring to automatically detect our custom beans
    @Service : alias of @Componenet to define that bean is used as service
    @Repository : alias of @Componenet to define that bean is used as repository

#JPA

    @Entity : Specifies that the class is an entity.
    @Table : Specifies the primary table for the annotated entity.
    @Id : Specifies the primary key of an entity.
    @SequenceGenerator : Generate a sequence for the primary keys of the Entity
    @GeneratedValue : Provides for the specification of generation strategies for the values of primary keys
    @Transient : Specifies that the property or field is not persistent
    @Transactional : Manage state of the Entity covred by spring JPA

#Lombok @nnotations :

    Lombok allows us to remove : setters, getters, constructors, toString, HashCode, equals.
    Help us to have a class looking clean, avoid regenerate those methodes any time we add a new field.
    All of this with just using Lombok annotations.

    @ToString : replace toString() methode
        [ @ToString(of = {« nom », « prenom »}) ou @ToString(exclude = {« age »}) ]
    
    @AllArgsConstructor : generate All Args constructor
        Lombok doesn't allow us to exclud a field, so for constructor without id forExample 
        we have to create or implementation
    ! -- Can be used almost for services ... Constructors

    @NoArgsConstructor : generate default no args constructor

    @EqualsAndHashCode : for performing equels check, to confirm that two Objects are the same.

    @Getter : generate a getter methods for attributes

    @Setter : generate a Setter methods for attributes
    
    @Slf4j : Allors to use Log4j without having to declarate it.

    @Data : generate Gettes, Setters, toString, hashCode and equals for all Field.


    @Value : 
    @Equals : @HashCode(of = {« nom », « prenom »}) ou @HashCode(exclude = {« age »})
    @HashCode : @Equals(of = {« nom », « prenom »}) ou @Equals(exclude = {« age »})

