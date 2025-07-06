package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingClub: ImageVector
    get() {
        if (_CardsPlayingClub != null) {
            return _CardsPlayingClub!!
        }
        _CardsPlayingClub = ImageVector.Builder(
            name = "CardsPlayingClub",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineTo(7f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                verticalLineTo(20f)
                curveTo(5f, 21.1f, 5.9f, 22f, 7f, 22f)
                horizontalLineTo(17f)
                curveTo(18.1f, 22f, 19f, 21.1f, 19f, 20f)
                verticalLineTo(4f)
                curveTo(19f, 2.9f, 18.1f, 2f, 17f, 2f)
                moveTo(14f, 15f)
                curveTo(13.4f, 15f, 12.9f, 14.7f, 12.5f, 14.3f)
                lineTo(13.5f, 17f)
                horizontalLineTo(10.5f)
                lineTo(11.5f, 14.3f)
                curveTo(11.1f, 14.7f, 10.6f, 15f, 10f, 15f)
                curveTo(8.9f, 15f, 8f, 14.1f, 8f, 13f)
                reflectiveCurveTo(8.9f, 11f, 10f, 11f)
                horizontalLineTo(10.3f)
                curveTo(10.1f, 10.7f, 10f, 10.3f, 10f, 10f)
                curveTo(10f, 8.9f, 10.9f, 8f, 12f, 8f)
                reflectiveCurveTo(14f, 8.9f, 14f, 10f)
                curveTo(14f, 10.4f, 13.9f, 10.7f, 13.7f, 11f)
                horizontalLineTo(14f)
                curveTo(15.1f, 11f, 16f, 11.9f, 16f, 13f)
                reflectiveCurveTo(15.1f, 15f, 14f, 15f)
                close()
            }
        }.build()

        return _CardsPlayingClub!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingClub: ImageVector? = null
