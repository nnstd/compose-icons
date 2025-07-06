package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingClubMultiple: ImageVector
    get() {
        if (_CardsPlayingClubMultiple != null) {
            return _CardsPlayingClubMultiple!!
        }
        _CardsPlayingClubMultiple = ImageVector.Builder(
            name = "CardsPlayingClubMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                verticalLineTo(22f)
                curveTo(3f, 23.1f, 3.9f, 24f, 5f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(19f, 0f)
                horizontalLineTo(9f)
                curveTo(7.9f, 0f, 7f, 0.9f, 7f, 2f)
                verticalLineTo(18f)
                curveTo(7f, 19.1f, 7.9f, 20f, 9f, 20f)
                horizontalLineTo(19f)
                curveTo(20.1f, 20f, 21f, 19.1f, 21f, 18f)
                verticalLineTo(2f)
                curveTo(21f, 0.9f, 20.1f, 0f, 19f, 0f)
                moveTo(16f, 13f)
                curveTo(15.4f, 13f, 14.9f, 12.7f, 14.5f, 12.3f)
                lineTo(15.5f, 15f)
                horizontalLineTo(12.5f)
                lineTo(13.5f, 12.3f)
                curveTo(13.1f, 12.7f, 12.6f, 13f, 12f, 13f)
                curveTo(10.9f, 13f, 10f, 12.1f, 10f, 11f)
                reflectiveCurveTo(10.9f, 9f, 12f, 9f)
                horizontalLineTo(12.3f)
                curveTo(12.1f, 8.7f, 12f, 8.4f, 12f, 8f)
                curveTo(12f, 6.9f, 12.9f, 6f, 14f, 6f)
                reflectiveCurveTo(16f, 6.9f, 16f, 8f)
                curveTo(16f, 8.4f, 15.9f, 8.7f, 15.7f, 9f)
                horizontalLineTo(16f)
                curveTo(17.1f, 9f, 18f, 9.9f, 18f, 11f)
                reflectiveCurveTo(17.1f, 13f, 16f, 13f)
                close()
            }
        }.build()

        return _CardsPlayingClubMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingClubMultiple: ImageVector? = null
