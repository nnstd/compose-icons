package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandSaw: ImageVector
    get() {
        if (_HandSaw != null) {
            return _HandSaw!!
        }
        _HandSaw = ImageVector.Builder(
            name = "HandSaw",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.8f, 17f)
                lineTo(5.9f, 11.6f)
                lineTo(20f, 2f)
                lineTo(22f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                moveTo(9.7f, 18.7f)
                lineTo(9.2f, 21.5f)
                lineTo(7.6f, 22.7f)
                curveTo(6.7f, 23.3f, 5.5f, 23.1f, 4.8f, 22.2f)
                lineTo(1.3f, 17.3f)
                curveTo(0.7f, 16.4f, 0.9f, 15.2f, 1.8f, 14.5f)
                lineTo(5.1f, 12.2f)
                lineTo(9.7f, 18.7f)
                moveTo(4.6f, 15f)
                lineTo(3f, 16.1f)
                lineTo(6.5f, 21f)
                lineTo(8.1f, 19.8f)
                lineTo(4.6f, 15f)
                close()
            }
        }.build()

        return _HandSaw!!
    }

@Suppress("ObjectPropertyName")
private var _HandSaw: ImageVector? = null
