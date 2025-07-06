package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CompassOff: ImageVector
    get() {
        if (_CompassOff != null) {
            return _CompassOff!!
        }
        _CompassOff = ImageVector.Builder(
            name = "CompassOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 3.5f)
                lineTo(2.28f, 2.25f)
                lineTo(21.75f, 21.72f)
                lineTo(20.5f, 23f)
                lineTo(17.7f, 20.22f)
                curveTo(16.08f, 21.34f, 14.12f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                curveTo(2f, 9.88f, 2.66f, 7.92f, 3.78f, 6.3f)
                lineTo(1f, 3.5f)
                moveTo(6f, 18f)
                lineTo(12.47f, 15f)
                lineTo(9f, 11.53f)
                lineTo(6f, 18f)
                moveTo(18f, 6f)
                lineTo(11.56f, 9f)
                lineTo(6.33f, 3.76f)
                curveTo(7.94f, 2.65f, 9.9f, 2f, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                curveTo(22f, 14.1f, 21.35f, 16.06f, 20.24f, 17.67f)
                lineTo(15f, 12.44f)
                lineTo(18f, 6f)
                close()
            }
        }.build()

        return _CompassOff!!
    }

@Suppress("ObjectPropertyName")
private var _CompassOff: ImageVector? = null
