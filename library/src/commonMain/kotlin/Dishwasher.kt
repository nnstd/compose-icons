package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dishwasher: ImageVector
    get() {
        if (_Dishwasher != null) {
            return _Dishwasher!!
        }
        _Dishwasher = ImageVector.Builder(
            name = "Dishwasher",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                moveTo(10f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                moveTo(7f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4f)
                moveTo(18f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                moveTo(14.67f, 15.33f)
                curveTo(14.69f, 16.03f, 14.41f, 16.71f, 13.91f, 17.21f)
                curveTo(12.86f, 18.26f, 11.15f, 18.27f, 10.09f, 17.21f)
                curveTo(9.59f, 16.71f, 9.31f, 16.03f, 9.33f, 15.33f)
                curveTo(9.4f, 14.62f, 9.63f, 13.94f, 10f, 13.33f)
                curveTo(10.37f, 12.5f, 10.81f, 11.73f, 11.33f, 11f)
                lineTo(12f, 10f)
                curveTo(13.79f, 12.59f, 14.67f, 14.36f, 14.67f, 15.33f)
            }
        }.build()

        return _Dishwasher!!
    }

@Suppress("ObjectPropertyName")
private var _Dishwasher: ImageVector? = null
