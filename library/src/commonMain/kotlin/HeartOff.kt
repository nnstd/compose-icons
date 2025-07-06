package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartOff: ImageVector
    get() {
        if (_HeartOff != null) {
            return _HeartOff!!
        }
        _HeartOff = ImageVector.Builder(
            name = "HeartOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(15.18f, 18.44f)
                lineTo(13.45f, 20.03f)
                lineTo(12f, 21.35f)
                lineTo(10.55f, 20.03f)
                curveTo(5.4f, 15.36f, 2f, 12.27f, 2f, 8.5f)
                curveTo(2f, 7.55f, 2.23f, 6.67f, 2.63f, 5.9f)
                lineTo(1f, 4.27f)
                moveTo(7.5f, 3f)
                curveTo(9.24f, 3f, 10.91f, 3.81f, 12f, 5.08f)
                curveTo(13.09f, 3.81f, 14.76f, 3f, 16.5f, 3f)
                curveTo(19.58f, 3f, 22f, 5.41f, 22f, 8.5f)
                curveTo(22f, 11.07f, 20.42f, 13.32f, 17.79f, 15.97f)
                lineTo(5.27f, 3.45f)
                curveTo(5.95f, 3.16f, 6.7f, 3f, 7.5f, 3f)
                close()
            }
        }.build()

        return _HeartOff!!
    }

@Suppress("ObjectPropertyName")
private var _HeartOff: ImageVector? = null
