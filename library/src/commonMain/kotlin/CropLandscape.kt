package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CropLandscape: ImageVector
    get() {
        if (_CropLandscape != null) {
            return _CropLandscape!!
        }
        _CropLandscape = ImageVector.Builder(
            name = "CropLandscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 19f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17f)
                verticalLineTo(7f)
                curveTo(21f, 5.89f, 20.1f, 5f, 19f, 5f)
                close()
            }
        }.build()

        return _CropLandscape!!
    }

@Suppress("ObjectPropertyName")
private var _CropLandscape: ImageVector? = null
