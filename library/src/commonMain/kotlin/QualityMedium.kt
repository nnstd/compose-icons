package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.QualityMedium: ImageVector
    get() {
        if (_QualityMedium != null) {
            return _QualityMedium!!
        }
        _QualityMedium = ImageVector.Builder(
            name = "QualityMedium",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 20f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 4f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 6f)
                moveTo(12f, 10f)
                curveTo(12f, 9.5f, 11.5f, 9f, 11f, 9f)
                horizontalLineTo(6.5f)
                curveTo(6f, 9f, 5.5f, 9.5f, 5.5f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(10.5f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                moveTo(14.5f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 10f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 15f)
                horizontalLineTo(15.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.75f)
                verticalLineTo(15f)
                horizontalLineTo(17.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 9f)
                horizontalLineTo(14.5f)
                moveTo(15f, 10.5f)
                horizontalLineTo(17f)
                verticalLineTo(13.5f)
                horizontalLineTo(15f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _QualityMedium!!
    }

@Suppress("ObjectPropertyName")
private var _QualityMedium: ImageVector? = null
