package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AugmentedReality: ImageVector
    get() {
        if (_AugmentedReality != null) {
            return _AugmentedReality!!
        }
        _AugmentedReality = ImageVector.Builder(
            name = "AugmentedReality",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(7f, 9f)
                horizontalLineTo(10f)
                curveTo(10.6f, 9f, 11f, 9.5f, 11f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                curveTo(6f, 9.5f, 6.4f, 9f, 7f, 9f)
                moveTo(13f, 9f)
                horizontalLineTo(16.5f)
                curveTo(17.35f, 9f, 18f, 9.65f, 18f, 10.5f)
                verticalLineTo(11.5f)
                curveTo(18f, 12.1f, 17.6f, 12.65f, 17.1f, 12.9f)
                lineTo(18f, 15f)
                horizontalLineTo(16.5f)
                lineTo(15.65f, 13f)
                horizontalLineTo(14.5f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(7.5f, 10.5f)
                verticalLineTo(12f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(7.5f)
                moveTo(14.5f, 10.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
            }
        }.build()

        return _AugmentedReality!!
    }

@Suppress("ObjectPropertyName")
private var _AugmentedReality: ImageVector? = null
