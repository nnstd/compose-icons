package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskOff: ImageVector
    get() {
        if (_FlaskOff != null) {
            return _FlaskOff!!
        }
        _FlaskOff = ImageVector.Builder(
            name = "FlaskOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(7.9f, 9.8f)
                lineTo(3.5f, 17.4f)
                curveTo(3.2f, 17.8f, 3f, 18.4f, 3f, 19f)
                curveTo(3f, 20.7f, 4.3f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.6f, 22f, 19.2f, 21.8f, 19.6f, 21.5f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                curveTo(5.4f, 20f, 5f, 19.6f, 5f, 19f)
                curveTo(5f, 18.8f, 5.1f, 18.6f, 5.2f, 18.4f)
                lineTo(9f, 11.9f)
                lineTo(14f, 17f)
                lineTo(14.6f, 16.4f)
                lineTo(18f, 20f)
                curveTo(18.1f, 20f, 18f, 20f, 18f, 20f)
                moveTo(8f, 4.8f)
                verticalLineTo(4f)
                curveTo(8f, 2.9f, 8.9f, 2f, 10f, 2f)
                horizontalLineTo(14f)
                curveTo(15.1f, 2f, 16f, 2.9f, 16f, 4f)
                verticalLineTo(5f)
                curveTo(16f, 5.6f, 15.6f, 6f, 15f, 6f)
                verticalLineTo(7.8f)
                lineTo(20.4f, 17.2f)
                lineTo(8f, 4.8f)
                close()
            }
        }.build()

        return _FlaskOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskOff: ImageVector? = null
