package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PillOff: ImageVector
    get() {
        if (_PillOff != null) {
            return _PillOff!!
        }
        _PillOff = ImageVector.Builder(
            name = "PillOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.81f, 8.7f)
                lineTo(4.22f, 11.29f)
                curveTo(1.88f, 13.64f, 1.88f, 17.43f, 4.22f, 19.78f)
                curveTo(6.56f, 22.12f, 10.36f, 22.12f, 12.71f, 19.78f)
                lineTo(15.3f, 17.19f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(4.6f, 16.57f)
                curveTo(4.24f, 15.24f, 4.59f, 13.75f, 5.64f, 12.71f)
                lineTo(8.23f, 10.12f)
                lineTo(9.64f, 11.53f)
                lineTo(4.6f, 16.57f)
                moveTo(10.78f, 7.58f)
                lineTo(9.36f, 6.16f)
                lineTo(11.29f, 4.22f)
                curveTo(13.64f, 1.88f, 17.43f, 1.88f, 19.78f, 4.22f)
                curveTo(22.12f, 6.56f, 22.12f, 10.36f, 19.78f, 12.71f)
                lineTo(17.85f, 14.65f)
                lineTo(16.43f, 13.23f)
                lineTo(18.36f, 11.29f)
                curveTo(19.93f, 9.73f, 19.93f, 7.2f, 18.36f, 5.64f)
                curveTo(16.8f, 4.07f, 14.27f, 4.07f, 12.71f, 5.64f)
                lineTo(10.78f, 7.58f)
                close()
            }
        }.build()

        return _PillOff!!
    }

@Suppress("ObjectPropertyName")
private var _PillOff: ImageVector? = null
