package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrderBoolAscendingVariant: ImageVector
    get() {
        if (_OrderBoolAscendingVariant != null) {
            return _OrderBoolAscendingVariant!!
        }
        _OrderBoolAscendingVariant = ImageVector.Builder(
            name = "OrderBoolAscendingVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 13f)
                curveTo(2.89f, 13f, 2f, 13.89f, 2f, 15f)
                verticalLineTo(19f)
                curveTo(2f, 20.11f, 2.89f, 21f, 4f, 21f)
                horizontalLineTo(8f)
                curveTo(9.11f, 21f, 10f, 20.11f, 10f, 19f)
                verticalLineTo(15f)
                curveTo(10f, 13.89f, 9.11f, 13f, 8f, 13f)
                moveTo(8.2f, 14.5f)
                lineTo(9.26f, 15.55f)
                lineTo(5.27f, 19.5f)
                lineTo(2.74f, 16.95f)
                lineTo(3.81f, 15.9f)
                lineTo(5.28f, 17.39f)
                moveTo(4f, 3f)
                curveTo(2.89f, 3f, 2f, 3.89f, 2f, 5f)
                verticalLineTo(9f)
                curveTo(2f, 10.11f, 2.89f, 11f, 4f, 11f)
                horizontalLineTo(8f)
                curveTo(9.11f, 11f, 10f, 10.11f, 10f, 9f)
                verticalLineTo(5f)
                curveTo(10f, 3.89f, 9.11f, 3f, 8f, 3f)
                moveTo(4f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                moveTo(12f, 5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                moveTo(12f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                moveTo(12f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _OrderBoolAscendingVariant!!
    }

@Suppress("ObjectPropertyName")
private var _OrderBoolAscendingVariant: ImageVector? = null
