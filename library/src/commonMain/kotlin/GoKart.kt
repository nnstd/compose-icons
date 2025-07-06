package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoKart: ImageVector
    get() {
        if (_GoKart != null) {
            return _GoKart!!
        }
        _GoKart = ImageVector.Builder(
            name = "GoKart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(15.53f)
                lineTo(14.38f, 8.28f)
                lineTo(15.8f, 7.33f)
                lineTo(14.7f, 5.67f)
                lineTo(10.2f, 8.67f)
                lineTo(11.3f, 10.33f)
                lineTo(12.73f, 9.38f)
                lineTo(13.88f, 11.12f)
                lineTo(13f, 12f)
                horizontalLineTo(10.2f)
                lineTo(5.83f, 5.45f)
                lineTo(4.17f, 6.55f)
                lineTo(5.87f, 9.11f)
                curveTo(3.04f, 9.65f, 1f, 12.12f, 1f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 10f)
                moveTo(6f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 18.5f)
                moveTo(18f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 18.5f)
                close()
            }
        }.build()

        return _GoKart!!
    }

@Suppress("ObjectPropertyName")
private var _GoKart: ImageVector? = null
