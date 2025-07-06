package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarSettingsOutline: ImageVector
    get() {
        if (_StarSettingsOutline != null) {
            return _StarSettingsOutline!!
        }
        _StarSettingsOutline = ImageVector.Builder(
            name = "StarSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
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
                moveTo(16.54f, 13.97f)
                lineTo(18.18f, 21f)
                lineTo(12f, 17.27f)
                lineTo(5.82f, 21f)
                lineTo(7.45f, 13.97f)
                lineTo(2f, 9.24f)
                lineTo(9.19f, 8.63f)
                lineTo(12f, 2f)
                lineTo(14.81f, 8.63f)
                lineTo(22f, 9.24f)
                lineTo(16.54f, 13.97f)
                moveTo(15.76f, 17.66f)
                lineTo(14.77f, 13.38f)
                lineTo(18.09f, 10.5f)
                lineTo(13.71f, 10.13f)
                lineTo(12f, 6.09f)
                lineTo(10.29f, 10.13f)
                lineTo(5.91f, 10.5f)
                lineTo(9.23f, 13.38f)
                lineTo(8.24f, 17.66f)
                lineTo(12f, 15.39f)
                lineTo(15.76f, 17.66f)
                close()
            }
        }.build()

        return _StarSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _StarSettingsOutline: ImageVector? = null
