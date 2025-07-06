package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveClockOutline: ImageVector
    get() {
        if (_ArchiveClockOutline != null) {
            return _ArchiveClockOutline!!
        }
        _ArchiveClockOutline = ImageVector.Builder(
            name = "ArchiveClockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                moveTo(18f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                moveTo(16f, 9f)
                curveTo(14.69f, 9f, 13.46f, 9.37f, 12.41f, 10f)
                horizontalLineTo(8.5f)
                curveTo(8.22f, 10f, 8f, 10.22f, 8f, 10.5f)
                verticalLineTo(12f)
                horizontalLineTo(10.26f)
                curveTo(9.47f, 13.13f, 9f, 14.5f, 9f, 16f)
                curveTo(9f, 16.7f, 9.11f, 17.37f, 9.29f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(10.26f)
                curveTo(11.53f, 21.81f, 13.62f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 12.13f, 19.87f, 9f, 16f, 9f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                reflectiveCurveTo(13.24f, 11f, 16f, 11f)
                reflectiveCurveTo(21f, 13.24f, 21f, 16f)
                reflectiveCurveTo(18.76f, 21f, 16f, 21f)
                moveTo(16.5f, 16.25f)
                lineTo(19.36f, 17.94f)
                lineTo(18.61f, 19.16f)
                lineTo(15f, 17f)
                verticalLineTo(12f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.25f)
                close()
            }
        }.build()

        return _ArchiveClockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveClockOutline: ImageVector? = null
