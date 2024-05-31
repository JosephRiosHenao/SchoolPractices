import React from 'react';
import { Box, Center, Environment, OrbitControls } from '@react-three/drei';
import Table from './Components/Table';
import Ball from './Components/Ball';

const Experience = () => {
  return (
    <>
      <color attach="background" args={["#ddc28d"]} />
      <ambientLight intensity={0.5} /> 
      <directionalLight position={[0, 1, 2]} intensity={1.5} />
      <Environment preset="city" />

      <OrbitControls makeDefault />

      <Center>
        <Table position={[0, 0, 0]} scale={[1, 1, 1]} /> 
        <Ball position={[0.25, 1.5, 0]} scale={[0.5, 0.5, 0.5]} />
      </Center>
    </>
  );
}

export default Experience;