package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PointOfSale: ImageVector
    get() {
        if (_PointOfSale != null) {
            return _PointOfSale!!
        }
        _PointOfSale = ImageVector.Builder(
            name = "PointOfSale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                curveTo(19.4f, 5f, 19f, 5.5f, 19f, 6.1f)
                verticalLineTo(16f)
                curveTo(19f, 16.6f, 19.4f, 17f, 20f, 17.1f)
                curveTo(20.6f, 17.1f, 21f, 16.6f, 21f, 16f)
                verticalLineTo(6.1f)
                curveTo(21f, 5.5f, 20.6f, 5f, 20f, 5f)
                moveTo(16.4f, 2f)
                horizontalLineTo(4.6f)
                curveTo(3.7f, 2f, 3f, 2.7f, 3f, 3.6f)
                verticalLineTo(17.4f)
                curveTo(3f, 18.3f, 3.7f, 19f, 4.6f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                curveTo(6f, 21.6f, 6.4f, 22f, 7f, 22f)
                horizontalLineTo(13f)
                curveTo(13.6f, 22f, 14f, 21.6f, 14f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(16.4f)
                curveTo(17.3f, 19f, 18f, 18.3f, 18f, 17.4f)
                verticalLineTo(3.6f)
                curveTo(18f, 2.7f, 17.3f, 2f, 16.4f, 2f)
                moveTo(5f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(12f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                moveTo(9f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(12f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                moveTo(5f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                moveTo(5f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                moveTo(8f, 21f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                moveTo(13f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                moveTo(16f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                moveTo(16f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                moveTo(16f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                moveTo(16f, 6f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _PointOfSale!!
    }

@Suppress("ObjectPropertyName")
private var _PointOfSale: ImageVector? = null
