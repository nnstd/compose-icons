package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrosoftDynamics365: ImageVector
    get() {
        if (_MicrosoftDynamics365 != null) {
            return _MicrosoftDynamics365!!
        }
        _MicrosoftDynamics365 = ImageVector.Builder(
            name = "MicrosoftDynamics365",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                lineTo(17.25f, 8.5f)
                lineTo(13.5f, 11.5f)
                lineTo(6f, 8f)
                verticalLineTo(2f)
                moveTo(6f, 9f)
                lineTo(9.5f, 11.25f)
                lineTo(6f, 22f)
                lineTo(18f, 9f)
                verticalLineTo(15f)
                lineTo(6f, 22f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _MicrosoftDynamics365!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftDynamics365: ImageVector? = null
