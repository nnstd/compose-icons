package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Forklift: ImageVector
    get() {
        if (_Forklift != null) {
            return _Forklift!!
        }
        _Forklift = ImageVector.Builder(
            name = "Forklift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                curveTo(2.89f, 11f, 2f, 11.89f, 2f, 13f)
                verticalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 17f)
                horizontalLineTo(10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 20f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 17f)
                verticalLineTo(13f)
                lineTo(12f, 4f)
                horizontalLineTo(6f)
                moveTo(17f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                moveTo(7.5f, 5.5f)
                horizontalLineTo(11.2f)
                lineTo(14.5f, 13f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.5f)
                moveTo(5f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 15.5f)
                moveTo(13f, 15.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 18.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.5f, 17f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 15.5f)
                close()
            }
        }.build()

        return _Forklift!!
    }

@Suppress("ObjectPropertyName")
private var _Forklift: ImageVector? = null
