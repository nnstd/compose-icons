package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsClubOutline: ImageVector
    get() {
        if (_CardsClubOutline != null) {
            return _CardsClubOutline!!
        }
        _CardsClubOutline = ImageVector.Builder(
            name = "CardsClubOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.6f, 9.5f)
                curveTo(16.8f, 8.9f, 17f, 8.2f, 17f, 7.5f)
                curveTo(17f, 4.5f, 14.8f, 2f, 12f, 2f)
                reflectiveCurveTo(7f, 4.5f, 7f, 7.5f)
                curveTo(7f, 8.2f, 7.1f, 8.9f, 7.4f, 9.5f)
                curveTo(4.9f, 9.6f, 3f, 11.4f, 3f, 13.8f)
                curveTo(3f, 16.3f, 5f, 18f, 7.5f, 18f)
                curveTo(7.5f, 18f, 10f, 18f, 11f, 17f)
                curveTo(11f, 17f, 11.3f, 19f, 9f, 22f)
                horizontalLineTo(15f)
                curveTo(12.7f, 19f, 13f, 17f, 13f, 17f)
                curveTo(14f, 18f, 16.5f, 18f, 16.5f, 18f)
                curveTo(19f, 18f, 21f, 16.3f, 21f, 13.8f)
                curveTo(21f, 11.4f, 19.1f, 9.6f, 16.6f, 9.5f)
                moveTo(16.5f, 16f)
                curveTo(16.5f, 16f, 14f, 16f, 13f, 15f)
                horizontalLineTo(11f)
                curveTo(10f, 16f, 7.5f, 16f, 7.5f, 16f)
                curveTo(6.3f, 16f, 5f, 15.3f, 5f, 13.8f)
                curveTo(5f, 12.5f, 6.1f, 11.5f, 7.5f, 11.5f)
                curveTo(7.8f, 11.5f, 8.3f, 11.6f, 8.8f, 11.7f)
                curveTo(8.9f, 11.7f, 9f, 11.8f, 9.1f, 11.8f)
                lineTo(10f, 10.1f)
                curveTo(9.8f, 9.9f, 9.7f, 9.7f, 9.6f, 9.5f)
                curveTo(9.2f, 8.9f, 9f, 8.3f, 9f, 7.5f)
                curveTo(9f, 5.6f, 10.3f, 4f, 12f, 4f)
                reflectiveCurveTo(15f, 5.6f, 15f, 7.5f)
                curveTo(15f, 8.3f, 14.8f, 9f, 14.4f, 9.6f)
                curveTo(14.3f, 9.8f, 14.2f, 9.9f, 14.1f, 10.1f)
                lineTo(15f, 11.8f)
                curveTo(15.1f, 11.8f, 15.2f, 11.7f, 15.3f, 11.7f)
                curveTo(15.7f, 11.6f, 16.2f, 11.5f, 16.6f, 11.5f)
                curveTo(18f, 11.5f, 19.1f, 12.5f, 19.1f, 13.8f)
                curveTo(19f, 15.3f, 17.7f, 16f, 16.5f, 16f)
                close()
            }
        }.build()

        return _CardsClubOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsClubOutline: ImageVector? = null
