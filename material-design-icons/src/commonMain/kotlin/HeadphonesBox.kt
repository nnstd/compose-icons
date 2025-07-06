package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadphonesBox: ImageVector
    get() {
        if (_HeadphonesBox != null) {
            return _HeadphonesBox!!
        }
        _HeadphonesBox = ImageVector.Builder(
            name = "HeadphonesBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.2f, 18f)
                curveTo(6.54f, 18f, 6f, 17.46f, 6f, 16.8f)
                verticalLineTo(13.2f)
                lineTo(6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                verticalLineTo(13.2f)
                lineTo(18f, 16.8f)
                arcTo(1.2f, 1.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.8f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _HeadphonesBox!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesBox: ImageVector? = null
