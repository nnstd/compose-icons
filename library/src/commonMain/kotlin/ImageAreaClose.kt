package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageAreaClose: ImageVector
    get() {
        if (_ImageAreaClose != null) {
            return _ImageAreaClose!!
        }
        _ImageAreaClose = ImageVector.Builder(
            name = "ImageAreaClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                lineTo(8f, 19f)
                horizontalLineTo(16f)
                lineTo(12f, 23f)
                moveTo(20f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                horizontalLineTo(20f)
                moveTo(5f, 14f)
                horizontalLineTo(19f)
                lineTo(14.5f, 8f)
                lineTo(11f, 12.5f)
                lineTo(8.5f, 9.5f)
                lineTo(5f, 14f)
                close()
            }
        }.build()

        return _ImageAreaClose!!
    }

@Suppress("ObjectPropertyName")
private var _ImageAreaClose: ImageVector? = null
