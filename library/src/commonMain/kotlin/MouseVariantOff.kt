package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseVariantOff: ImageVector
    get() {
        if (_MouseVariantOff != null) {
            return _MouseVariantOff!!
        }
        _MouseVariantOff = ImageVector.Builder(
            name = "MouseVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(17.29f, 20.56f)
                curveTo(16.42f, 22f, 14.82f, 23f, 13f, 23f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                verticalLineTo(16.9f)
                curveTo(5.72f, 16.44f, 4f, 14.42f, 4f, 12f)
                verticalLineTo(9f)
                horizontalLineTo(5.73f)
                lineTo(2f, 5.27f)
                moveTo(14f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(2.1f)
                curveTo(12.28f, 2.56f, 14f, 4.58f, 14f, 7f)
                moveTo(8f, 2.1f)
                verticalLineTo(6.18f)
                lineTo(5.38f, 3.55f)
                curveTo(6.07f, 2.83f, 7f, 2.31f, 8f, 2.1f)
                moveTo(14f, 12f)
                verticalLineTo(12.17f)
                lineTo(10.82f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                moveTo(10f, 16.9f)
                verticalLineTo(18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 21f)
                curveTo(14.28f, 21f, 15.37f, 20.2f, 15.8f, 19.07f)
                lineTo(12.4f, 15.67f)
                curveTo(11.74f, 16.28f, 10.92f, 16.71f, 10f, 16.9f)
                moveTo(16f, 13f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                horizontalLineTo(22f)
                lineTo(21f, 10f)
                lineTo(22f, 11f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 13f)
                verticalLineTo(16.18f)
                lineTo(16f, 14.18f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _MouseVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _MouseVariantOff: ImageVector? = null
