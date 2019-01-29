package vl.objectHierarchiesAbc;

import java.util.ArrayList;
import java.util.List;

class Main{

	public static void main ( String [] args ){

		List<AgentI> agents = new ArrayList<>() ;

		{
			Child child = new Child( "Alfred") ;
			agents.add( child ) ;

			aMethod(child) ;
		}

		for( AgentI agent : agents ){
			agent.move() ;
			aMethod( agent ) ;
		}

	}

	static void aMethod( AgentI ai ) {
		System.out.println( "calling method based on compile time type") ;
	}
	static void aMethod( Child child ) {
		System.out.println( "calling method based on run time type") ;
	}

}
