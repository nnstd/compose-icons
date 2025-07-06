package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieSettings: ImageVector
    get() {
        if (_MovieSettings != null) {
            return _MovieSettings!!
        }
        _MovieSettings = ImageVector.Builder(
            name = "MovieSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                lineTo(7f, 8f)
                horizontalLineTo(10f)
                lineTo(8f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 8f)
                horizontalLineTo(15f)
                lineTo(13f, 4f)
                horizontalLineTo(15f)
                lineTo(17f, 8f)
                horizontalLineTo(20f)
                lineTo(18f, 4f)
                horizontalLineTo(22f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _MovieSettings!!
    }

@Suppress("ObjectPropertyName")
private var _MovieSettings: ImageVector? = null
