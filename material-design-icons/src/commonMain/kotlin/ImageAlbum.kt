package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageAlbum: ImageVector
    get() {
        if (_ImageAlbum != null) {
            return _ImageAlbum!!
        }
        _ImageAlbum = ImageVector.Builder(
            name = "ImageAlbum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 19f)
                lineTo(9f, 15.14f)
                lineTo(11.14f, 17.72f)
                lineTo(14.14f, 13.86f)
                lineTo(18f, 19f)
                horizontalLineTo(6f)
                moveTo(6f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                lineTo(8.5f, 10.5f)
                lineTo(6f, 12f)
                moveTo(18f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 2f)
                close()
            }
        }.build()

        return _ImageAlbum!!
    }

@Suppress("ObjectPropertyName")
private var _ImageAlbum: ImageVector? = null
