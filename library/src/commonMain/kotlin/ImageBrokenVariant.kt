package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageBrokenVariant: ImageVector
    get() {
        if (_ImageBrokenVariant != null) {
            return _ImageBrokenVariant!!
        }
        _ImageBrokenVariant = ImageVector.Builder(
            name = "ImageBrokenVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                verticalLineTo(11.59f)
                lineTo(18f, 8.58f)
                lineTo(14f, 12.59f)
                lineTo(10f, 8.59f)
                lineTo(6f, 12.59f)
                lineTo(3f, 9.58f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                moveTo(18f, 11.42f)
                lineTo(21f, 14.43f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(12.42f)
                lineTo(6f, 15.41f)
                lineTo(10f, 11.41f)
                lineTo(14f, 15.41f)
            }
        }.build()

        return _ImageBrokenVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ImageBrokenVariant: ImageVector? = null
