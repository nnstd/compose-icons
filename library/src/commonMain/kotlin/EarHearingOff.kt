package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EarHearingOff: ImageVector
    get() {
        if (_EarHearingOff != null) {
            return _EarHearingOff!!
        }
        _EarHearingOff = ImageVector.Builder(
            name = "EarHearingOff",
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
                lineTo(12.91f, 16.18f)
                curveTo(12.19f, 16.74f, 11.67f, 17.19f, 11.37f, 18.1f)
                curveTo(10.77f, 19.92f, 10f, 20.94f, 8.64f, 21.65f)
                curveTo(8.13f, 21.88f, 7.57f, 22f, 7f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                curveTo(7.29f, 20f, 7.56f, 19.94f, 7.76f, 19.85f)
                curveTo(8.47f, 19.5f, 8.97f, 18.97f, 9.47f, 17.47f)
                curveTo(9.91f, 16.12f, 10.69f, 15.39f, 11.5f, 14.76f)
                lineTo(5.04f, 8.31f)
                curveTo(5f, 8.54f, 5f, 8.77f, 5f, 9f)
                horizontalLineTo(3f)
                curveTo(3f, 8.17f, 3.14f, 7.39f, 3.39f, 6.66f)
                lineTo(1f, 4.27f)
                moveTo(14.18f, 11.94f)
                curveTo(14.71f, 11f, 15f, 9.93f, 15f, 9f)
                curveTo(15f, 6.2f, 12.8f, 4f, 10f, 4f)
                curveTo(8.81f, 4f, 7.74f, 4.39f, 6.89f, 5.06f)
                lineTo(5.46f, 3.63f)
                curveTo(6.67f, 2.61f, 8.25f, 2f, 10f, 2f)
                curveTo(13.93f, 2f, 17f, 5.07f, 17f, 9f)
                curveTo(17f, 10.26f, 16.62f, 11.65f, 15.93f, 12.9f)
                lineTo(15.47f, 13.65f)
                lineTo(14.03f, 12.2f)
                lineTo(14.18f, 11.94f)
                moveTo(16.36f, 2.64f)
                lineTo(17.78f, 1.22f)
                curveTo(19.77f, 3.21f, 21f, 5.96f, 21f, 9f)
                curveTo(21f, 11.83f, 19.93f, 14.41f, 18.18f, 16.36f)
                lineTo(16.77f, 14.94f)
                curveTo(18.15f, 13.36f, 19f, 11.28f, 19f, 9f)
                curveTo(19f, 6.5f, 18f, 4.26f, 16.36f, 2.64f)
                moveTo(12.5f, 9f)
                curveTo(12.5f, 9.5f, 12.36f, 9.93f, 12.13f, 10.31f)
                lineTo(8.69f, 6.87f)
                curveTo(9.07f, 6.64f, 9.5f, 6.5f, 10f, 6.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, 9f)
                close()
            }
        }.build()

        return _EarHearingOff!!
    }

@Suppress("ObjectPropertyName")
private var _EarHearingOff: ImageVector? = null
