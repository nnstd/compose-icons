package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashlightOff: ImageVector
    get() {
        if (_FlashlightOff != null) {
            return _FlashlightOff!!
        }
        _FlashlightOff = ImageVector.Builder(
            name = "FlashlightOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(15f, 18.27f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(12.27f)
                lineTo(2f, 5.27f)
                moveTo(18f, 5f)
                lineTo(15f, 10f)
                horizontalLineTo(11.82f)
                lineTo(6.82f, 5f)
                horizontalLineTo(18f)
                moveTo(18f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(15f, 11f)
                verticalLineTo(13.18f)
                lineTo(12.82f, 11f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _FlashlightOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlashlightOff: ImageVector? = null
