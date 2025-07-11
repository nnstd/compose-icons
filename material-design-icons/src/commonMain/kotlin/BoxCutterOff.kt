package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BoxCutterOff: ImageVector
    get() {
        if (_BoxCutterOff != null) {
            return _BoxCutterOff!!
        }
        _BoxCutterOff = ImageVector.Builder(
            name = "BoxCutterOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(12.86f, 14.75f)
                lineTo(12.17f, 15.44f)
                lineTo(6.66f, 13.08f)
                curveTo(6.71f, 12.65f, 6.89f, 12.24f, 7.22f, 11.91f)
                lineTo(8.62f, 10.5f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(15.41f, 12.21f)
                lineTo(11.16f, 7.96f)
                lineTo(16.41f, 2.71f)
                curveTo(17.2f, 1.93f, 18.46f, 1.93f, 19.24f, 2.71f)
                lineTo(20.66f, 4.13f)
                curveTo(21.44f, 4.91f, 21.44f, 6.17f, 20.66f, 6.96f)
                lineTo(15.41f, 12.21f)
                moveTo(17.12f, 6.25f)
                curveTo(17.5f, 6.64f, 18.15f, 6.64f, 18.54f, 6.25f)
                curveTo(18.93f, 5.86f, 18.93f, 5.23f, 18.54f, 4.83f)
                curveTo(18.15f, 4.44f, 17.5f, 4.44f, 17.12f, 4.83f)
                curveTo(16.73f, 5.23f, 16.73f, 5.86f, 17.12f, 6.25f)
                moveTo(5f, 16f)
                verticalLineTo(21.75f)
                lineTo(10.81f, 16.53f)
                lineTo(5.81f, 14.53f)
                lineTo(5f, 16f)
                close()
            }
        }.build()

        return _BoxCutterOff!!
    }

@Suppress("ObjectPropertyName")
private var _BoxCutterOff: ImageVector? = null
