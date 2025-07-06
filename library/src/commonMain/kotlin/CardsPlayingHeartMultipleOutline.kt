package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardsPlayingHeartMultipleOutline: ImageVector
    get() {
        if (_CardsPlayingHeartMultipleOutline != null) {
            return _CardsPlayingHeartMultipleOutline!!
        }
        _CardsPlayingHeartMultipleOutline = ImageVector.Builder(
            name = "CardsPlayingHeartMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                horizontalLineTo(9f)
                curveTo(7.9f, 0f, 7f, 0.9f, 7f, 2f)
                verticalLineTo(18f)
                curveTo(7f, 19.1f, 7.9f, 20f, 9f, 20f)
                horizontalLineTo(19f)
                curveTo(20.1f, 20f, 21f, 19.1f, 21f, 18f)
                verticalLineTo(2f)
                curveTo(21f, 0.9f, 20.1f, 0f, 19f, 0f)
                moveTo(19f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                moveTo(3f, 4f)
                verticalLineTo(22f)
                curveTo(3f, 23.1f, 3.9f, 24f, 5f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                moveTo(12.2f, 7f)
                curveTo(11f, 7f, 10f, 8f, 10f, 9.2f)
                curveTo(10f, 10.7f, 11.4f, 11.9f, 13.4f, 13.8f)
                lineTo(14f, 14.3f)
                lineTo(14.6f, 13.8f)
                curveTo(16.6f, 11.9f, 18f, 10.7f, 18f, 9.2f)
                curveTo(18f, 7.9f, 17f, 7f, 15.8f, 7f)
                curveTo(15.1f, 7f, 14.4f, 7.3f, 14f, 7.8f)
                curveTo(13.6f, 7.3f, 12.9f, 7f, 12.2f, 7f)
                close()
            }
        }.build()

        return _CardsPlayingHeartMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CardsPlayingHeartMultipleOutline: ImageVector? = null
