package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageFilterFrames: ImageVector
    get() {
        if (_ImageFilterFrames != null) {
            return _ImageFilterFrames!!
        }
        _ImageFilterFrames = ImageVector.Builder(
            name = "ImageFilterFrames",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                moveTo(20f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(8.5f)
                lineTo(12.04f, 2.5f)
                lineTo(15.5f, 6f)
                horizontalLineTo(20f)
                moveTo(20f, 4f)
                horizontalLineTo(16f)
                lineTo(12f, 0f)
                lineTo(8f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 20f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                close()
            }
        }.build()

        return _ImageFilterFrames!!
    }

@Suppress("ObjectPropertyName")
private var _ImageFilterFrames: ImageVector? = null
