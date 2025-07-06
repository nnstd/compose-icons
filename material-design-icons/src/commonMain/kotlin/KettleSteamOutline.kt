package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KettleSteamOutline: ImageVector
    get() {
        if (_KettleSteamOutline != null) {
            return _KettleSteamOutline!!
        }
        _KettleSteamOutline = ImageVector.Builder(
            name = "KettleSteamOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 3f)
                curveTo(4.8f, 3f, 1f, 5.7f, 1f, 9f)
                curveTo(1f, 10.2f, 1.5f, 11.3f, 2.4f, 12.3f)
                curveTo(1.5f, 13.5f, 0.985f, 15f, 1f, 16.5f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(16f)
                curveTo(17.11f, 22f, 18f, 21.11f, 18f, 20f)
                verticalLineTo(16.5f)
                curveTo(18f, 15.3f, 17.7f, 14.1f, 17f, 13f)
                lineTo(19f, 11f)
                lineTo(16f, 8f)
                lineTo(13.9f, 10.1f)
                curveTo(10.97f, 8.5f, 7.42f, 8.63f, 4.6f, 10.4f)
                curveTo(4.22f, 10.03f, 4f, 9.53f, 4f, 9f)
                curveTo(4f, 7.2f, 6.5f, 5.7f, 9.5f, 5.7f)
                curveTo(10.9f, 5.7f, 12.3f, 6.1f, 13.3f, 6.7f)
                lineTo(15.3f, 4.7f)
                curveTo(13.59f, 3.55f, 11.56f, 2.96f, 9.5f, 3f)
                moveTo(9.5f, 11f)
                curveTo(13f, 11f, 16f, 14f, 16f, 16.5f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(16.5f)
                curveTo(3f, 14f, 6f, 11f, 9.5f, 11f)
                moveTo(10f, 12.5f)
                curveTo(7f, 12.5f, 5f, 14f, 5f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                curveTo(7f, 16f, 7f, 13.5f, 10f, 12.5f)
                moveTo(23f, 7.3f)
                curveTo(23f, 8.93f, 21.91f, 10.6f, 20.38f, 10.97f)
                lineTo(19.71f, 10.29f)
                lineTo(19f, 9.6f)
                horizontalLineTo(19.75f)
                curveTo(20.75f, 9.6f, 21.5f, 8.22f, 21.5f, 7.2f)
                curveTo(21.5f, 6.18f, 20.65f, 5.14f, 19.65f, 5.14f)
                verticalLineTo(3.64f)
                curveTo(21.5f, 3.64f, 23f, 5.45f, 23f, 7.3f)
                moveTo(17.65f, 6.73f)
                curveTo(17.03f, 6.12f, 16.65f, 5.28f, 16.65f, 4.35f)
                curveTo(16.65f, 2.5f, 18.15f, 1f, 20f, 1f)
                verticalLineTo(2.5f)
                curveTo(19f, 2.5f, 18.15f, 3.33f, 18.15f, 4.35f)
                curveTo(18.15f, 5.37f, 19f, 6.2f, 20f, 6.2f)
                verticalLineTo(7.7f)
                curveTo(19.18f, 7.7f, 18.42f, 7.95f, 17.79f, 8.38f)
                lineTo(16.72f, 7.31f)
                curveTo(17f, 7.09f, 17.32f, 6.89f, 17.65f, 6.73f)
                close()
            }
        }.build()

        return _KettleSteamOutline!!
    }

@Suppress("ObjectPropertyName")
private var _KettleSteamOutline: ImageVector? = null
