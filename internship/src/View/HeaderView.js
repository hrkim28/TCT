import React from 'react';
import { Header, Icon } from 'semantic-ui-react'
import './View.css';

const HeaderView = () => (
    <div className="HeaderBackGround">
        <Header as='h2' color="blue" inverted>
            <Icon name='settings' />
            <Header.Content>
                Process Management
      <Header.Subheader>Manage factory Process</Header.Subheader>
            </Header.Content>
        </Header>
    </div>
)

export default HeaderView;