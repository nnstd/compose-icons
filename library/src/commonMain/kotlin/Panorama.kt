package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Panorama: ImageVector
    get() {
        if (_Panorama != null) {
            return _Panorama!!
        }
        _Panorama = ImageVector.Builder(
            name = "Panorama",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 12.5f)
                lineTo(11f, 15.5f)
                lineTo(14.5f, 11f)
                lineTo(19f, 17f)
                horizontalLineTo(5f)
                moveTo(23f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 4f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 18f)
                close()
            }
        }.build()

        return _Panorama!!
    }

@Suppress("ObjectPropertyName")
private var _Panorama: ImageVector? = null
