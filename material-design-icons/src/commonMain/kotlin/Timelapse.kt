package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Timelapse: ImageVector
    get() {
        if (_Timelapse != null) {
            return _Timelapse!!
        }
        _Timelapse = ImageVector.Builder(
            name = "Timelapse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(16.24f, 7.76f)
                curveTo(15.07f, 6.58f, 13.53f, 6f, 12f, 6f)
                verticalLineTo(12f)
                lineTo(7.76f, 16.24f)
                curveTo(10.1f, 18.58f, 13.9f, 18.58f, 16.24f, 16.24f)
                curveTo(18.59f, 13.9f, 18.59f, 10.1f, 16.24f, 7.76f)
                close()
            }
        }.build()

        return _Timelapse!!
    }

@Suppress("ObjectPropertyName")
private var _Timelapse: ImageVector? = null
