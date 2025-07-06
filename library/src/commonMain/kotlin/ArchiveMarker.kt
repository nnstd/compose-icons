package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveMarker: ImageVector
    get() {
        if (_ArchiveMarker != null) {
            return _ArchiveMarker!!
        }
        _ArchiveMarker = ImageVector.Builder(
            name = "ArchiveMarker",
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
                moveTo(13.63f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.72f, 11f, 14.9f, 11.14f, 14.97f, 11.33f)
                curveTo(15.93f, 10.5f, 17.17f, 10f, 18.5f, 10f)
                curveTo(19f, 10f, 19.5f, 10.08f, 20f, 10.22f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(15.19f)
                curveTo(14.12f, 19.43f, 13f, 17.35f, 13f, 15.5f)
                curveTo(13f, 14.61f, 13.23f, 13.76f, 13.63f, 13f)
                moveTo(22f, 15.5f)
                curveTo(22f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(15f, 18.1f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                reflectiveCurveTo(22f, 13.6f, 22f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }.build()

        return _ArchiveMarker!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveMarker: ImageVector? = null
