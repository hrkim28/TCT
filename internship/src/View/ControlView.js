import React, { Component } from 'react';
import { Grid, Button, Icon } from 'semantic-ui-react'

class ControlView extends Component {
    render() {
        return (
            <div className="ControlButton">
                <Grid>
                    <Button content='Start' primary
                        onClick={(e) => {
                            this.props.onProgress();
                            this.props.onIncrement();
                        }} />
                    <Button secondary onClick={(e)=>this.props.onRestart()}>
                        <Icon fitted name='undo' />
                    </Button>
                </Grid>
            </div>
        );
    }
}

export default ControlView;