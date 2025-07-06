package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AppleIos: ImageVector
    get() {
        if (_AppleIos != null) {
            return _AppleIos!!
        }
        _AppleIos = ImageVector.Builder(
            name = "AppleIos",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.09f, 16.8f)
                horizontalLineTo(3.75f)
                verticalLineTo(9.76f)
                horizontalLineTo(2.09f)
                moveTo(2.92f, 8.84f)
                curveTo(3.44f, 8.84f, 3.84f, 8.44f, 3.84f, 7.94f)
                curveTo(3.84f, 7.44f, 3.44f, 7.04f, 2.92f, 7.04f)
                curveTo(2.4f, 7.04f, 2f, 7.44f, 2f, 7.94f)
                curveTo(2f, 8.44f, 2.4f, 8.84f, 2.92f, 8.84f)
                moveTo(9.25f, 7.06f)
                curveTo(6.46f, 7.06f, 4.7f, 8.96f, 4.7f, 12f)
                curveTo(4.7f, 15.06f, 6.46f, 16.96f, 9.25f, 16.96f)
                curveTo(12.04f, 16.96f, 13.8f, 15.06f, 13.8f, 12f)
                curveTo(13.8f, 8.96f, 12.04f, 7.06f, 9.25f, 7.06f)
                moveTo(9.25f, 8.5f)
                curveTo(10.96f, 8.5f, 12.05f, 9.87f, 12.05f, 12f)
                curveTo(12.05f, 14.15f, 10.96f, 15.5f, 9.25f, 15.5f)
                curveTo(7.54f, 15.5f, 6.46f, 14.15f, 6.46f, 12f)
                curveTo(6.46f, 9.87f, 7.54f, 8.5f, 9.25f, 8.5f)
                moveTo(14.5f, 14.11f)
                curveTo(14.57f, 15.87f, 16f, 16.96f, 18.22f, 16.96f)
                curveTo(20.54f, 16.96f, 22f, 15.82f, 22f, 14f)
                curveTo(22f, 12.57f, 21.18f, 11.77f, 19.23f, 11.32f)
                lineTo(18.13f, 11.07f)
                curveTo(16.95f, 10.79f, 16.47f, 10.42f, 16.47f, 9.78f)
                curveTo(16.47f, 9f, 17.2f, 8.45f, 18.28f, 8.45f)
                curveTo(19.38f, 8.45f, 20.13f, 9f, 20.21f, 9.89f)
                horizontalLineTo(21.84f)
                curveTo(21.8f, 8.2f, 20.41f, 7.06f, 18.29f, 7.06f)
                curveTo(16.21f, 7.06f, 14.73f, 8.21f, 14.73f, 9.91f)
                curveTo(14.73f, 11.28f, 15.56f, 12.13f, 17.33f, 12.53f)
                lineTo(18.57f, 12.82f)
                curveTo(19.78f, 13.11f, 20.27f, 13.5f, 20.27f, 14.2f)
                curveTo(20.27f, 15f, 19.47f, 15.57f, 18.31f, 15.57f)
                curveTo(17.15f, 15.57f, 16.26f, 15f, 16.16f, 14.11f)
                horizontalLineTo(14.5f)
                close()
            }
        }.build()

        return _AppleIos!!
    }

@Suppress("ObjectPropertyName")
private var _AppleIos: ImageVector? = null
