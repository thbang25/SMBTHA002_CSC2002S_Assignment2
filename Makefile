JAVAC=/usr/bin/javac
.SUFFIXES: .java .class
SRCDIR=src
BINDIR=bin

$(BINDIR)/%.class:$(SRCDIR)/%.java
	$(JAVAC) -d $(BINDIR)/ -cp $(BINDIR) $<
    
CLASSES= WordApp.class\
         WordPanel.class\
         Score.class\
         WordRecord.class\
         WordDictionary.class

CLASS_FILES=$(CLASSES:%.class=$(BINDIR)/%.class)



default: $(CLASS_FILES)



clean:
	rm $(BINDIR)/*.class
	
runarray: $(CLASS_FILES)
	java -cp  bin Parallelisim "example_dict.txt"
	
       
docs:
	javadoc -d doc/ src/*.java      	
