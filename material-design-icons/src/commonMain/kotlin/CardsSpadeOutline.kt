package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsSpadeOutline: ImageVector
    get() {
        if (_CardsSpadeOutline != null) {
            return _CardsSpadeOutline!!
        }
        _CardsSpadeOutline = ImageVector.Builder(
            name = "CardsSpadeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                curveTo(11f, 17f, 11.3f, 19f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(12.7f, 19f, 13f, 17f, 13f, 17f)
                reflectiveCurveTo(14f, 18f, 16f, 18f)
                reflectiveCurveTo(20f, 16f, 20f, 14f)
                curveTo(20f, 9f, 15f, 7f, 12f, 2f)
                curveTo(9f, 7f, 4f, 9f, 4f, 14f)
                curveTo(4f, 16f, 6f, 18f, 8f, 18f)
                reflectiveCurveTo(11f, 17f, 11f, 17f)
                moveTo(13f, 14f)
                horizontalLineTo(11f)
                curveTo(11f, 14f, 10f, 16f, 8f, 16f)
                curveTo(7.1f, 16f, 6f, 14.9f, 6f, 14f)
                curveTo(5.8f, 11f, 9.9f, 8.2f, 12f, 5.4f)
                curveTo(14.1f, 8.1f, 18.2f, 10.9f, 18f, 14f)
                curveTo(18f, 14.9f, 16.9f, 16f, 16f, 16f)
                curveTo(14f, 16f, 13f, 14f, 13f, 14f)
                close()
            }
        }.build()

        return _CardsSpadeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsSpadeOutline: ImageVector? = null
