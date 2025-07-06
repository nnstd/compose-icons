package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WebClock: ImageVector
    get() {
        if (_WebClock != null) {
            return _WebClock!!
        }
        _WebClock = ImageVector.Builder(
            name = "WebClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12.5f)
                verticalLineTo(16.5f)
                lineTo(18f, 18.5f)
                lineTo(18.75f, 17.25f)
                lineTo(16.5f, 15.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(15f)
                moveTo(22f, 12.39f)
                curveTo(22f, 12.26f, 22f, 12.13f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(12.13f, 22f, 12.24f, 22f, 12.37f, 21.97f)
                curveTo(13.43f, 22.62f, 14.67f, 23f, 16f, 23f)
                curveTo(19.86f, 23f, 23f, 19.86f, 23f, 16f)
                curveTo(23f, 14.68f, 22.62f, 13.44f, 22f, 12.39f)
                moveTo(19.76f, 10.11f)
                curveTo(19.7f, 10.07f, 19.65f, 10.04f, 19.59f, 10f)
                horizontalLineTo(19.74f)
                curveTo(19.75f, 10.03f, 19.75f, 10.07f, 19.76f, 10.11f)
                moveTo(18.92f, 8f)
                horizontalLineTo(15.97f)
                curveTo(15.65f, 6.75f, 15.19f, 5.55f, 14.59f, 4.44f)
                curveTo(16.43f, 5.07f, 17.96f, 6.34f, 18.92f, 8f)
                moveTo(12f, 4.03f)
                curveTo(12.83f, 5.23f, 13.5f, 6.57f, 13.91f, 8f)
                horizontalLineTo(10.09f)
                curveTo(10.5f, 6.57f, 11.17f, 5.23f, 12f, 4.03f)
                moveTo(9.66f, 10f)
                horizontalLineTo(12.41f)
                curveTo(11.16f, 10.75f, 10.15f, 11.88f, 9.57f, 13.24f)
                curveTo(9.53f, 12.83f, 9.5f, 12.42f, 9.5f, 12f)
                curveTo(9.5f, 11.32f, 9.56f, 10.65f, 9.66f, 10f)
                moveTo(9.4f, 4.44f)
                curveTo(8.8f, 5.55f, 8.35f, 6.75f, 8f, 8f)
                horizontalLineTo(5.08f)
                curveTo(6.03f, 6.34f, 7.57f, 5.06f, 9.4f, 4.44f)
                moveTo(4.26f, 14f)
                curveTo(4.1f, 13.36f, 4f, 12.69f, 4f, 12f)
                reflectiveCurveTo(4.1f, 10.64f, 4.26f, 10f)
                horizontalLineTo(7.64f)
                curveTo(7.56f, 10.66f, 7.5f, 11.32f, 7.5f, 12f)
                reflectiveCurveTo(7.56f, 13.34f, 7.64f, 14f)
                horizontalLineTo(4.26f)
                moveTo(5.08f, 16f)
                horizontalLineTo(8f)
                curveTo(8.35f, 17.25f, 8.8f, 18.45f, 9.4f, 19.56f)
                curveTo(7.57f, 18.93f, 6.03f, 17.65f, 5.08f, 16f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _WebClock!!
    }

@Suppress("ObjectPropertyName")
private var _WebClock: ImageVector? = null
