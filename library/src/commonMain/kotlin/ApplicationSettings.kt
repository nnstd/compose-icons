package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationSettings: ImageVector
    get() {
        if (_ApplicationSettings != null) {
            return _ApplicationSettings!!
        }
        _ApplicationSettings = ImageVector.Builder(
            name = "ApplicationSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                curveTo(1.9f, 0f, 1f, 0.9f, 1f, 2f)
                verticalLineTo(18f)
                curveTo(1f, 19.1f, 1.9f, 20f, 3f, 20f)
                horizontalLineTo(21f)
                curveTo(22.1f, 20f, 23f, 19.1f, 23f, 18f)
                verticalLineTo(2f)
                curveTo(23f, 0.9f, 22.1f, 0f, 21f, 0f)
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
            }
        }.build()

        return _ApplicationSettings!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationSettings: ImageVector? = null
