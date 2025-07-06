package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveLock: ImageVector
    get() {
        if (_ArchiveLock != null) {
            return _ArchiveLock!!
        }
        _ArchiveLock = ImageVector.Builder(
            name = "ArchiveLock",
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
                moveTo(9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(12.06f)
                curveTo(15.87f, 10.83f, 17.35f, 10f, 19f, 10f)
                curveTo(19.34f, 10f, 19.68f, 10.04f, 20f, 10.11f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(13.03f)
                curveTo(13f, 20.9f, 13f, 20.8f, 13f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(13f, 16.24f, 13.5f, 15.34f, 14.2f, 14.74f)
                verticalLineTo(14.5f)
                curveTo(14.2f, 14f, 14.32f, 13.47f, 14.5f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12f, 19f, 12f)
                reflectiveCurveTo(21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _ArchiveLock!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveLock: ImageVector? = null
