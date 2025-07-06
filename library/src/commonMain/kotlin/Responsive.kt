package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Responsive: ImageVector
    get() {
        if (_Responsive != null) {
            return _Responsive!!
        }
        _Responsive = ImageVector.Builder(
            name = "Responsive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 10f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(0f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                curveTo(18f, 21.11f, 17.1f, 22f, 16f, 22f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 20f)
                horizontalLineTo(9f)
                lineTo(0f, 20f)
                moveTo(11.5f, 20f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 20.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 21f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 20f)
                moveTo(15.5f, 20f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 21f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 20.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 20f)
                moveTo(13f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                moveTo(11f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _Responsive!!
    }

@Suppress("ObjectPropertyName")
private var _Responsive: ImageVector? = null
