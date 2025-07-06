package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MixedReality: ImageVector
    get() {
        if (_MixedReality != null) {
            return _MixedReality!!
        }
        _MixedReality = ImageVector.Builder(
            name = "MixedReality",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(8.25f, 15f)
                horizontalLineTo(9.75f)
                lineTo(10.75f, 11.57f)
                verticalLineTo(15f)
                horizontalLineTo(12.25f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                lineTo(9f, 12.43f)
                lineTo(8f, 9f)
                horizontalLineTo(5.75f)
                verticalLineTo(15f)
                horizontalLineTo(7.25f)
                verticalLineTo(11.57f)
                lineTo(8.25f, 15f)
                moveTo(13.5f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(16.15f)
                lineTo(17f, 15f)
                horizontalLineTo(18.5f)
                lineTo(17.6f, 12.9f)
                curveTo(18.1f, 12.65f, 18.5f, 12.1f, 18.5f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(18.5f, 9.65f, 17.85f, 9f, 17f, 9f)
                horizontalLineTo(13.5f)
                moveTo(15f, 10.5f)
                horizontalLineTo(17f)
                verticalLineTo(11.5f)
                horizontalLineTo(15f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _MixedReality!!
    }

@Suppress("ObjectPropertyName")
private var _MixedReality: ImageVector? = null
