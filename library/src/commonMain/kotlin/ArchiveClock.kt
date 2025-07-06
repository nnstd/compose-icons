package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveClock: ImageVector
    get() {
        if (_ArchiveClock != null) {
            return _ArchiveClock!!
        }
        _ArchiveClock = ImageVector.Builder(
            name = "ArchiveClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                moveTo(16.5f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12f)
                moveTo(23f, 16f)
                curveTo(23f, 19.87f, 19.87f, 23f, 16f, 23f)
                curveTo(13.62f, 23f, 11.53f, 21.81f, 10.26f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(9.68f)
                curveTo(21.36f, 10.81f, 23f, 13.21f, 23f, 16f)
                moveTo(8f, 12f)
                horizontalLineTo(10.26f)
                curveTo(10.83f, 11.19f, 11.56f, 10.5f, 12.41f, 10f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 10f, 8f, 10.22f, 8f, 10.5f)
                verticalLineTo(12f)
                moveTo(21f, 16f)
                curveTo(21f, 13.24f, 18.76f, 11f, 16f, 11f)
                reflectiveCurveTo(11f, 13.24f, 11f, 16f)
                reflectiveCurveTo(13.24f, 21f, 16f, 21f)
                reflectiveCurveTo(21f, 18.76f, 21f, 16f)
                close()
            }
        }.build()

        return _ArchiveClock!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveClock: ImageVector? = null
