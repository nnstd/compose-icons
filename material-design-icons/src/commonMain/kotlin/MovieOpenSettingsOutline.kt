package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOpenSettingsOutline: ImageVector
    get() {
        if (_MovieOpenSettingsOutline != null) {
            return _MovieOpenSettingsOutline!!
        }
        _MovieOpenSettingsOutline = ImageVector.Builder(
            name = "MovieOpenSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.65f, 4.5f)
                lineTo(16.91f, 0.96f)
                lineTo(20.84f, 0.18f)
                lineTo(21.62f, 4.1f)
                lineTo(19.65f, 4.5f)
                moveTo(16.71f, 5.07f)
                lineTo(13.97f, 1.54f)
                lineTo(12f, 1.93f)
                lineTo(14.75f, 5.46f)
                lineTo(16.71f, 5.07f)
                moveTo(11.81f, 6.05f)
                lineTo(9.07f, 2.5f)
                lineTo(7.1f, 2.91f)
                lineTo(9.85f, 6.44f)
                lineTo(11.81f, 6.05f)
                moveTo(4.16f, 3.5f)
                lineTo(3.18f, 3.69f)
                curveTo(2.1f, 3.9f, 1.39f, 4.96f, 1.61f, 6.04f)
                lineTo(2f, 8f)
                lineTo(6.9f, 7.03f)
                lineTo(4.16f, 3.5f)
                moveTo(22f, 8f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                moveTo(20f, 10f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _MovieOpenSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOpenSettingsOutline: ImageVector? = null
