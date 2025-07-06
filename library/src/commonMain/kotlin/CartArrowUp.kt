package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartArrowUp: ImageVector
    get() {
        if (_CartArrowUp != null) {
            return _CartArrowUp!!
        }
        _CartArrowUp = ImageVector.Builder(
            name = "CartArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineTo(8f, 4f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                moveTo(1f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                lineTo(6.6f, 11.6f)
                lineTo(5.2f, 14f)
                curveTo(5.1f, 14.3f, 5f, 14.6f, 5f, 15f)
                curveTo(5f, 16.1f, 5.9f, 17f, 7f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(7.4f)
                curveTo(7.3f, 15f, 7.2f, 14.9f, 7.2f, 14.8f)
                verticalLineTo(14.7f)
                lineTo(8.1f, 13f)
                horizontalLineTo(15.5f)
                curveTo(16.2f, 13f, 16.9f, 12.6f, 17.2f, 12f)
                lineTo(21.1f, 5f)
                lineTo(19.4f, 4f)
                lineTo(15.5f, 11f)
                horizontalLineTo(8.5f)
                lineTo(4.3f, 2f)
                moveTo(7f, 18f)
                curveTo(5.9f, 18f, 5f, 18.9f, 5f, 20f)
                reflectiveCurveTo(5.9f, 22f, 7f, 22f)
                reflectiveCurveTo(9f, 21.1f, 9f, 20f)
                reflectiveCurveTo(8.1f, 18f, 7f, 18f)
                moveTo(17f, 18f)
                curveTo(15.9f, 18f, 15f, 18.9f, 15f, 20f)
                reflectiveCurveTo(15.9f, 22f, 17f, 22f)
                reflectiveCurveTo(19f, 21.1f, 19f, 20f)
                reflectiveCurveTo(18.1f, 18f, 17f, 18f)
                close()
            }
        }.build()

        return _CartArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _CartArrowUp: ImageVector? = null
