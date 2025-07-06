package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CallReceived: ImageVector
    get() {
        if (_CallReceived != null) {
            return _CallReceived!!
        }
        _CallReceived = ImageVector.Builder(
            name = "CallReceived",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5.41f)
                lineTo(18.59f, 4f)
                lineTo(7f, 15.59f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(8.41f)
            }
        }.build()

        return _CallReceived!!
    }

@Suppress("ObjectPropertyName")
private var _CallReceived: ImageVector? = null
