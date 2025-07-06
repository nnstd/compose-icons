package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScaleBathroom: ImageVector
    get() {
        if (_ScaleBathroom != null) {
            return _ScaleBathroom!!
        }
        _ScaleBathroom = ImageVector.Builder(
            name = "ScaleBathroom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 2f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                moveTo(12f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(11.26f)
                lineTo(10.85f, 5.23f)
                lineTo(12.9f, 8f)
                horizontalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 4f)
                moveTo(5f, 10f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ScaleBathroom!!
    }

@Suppress("ObjectPropertyName")
private var _ScaleBathroom: ImageVector? = null
