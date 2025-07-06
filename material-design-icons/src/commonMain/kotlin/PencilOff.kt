package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilOff: ImageVector
    get() {
        if (_PencilOff != null) {
            return _PencilOff!!
        }
        _PencilOff = ImageVector.Builder(
            name = "PencilOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.66f, 2f)
                curveTo(18.4f, 2f, 18.16f, 2.09f, 17.97f, 2.28f)
                lineTo(16.13f, 4.13f)
                lineTo(19.88f, 7.88f)
                lineTo(21.72f, 6.03f)
                curveTo(22.11f, 5.64f, 22.11f, 5f, 21.72f, 4.63f)
                lineTo(19.38f, 2.28f)
                curveTo(19.18f, 2.09f, 18.91f, 2f, 18.66f, 2f)
                moveTo(3.28f, 4f)
                lineTo(2f, 5.28f)
                lineTo(8.5f, 11.75f)
                lineTo(4f, 16.25f)
                verticalLineTo(20f)
                horizontalLineTo(7.75f)
                lineTo(12.25f, 15.5f)
                lineTo(18.72f, 22f)
                lineTo(20f, 20.72f)
                lineTo(13.5f, 14.25f)
                lineTo(9.75f, 10.5f)
                lineTo(3.28f, 4f)
                moveTo(15.06f, 5.19f)
                lineTo(11.03f, 9.22f)
                lineTo(14.78f, 12.97f)
                lineTo(18.81f, 8.94f)
                lineTo(15.06f, 5.19f)
                close()
            }
        }.build()

        return _PencilOff!!
    }

@Suppress("ObjectPropertyName")
private var _PencilOff: ImageVector? = null
