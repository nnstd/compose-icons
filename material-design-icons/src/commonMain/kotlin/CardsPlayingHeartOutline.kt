package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingHeartOutline: ImageVector
    get() {
        if (_CardsPlayingHeartOutline != null) {
            return _CardsPlayingHeartOutline!!
        }
        _CardsPlayingHeartOutline = ImageVector.Builder(
            name = "CardsPlayingHeartOutline",
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
                moveTo(17f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                moveTo(10.2f, 9f)
                curveTo(9f, 9f, 8f, 10f, 8f, 11.2f)
                curveTo(8f, 12.7f, 9.4f, 13.9f, 11.4f, 15.8f)
                lineTo(12f, 16.3f)
                lineTo(12.6f, 15.8f)
                curveTo(14.6f, 13.9f, 16f, 12.7f, 16f, 11.2f)
                curveTo(16f, 9.9f, 15f, 9f, 13.8f, 9f)
                curveTo(13.1f, 9f, 12.4f, 9.3f, 12f, 9.8f)
                curveTo(11.6f, 9.3f, 10.9f, 9f, 10.2f, 9f)
                close()
            }
        }.build()

        return _CardsPlayingHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingHeartOutline: ImageVector? = null
