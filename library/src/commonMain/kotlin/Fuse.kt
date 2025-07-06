package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fuse: ImageVector
    get() {
        if (_Fuse != null) {
            return _Fuse!!
        }
        _Fuse = ImageVector.Builder(
            name = "Fuse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                moveTo(11.16f, 16f)
                verticalLineTo(12.87f)
                horizontalLineTo(9.41f)
                lineTo(11.91f, 8f)
                verticalLineTo(11.14f)
                horizontalLineTo(13.59f)
                lineTo(11.16f, 16f)
                moveTo(16f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 1f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 2f)
                moveTo(16f, 18f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 23f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Fuse!!
    }

@Suppress("ObjectPropertyName")
private var _Fuse: ImageVector? = null
