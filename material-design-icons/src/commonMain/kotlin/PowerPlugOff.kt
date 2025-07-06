package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerPlugOff: ImageVector
    get() {
        if (_PowerPlugOff != null) {
            return _PowerPlugOff!!
        }
        _PowerPlugOff = ImageVector.Builder(
            name = "PowerPlugOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(15.31f, 17.2f)
                lineTo(14.5f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(9.5f)
                verticalLineTo(18f)
                lineTo(6f, 14.5f)
                verticalLineTo(9f)
                curveTo(6f, 8.7f, 6.1f, 8.41f, 6.25f, 8.14f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(18f, 14.5f)
                verticalLineTo(9f)
                curveTo(18f, 8f, 17f, 7f, 16f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10.2f)
                lineTo(17.85f, 14.65f)
                lineTo(18f, 14.5f)
                moveTo(10f, 3f)
                horizontalLineTo(8f)
                verticalLineTo(4.8f)
                lineTo(10f, 6.8f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _PowerPlugOff!!
    }

@Suppress("ObjectPropertyName")
private var _PowerPlugOff: ImageVector? = null
