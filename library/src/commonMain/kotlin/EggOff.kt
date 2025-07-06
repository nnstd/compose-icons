package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EggOff: ImageVector
    get() {
        if (_EggOff != null) {
            return _EggOff!!
        }
        _EggOff = ImageVector.Builder(
            name = "EggOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(6.1f, 8f)
                curveTo(5.1f, 10.3f, 4.5f, 12.8f, 4.5f, 14.5f)
                curveTo(4.5f, 18.6f, 7.9f, 22f, 12f, 22f)
                curveTo(14.2f, 22f, 16.2f, 21f, 17.6f, 19.5f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(19.5f, 14.5f)
                curveTo(19.5f, 10.4f, 16.1f, 2f, 12f, 2f)
                curveTo(10.5f, 2f, 9.1f, 3.1f, 7.9f, 4.7f)
                lineTo(19.3f, 16.1f)
                curveTo(19.4f, 15.6f, 19.5f, 15.1f, 19.5f, 14.5f)
                close()
            }
        }.build()

        return _EggOff!!
    }

@Suppress("ObjectPropertyName")
private var _EggOff: ImageVector? = null
