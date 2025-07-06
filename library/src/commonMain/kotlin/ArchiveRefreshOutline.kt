package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArchiveRefreshOutline: ImageVector
    get() {
        if (_ArchiveRefreshOutline != null) {
            return _ArchiveRefreshOutline!!
        }
        _ArchiveRefreshOutline = ImageVector.Builder(
            name = "ArchiveRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12.03f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(12.18f)
                curveTo(19.5f, 12.07f, 19f, 12f, 18.5f, 12f)
                curveTo(18.33f, 12f, 18.17f, 12f, 18f, 12.03f)
                moveTo(9.5f, 11f)
                curveTo(9.22f, 11f, 9f, 11.22f, 9f, 11.5f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(11.5f)
                curveTo(15f, 11.22f, 14.78f, 11f, 14.5f, 11f)
                horizontalLineTo(9.5f)
                moveTo(6f, 19f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(12.5f)
                curveTo(12.24f, 20.38f, 12.09f, 19.7f, 12.03f, 19f)
                horizontalLineTo(6f)
                moveTo(21f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(22f, 18.5f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18f, 14.5f)
                curveTo(15.79f, 14.5f, 14f, 16.29f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20f)
                horizontalLineTo(20f)
                curveTo(19.54f, 20.61f, 18.82f, 21f, 18f, 21f)
                curveTo(16.62f, 21f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16f, 18f, 16f)
                curveTo(18.69f, 16f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18f, 18.5f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ArchiveRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveRefreshOutline: ImageVector? = null
