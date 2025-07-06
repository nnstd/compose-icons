package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.QualityHigh: ImageVector
    get() {
        if (_QualityHigh != null) {
            return _QualityHigh!!
        }
        _QualityHigh = ImageVector.Builder(
            name = "QualityHigh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                moveTo(18f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                horizontalLineTo(16.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(14.75f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 9f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                moveTo(11f, 15f)
                horizontalLineTo(9.5f)
                verticalLineTo(13f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                curveTo(3.89f, 4f, 3f, 4.89f, 3f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18f)
                verticalLineTo(6f)
                curveTo(21f, 4.89f, 20.1f, 4f, 19f, 4f)
                close()
            }
        }.build()

        return _QualityHigh!!
    }

@Suppress("ObjectPropertyName")
private var _QualityHigh: ImageVector? = null
