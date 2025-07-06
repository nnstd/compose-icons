package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadHeartOutline: ImageVector
    get() {
        if (_HeadHeartOutline != null) {
            return _HeadHeartOutline!!
        }
        _HeadHeartOutline = ImageVector.Builder(
            name = "HeadHeartOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.88f, 3f, 20f, 6.14f, 20f, 10f)
                curveTo(20f, 12.8f, 18.37f, 15.19f, 16f, 16.31f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.41f, 1f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11f)
                lineTo(2.47f, 11f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4f, 14.94f)
                verticalLineTo(16f)
                curveTo(4f, 17.85f, 5.28f, 19.42f, 7f, 19.87f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22f, 13.06f, 22f, 10f)
                curveTo(22f, 5.03f, 17.96f, 1f, 13f, 1f)
                moveTo(17f, 8.83f)
                curveTo(17f, 10.37f, 15.64f, 11.6f, 13.58f, 13.47f)
                lineTo(13f, 14f)
                lineTo(12.42f, 13.47f)
                curveTo(10.36f, 11.6f, 9f, 10.37f, 9f, 8.83f)
                curveTo(9f, 7.63f, 9.96f, 6.64f, 11.16f, 6.63f)
                horizontalLineTo(11.2f)
                curveTo(11.89f, 6.63f, 12.55f, 6.94f, 13f, 7.46f)
                curveTo(13.45f, 6.94f, 14.11f, 6.63f, 14.8f, 6.63f)
                curveTo(16f, 6.62f, 17f, 7.59f, 17f, 8.79f)
                verticalLineTo(8.83f)
                close()
            }
        }.build()

        return _HeadHeartOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadHeartOutline: ImageVector? = null
