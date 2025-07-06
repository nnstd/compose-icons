package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoeSneaker: ImageVector
    get() {
        if (_ShoeSneaker != null) {
            return _ShoeSneaker!!
        }
        _ShoeSneaker = ImageVector.Builder(
            name = "ShoeSneaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 15f)
                curveTo(2f, 15f, 2f, 12f, 4f, 12f)
                curveTo(4.68f, 12f, 5.46f, 11.95f, 6.28f, 11.82f)
                curveTo(7.2f, 12.54f, 8.5f, 13f, 10f, 13f)
                horizontalLineTo(10.25f)
                lineTo(8.56f, 11.29f)
                curveTo(8.91f, 11.18f, 9.25f, 11.05f, 9.59f, 10.91f)
                lineTo(11.5f, 12.82f)
                curveTo(11.89f, 12.74f, 12.25f, 12.63f, 12.58f, 12.5f)
                lineTo(10.55f, 10.45f)
                curveTo(10.85f, 10.28f, 11.14f, 10.11f, 11.43f, 9.91f)
                lineTo(13.5f, 12f)
                curveTo(13.8f, 11.79f, 14.04f, 11.56f, 14.25f, 11.32f)
                lineTo(12.22f, 9.29f)
                curveTo(12.46f, 9.07f, 12.7f, 8.83f, 12.92f, 8.58f)
                lineTo(14.79f, 10.45f)
                curveTo(14.91f, 10.14f, 15f, 9.83f, 15f, 9.5f)
                curveTo(15f, 8.65f, 14.55f, 7.89f, 13.84f, 7.28f)
                curveTo(13.89f, 7.19f, 13.95f, 7.1f, 14f, 7f)
                lineTo(15.53f, 6.23f)
                curveTo(16.38f, 7.17f, 18.14f, 7.84f, 20.25f, 7.97f)
                lineTo(20.3f, 8f)
                horizontalLineTo(21f)
                curveTo(21f, 8f, 22f, 9f, 22f, 12.5f)
                curveTo(22f, 13.07f, 22f, 13.57f, 21.96f, 14f)
                horizontalLineTo(19f)
                curveTo(17.9f, 14f, 16.58f, 14.26f, 15.3f, 14.5f)
                curveTo(14.12f, 14.76f, 12.9f, 15f, 12f, 15f)
                horizontalLineTo(2f)
                moveTo(21f, 17f)
                curveTo(21f, 17f, 21.58f, 17f, 21.86f, 15f)
                horizontalLineTo(19f)
                curveTo(17f, 15f, 14f, 16f, 12f, 16f)
                horizontalLineTo(2.28f)
                curveTo(2.62f, 16.6f, 3.26f, 17f, 4f, 17f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _ShoeSneaker!!
    }

@Suppress("ObjectPropertyName")
private var _ShoeSneaker: ImageVector? = null
