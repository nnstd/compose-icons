package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GuitarAcoustic: ImageVector
    get() {
        if (_GuitarAcoustic != null) {
            return _GuitarAcoustic!!
        }
        _GuitarAcoustic = ImageVector.Builder(
            name = "GuitarAcoustic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.59f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(20.41f)
                lineTo(16.17f, 9.24f)
                curveTo(15.8f, 8.68f, 15.32f, 8.2f, 14.76f, 7.83f)
                lineTo(19.59f, 3f)
                moveTo(12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                curveTo(16f, 13.82f, 14.77f, 15.42f, 13f, 15.87f)
                verticalLineTo(16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11f)
                horizontalLineTo(8.13f)
                curveTo(8.58f, 9.24f, 10.17f, 8f, 12f, 8f)
                moveTo(12f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.5f)
                moveTo(6.94f, 14.24f)
                lineTo(6.23f, 14.94f)
                lineTo(9.06f, 17.77f)
                lineTo(9.77f, 17.06f)
                lineTo(6.94f, 14.24f)
                close()
            }
        }.build()

        return _GuitarAcoustic!!
    }

@Suppress("ObjectPropertyName")
private var _GuitarAcoustic: ImageVector? = null
