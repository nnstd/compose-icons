package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MusicAccidentalDoubleFlat: ImageVector
    get() {
        if (_MusicAccidentalDoubleFlat != null) {
            return _MusicAccidentalDoubleFlat!!
        }
        _MusicAccidentalDoubleFlat = ImageVector.Builder(
            name = "MusicAccidentalDoubleFlat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 9f)
                curveTo(14.8f, 9f, 14.11f, 9.28f, 13.5f, 9.67f)
                verticalLineTo(5f)
                horizontalLineTo(11.5f)
                verticalLineTo(9.62f)
                curveTo(11.04f, 9.24f, 10.39f, 9f, 9.5f, 9f)
                curveTo(8.8f, 9f, 8.11f, 9.28f, 7.5f, 9.67f)
                verticalLineTo(5f)
                horizontalLineTo(5.5f)
                verticalLineTo(19f)
                curveTo(8.5f, 17.32f, 10.43f, 15.79f, 11.5f, 14.41f)
                verticalLineTo(19f)
                curveTo(16.36f, 16.26f, 18.5f, 13.91f, 18.5f, 12f)
                curveTo(18.5f, 10.59f, 17.79f, 9f, 15.5f, 9f)
                moveTo(7.5f, 15.38f)
                verticalLineTo(12.26f)
                curveTo(8.12f, 11.59f, 8.95f, 11f, 9.5f, 11f)
                curveTo(10.09f, 11f, 10.5f, 11.07f, 10.5f, 12f)
                curveTo(10.5f, 12.15f, 10.4f, 13.3f, 7.5f, 15.38f)
                moveTo(13.5f, 15.38f)
                verticalLineTo(12.26f)
                curveTo(14.12f, 11.59f, 14.95f, 11f, 15.5f, 11f)
                curveTo(16.09f, 11f, 16.5f, 11.07f, 16.5f, 12f)
                curveTo(16.5f, 12.15f, 16.4f, 13.3f, 13.5f, 15.38f)
                close()
            }
        }.build()

        return _MusicAccidentalDoubleFlat!!
    }

@Suppress("ObjectPropertyName")
private var _MusicAccidentalDoubleFlat: ImageVector? = null
