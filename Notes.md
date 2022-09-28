Spring boot



#API @nnotations : 
    @RestController : define class to serve an Endpoint
    @RequestMappin : define mapping to rest controller ( path = "api/v1/..." )
    @GetMapping : define a GET EndPoint
    @PostMapping : define a POST Endpoint
    @RequestBody : 


#Service @nnotations :
    @Autowired : will instanciate for us the service and inject it in the constructor of the class using it.
    @Component : allows Spring to automatically detect our custom beans
    @Service : alias of @Componenet to define that bean is used as service
    @Repository : alias of @Componenet to define that bean is used as repository

#Lombok @nnotations : 
    
    @NoArgsConstructor : generate default no args constructor
    @AllArgsConstructor : generate All Args constructor
    @Getter : generate a getter methods for attributes  
    @Setter : generate a Setter methods for attributes
    @Value : 
    @ToString : @ToString(of = {« nom », « prenom »}) ou @ToString(exclude = {« age »})
    @Equals : @HashCode(of = {« nom », « prenom »}) ou @HashCode(exclude = {« age »})
    @HashCode : @Equals(of = {« nom », « prenom »}) ou @Equals(exclude = {« age »})

#JPA

    @Entity : Specifies that the class is an entity.
    @Table : Specifies the primary table for the annotated entity.
    @Id : Specifies the primary key of an entity.
    @SequenceGenerator : Generate a sequence for the primary keys of the Entity
    @GeneratedValue : Provides for the specification of generation strategies for the values of primary keys
    @Transient : Specifies that the property or field is not persistent
