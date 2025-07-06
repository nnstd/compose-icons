package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Speedometer: ImageVector
    get() {
        if (_Speedometer != null) {
            return _Speedometer!!
        }
        _Speedometer = ImageVector.Builder(
            name = "Speedometer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13f)
                curveTo(9f, 11.88f, 9.61f, 10.9f, 10.5f, 10.39f)
                lineTo(20.21f, 4.77f)
                lineTo(14.68f, 14.35f)
                curveTo(14.18f, 15.33f, 13.17f, 16f, 12f, 16f)
                moveTo(12f, 3f)
                curveTo(13.81f, 3f, 15.5f, 3.5f, 16.97f, 4.32f)
                lineTo(14.87f, 5.53f)
                curveTo(14f, 5.19f, 13f, 5f, 12f, 5f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13f)
                curveTo(4f, 15.21f, 4.89f, 17.21f, 6.34f, 18.65f)
                horizontalLineTo(6.35f)
                curveTo(6.74f, 19.04f, 6.74f, 19.67f, 6.35f, 20.06f)
                curveTo(5.96f, 20.45f, 5.32f, 20.45f, 4.93f, 20.07f)
                verticalLineTo(20.07f)
                curveTo(3.12f, 18.26f, 2f, 15.76f, 2f, 13f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                moveTo(22f, 13f)
                curveTo(22f, 15.76f, 20.88f, 18.26f, 19.07f, 20.07f)
                verticalLineTo(20.07f)
                curveTo(18.68f, 20.45f, 18.05f, 20.45f, 17.66f, 20.06f)
                curveTo(17.27f, 19.67f, 17.27f, 19.04f, 17.66f, 18.65f)
                verticalLineTo(18.65f)
                curveTo(19.11f, 17.2f, 20f, 15.21f, 20f, 13f)
                curveTo(20f, 12f, 19.81f, 11f, 19.46f, 10.1f)
                lineTo(20.67f, 8f)
                curveTo(21.5f, 9.5f, 22f, 11.18f, 22f, 13f)
                close()
            }
        }.build()

        return _Speedometer!!
    }

@Suppress("ObjectPropertyName")
private var _Speedometer: ImageVector? = null
