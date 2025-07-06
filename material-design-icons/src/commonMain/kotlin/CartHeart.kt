package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CartHeart: ImageVector
    get() {
        if (_CartHeart != null) {
            return _CartHeart!!
        }
        _CartHeart = ImageVector.Builder(
            name = "CartHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 20f)
                curveTo(9f, 21.1f, 8.1f, 22f, 7f, 22f)
                reflectiveCurveTo(5f, 21.1f, 5f, 20f)
                reflectiveCurveTo(5.9f, 18f, 7f, 18f)
                reflectiveCurveTo(9f, 18.9f, 9f, 20f)
                moveTo(17f, 18f)
                curveTo(15.9f, 18f, 15f, 18.9f, 15f, 20f)
                reflectiveCurveTo(15.9f, 22f, 17f, 22f)
                reflectiveCurveTo(19f, 21.1f, 19f, 20f)
                reflectiveCurveTo(18.1f, 18f, 17f, 18f)
                moveTo(7.2f, 14.8f)
                verticalLineTo(14.7f)
                lineTo(8.1f, 13f)
                horizontalLineTo(15.5f)
                curveTo(16.2f, 13f, 16.9f, 12.6f, 17.2f, 12f)
                lineTo(21.1f, 5f)
                lineTo(19.4f, 4f)
                lineTo(15.5f, 11f)
                horizontalLineTo(8.5f)
                lineTo(4.3f, 2f)
                horizontalLineTo(1f)
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
                moveTo(12f, 9.3f)
                lineTo(11.4f, 8.8f)
                curveTo(9.4f, 6.9f, 8f, 5.7f, 8f, 4.2f)
                curveTo(8f, 3f, 9f, 2f, 10.2f, 2f)
                curveTo(10.9f, 2f, 11.6f, 2.3f, 12f, 2.8f)
                curveTo(12.4f, 2.3f, 13.1f, 2f, 13.8f, 2f)
                curveTo(15f, 2f, 16f, 2.9f, 16f, 4.2f)
                curveTo(16f, 5.7f, 14.6f, 6.9f, 12.6f, 8.8f)
                lineTo(12f, 9.3f)
                close()
            }
        }.build()

        return _CartHeart!!
    }

@Suppress("ObjectPropertyName")
private var _CartHeart: ImageVector? = null
