package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TildeOff: ImageVector
    get() {
        if (_TildeOff != null) {
            return _TildeOff!!
        }
        _TildeOff = ImageVector.Builder(
            name = "TildeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(10.78f, 12.67f)
                curveTo(10f, 12.03f, 9.27f, 11.5f, 8.5f, 11.5f)
                curveTo(4.5f, 11.5f, 4.5f, 15f, 4.5f, 15f)
                horizontalLineTo(2f)
                curveTo(2f, 15f, 2f, 9.59f, 7.16f, 9.05f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(10.03f, 9.37f)
                lineTo(10.03f, 9.37f)
                lineTo(15.64f, 15f)
                lineTo(15.63f, 15f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(22f, 9f)
                horizontalLineTo(19.5f)
                curveTo(19.5f, 9f, 19.5f, 12.38f, 15.69f, 12.5f)
                lineTo(17.95f, 14.75f)
                curveTo(22f, 13.62f, 22f, 9f, 22f, 9f)
                close()
            }
        }.build()

        return _TildeOff!!
    }

@Suppress("ObjectPropertyName")
private var _TildeOff: ImageVector? = null
