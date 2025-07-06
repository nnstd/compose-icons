package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveRefresh: ImageVector
    get() {
        if (_ArchiveRefresh != null) {
            return _ArchiveRefresh!!
        }
        _ArchiveRefresh = ImageVector.Builder(
            name = "ArchiveRefresh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 12f)
                curveTo(19f, 12f, 19.5f, 12.07f, 20f, 12.18f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(12.5f)
                curveTo(12.18f, 20.23f, 12f, 19.39f, 12f, 18.5f)
                curveTo(12f, 14.91f, 14.91f, 12f, 18.5f, 12f)
                moveTo(9f, 13f)
                verticalLineTo(11.5f)
                curveTo(9f, 11.22f, 9.22f, 11f, 9.5f, 11f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 11f, 15f, 11.22f, 15f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                moveTo(18f, 18.5f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16f, 18f, 16f)
                curveTo(16.62f, 16f, 15.5f, 17.12f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 21f, 18f, 21f)
                curveTo(18.82f, 21f, 19.54f, 20.61f, 20f, 20f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18f, 22.5f)
                curveTo(15.79f, 22.5f, 14f, 20.71f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 14.5f, 18f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _ArchiveRefresh!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveRefresh: ImageVector? = null
