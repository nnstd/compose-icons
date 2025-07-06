package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOpenSettings: ImageVector
    get() {
        if (_MovieOpenSettings != null) {
            return _MovieOpenSettings!!
        }
        _MovieOpenSettings = ImageVector.Builder(
            name = "MovieOpenSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.75f, 5.46f)
                lineTo(12f, 1.93f)
                lineTo(13.97f, 1.54f)
                lineTo(16.71f, 5.07f)
                lineTo(14.75f, 5.46f)
                moveTo(21.62f, 4.1f)
                lineTo(20.84f, 0.18f)
                lineTo(16.91f, 0.96f)
                lineTo(19.65f, 4.5f)
                lineTo(21.62f, 4.1f)
                moveTo(11.81f, 6.05f)
                lineTo(9.07f, 2.5f)
                lineTo(7.1f, 2.91f)
                lineTo(9.85f, 6.44f)
                lineTo(11.81f, 6.05f)
                moveTo(2f, 8f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                moveTo(4.16f, 3.5f)
                lineTo(3.18f, 3.69f)
                curveTo(2.1f, 3.91f, 1.4f, 4.96f, 1.61f, 6.04f)
                lineTo(2f, 8f)
                lineTo(6.9f, 7.03f)
                lineTo(4.16f, 3.5f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
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
                close()
            }
        }.build()

        return _MovieOpenSettings!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOpenSettings: ImageVector? = null
