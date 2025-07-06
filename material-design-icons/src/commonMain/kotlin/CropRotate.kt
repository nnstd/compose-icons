package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CropRotate: ImageVector
    get() {
        if (_CropRotate != null) {
            return _CropRotate!!
        }
        _CropRotate = ImageVector.Builder(
            name = "CropRotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.47f, 21.5f)
                curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13f)
                horizontalLineTo(0f)
                curveTo(0.5f, 19.16f, 5.66f, 24f, 11.95f, 24f)
                curveTo(12.18f, 24f, 12.39f, 24f, 12.61f, 23.97f)
                lineTo(8.8f, 20.15f)
                lineTo(7.47f, 21.5f)
                moveTo(12.05f, 0f)
                curveTo(11.82f, 0f, 11.61f, 0f, 11.39f, 0.04f)
                lineTo(15.2f, 3.85f)
                lineTo(16.53f, 2.5f)
                curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11f)
                horizontalLineTo(24f)
                curveTo(23.5f, 4.84f, 18.34f, 0f, 12.05f, 0f)
                moveTo(16f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                curveTo(18f, 6.89f, 17.1f, 6f, 16f, 6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                moveTo(8f, 16f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _CropRotate!!
    }

@Suppress("ObjectPropertyName")
private var _CropRotate: ImageVector? = null
