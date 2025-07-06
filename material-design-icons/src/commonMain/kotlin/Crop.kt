package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Crop: ImageVector
    get() {
        if (_Crop != null) {
            return _Crop!!
        }
        _Crop = ImageVector.Builder(
            name = "Crop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 17f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                moveTo(17f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                curveTo(19f, 5.89f, 18.1f, 5f, 17f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Crop!!
    }

@Suppress("ObjectPropertyName")
private var _Crop: ImageVector? = null
