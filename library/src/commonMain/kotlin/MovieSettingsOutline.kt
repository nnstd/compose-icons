package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieSettingsOutline: ImageVector
    get() {
        if (_MovieSettingsOutline != null) {
            return _MovieSettingsOutline!!
        }
        _MovieSettingsOutline = ImageVector.Builder(
            name = "MovieSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                lineTo(20f, 8f)
                horizontalLineTo(17f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                lineTo(15f, 8f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(8f)
                lineTo(10f, 8f)
                horizontalLineTo(7f)
                lineTo(5f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6.47f)
                lineTo(5.76f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _MovieSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieSettingsOutline: ImageVector? = null
