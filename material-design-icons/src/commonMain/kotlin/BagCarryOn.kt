package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BagCarryOn: ImageVector
    get() {
        if (_BagCarryOn != null) {
            return _BagCarryOn!!
        }
        _BagCarryOn = ImageVector.Builder(
            name = "BagCarryOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.6f, 21.4f)
                curveTo(15f, 21.8f, 15.4f, 22f, 16f, 22f)
                reflectiveCurveTo(17f, 21.8f, 17.4f, 21.4f)
                reflectiveCurveTo(18f, 20.6f, 18f, 20f)
                reflectiveCurveTo(17.8f, 19f, 17.4f, 18.6f)
                reflectiveCurveTo(16.5f, 18f, 16f, 18f)
                reflectiveCurveTo(15f, 18.2f, 14.6f, 18.6f)
                reflectiveCurveTo(14f, 19.4f, 14f, 20f)
                reflectiveCurveTo(14.2f, 21f, 14.6f, 21.4f)
                moveTo(6f, 19f)
                curveTo(6f, 19.5f, 6.2f, 20f, 6.6f, 20.4f)
                curveTo(7f, 20.8f, 7.5f, 21f, 8f, 21f)
                verticalLineTo(7f)
                curveTo(7.5f, 7f, 7f, 7.2f, 6.6f, 7.6f)
                curveTo(6.2f, 8f, 6f, 8.5f, 6f, 9f)
                verticalLineTo(19f)
                moveTo(16f, 2f)
                horizontalLineTo(12f)
                curveTo(12f, 2.5f, 12.2f, 3f, 12.6f, 3.4f)
                curveTo(13f, 3.8f, 13.5f, 4f, 14f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(13.2f)
                curveTo(13f, 20.5f, 13f, 20.2f, 13f, 20f)
                curveTo(13f, 19.2f, 13.3f, 18.5f, 13.9f, 17.9f)
                curveTo(14.5f, 17.3f, 15.2f, 17f, 16f, 17f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _BagCarryOn!!
    }

@Suppress("ObjectPropertyName")
private var _BagCarryOn: ImageVector? = null
