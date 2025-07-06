package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveLockOpen: ImageVector
    get() {
        if (_ArchiveLockOpen != null) {
            return _ArchiveLockOpen!!
        }
        _ArchiveLockOpen = ImageVector.Builder(
            name = "ArchiveLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(19f, 9f)
                curveTo(19.34f, 9f, 19.68f, 9.04f, 20f, 9.11f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(13.03f)
                curveTo(13f, 20.9f, 13f, 20.8f, 13f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(13f, 16.24f, 13.5f, 15.34f, 14.2f, 14.74f)
                verticalLineTo(13.5f)
                curveTo(14.2f, 13.33f, 14.24f, 13.17f, 14.26f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.67f, 11f, 14.82f, 11.09f, 14.91f, 11.22f)
                curveTo(15.75f, 9.91f, 17.28f, 9f, 19f, 9f)
                moveTo(21.8f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11f, 19f, 11f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                close()
            }
        }.build()

        return _ArchiveLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveLockOpen: ImageVector? = null
