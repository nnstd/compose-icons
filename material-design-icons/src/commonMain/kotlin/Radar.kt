package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Radar: ImageVector
    get() {
        if (_Radar != null) {
            return _Radar!!
        }
        _Radar = ImageVector.Builder(
            name = "Radar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.1f, 7.79f, 20f, 9.79f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                curveTo(4f, 7.92f, 7.05f, 4.56f, 11f, 4.07f)
                verticalLineTo(6.09f)
                curveTo(8.16f, 6.57f, 6f, 9.03f, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12f)
                curveTo(18f, 10.34f, 17.33f, 8.84f, 16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.9f, 16f, 10.9f, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                curveTo(8f, 10.14f, 9.28f, 8.59f, 11f, 8.14f)
                verticalLineTo(10.28f)
                curveTo(10.4f, 10.63f, 10f, 11.26f, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                curveTo(14f, 11.26f, 13.6f, 10.62f, 13f, 10.28f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                curveTo(22f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                close()
            }
        }.build()

        return _Radar!!
    }

@Suppress("ObjectPropertyName")
private var _Radar: ImageVector? = null
