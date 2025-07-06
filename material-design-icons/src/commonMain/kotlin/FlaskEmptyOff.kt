package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlaskEmptyOff: ImageVector
    get() {
        if (_FlaskEmptyOff != null) {
            return _FlaskEmptyOff!!
        }
        _FlaskEmptyOff = ImageVector.Builder(
            name = "FlaskEmptyOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(19.6f, 21.5f)
                curveTo(19.1f, 21.8f, 18.6f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.3f, 22f, 3f, 20.7f, 3f, 19f)
                curveTo(3f, 18.4f, 3.2f, 17.8f, 3.5f, 17.4f)
                lineTo(7.9f, 9.8f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(15f, 7.8f)
                verticalLineTo(6f)
                curveTo(15.6f, 6f, 16f, 5.6f, 16f, 5f)
                verticalLineTo(4f)
                curveTo(16f, 2.9f, 15.1f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(8.9f, 2f, 8f, 2.9f, 8f, 4f)
                verticalLineTo(4.8f)
                lineTo(20.4f, 17.2f)
                lineTo(15f, 7.8f)
                close()
            }
        }.build()

        return _FlaskEmptyOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlaskEmptyOff: ImageVector? = null
