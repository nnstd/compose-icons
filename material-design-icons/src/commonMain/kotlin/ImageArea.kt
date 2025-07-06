package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageArea: ImageVector
    get() {
        if (_ImageArea != null) {
            return _ImageArea!!
        }
        _ImageArea = ImageVector.Builder(
            name = "ImageArea",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(4f)
                curveTo(2.89f, 19f, 2f, 18.1f, 2f, 17f)
                verticalLineTo(7f)
                curveTo(2f, 5.89f, 2.89f, 5f, 4f, 5f)
                horizontalLineTo(20f)
                moveTo(5f, 16f)
                horizontalLineTo(19f)
                lineTo(14.5f, 10f)
                lineTo(11f, 14.5f)
                lineTo(8.5f, 11.5f)
                lineTo(5f, 16f)
                close()
            }
        }.build()

        return _ImageArea!!
    }

@Suppress("ObjectPropertyName")
private var _ImageArea: ImageVector? = null
