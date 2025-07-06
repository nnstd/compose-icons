package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlarmOff: ImageVector
    get() {
        if (_AlarmOff != null) {
            return _AlarmOff!!
        }
        _AlarmOff = ImageVector.Builder(
            name = "AlarmOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3.28f)
                lineTo(6.6f, 1.86f)
                lineTo(5.74f, 2.57f)
                lineTo(7.16f, 4f)
                moveTo(16.47f, 18.39f)
                curveTo(15.26f, 19.39f, 13.7f, 20f, 12f, 20f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 13f)
                curveTo(5f, 11.3f, 5.61f, 9.74f, 6.61f, 8.53f)
                moveTo(2.92f, 2.29f)
                lineTo(1.65f, 3.57f)
                lineTo(3f, 4.9f)
                lineTo(1.87f, 5.83f)
                lineTo(3.29f, 7.25f)
                lineTo(4.4f, 6.31f)
                lineTo(5.2f, 7.11f)
                curveTo(3.83f, 8.69f, 3f, 10.75f, 3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(14.25f, 22f, 16.31f, 21.17f, 17.89f, 19.8f)
                lineTo(20.09f, 22f)
                lineTo(21.36f, 20.73f)
                lineTo(3.89f, 3.27f)
                lineTo(2.92f, 2.29f)
                moveTo(22f, 5.72f)
                lineTo(17.4f, 1.86f)
                lineTo(16.11f, 3.39f)
                lineTo(20.71f, 7.25f)
                lineTo(22f, 5.72f)
                moveTo(12f, 6f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 13f)
                curveTo(19f, 13.84f, 18.84f, 14.65f, 18.57f, 15.4f)
                lineTo(20.09f, 16.92f)
                curveTo(20.67f, 15.73f, 21f, 14.41f, 21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                curveTo(10.59f, 4f, 9.27f, 4.33f, 8.08f, 4.91f)
                lineTo(9.6f, 6.43f)
                curveTo(10.35f, 6.16f, 11.16f, 6f, 12f, 6f)
                close()
            }
        }.build()

        return _AlarmOff!!
    }

@Suppress("ObjectPropertyName")
private var _AlarmOff: ImageVector? = null
