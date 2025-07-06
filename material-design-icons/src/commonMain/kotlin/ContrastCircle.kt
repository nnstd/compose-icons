package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContrastCircle: ImageVector
    get() {
        if (_ContrastCircle != null) {
            return _ContrastCircle!!
        }
        _ContrastCircle = ImageVector.Builder(
            name = "ContrastCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveTo(9.79f, 20f, 7.79f, 19.1f, 6.34f, 17.66f)
                lineTo(17.66f, 6.34f)
                curveTo(19.1f, 7.79f, 20f, 9.79f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(6f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(9.5f)
                verticalLineTo(8f)
                horizontalLineTo(11.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                horizontalLineTo(6f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 16f)
                horizontalLineTo(17f)
                verticalLineTo(14.5f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ContrastCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ContrastCircle: ImageVector? = null
